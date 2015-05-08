package c로만들어봣던예제들;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
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
			System.out.println("시작하기전 사용자와 컴퓨터의 이름을 설정합니다.");
			System.out.print("사용자의 이름을 입력->");
			user=scan.next();
			System.out.print("컴퓨터의 이름을 입력->");
			com=scan.next();
			System.out.println("가위바위보 게임을 시작합니다.");
			while(true){
			System.out.print("고르세요 ->가위(1) / 바위(2) / 보(3) / 종료(0): ");
			UserSel=scan.nextInt();
			ComSel= rand.nextInt(3);
			if(UserSel==0){
				System.out.println("종료되었습니다.");
				return;
			}else if(UserSel==ComSel){
				System.out.println("비겼습니다.");
			}else if(UserSel==(ComSel%3)+1){
				ComScore++;
				System.out.println("졌습니다.	\t 현재 스코어 User->"+UserScore+" 점\t VS \t Com->"+ComScore+"점");
			}else if((UserSel%3)+1==ComSel){
				UserScore++;
				System.out.println("이겼습니다. \t 현재 스코어 User->"+UserScore+" 점\t VS \t Com->"+ComScore+"점");
			}
			}
		}
	}
}
