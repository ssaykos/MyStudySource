package RPG;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class zollaman {

	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
	}
}
class Unit{
	
}
class Character{
	
}
class Town{
	
}
class Item{
	
}
class GameFrame extends JFrame implements KeyListener,Runnable{
	int x,y;//캐릭터 위치
	
	Image CharacterLeftWalk1_img;
	Image CharacterLeftWalk2_img;
	Image CharacterLeftWalk3_img;
	Image CharacterLeftWalk4_img;
	Image CharacterLeftWalk5_img;
	Image CharacterLeftWalk6_img;
	Image CharacterLeftWalk7_img;
	Image CharacterLeftWalk8_img;
	Image CharacterLeftWalk9_img;
	Image CharacterLeftWalk10_img;
	Image CharacterLeftWalk11_img;
	Image CharacterLeftWalk12_img;
	Image CharacterLeftWalk13_img;
	Image CharacterLeftWalk14_img;
	Image CharacterRightWalk1_img;
	Image CharacterRightWalk2_img;
	Image CharacterRightWalk3_img;
	Image CharacterRightWalk4_img;
	Image CharacterRightWalk5_img;
	Image CharacterRightWalk6_img;
	Image CharacterRightWalk7_img;
	Image CharacterRightWalk8_img;
	Image CharacterRightWalk9_img;
	Image CharacterRightWalk10_img;
	Image CharacterRightWalk11_img;
	Image CharacterRightWalk12_img;
	Image CharacterRightWalk13_img;
	Image CharacterRightWalk14_img;
	
	int FrameWidth=1280;//창크기 넓이
	int FrameHeight=720;//창크기 높이
	

	Thread th;
	Toolkit tk= Toolkit.getDefaultToolkit();
	
	boolean KeyUp = false;
	boolean KeyDown=false;
	boolean KeyRight=false;
	boolean KeyLeft=false;
	
	Image BuffImage;
	Graphics BuffGraphic;
		
	GameFrame(){
		init();
		start();
		
		setTitle("Zol La Man 의 대모험");
		setSize(FrameWidth, FrameHeight);
		Dimension screen = tk.getScreenSize();
		
		int FrameXpos =(int)((screen.getWidth()-FrameWidth)/2);
		int FrameYpos = (int)((screen.getHeight()-FrameHeight)/2);
		
		setLocation(FrameXpos, FrameYpos);
		setResizable(false);
		setVisible(true);
	}
	
	private void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		th = new Thread(this);
		th.start();
	}

	private void init() {
		x=FrameWidth/2;
		y=FrameHeight/2;
		CharacterLeftWalk1_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk1.bmp");
		CharacterLeftWalk2_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk2.bmp");
		CharacterLeftWalk3_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk3.bmp");
		CharacterLeftWalk4_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk4.bmp");
		CharacterLeftWalk5_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk5.bmp");
		CharacterLeftWalk6_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk6.bmp");
		CharacterLeftWalk7_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk7.bmp");
		CharacterLeftWalk8_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk8.bmp");
		CharacterLeftWalk9_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk9.bmp");
		CharacterLeftWalk10_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk10.bmp");
		CharacterLeftWalk11_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk11.bmp");
		CharacterLeftWalk12_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk12.bmp");
		CharacterLeftWalk13_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk13.bmp");
		CharacterLeftWalk14_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk14.bmp");
		CharacterRightWalk1_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk1.bmp");
		CharacterRightWalk2_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk2.bmp");
		CharacterRightWalk3_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk3.bmp");
		CharacterRightWalk4_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk4.bmp");
		CharacterRightWalk5_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk5.bmp");
		CharacterRightWalk6_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk6.bmp");
		CharacterRightWalk7_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk7.bmp");
		CharacterRightWalk8_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk8.bmp");
		CharacterRightWalk9_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk9.bmp");
		CharacterRightWalk10_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk10.bmp");
		CharacterRightWalk11_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk11.bmp");
		CharacterRightWalk12_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk12.bmp");
		CharacterRightWalk13_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk13.bmp");
		CharacterRightWalk14_img=tk.getImage("C:\\Users\\취업반PM\\git\\MyStudySource\\MySource\\src\\RPG\\zollamanrightwalk14.bmp");
		
	}
	public void update(Graphics g){
		DrawCharacter();
		g.drawImage(CharacterLeftWalk1_img, x, y, Color.white, this);
		
	}
	public void Paint(Graphics g){
		BuffImage=createImage(FrameWidth, FrameHeight);
		BuffGraphic=BuffImage.getGraphics();
		update(g);
	}

	private void DrawCharacter() {
		
	}

	public void run() {
		try {
			while(true){
				keyPressed();
				repaint();
				
			}
		} catch (Exception e) {

		}
	}
	
	private void keyPressed() {
		if(KeyUp==true)y-=3;
		if(KeyDown==true)y+=3;
		if(KeyLeft==true)x-=3;
		if(KeyRight==true)x+=3;
	}

	public void keyPressed(KeyEvent e) {
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
		
		}
	}
	
	public void keyReleased(KeyEvent e) {
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
		}
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
}

