package �ڹ�1_�������_�����ʱ����ѹ߾�;



import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 import java.awt.datatransfer.*;
 import java.applet.*;

import javax.swing.*;


 

public class asdf extends JFrame implements ActionListener {

 public MenuBar mb = new MenuBar();
  public Menu fileMenu = new Menu("����(F)");
  public MenuItem newFile = new MenuItem("����");
  public MenuItem openFile = new MenuItem("����");
  public MenuItem saveFile = new MenuItem("����");
  public MenuItem exit = new MenuItem("����(Alt + F4)");

 public Menu editMenu = new Menu("����(E)");
  public MenuItem cutFile = new MenuItem("�߶󳻱�(Ctrl + X)");
  public MenuItem copyFile = new MenuItem("�����ϱ�(Ctrl + C)");
  public MenuItem pasteFile = new MenuItem("�ٿ��ֱ�(Ctrl + V)");
  public MenuItem eraserFile = new MenuItem("�����(Del)");
  public MenuItem allselectFile = new MenuItem("��ü����(Ctrl + A)");
  public Menu textType = new Menu("�۲�");
  public Menu fontColor = new Menu("���ڻ���");
  public MenuItem Colorpink = new MenuItem("��ȫ");
  public MenuItem Colorred = new MenuItem("����");
  public MenuItem Coloryellow = new MenuItem("���");
  public MenuItem Colorblue = new MenuItem("�Ķ�");
  public MenuItem Colorgreen = new MenuItem("�ʷ�");
  public MenuItem Colorwhite = new MenuItem("�Ͼ�");
  public MenuItem Colorblack = new MenuItem("����");
  public MenuItem fontStyle = new MenuItem("���ڸ��");
  public Menu fontBG = new Menu("���ڹ��");
  public MenuItem BGpink = new MenuItem("��ȫ");
  public MenuItem BGred = new MenuItem("����");
  public MenuItem BGyellow = new MenuItem("���");
  public MenuItem BGblue = new MenuItem("�Ķ�");
  public MenuItem BGgreen = new MenuItem("�ʷ�");
  public MenuItem BGwhite = new MenuItem("�Ͼ�");
  public MenuItem BGblack = new MenuItem("����");

 public Menu searchMenu = new Menu("�˻�(S)");
  public MenuItem findFile = new MenuItem("ã��");
  public MenuItem findchangeFile = new MenuItem("ã�� �ٲٱ�");

 public Menu helpMenu = new Menu("����(H)");
  public MenuItem information = new MenuItem("�� �����е� ����");
  public FileDialog fd = null;

 public JTextArea ta ;
  Container cp = getContentPane();
  JDialog dlg_Font ;
  Font f ;
  Choice cho_Font ;
  Choice cho_Size ;
  JLabel lbl_Font ;
  JButton btn_setFont ;

 Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard(); //Ŭ������ ��ü
 
  MyFindDialog findDlg = new MyFindDialog(this,ta);

private void initMember()// ��� ������ �ʱ�ȭ
 {
   f = new Font("Dialog", Font.PLAIN, 12);// �⺻ ��Ʈ ����
  ta = new JTextArea(); // �ؽ�Ʈ Area����
  ta.setFont(f); // �⺻��Ʈ ����

  String[] F_font = { "Dialog", "DialogInput", "Serif", "SansSerif", "Monospaced"};
   cho_Font = new Choice(); // �۲�
  String[] F_size = { "10", "12", "14", "16" , "18"};
   cho_Size = new Choice(); // ũ��

  for ( int i=0 ; i<5 ; i++ )//���ø޴��� ���û��׵��� ����ִ´�.
   {
    cho_Font.add(F_font[i]);
    cho_Size.add(F_size[i]);
   }
   btn_setFont = new JButton("����");
  }

 private void setFont()
  {
   String style = cho_Font.getSelectedItem();
   int size = Integer.parseInt(cho_Size.getSelectedItem());
   Font lblsFont = new Font(style, Font.PLAIN, size); // ���� ��Ʈ
  lbl_Font.setFont(lblsFont);  // ���� ���� ��
 }

 private void addListener()
  {
  // ������ ������
  cho_Font.addItemListener(new ItemListener()
   {
    public void itemStateChanged(ItemEvent ie)
    {
     setFont();
    }
   });
   cho_Size.addItemListener(new ItemListener()
   {
    public void itemStateChanged(ItemEvent ie)
    {
     setFont();
    }
   });
  // �׼� ������
  btn_setFont.addActionListener(this);
  }


