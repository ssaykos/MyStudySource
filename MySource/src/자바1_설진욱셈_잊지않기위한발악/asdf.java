package 자바1_설진욱셈_잊지않기위한발악;



import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 import java.awt.datatransfer.*;
 import java.applet.*;

import javax.swing.*;


 

public class asdf extends JFrame implements ActionListener {

 public MenuBar mb = new MenuBar();
  public Menu fileMenu = new Menu("파일(F)");
  public MenuItem newFile = new MenuItem("새글");
  public MenuItem openFile = new MenuItem("열기");
  public MenuItem saveFile = new MenuItem("저장");
  public MenuItem exit = new MenuItem("종료(Alt + F4)");

 public Menu editMenu = new Menu("편집(E)");
  public MenuItem cutFile = new MenuItem("잘라내기(Ctrl + X)");
  public MenuItem copyFile = new MenuItem("복사하기(Ctrl + C)");
  public MenuItem pasteFile = new MenuItem("붙여넣기(Ctrl + V)");
  public MenuItem eraserFile = new MenuItem("지우기(Del)");
  public MenuItem allselectFile = new MenuItem("전체선택(Ctrl + A)");
  public Menu textType = new Menu("글꼴");
  public Menu fontColor = new Menu("글자색깔");
  public MenuItem Colorpink = new MenuItem("분홍");
  public MenuItem Colorred = new MenuItem("빨강");
  public MenuItem Coloryellow = new MenuItem("노랑");
  public MenuItem Colorblue = new MenuItem("파랑");
  public MenuItem Colorgreen = new MenuItem("초록");
  public MenuItem Colorwhite = new MenuItem("하양");
  public MenuItem Colorblack = new MenuItem("검정");
  public MenuItem fontStyle = new MenuItem("글자모양");
  public Menu fontBG = new Menu("글자배경");
  public MenuItem BGpink = new MenuItem("분홍");
  public MenuItem BGred = new MenuItem("빨강");
  public MenuItem BGyellow = new MenuItem("노랑");
  public MenuItem BGblue = new MenuItem("파랑");
  public MenuItem BGgreen = new MenuItem("초록");
  public MenuItem BGwhite = new MenuItem("하양");
  public MenuItem BGblack = new MenuItem("검정");

 public Menu searchMenu = new Menu("검색(S)");
  public MenuItem findFile = new MenuItem("찾기");
  public MenuItem findchangeFile = new MenuItem("찾아 바꾸기");

 public Menu helpMenu = new Menu("도움말(H)");
  public MenuItem information = new MenuItem("내 워드패드 정보");
  public FileDialog fd = null;

 public JTextArea ta ;
  Container cp = getContentPane();
  JDialog dlg_Font ;
  Font f ;
  Choice cho_Font ;
  Choice cho_Size ;
  JLabel lbl_Font ;
  JButton btn_setFont ;

 Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard(); //클립보드 객체
 
  MyFindDialog findDlg = new MyFindDialog(this,ta);

private void initMember()// 멤버 변수들 초기화
 {
   f = new Font("Dialog", Font.PLAIN, 12);// 기본 폰트 설정
  ta = new JTextArea(); // 텍스트 Area생성
  ta.setFont(f); // 기본폰트 적용

  String[] F_font = { "Dialog", "DialogInput", "Serif", "SansSerif", "Monospaced"};
   cho_Font = new Choice(); // 글꼴
  String[] F_size = { "10", "12", "14", "16" , "18"};
   cho_Size = new Choice(); // 크기

  for ( int i=0 ; i<5 ; i++ )//선택메뉴에 선택사항들을 집어넣는다.
   {
    cho_Font.add(F_font[i]);
    cho_Size.add(F_size[i]);
   }
   btn_setFont = new JButton("설정");
  }

 private void setFont()
  {
   String style = cho_Font.getSelectedItem();
   int size = Integer.parseInt(cho_Size.getSelectedItem());
   Font lblsFont = new Font(style, Font.PLAIN, size); // 라벨의 폰트
  lbl_Font.setFont(lblsFont);  // 샘플 보기 라벨
 }

 private void addListener()
  {
  // 아이템 리스너
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
  // 액션 리스너
  btn_setFont.addActionListener(this);
  }


  public asdf(){

  initMember(); 
   addListener();
   this.setTitle("내 워드패드~");
   setLocation(200,150);


 //컴포넌트들을 부착

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

//윈도우 리스너 설정
  addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
     System.exit(0);//종료
   }
   });
  }

