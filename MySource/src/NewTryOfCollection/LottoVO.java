package NewTryOfCollection;

import java.util.ArrayList;

public class LottoVO {
	// VO가 현재 데이터 베이스의 개념을 담당하는 클래스 라고 들었다.
	// 그렇다면 각 회차 마다의 로또 당첨 번호와 
	//각 회차때 사용자가 뽑은 번호 들을 그때 뽑은 갯수 만큼 가지고 있어야 한다.
	//즉 사용자가 XX 회차 때 N번 6개의 로또 번호를 선택햇다면,
	//다음 회차때 그동안 사용자가 이용했던 사용 내역을 뽑고 싶다면..
	//1부터 XX회차 중 이용했던 회차는 당첨 번호 7자리(뒤의 한자리는 보너스번호)
	//사용자가 뽑았던 번호 6자리  한세트로 N(1~100)개의 세트가 나와야 한다.
	// 그리고 이용하지 않았던 회차는 당첨 번호만 출력되야 한다
//	public int[] WINLOTTO = new int[7];
//	private int[][] selLotto= new int[30][6];
	ArrayList<Integer> winlotto = new ArrayList<Integer>();
	ArrayList<Integer> customerlotto = new ArrayList<Integer>();
	public ArrayList<Integer> getWinlotto() {
		return winlotto;
	}
	public void setWinlotto(ArrayList<Integer> winlotto) {
		this.winlotto = winlotto;
	}
	public ArrayList<Integer> getCustomerlotto() {
		return customerlotto;
	}
	public void setCustomerlotto(ArrayList<Integer> customerlotto) {
		this.customerlotto = customerlotto;
	}
	
}
