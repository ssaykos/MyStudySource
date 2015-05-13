package ShootingGame;

import java.awt.event.KeyListener;
import java.util.ArrayList;//ArrayList�� ���� ����Ʈ �߰�

import javax.swing.JFrame;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class AirportGame {
	public static void main(String[] args) {
		  game_Frame fms = new game_Frame();	
		  //����Ŭ���� ������(����â)������ ���� ��ü����
	}
}
class game_Frame extends JFrame implements KeyListener, Runnable{
	//������(����â)������ Ŭ����
	//�������� ���� JFrame���
	//Ű���� �̺�Ʈ ó���� ���� KeyListener ���
	//�������� ������ ���� Runnable ���
	int f_width;// �������� ����
	int f_height;// �������� ����
	
	
	int x,y;//ĳ������ ��ǥ ����
	
	boolean KeyUp=false;
	boolean KeyDown=false;
	boolean KeyLeft=false;
	boolean KeyRight=false;
	boolean KeySpace=false;
	
	int cnt;
	
	Thread th;//������ ����

	Toolkit tk=Toolkit.getDefaultToolkit();
	//�̹����� �ҷ����� ���� ��Ŷ
	Image me_img;//�� ���� �ɸ��� �̹��� ����
	Image Missile_img;//�̻��� �̹�������
	Image Enemy_img;
	
	ArrayList Enemy_List= new ArrayList();
	ArrayList Missile_List=new ArrayList();	
	
	Image buffIamge;//���� ���۸���
	Graphics buffg;//������۸���
	
	Missile ms;//�̻��� Ŭ���� ����Ű
	Enemy en;
	
	game_Frame(){//�����Ӹ����
		
		init();//������ ���� �����ӿ� �� ������Ʈ ���� �޼ҵ�.		
		start();//������ ���� �⺻���� ���۸�� ó�� �κ�.
		
		setTitle("���ð��Ӹ����");//������ �̸� ����.
		setSize(f_width,f_height);//������ ũ�⸦ ���� ������ ������ ����
		
		Dimension screen=tk.getScreenSize();
		//�������� �����쿡 ǥ�õɶ� ��ġ�� �����ϱ� ���� ���� ������� �ػ� ���� �޾ƿ���.
				
		int f_xpos=(int)(screen.getWidth()/2-f_width/2);
		int f_ypos=(int)(screen.getHeight()/2-f_height/2);
		//�������� ����� ȭ�� ���߾ӿ� ��ġ�ϱ� ���� ��ǥ�� ���.
		
		setLocation(f_xpos, f_ypos);//�������� ȭ�鿡 ��ġ
		setResizable(false);//������ ũ�����(���Ƿ� ũ�⺯�� ���ϰ� �ϱ�)
		setVisible(true);//�������� ���� ���̰� ����.
	}
	public void init() {//������ ���� �����ӿ� �� ������Ʈ ���� �޼ҵ�
		x=100;//ĳ������ ���� ��ǥx��
		y=100;//ĳ������ ���� ��ǥy��
		f_width=800;// �������� ����
		f_height=600;// �������� ����
		
		//Ŭ���� ���������ӿ� �ִ��� �޼ҵ� ������ �ű�
		me_img = tk.getImage("C:\\Users\\�����PM\\git\\MyStudySource\\MySource\\src\\ShootingGame\\f15k.jpg");
		//f15k.png��� �̹��� �ҷ�����.
		
		Missile_img=tk.getImage("C:\\Users\\�����PM\\git\\MyStudySource\\MySource\\src\\ShootingGame\\Missile.png");
		//�̻��� �̹��� �ҷ�����
//		Enemy_img=tk.getImage("C:\\Users\\�����PM\\git\\MyStudySource\\MySource\\src\\ShootingGame\\enemy.png");
	}
	public void start() {//������ ���� �⺻���� ���� ��� ó���κ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);//Ű���� �̺�Ʈ ����
		
		th=new Thread(this);//������ ����
		th.start();//������ ����
	}
	public void run() {//�����尡 ���� ������ �κ�
		try{//���ܿɼ� �������� ��������
			while(true){
				KeyProcess();
				EnemyProcess();
				MissileProcess();//�̻��� ó�� �޼ҵ�
				
				repaint();
				
				Thread.sleep(20);
				cnt++;
			}
		}catch(Exception e){}
	}
	