//액션 이벤트 설정
 public void actionPerformed(ActionEvent e) {

//파일메뉴
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

//편집메뉴
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


 //검색메뉴
  else if (e.getSource()==findFile)
    find();
   else if (e.getSource()==findchangeFile)
    change();

//도움말
  else if (e.getSource()==information)
    about();
  }

 

//액션에 반응 할 함수들

 // 새파일
 public void newFile(){
   ta.setText("");
  }

 //열기
 public void open() throws IOException{
   fd = new FileDialog(this,"파일 열기",FileDialog.LOAD);
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

 //저장
 public void save() throws IOException{
   fd = new FileDialog(this,"파일 저장",FileDialog.SAVE);
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
  
  //종료
 public void exit(){
   System.exit(0);
  }

 //복사
 public void copy(){
   String str = ta.getSelectedText();
   cb.setContents(new StringSelection(str),null);
  }

 //붙여넣기
 public void paste(){
  
   Transferable content=cb.getContents(null);
   try {
          String str = (String)content.getTransferData(DataFlavor.stringFlavor);
    ta.replaceRange(str,ta.getSelectionStart(),ta.getSelectionEnd());
   }catch(Exception ue){}
        
  }

 // 잘라내기
 public void cut(){
   String str = ta.getSelectedText();
   cb.setContents(new StringSelection(str),null);
      ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }
  
  //지우기
 public void erase(){
   ta.replaceRange("",ta.getSelectionStart(),ta.getSelectionEnd());
  }
  
  //전체선택
 public void selAll(){
   ta.setSelectionStart(0);
   ta.setSelectionEnd(ta.getText().length());
  }

 //글자 모양&크기 조절
 public void fontStyle()
  {
   dlg_Font = new JDialog(this, "폰트 변경", true);
   Container fcp = dlg_Font.getContentPane();
  
   JPanel pnl_Font = new JPanel();
   pnl_Font.add(new JLabel("글꼴"));
   pnl_Font.add(cho_Font);
   JPanel pnl_Size = new JPanel();
   pnl_Size.add(new JLabel("크기"));
   pnl_Size.add(cho_Size);

  JPanel pnl_All = new JPanel();
   JPanel pnl_Center = new JPanel();
   pnl_Center.add(pnl_Font);
   pnl_Center.add(pnl_Size);
   JPanel pnl_East = new JPanel();
   pnl_East.add(btn_setFont);
   pnl_All.add(pnl_Center, BorderLayout.CENTER);
   pnl_All.add(pnl_East, BorderLayout.EAST);

  lbl_Font = new JLabel("ABCDE, 고마워요, 200411649");
   lbl_Font.setFont(f);
  
   fcp.add(new JLabel(" 글꼴과 크기를 선택해 주세요♡"), BorderLayout.NORTH);
   fcp.add(pnl_All, BorderLayout.CENTER);
   fcp.add(lbl_Font, BorderLayout.SOUTH); 

  dlg_Font.pack();
   dlg_Font.setLocation(300,300);
   dlg_Font.setVisible(true);
  }

 //글자 색상조절
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
  //글자 배경 색상조절
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

 //찾기
 public void find(){
   findDlg.showFind();
  }

 //찾아바꾸기
 public void change(){
   findDlg.showReplace();
  
  }
  
  // 도움말
 public void about(){
  findDlg.abt();
  
  }

 public static void main(String args[]){
   new asdf();
  }
 }


 //'찾아바꾸기 다이얼 로그' 클래스 추가


class MyFindDialog extends Dialog implements ActionListener{

  private Label lFind=new Label("찾을 문자열:");
   private Label lReplace=new Label("바꿀 문자열:");
   private TextField tFind=new TextField(10);
   private TextField tReplace=new TextField(10);
   private Button bFind=new Button("찾기");
   private Button bReplace=new Button("바꾸기");
   private JTextArea ta;

  public MyFindDialog(JFrame owner, JTextArea ta){

    super(owner,"찾기",false);

    this.ta=ta;

    setLayout(null);//레이아웃 설정

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

    setTitle("찾기"); setLocation(300,300); setSize(280,60); setVisible(true);

  }

  public void showReplace(){

    setTitle("찾아 바꾸기"); setLocation(300,300); setSize(280,110); setVisible(true);

  }
   public void abt(){
    setTitle("★ 그동안 모은 소스들의 결과물 ★");
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
     ta.requestFocus(); // Focus를 설정함으로써 선택된 영역이 나타난다.
     return;
    }
   }
   ta.setSelectionStart(end);
   ta.setSelectionEnd(end);
   ta.requestFocus();
  }

//찾아바꾸기에 의해 동작

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
