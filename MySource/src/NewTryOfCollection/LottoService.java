package NewTryOfCollection;

public class LottoService {
	
	public boolean menuSelectCheck(int topMenuSel) {
		boolean check=true;
		if(topMenuSel>=0&&topMenuSel<=5){
			check=true;
		}else{
			check=false;
		}
		// TODO Auto-generated method stub
		return check;
	}

	public void menuSelectFalse(boolean sel) {
		// TODO Auto-generated method stub
		if(!sel){
			System.out.println("잘못된 값을 입력하셧습니다.\n0~5의 값만 입력가능");
		}
	}

	public boolean lottoPlayBefore(int topMenuSel) {
		// TODO Auto-generated method stub
		boolean topMenu=true;
		switch (topMenuSel) {
		case 1:
			System.out.println("사용자께서 뽑으실 로또의 갯수를 적어주세요.");
			break;
		case 2:
			System.out.println("사용자께서 뽑으실 로또의 갯수를 적은 후(1~10)");
			System.out.println("사용자께서 원하시는 로또의 번호를 적어주세요(1~45)");
			break;
		case 3:
			System.out.println("현재까지의 당첨 번호 출력");
			break;
		case 4:
			System.out.println("현재까지의 고객님께서 각 회차마다 사용하신 당첨번호 내역 출력");
			break;
		case 5:
			System.out.println("현재까지의 당첨 번호들과 각 회차 마다의 고객님께서 사용하신 당첨번호의 내역 출력");
			break;
		default:
			System.out.println("종료되었습니다");
			break;
		}
		return topMenu;
	}

	public void lottoPlay(int selectChoice,int topMenuSel) {
		// TODO Auto-generated method stub
		switch (topMenuSel) {// topMenuSel -> 최상위 메뉴에 대한 값  
			// selectChoice -> lottoPlayBefore의 안내에 의한 차상위 메뉴 실행에 대한 값. 
			case 1 : // 자동로또 // 로또번호를 원하는 갯수만큼 뽑은뒤.해당값을 저장.
				int[] winLotto = new int[7];
				for (int i = 0; i < winLotto.length; i++) {
					 winLotto[i]=(int) ((Math.random()*35)+1);// 6개의 당첨번호와 마지막의 추가번호.
					 
				}
				
				
				break;
			case 2 ://수동로또 //
				
				break;
			case 3 :
	
				break;
			case 4 :
	
				break;
			case 5 :
	
				break;

			default :
				break;
		}
	}
	

}
