package �ڹ�1_�������_�����ʱ����ѹ߾�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.StyledEditorKit.FontSizeAction;



public class bank {

	public static void main(String[] args) {

		BankFrame bank = new BankFrame();
		
	}

}
class BankData{
	String CustomerID;//���¹�ȣ
	String CustomerPassword;//���� ��й�ȣ
	String CustomerName;//������ �̸�	
	String JoinDate;//���� ��¥����
	String LoginDate;// ���¿� ������ ��¥����
	int CustomerMoney;//���� �ܾ�
	
}

class BankFrame extends JFrame implements Runnable{

	//private static final Component NULL = null;
	int f_width = 700;
	int f_height = 500;
	
	private JLabel time;
	//Label t_label = new Label("Bank System",Label.CENTER);
	private JLabel t_label;
	private JTextField t_time;
	private JButton login,signup,manager;
	
	private GridBagLayout gbl;
	private GridBagConstraints gbc;
/*	
	private JPanel p_time;
	private JPanel p_t_label;
	private JPanel p_login;
	private JPanel p_signup;
	private JPanel p_manager;*/
	private Calendar cal;
	/*private BorderLayout out;
	private BorderLayout in;
	
	private GridLayout out_side;
	private GridLayout in_side;
	
	private JPanel p_bottom;
	private JPanel p_center_bottm;
	private JPanel p_center;*/

	BankFrame() {
		
		setTitle("BankFrame");
			
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)(screen.getWidth()/2-f_width/2), (int)(screen.getHeight()/2-f_height/2), f_width, f_height);
		
		compose_start();
		event_start();
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void event_start() {
		
	}
	private void event_signup(){
		
	}
	private void event_login(){
		
	}
	private void event_moneyinput(){
		
	}
	private void event_moneyoutput(){
	
	}
	private void event_moneytrade(){
		
	}

	private void compose_start() {
				
		gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		cal=Calendar.getInstance();
		
		t_label = new JLabel("Bank System");
		t_label.setBounds(140, 100, 420, 150);
//		t_label.setSize(300, 100);
		t_label.setHorizontalAlignment(0);
		t_label.setBorder(new LineBorder(Color.BLACK, 1));
		t_label.setFont(new Font("Arial", Font.PLAIN, 32));
		super.add(t_label);		
		
		manager = new JButton("�����ڷα���");
		manager.setBounds(0, 400, 140, 50);
		super.add(manager);
		
		signup = new JButton("ȸ������<���»���>");
		signup.setBounds(140, 300, 140, 50);
		super.add(signup);
		
		login = new JButton("�α���");
		login.setBounds(420, 300, 140, 50);
		super.add(login);
		
		time = new JLabel("��_��¥:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH+1)+"-"+cal.get(Calendar.DATE)+" �ð�:"+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		time.setBounds(400, 400, 200, 100);
		super.add(time);
		
		t_time= new JTextField("�ؽ�Ʈ�ʵ�_��¥:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH+1)+"-"+cal.get(Calendar.DATE)+" �ð�:"+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		time.setBounds(400, 300, 200, 100);
		super.add(t_time);
		
		/*p_t_label = new JPanel();
		p_manager = new JPanel();
		p_signup = new JPanel();
		p_login = new JPanel();
		p_time = new JPanel();*/
				
//		gbc.fill = GridBagConstraints.BOTH;
		
		/*gbc.gridx = 2 ;
		gbc.gridy = 2 ;
		gbc.gridwidth = 6;
		gbc.gridheight= 3;
		gbc.ipadx=200;//�����е� �׽����̴� �ٷ� ������ �� ���� ũ�⸦ ���ϴ°� �´µ�.
		gbc.ipady=100;//�̰� ����� �� �� ���ڸ�ŭ���� Ȯ �پ��������..
		gbl.setConstraints(t_label, gbc);
		super.add(t_label);
		
		gbc.gridx=2;
		gbc.gridy=6;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.ipadx=50;
		gbc.ipady=30;
		gbl.setConstraints(signup, gbc);
 		super.add(signup);
		
		gbc.gridx=6;
		gbc.gridy=6;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.ipadx=150;
		gbc.ipady=30;
		
		gbl.setConstraints(login, gbc);
		super.add(login);*/
		
		//6�ð� �Ѱ� ���� ���m�ٸ� �ݺ��޴µ� ������..�Фб׸��� �� ���̾ƿ��� ��������..
	/*	out= new BorderLayout();
		
		out_side = new GridLayout(2, 3);
			p_bottom= new JPanel();
				manager = new JButton("�����ڷα���");
				time= new JTextField();
				
		in= new BorderLayout();	
		
		in_side = new GridLayout(1,3);//�׸��� ���̾ƿ� 1��2�� ��ü����
			p_center_bottm = new JPanel();
				signup = new JButton("ȸ������(���»���)");
				login = new JButton("�α���");
			p_center = new JPanel();
				//��
		
		
		
		
		super.setLayout(out);
		out_side.layoutContainer(manager);
		out_side.layoutContainer(null);
		out_side.layoutContainer(null);
		out_side.layoutContainer(null);
		out_side.layoutContainer(null);
		out_side.layoutContainer(time);
		p_bottom.setLayout(out_side);
		out.addLayoutComponent(p_bottom, BorderLayout.SOUTH);
		
		
		super.add(p_bottom, BorderLayout.SOUTH);
		
		
		p_center.setLayout(in_side);
		in_side.layoutContainer(signup);
		in_side.layoutContainer((Container) NULL);
		in_side.layoutContainer(login);
		p_bottom.setLayout(out_side);
		
		p_center_bottm.add(signup);
		p_center_bottm.addNotify();
		p_center_bottm.add(login);
		
		out_side.layoutContainer(p_center);
		
		out_side.layoutContainer(manager);
		out_side.layoutContainer(time);
		p_bottom.setLayout(out_side);
		
*/
		
		
	/*	binyes = new JButton("[��]");
		binno = new JButton("[�ƴϿ�]");
		jta= new JTextArea();
		chkbox = new JCheckBox("[�ƴϿ�]�� Ȱ��ȭ ��ŵ�ϴ�.");
		
		bl= new BorderLayout();
		
		gi = new GridLayout(1,2);//�׸��� ���̾ƿ� 1��2�� ��ü����
		
		pNorth= new JPanel();
		
		pNorth.setLayout(gi);
		super.setLayout(bl);
		
		pNorth.add(binyes);
		pNorth.add(binno);
		
		super.add(pNorth, BorderLayout.NORTH);
		
		super.add(jta, BorderLayout.CENTER);
		super.add(chkbox, BorderLayout.SOUTH);
		
		binno.setEnabled(false);*/
		
		
		
		
	}
	private void compose_signup(){
		
	}
	private void compose_login(){
		
	}
	private void compose_moneyinput(){
		
	}
	private void compose_moneyoutput(){
	
	}
	private void compose_moneytrade(){
		
	}


	public void start(){
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