	private void EnemyProcess() {

		for (int i = 0; i < Enemy_List.size(); ++i) {
			en= (Enemy)(Enemy_List.get(i));
			//�迭�� ���� �����Ǿ� ������ �ش�Ǵ� ���� �Ǻ�
			en.move();
			if(en.x<-200){//���� ȭ���(���̹��� ��ǥ�� ȭ�� ������ �Ѿ��
				Enemy_List.remove(i);				
			}
		}
		if(cnt%300==0){//���� ī���� 300ȸ ����
			en=new Enemy(f_width+100,100);
			Enemy_List.add(en);
			//����ǥ�� ���� ������ �� �迭�� �߰��Ѵ�
			en=new Enemy(f_width+100, 300);
			Enemy_List.add(en);
			
			en=new Enemy(f_width+100, 500);
			Enemy_List.add(en);
		}
	}
	private void MissileProcess() {//�̻��� ó�� �޼ҵ�
		if(KeySpace){//�����̽��� Ű ���°� �� �̸� 
			ms=new Missile(x,y);//��ǥ üũ�Ͽ� 
			Missile_List.add(ms);//�ش�̻��� �߰� �׸���
		}
	}
	public void paint(Graphics g){
		/*g.clearRect(0, 0, f_width, f_height);
		//0,0 ���� ������ ���� �ػ� ũ�⸸ŭ ȭ���� ����ϴ�.
		g.drawImage(me_img, 100, 100, this);
		//�����ӿ��� me_img�� ����� f15k.png�̹����� x=100,y=100��ǥ�� �ֱ�.
		//����Ǵ� ��ǥ�� ���� �̹����� ���� �׷����� �ϱ�
*/		
		buffIamge= createImage(f_width, f_height);
		//���� ���۸� ���� ũ�⸦ ȭ�� ũ��� ���� ����
		buffg=buffIamge.getGraphics();//������ �׷��� ��ü�� ���
		
		update(g);
	}
	
	public void update(Graphics g) {
		Draw_Char();
		
		Draw_Enemy();
		
		Draw_Missile();//�׷��� �̻��� ������ ����
		
		g.drawImage(buffIamge, x, y, this);
	}

	private void Draw_Enemy() {//�� �̹����� �׸��� �κ�
		for (int i = 0; i < Enemy_List.size(); ++i) {
			en=(Enemy)(Enemy_List.get(i));
			buffg.drawImage(Enemy_img, en.x, en.y, this);
			//�迭�� ������ �� ���� �Ǻ��Ͽ� �̹��� �׸���
		}
	}
	public void Draw_Char() {
		buffg.clearRect(0, 0, f_width, f_height);
		buffg.drawImage(me_img, x, y, this);
	}

	public void Draw_Missile() {
		for (int i = 0; i < Missile_List.size(); ++i) {
			//�̻��� �������� Ȯ��.
			
			ms=(Missile)(Missile_List.get(i));//�̻��� ��ġ�� Ȯ��
			
			buffg.drawImage(Missile_img, ms.pos.x+150, ms.pos.y+30, this);//���� ��ǥ�� �̻��� �׸���. // �̹��� ũ�⸦ ������ �̻��� �߻� ��ǥ�� ������
			
			ms.move();//�׷��� �̻����� ������ ���ڸ�ŭ �̵���Ű��
			
			if(ms.pos.x>f_width){//�̻����� ȭ������� ������
				Missile_List.remove(i);//�̻��� �����
			}
		}
	}
	
	public void keyPressed(KeyEvent e){
		//Ű���尡 ������������ �̺�Ʈ�� ó���ϴ� ��
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				KeyUp=true;
				break;
			case KeyEvent.VK_DOWN:
				KeyDown=true;
				break;
			case KeyEvent.VK_LEFT:
				KeyLeft=true;
				break;
			case KeyEvent.VK_RIGHT:
				KeyRight=true;
				break;
				
			case KeyEvent.VK_SPACE:
				KeySpace=true;
				break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		//Ű���尡 �������ٰ� ���������� �̺�Ʈ ó�� �ϴ°�
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			KeyUp=false;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown=false;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft=false;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight=false;
			break;
			
		case KeyEvent.VK_SPACE:
			KeySpace=false;
			break;
		}
	}
	public void keyTyped(KeyEvent e){}
	//Ű���� Ÿ���� ���� �̺�Ʈ ó�� �ϴ°�
	public void KeyProcess() {
		//������ ĳ���� ������ ������ ���� ������ �޾Ƶ��� Ű���� �������� Ű�Է½ø��� 5��ŭ�� �̵���Ų��.			
		if(KeyUp==true)this.y-=5;
		if(KeyDown==true)this.y+=5;
		if(KeyLeft==true)this.x-=5;
		if(KeyRight==true)this.x+=5;
	}

}
class Missile{//�̻��� ��ġ �ľ� �� �̵��� ���� Ŭ���� �߰�
	
	Point pos;//�̻��� ��ǥ����
	Missile(int x, int y){//�̻��� ��ǥ�� �Է¹޴� �޼ҵ�
		pos=new Point(x,y);//�̻��� ��ǥ�� üũ
	}
	
	public void move(){//�̻��� �̵��� ���� �޼ҵ�
		pos.x+=10;//x��ǥ�� 10 ��ŭ �̻��� �̵�
	}
}
class Enemy{
	int x,y;
	
	Enemy(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void move(){
		x-=3;
	}
}