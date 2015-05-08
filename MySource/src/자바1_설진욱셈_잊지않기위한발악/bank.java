package 자바1_설진욱셈_잊지않기위한발악;

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
	String CustomerID;//계좌번호
	String CustomerPassword;//계좌 비밀번호
	String CustomerName;//계좌주 이름	
	String JoinDate;//가입 날짜정보
	String LoginDate;// 계좌에 접속한 날짜정보
	int CustomerMoney;//계좌 잔액
	
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
		
		manager = new JButton("관리자로그인");
		manager.setBounds(0, 400, 140, 50);
		super.add(manager);
		
		signup = new JButton("회원가입<계좌생성>");
		signup.setBounds(140, 300, 140, 50);
		super.add(signup);
		
		login = new JButton("로그인");
		login.setBounds(420, 300, 140, 50);
		super.add(login);
		
		time = new JLabel("라벨_날짜:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH+1)+"-"+cal.get(Calendar.DATE)+" 시간:"+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
		time.setBounds(400, 400, 200, 100);
		super.add(time);
		
		t_time= new JTextField("텍스트필드_날짜:"+cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH+1)+"-"+cal.get(Calendar.DATE)+" 시간:"+cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
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
		gbc.ipadx=200;//아이패드 액스와이는 바로 다음에 들어갈 곳의 크기를 정하는게 맞는듯.
		gbc.ipady=100;//이걸 지우면 딱 라벨 글자만큼으로 확 줄어버리더라..
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
		
		//6시간 넘게 썻다 지웟다만 반복햇는데 실패함..ㅠㅠ그리드 백 레이아웃을 도전하자..
	/*	out= new BorderLayout();
		
		out_side = new GridLayout(2, 3);
			p_bottom= new JPanel();
				manager = new JButton("관리자로그인");
				time= new JTextField();
				
		in= new BorderLayout();	
		
		in_side = new GridLayout(1,3);//그리드 레이아웃 1행2열 객체생성
			p_center_bottm = new JPanel();
				signup = new JButton("회원가입(계좌생성)");
				login = new JButton("로그인");
			p_center = new JPanel();
				//라벨
		
		
		
		
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
		
		
	/*	binyes = new JButton("[예]");
		binno = new JButton("[아니오]");
		jta= new JTextArea();
		chkbox = new JCheckBox("[아니오]를 활성화 시킵니다.");
		
		bl= new BorderLayout();
		
		gi = new GridLayout(1,2);//그리드 레이아웃 1행2열 객체생성
		
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
