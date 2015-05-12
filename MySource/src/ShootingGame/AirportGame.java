package ShootingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;//ArrayList를 위한 임포트 추가

public class AirportGame {
	public static void main(String[] args) {
		  game_Frame fms = new game_Frame();	
		  //메인클래스 프레임(게임창)생성을 위한 객체선언
	}
}
class game_Frame extends JFrame implements KeyListener, Runnable{
	//프레임(게임창)만들기용 클래스
	//프레임을 위한 JFrame상속
	//키보드 이벤트 처리를 위한 KeyListener 상속
	//스레스를 돌리기 위한 Runnable 상속
	int f_width;// 프레임의 넓이
	int f_height;// 프레임의 높이
	
	
	int x,y;//캐릭터의 좌표 변수
	boolean KeyUp=false;
	boolean KeyDown=false;
	boolean KeyLeft=false;
	boolean KeyRight=false;
	boolean KeySpace=false;
	
	Thread th;//스레드 생성
	Toolkit tk=Toolkit.getDefaultToolkit();
	//이미지를 불러오기 위한 툴킷
	Image me_img;//내 게임 케릭터 이미지 변수
	Image Missile_img;//미사일 이미지변수
	ArrayList Missile_List=new ArrayList();	
	
	Image buffIamge;//더블 버퍼링용
	Graphics buffg;//더블버퍼링용
	
	Missile ms;//미사일 클래스 접근키
	
	game_Frame(){//프레임만들기
		
		init();//나중을 위한 프레임에 들어갈 컴포넌트 세팅 메소드.		
		start();//나중을 위한 기본적인 시작명령 처리 부분.
		
		setTitle("슈팅게임만들기");//프레임 이름 설정.
		setSize(f_width,f_height);//프레임 크기를 위의 값에서 가져와 설정
		Dimension screen=tk.getScreenSize();
		//프레임이 윈도우에 표시될때 위치를 세팅하기 위해 현재 모니터의 해상도 값을 받아오기.
		
		
		int f_xpos=(int)(screen.getWidth()/2-f_width/2);
		int f_ypos=(int)(screen.getHeight()/2-f_height/2);
		//프레임이 모니터 화면 정중앙에 배치하기 위한 좌표값 계산.
		
		setLocation(f_xpos, f_ypos);//프레임을 화면에 배치
		setResizable(false);//프레임 크기고정(임의로 크기변경 못하게 하기)
		setVisible(true);//프레임을 눈에 보이게 띄우기.
	}
	public void init() {//나중을 위한 프레임에 들어갈 컴포넌트 세팅 메소드
		x=100;//캐릭터의 최초 좌표x축
		y=100;//캐릭터의 최초 좌표y축
		f_width=800;// 프레임의 넓이
		f_height=600;// 프레임의 높이
		
		//클레스 게임프레임에 있던걸 메소드 안으로 옮김
		me_img = tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\ShootingGame\\f15k.jpg");
		//f15k.png라는 이미지 불러오기.
		
		Missile_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\ShootingGame\\Missile.png");
		//미사일 이미지 불러오기
	}
	public void start() {//나중을 위한 기본적인 시작 명령 처리부분
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);//키보드 이벤트 실행
		th=new Thread(this);//스레스 생성
		th.start();//스레스 실행
	}
	public void run() {//스레드가 무한 루프될 부분
		try{//예외옵션 설정으로 에러방지
			while(true){
				KeyProcess();
				MissileProcess();//미사일 처리 메소드
				repaint();
				Thread.sleep(20);
			}
		}catch(Exception e){}
	}
	
	private void MissileProcess() {//미사일 처리 메소드
		if(KeySpace){//스페이스바 키 상태가 참 이면 
			ms=new Missile(x,y);//좌표 체크하여 
			Missile_List.add(ms);//해당미사일 추가 그리기
		}
	}
	public void paint(Graphics g){
		/*g.clearRect(0, 0, f_width, f_height);
		//0,0 에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
		g.drawImage(me_img, 100, 100, this);
		//프레임에서 me_img에 저장된 f15k.png이미지를 x=100,y=100좌표에 넣기.
		//변경되는 좌표에 따라 이미지가 새로 그려지게 하기
*/		
		buffIamge= createImage(f_width, f_height);
		//더블 버퍼링 버퍼 크기를 화면 크기와 같게 설정
		buffg=buffIamge.getGraphics();//버퍼의 그래픽 객체를 얻기
		
		update(g);
	}
	
	public void update(Graphics g) {
		Draw_Char();
		
		Draw_Missile();//그려진 미사일 가져와 실행
		
		g.drawImage(me_img, x, y, this);
	}

	public void Draw_Char() {
		buffg.clearRect(0, 0, f_width, f_height);
		buffg.drawImage(me_img, x, y, this);
	}

	public void Draw_Missile() {
		for (int i = 0; i < Missile_List.size(); ++i) {
			//미사일 존재유무 확인.
			
			ms=(Missile)(Missile_List.get(i));//미사일 위치값 확인
			
			buffg.drawImage(Missile_img, ms.pos.x+150, ms.pos.y+30, this);//현재 좌표에 미사일 그리기. // 이미지 크기를 감안한 미사일 발사 좌표는 수정됨
			
			ms.move();//그려진 미사일을 정해진 숫자만큼 이동시키기
			
			if(ms.pos.x>f_width){//미사일이 화면밖으로 나가면
				Missile_List.remove(i);//미사일 지우기
			}
		}
	}
	
	public void keyPressed(KeyEvent e){
		//키보드가 눌러졌을때의 이벤트를 처리하는 곳
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
		//키보드가 눌러졌다가 때어졌을때 이벤트 처리 하는곳
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
	//키보드 타이핑 때의 이벤트 처리 하는곳
	public void KeyProcess() {
		//실제로 캐릭터 움직임 실현을 위해 위에서 받아들인 키값을 바탕으로 키입력시마다 5만큼씩 이동시킨다.			
		if(KeyUp==true)y-=5;
		if(KeyDown==true)y+=5;
		if(KeyLeft==true)x-=5;
		if(KeyRight==true)x+=5;
	}

}
class Missile{//미사일 위치 파악 및 이동을 위한 클래스 추가
	
	Point pos;//미사일 좌표변수
	Missile(int x, int y){//미사일 좌표를 입력받는 메소드
		pos=new Point(x,y);//미사일 좌표를 체크
	}
	
	public void move(){//미사일 이동을 위한 메소드
		pos.x+=10;//x좌표에 10 만큼 미사일 이동
	}
}
