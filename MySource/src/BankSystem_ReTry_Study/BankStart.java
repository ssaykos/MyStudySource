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
		//�������� ����� ȭ�� ���߾ӿ� ��ġ�ϱ� ���� ��ǥ�� ���.
		
		setLocation(f_xpos, f_ypos);//�������� ȭ�鿡 ��ġ
		setResizable(false);//������ ũ�����(���Ƿ� ũ�⺯�� ���ϰ� �ϱ�)
		setVisible(true);//�������� ���� ���̰� ����.
		
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
