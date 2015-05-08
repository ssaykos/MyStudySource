package ShootingGame;

import javax.swing.*;

import java.awt.*;


public class CharacterPly {

	public static void main(String[] args) {
		GameFrame gf= new GameFrame();


	}

}
class GameFrame extends JFrame{
	int f_width=500;
	int f_height=800;
	
	Toolkit tk=Toolkit.getDefaultToolkit();
	
	Image myCharater=tk.getImage("C:\\Users\\취업반PM\\workspace\\MySource\\src\\ShootingGame\\도트케릭터.JPG");
	
	GameFrame(){
		init();
		start();
		setTitle("캐릭터슈팅게임");
		setSize(f_width, f_height);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		
		int f_xpos=(int)(screen.getWidth()/2 - f_width / 2);
		int f_ypos=(int)(screen.getHeight()/2 - f_height / 2);
		
		setLocation(f_xpos, f_ypos);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void init() {
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		int x=(int)(screen.getWidth()/2 - f_width / 2);
		int y = (int)(screen.getHeight()/2- f_height/2+200);
	}
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g){
		g.clearRect(0, 0, f_width, f_height);
		g.drawImage(myCharater, x, y, this);
	}
}