  public asdf(){

  initMember(); 
   addListener();
   this.setTitle("�� �����е�~");
   setLocation(200,150);


 //������Ʈ���� ����

  fileMenu.add(newFile);
   newFile.addActionListener(this);
   fileMenu.add(openFile);
   openFile.addActionListener(this);
   fileMenu.add(saveFile);
   saveFile.addActionListener(this);
   fileMenu.addSeparator();
   fileMenu.add(exit);
   exit.addActionListener(this);

  editMenu.add(cutFile);
   cutFile.addActionListener(this);
   editMenu.add(copyFile);
   copyFile.addActionListener(this);
   editMenu.add(pasteFile);
   pasteFile.addActionListener(this);
   editMenu.add(eraserFile);
   eraserFile.addActionListener(this);
   editMenu.addSeparator();
   editMenu.add(allselectFile);
   allselectFile.addActionListener(this);
  
   editMenu.add(textType);
   textType.addActionListener(this);
   textType.add(fontStyle);
   fontStyle.addActionListener(this); 

  fontColor.addActionListener(this);
   textType.add(fontColor);
   Colorred.addActionListener(this);
   fontColor.add(Colorpink);
   fontColor.addActionListener(this);
   fontColor.add(Colorred);
   Colorpink.addActionListener(this);
   fontColor.add(Coloryellow);
   Coloryellow.addActionListener(this);
   fontColor.add(Colorblue);
   Colorblue.addActionListener(this);
   fontColor.add(Colorgreen);
   Colorgreen.addActionListener(this);
   fontColor.add(Colorblack);
   Colorblack.addActionListener(this);
   fontColor.add(Colorwhite);
   Colorwhite.addActionListener(this);
  
   textType.add(fontBG);
   BGred.addActionListener(this);
   fontBG.add(BGpink);
   fontBG.addActionListener(this);
   fontBG.add(BGred);
   BGpink.addActionListener(this);
   fontBG.add(BGyellow);
   BGyellow.addActionListener(this);
   fontBG.add(BGblue);
   BGblue.addActionListener(this);
   fontBG.add(BGgreen);
   BGgreen.addActionListener(this);
   fontBG.add(BGblack);
   BGblack.addActionListener(this);
   fontBG.add(BGwhite);
   BGwhite.addActionListener(this);
    
   searchMenu.add(findFile);
   findFile.addActionListener(this);
   searchMenu.addSeparator();
   searchMenu.add(findchangeFile);
   findchangeFile.addActionListener(this);

  helpMenu.add(information);
   information.addActionListener(this);

  mb.add(fileMenu);
   mb.add(editMenu);
   mb.add(searchMenu);
   mb.add(helpMenu);
   setMenuBar(mb);
   add(ta);

  setSize(550,400);
   setVisible(true);

//������ ������ ����
  addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
     System.exit(0);//����
   }
   });
  }

//�׼� �̺�Ʈ ����
 public void actionPerformed(ActionEvent e) {

//���ϸ޴�
  if(e.getSource()==openFile){
    try{
     open();
    }catch(Exception ef){}
   }
   else if(e.getSource()==saveFile){  
    try{
     save();
    }catch(Exception ef){}
   }
   else if(e.getSource()==newFile)
    newFile();
   else if(e.getSource()==exit)
    exit();

  else if (e.getSource() == btn_setFont)
   {
    String style = cho_Font.getSelectedItem();
    int size = Integer.parseInt(cho_Size.getSelectedItem());
    f = new Font(style, Font.PLAIN, size) ;
    dlg_Font.dispose();  
    ta.setFont(f);
   }

//�����޴�
  else if(e.getSource()==copyFile)
    copy();
   else if (e.getSource()==pasteFile)
    paste();
   else if (e.getSource()==cutFile)
    cut(); 
   else if (e.getSource()==eraserFile)
    erase();
   else if (e.getSource()==allselectFile)
  selAll();
   else if (e.getSource()==fontStyle)
    fontStyle();
   else if (e.getSource()==Colorpink)
    Colorpink();
   else if (e.getSource()==Colorred)
    Colorred();
   else if (e.getSource()==Colorwhite)
    Colorwhite();
   else if (e.getSource()==Coloryellow)
    Coloryellow();
   else if (e.getSource()==Colorgreen)
    Colorgreen();
   else if (e.getSource()==Colorblue)
    Colorblue();
   else if (e.getSource()==Colorblack)
    Colorblack();
   else if (e.getSource()==BGpink)
    BGpink();
   else if (e.getSource()==BGred)
    BGred();
   else if (e.getSource()==BGwhite)
    BGwhite();
   else if (e.getSource()==BGyellow)
    BGyellow();
   else if (e.getSource()==BGgreen)
    BGgreen();
   else if (e.getSource()==BGblue)
    BGblue();
   else if (e.getSource()==BGblack)
    BGblack();


 //�˻��޴�
  else if (e.getSource()==findFile)
    find();
   else if (e.getSource()==findchangeFile)
    change();

//����
  else if (e.getSource()==information)
    about();
  }

 

