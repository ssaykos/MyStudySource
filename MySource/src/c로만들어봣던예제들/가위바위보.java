package c�θ����f��������;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
	public static void main(String[] args) {
		String user;
		String com;
		int UserSel = 0;
		int ComSel=0;
		int UserScore=0;
		int ComScore=0;
		
		Random rand= new Random();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("�����ϱ��� ����ڿ� ��ǻ���� �̸��� �����մϴ�.");
			System.out.print("������� �̸��� �Է�->");
			user=scan.next();
			System.out.print("��ǻ���� �̸��� �Է�->");
			com=scan.next();
			System.out.println("���������� ������ �����մϴ�.");
			while(true){
			System.out.print("������ ->����(1) / ����(2) / ��(3) / ����(0): ");
			UserSel=scan.nextInt();
			ComSel= rand.nextInt(3);
			if(UserSel==0){
				System.out.println("����Ǿ����ϴ�.");
				return;
			}else if(UserSel==ComSel){
				System.out.println("�����ϴ�.");
			}else if(UserSel==(ComSel%3)+1){
				ComScore++;
				System.out.println("�����ϴ�.	\t ���� ���ھ� User->"+UserScore+" ��\t VS \t Com->"+ComScore+"��");
			}else if((UserSel%3)+1==ComSel){
				UserScore++;
				System.out.println("�̰���ϴ�. \t ���� ���ھ� User->"+UserScore+" ��\t VS \t Com->"+ComScore+"��");
			}
			}
		}
	}
}
