package �ڹ�1_�������_�����ʱ����ѹ߾�;

import java.awt.*;

import javax.swing.JFrame;

class asd

{

        public static void main(String[] args) 

        {

               Exam005_Sub ex = new Exam005_Sub("�ڹٸ� ��ƶ�");

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

        

        //�Ű����� ����. �⺻������ ������. ����ڰ� ���ϴ� ���� ��ġ��.

        private GridBagLayout gridbag = new GridBagLayout();

        //������ GridBagConstraints�� ���Ͽ� GridBag ���̾ƿ��� �����ϰ� �� �� �ִ�.

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

               //�⺻������ ȭ���� �� �߾ӿ� ��ġ�ȴ�.

               this.setLayout(gridbag);

 

               //���� ��ġ�ϰ��� �ϴ� ������Ʈ�� 0, 0�� ��ġ�Ѵ�. �� ���� ��ܤ��� ��Ÿ��.

               gc.gridx = 0;

               gc.gridy = 0;

               gridbag.setConstraints(bt1, gc);

                this.add(bt1);

 

               //ù��° ��ġ�� ������Ʈ�� ��������, x0, y1 ������ ���� ��ġ��Ų��.

               //��, 1�� 1�Ŀ� ��ġ ��Ų��.

               gc.gridx = 1;

               gc.gridy = 1;

               gridbag.setConstraints(bt2, gc);

               this.add(bt2);         

 

               // 2�� 2�Ŀ� ��ġ ��Ų��.

               gc.gridx = 2;

               gc.gridy = 2;

               gridbag.setConstraints(bt3, gc);

               this.add(bt3);

 

               gc.gridx = 3;

               gc.gridy = 2;

               gridbag.setConstraints(bt6, gc);

               this.add(bt6);

               

               //���� ���̸� ������ �� �ִ�. 

               gc.gridx = 2;

               gc.gridy = 0;

               gc.gridwidth = 2;

               gc.gridheight = 2;

               gridbag.setConstraints(bt5, gc);

               this.add(bt5);

 

               

        }
}