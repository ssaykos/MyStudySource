package ShootingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;//ArrayList�� ���� ����Ʈ �߰�

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
	
	Thread th;//������ ����
	Toolkit tk=Toolkit.getDefaultToolkit();
	//�̹����� �ҷ����� ���� ��Ŷ
	Image me_img;//�� ���� �ɸ��� �̹��� ����
	Image Missile_img;//�̻��� �̹�������
	ArrayList Missile_List=new ArrayList();	
	
	Image buffIamge;//���� ���۸���
	Graphics buffg;//������۸���
	
	Missile ms;//�̻��� Ŭ���� ����Ű
	
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
				MissileProcess();//�̻��� ó�� �޼ҵ�
				repaint();
				Thread.sleep(20);
			}
		}catch(Exception e){}
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
		
		Draw_Missile();//�׷��� �̻��� ������ ����
		
		g.drawImage(me_img, x, y, this);
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
		if(KeyUp==true)y-=5;
		if(KeyDown==true)y+=5;
		if(KeyLeft==true)x-=5;
		if(KeyRight==true)x+=5;
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
