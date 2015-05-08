package 자바1_설진욱셈_잊지않기위한발악;

import java.awt.*;

import javax.swing.JFrame;

class asd

{

        public static void main(String[] args) 

        {

               Exam005_Sub ex = new Exam005_Sub("자바를 잡아라");

        }

}

 

class Exam005_Sub extends JFrame

{

 

        private Button bt1 = new Button("AAA");

        private Button bt2 = new Button("BBB");

        private Button bt3 = new Button("CCC");

        private Button bt4 = new Button("DDD");

        private Button bt5 = new Button("EEE");

        private Button bt6 = new Button("FFF");

        private Button bt7 = new Button("GGG");

        

        //매개변수 없음. 기본값으로 설정됨. 사용자가 원하는 곳에 배치함.

        private GridBagLayout gridbag = new GridBagLayout();

        //다음의 GridBagConstraints를 통하여 GridBag 레이아웃을 조절하게 할 수 있다.

        private GridBagConstraints gc = new GridBagConstraints();

        public Exam005_Sub(String title){

               super(title);

 

               super.setSize(300, 300);

               

               this.init();

 

               Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

               

               Dimension frm = super.getSize();

               

               

 

               int xpos = (int)(screen.getWidth() / 2 - frm.getWidth() / 2);

               int ypos = (int)(screen.getHeight() / 2 - frm.getHeight() / 2);

               super.setLocation(xpos, ypos);

 

 

               super.setVisible(true);

 
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        

        

        public void init()

        {

               //기본값으로 화면의 정 중앙에 배치된다.

               this.setLayout(gridbag);

 

               //지금 배치하고자 하는 컴포넌트를 0, 0에 배치한다. 즉 좌측 상단ㅇㅔ 나타남.

               gc.gridx = 0;

               gc.gridy = 0;

               gridbag.setConstraints(bt1, gc);

                this.add(bt1);

 

               //첫번째 배치된 컴포넌트를 기준으로, x0, y1 떨어진 곳에 위치시킨다.

               //즉, 1행 1렬에 위치 시킨다.

               gc.gridx = 1;

               gc.gridy = 1;

               gridbag.setConstraints(bt2, gc);

               this.add(bt2);         

 

               // 2행 2렬에 위치 시킨다.

               gc.gridx = 2;

               gc.gridy = 2;

               gridbag.setConstraints(bt3, gc);

               this.add(bt3);

 

               gc.gridx = 3;

               gc.gridy = 2;

               gridbag.setConstraints(bt6, gc);

               this.add(bt6);

               

               //폭과 높이를 지정할 수 있다. 

               gc.gridx = 2;

               gc.gridy = 0;

               gc.gridwidth = 2;

               gc.gridheight = 2;

               gridbag.setConstraints(bt5, gc);

               this.add(bt5);

 

               

        }
}