//�׼ǿ� ���� �� �Լ���

 // ������
 public void newFile(){
   ta.setText("");
  }

 //����
 public void open() throws IOException{
   fd = new FileDialog(this,"���� ����",FileDialog.LOAD);
   fd.setFile("*.txt");
   fd.setVisible(true);
   String dir= fd.getDirectory();
   String file = fd.getFile();
   this.setTitle(dir+file);
   if(!dir.equals(null) || !file.equals(null)){
    ta.setText("");
    FileReader in = new FileReader(dir+file);
    BufferedReader br= new BufferedReader(in,1024*24);
    String line = null;
    while( (line = br.readLine() ) != null )
     ta.append(line+"\n");
    ta.setFocusable(true);
    ta.setCaretPosition(0);
   }
  }

 //����
 public void save() throws IOException{
   fd = new FileDialog(this,"���� ����",FileDialog.SAVE);
   fd.setVisible(true);
   String dir= fd.getDirectory();
   String file = fd.getFile();
   this.setTitle(dir+file);
   if(!dir.equals(null) || !file.equals(null)){
    OutputStream out = new FileOutputStream(dir+file);
    String line = ta.getText();
    byte[] buf = line.getBytes();
    out.write(buf);
   }
  }
  
  //����
 public void exit(){
   System.exit(0);
  }

 //����
 public void copy(){
   String str = ta.getSelectedText();
   cb.setContents(new StringSelection(str),null);
  }

 //�ٿ��ֱ�
 public void paste(){
  
   Transferable content=cb.getContents(null);
   try {
          String str = (String)content.getTransferData(DataFlavor.stringFlavor);
    ta.replaceRange(str,ta.getSelectionStart(),ta.getSelectionEnd());
   }catch(Exception ue){}
        
  }

 // �߶󳻱�
 public void cut(){
   String str = ta.getSelectedText();
   cb.setContents(new StringSelection(str),null);
      ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }
  
  //�����
 public void erase(){
   ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }
  
  //��ü����
 public void selAll(){
   ta.setSelectionStart(0);
   ta.setSelectionEnd(ta.getText().length());
  }

 //���� ���&ũ�� ����
 public void fontStyle()
  {
   dlg_Font = new JDialog(this, "��Ʈ ����", true);
   Container fcp = dlg_Font.getContentPane();
  
   JPanel pnl_Font = new JPanel();
   pnl_Font.add(new JLabel("�۲�"));
   pnl_Font.add(cho_Font);
   JPanel pnl_Size = new JPanel();
   pnl_Size.add(new JLabel("ũ��"));
   pnl_Size.add(cho_Size);

  JPanel pnl_All = new JPanel();
   JPanel pnl_Center = new JPanel();
   pnl_Center.add(pnl_Font);
   pnl_Center.add(pnl_Size);
   JPanel pnl_East = new JPanel();
   pnl_East.add(btn_setFont);
   pnl_All.add(pnl_Center, BorderLayout.CENTER);
   pnl_All.add(pnl_East, BorderLayout.EAST);

  lbl_Font = new JLabel("ABCDE, ������, 200411649");
   lbl_Font.setFont(f);
  
   fcp.add(new JLabel(" �۲ð� ũ�⸦ ������ �ּ��䢽"), BorderLayout.NORTH);
   fcp.add(pnl_All, BorderLayout.CENTER);
   fcp.add(lbl_Font, BorderLayout.SOUTH); 

  dlg_Font.pack();
   dlg_Font.setLocation(300,300);
   dlg_Font.setVisible(true);
  }

 //���� ��������
 public void Colorpink(){ 
   ta.setForeground(Color.pink); 
  }
  public void Colorred(){
   ta.setForeground(Color.red);
  }
  public void Colorwhite(){ 
   ta.setForeground(Color.white);
  }
  public void Coloryellow(){ 
   ta.setForeground(Color.yellow);
  }
  public void Colorblue(){ 
   ta.setForeground(Color.blue);
  }
  public void Colorblack(){ 
   ta.setForeground(Color.black);
  }
  public void Colorgreen(){ 
   ta.setForeground(Color.green);
  }
  //���� ��� ��������
 public void BGpink(){
   ta.setBackground(Color.pink);
  }
  public void BGred(){
   ta.setBackground(Color.red);
  }
  public void BGwhite(){ 
   ta.setBackground(Color.white);
  }
  public void BGyellow(){ 
   ta.setBackground(Color.yellow);
  }
  public void BGblue(){ 
   ta.setBackground(Color.blue);
  }
  public void BGblack(){ 
   ta.setBackground(Color.black);
  }
  public void BGgreen(){ 
   ta.setBackground(Color.green);
  }

 //ã��
 public void find(){
   findDlg.showFind();
  }

 //ã�ƹٲٱ�
 public void change(){
   findDlg.showReplace();
  
  }
  
  // ����
 public void about(){
  findDlg.abt();
  
  }

 public static void main(String args[]){
   new asdf();
  }
 }


 //'ã�ƹٲٱ� ���̾� �α�' Ŭ���� �߰�


