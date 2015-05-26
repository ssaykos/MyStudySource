package NewTryOfCollection;

import java.util.Scanner;

public class LottoMainController {
	public static void main(String[] args) {
		LottoService lotto = new LottoService();// 되도록 주요 기능은 서비스에서 처리 하도록 하기 위한 인스턴스 형성//최대한 로직은 서비스로 올리도록 한다.
		Scanner scanner = new Scanner(System.in);
		boolean topMenu=false;
		while(!topMenu){
			System.out.println("로또 프로그램을 시작합니다.");
			System.out.println("실행 할 기능의 숫자를 입력하라는 곳이 나오면 다음 중에 입력하세요.");
			System.out.println("0.종료");
			System.out.println("1. 자동 로또번호 출력.");
			System.out.println("2. 수동 로또번호 출력.");//할 수 있으면 3~5번 기능은 1번과 2번을 사용하여 데이터값이 저장 되었을때만 생성 되도록 하기.//물론 되면 아래의 로직을 손봐야 한다.
			System.out.println("3. 현재까지의 당첨 로또 번호 출력");
			System.out.println("4. 현재까지의 고객님께서 선택 로또 번호 내역 출력");
			System.out.println("5. 현재까지의 당첨 로또 번호와 고객님의 선택 로또 번호 내역 출력");
			System.out.println("실행 하실 항목의 숫자를 입력하세요(0~5) ->");
			// 실제는 지난주의 당첨 번호만 출력하는 것도 필요 할꺼고. 어떤 특정 회차에서의 기록만 출력하는 것도 있을 것이나..이정도로 만해도 앞의 두가지는 가능하지 않을까? 싶다.
			int topMenuSel=0;
			
			try {//어떤 청개구리 심보의 사용자가 0-5의 숫자로 메뉴를 선택하라는 안내를 무시하고 문자를 집어 넣었을 경우에 대한 에러문 처리. 
				topMenuSel = scanner.nextInt();
				boolean topMenuSelectCheck=false;//0-5의 숫자가 맞는지에 대한 체크를 할때 체크가 통과하면 트루값이 나와서 반복문에 낫연산으로 인해 페일로 바뀌어서 다시 돌지 않도록하는
								//반복문의 체크 기능을 담당하는 변수
				while(!topMenuSelectCheck){
					topMenuSelectCheck=lotto.menuSelectCheck(topMenuSel); // 0-5의 숫자를 사용 하라고 했으나 실수로나 장난으로 다른 숫자를 넣었을 경우에 대한 체크처리.
					lotto.menuSelectFalse(topMenuSelectCheck);
				}
			} catch (java.util.InputMismatchException e) {
				// TODO: handle exception
				System.out.println("잘못된 값이 입력됨으로 인해 에러가 발생 하였습니다. 다시 실행 시켜주세요.");
				return;
			}
			int selectChoice=0;
			try {
				boolean subMenuSelectCheck = false;
				while (!subMenuSelectCheck) {
					lotto.lottoPlayBefore(topMenuSel);// 선택한 메뉴에 대해 다음 해야 할 행동에 대한 안내.
					selectChoice= scanner.nextInt();
					// 이 사이에..첫번째 메뉴 선택에 대한 두번째 메뉴 선택에 대한 체크는 하지 않았다.. 그에대한 체크 처리를 먼저 하도록 하고..
					//하고난 이후 로또 플레이 안에 로또 카운트를 올리면서 해당 로직을 짜고.. 값이 출력되고 디비에 저장되기까지의 로직을 넣도록 하자..
					//메인에 너무 늘어지는 것은 개인적으로 보기 싫다.. 
					subMenuSelectCheck=lotto.subMenuSelectCheck(selectChoice,topMenuSel);//22일 광주 와서 새벽 4시부터 2시간 삽질..
					
				}
			} catch (java.util.InputMismatchException e) {
				// TODO: handle exception
				System.out.println("잘못된 값이 입력됨으로 인해 에러가 발생 하였습니다. 다시 실행 시켜주세요.");
				return;
			}
			lotto.lottoPlay(selectChoice,topMenuSel);//안내하고 받은 해당 값에 대한 처리.. 졸려서 더 안되겠다 내일 마져 해보도록하자.. 1시부터 2시54분까지의..삽질..
					
		}
		
		
	}
}
