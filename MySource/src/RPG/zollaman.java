package RPG;

import java.awt.*;
import javax.swing.*;

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
	int FrameWidth=1280;//창크기 넓이
	int FrameHeight=720;//창크기 높이
	

	Thread thread1;
	Toolkit tk= Toolkit.getDefaultToolkit();
	
	boolean KeyUp = false;
	boolean KeyDown=false;
	boolean KeyRight=false;
	boolean KeyLeft=false;
	
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
		
	}

	private void init() {
		Image CharacterLeftWalk1_img=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\RPG\\zollamanleftwalk1.bmp");
		
	}

	public void run() {
		
	}
	
	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
}
public class zollaman {

	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
	}
}