class MyFindDialog extends Dialog implements ActionListener{

  private Label lFind=new Label("ã�� ���ڿ�:");
   private Label lReplace=new Label("�ٲ� ���ڿ�:");
   private TextField tFind=new TextField(10);
   private TextField tReplace=new TextField(10);
   private Button bFind=new Button("ã��");
   private Button bReplace=new Button("�ٲٱ�");
   private JTextArea ta;

  public MyFindDialog(JFrame owner, JTextArea ta){

    super(owner,"ã��",false);

    this.ta=ta;

    setLayout(null);//���̾ƿ� ����

    lFind.setBounds(10,30,80,20); lReplace.setBounds(10,70,80,20);

    tFind.setBounds(90,30,90,20); tReplace.setBounds(90,70,90,20);

    bFind.setBounds(190,30,80,20); bReplace.setBounds(190,70,80,20);

    add(lFind); add(tFind); add(bFind); add(lReplace);

    add(tReplace); add(bReplace);

    setResizable(false);

    bFind.addActionListener(this);

    bReplace.addActionListener(this);

    addWindowListener( new WindowAdapter(){

         public void windowClosing(WindowEvent e){

           MyFindDialog.this.dispose();

         }

    });

  }

  public void showFind(){

    setTitle("ã��"); setLocation(300,300); setSize(280,60); setVisible(true);

  }

  public void showReplace(){

    setTitle("ã�� �ٲٱ�"); setLocation(300,300); setSize(280,110); setVisible(true);

  }
   public void abt(){
    setTitle("�� �׵��� ���� �ҽ����� ����� ��");
    setLocation(200,300); setSize(550,0);setVisible(true);
   }

 
  private void find() {
   String text = ta.getText();
   text = text.replaceAll("\\r", "");  
   String str = tFind.getText();
   int end = text.length();
   int len = str.length();
   int start = ta.getSelectionEnd();
   if (start == end)start = 0;
   for (; start <= end - len; start++) {
    if (text.substring(start, start + len).equals(str)) {
     ta.setText(text);
     ta.setSelectionStart(start);
     ta.setSelectionEnd(start + len);
     ta.requestFocus(); // Focus�� ���������ν� ���õ� ������ ��Ÿ����.
     return;
    }
   }
   ta.setSelectionStart(end);
   ta.setSelectionEnd(end);
   ta.requestFocus();
  }

//ã�ƹٲٱ⿡ ���� ����

  private void replace(){

    String str=tReplace.getText();

    if(ta.getSelectedText().equals(tFind.getText()))

    ta.replaceRange(str,ta.getSelectionStart(),ta.getSelectionEnd()); 

    else find();

  }

  public void actionPerformed(ActionEvent e){

    if(e.getSource()==bFind)

      find();

    else if(e.getSource()==bReplace)

      replace();
   }
 }
