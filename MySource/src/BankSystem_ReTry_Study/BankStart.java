package BankSystem_ReTry_Study;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

import sun.text.ComposedCharIter;

public class BankStart extends JFrame implements Runnable,ActionListener,ItemListener {

	int fWidth=800;
	int fHeight=600;
	
	
	public BankStart() {
		// TODO Auto-generated constructor stub
		
		compose();
		start();
		
		setTitle("BankSystem");
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)screen.getWidth()/2-fWidth/2, (int)screen.getHeight()/2-fHeight/2, fWidth, fWidth);
		
		int f_xpos=(int)(screen.getWidth()/2-fWidth/2);
		int f_ypos=(int)(screen.getHeight()/2-fHeight/2);
		//프레임이 모니터 화면 정중앙에 배치하기 위한 좌표값 계산.
		
		setLocation(f_xpos, f_ypos);//프레임을 화면에 배치
		setResizable(false);//프레임 크기고정(임의로 크기변경 못하게 하기)
		setVisible(true);//프레임을 눈에 보이게 띄우기.
		
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
	private void compose() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
