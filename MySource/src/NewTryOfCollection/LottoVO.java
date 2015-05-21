package NewTryOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	public static int LOTTOCOUNT=0;// 해당 값은 공개 될 값이며,프로그램을 실행될때마다 증가하고.. 프로그램종료..
	//즉 해당 웹사이트가 무너질 때까지.. 살아남아서 증가되어야 하는 값이다.. 로또가 몇회 추첨 되었는지를 알수 있는 값이다.
	ArrayList<Integer> winlotto = new ArrayList<Integer>();//정말 콜랙션에 취약하다는걸 알겟다..ㅠ_ㅠ;;
	//위는 로또 당첨 번호에 대해 로또 카운트를 기준으로 값을 7개의 인트형배열변수 셋트씩 가지고 있어야 한다.//21일 새벽삽질..
	HashMap<Integer, ArrayList<Integer>> winlottoMemory =new HashMap<Integer, ArrayList<Integer>>(?);
	//???????????????????????????????????????????????????????????????//이 바로 위의 한줄 22일 광주새벽4시삽질
	ArrayList<Integer> customerlotto = new ArrayList<Integer>();//21일 새벽삽질
	//위는 사용자 로또 번호에 대해 로또 카운트를 기준으로 값을 6개씩 세트로 인트형 이중배열 변수 셋트로 가지고 있어야 한다.
	//그렇다면 위의 두가지는 어레이 리스트가 맞는가 해쉬맵이 맞는가 맵이 맞는가 그것이 문제이다..아직 
//	public ArrayList<Integer> getWinlotto() {
//		return winlotto;
//	}
//	public void setWinlotto(ArrayList<Integer> winlotto) {
//		this.winlotto = winlotto;
//	}
//	public ArrayList<Integer> getCustomerlotto() {
//		return customerlotto;
//	}
//	public void setCustomerlotto(ArrayList<Integer> customerlotto) {
//		this.customerlotto = customerlotto;
//	}  // 이것들은 서비스의 로직에따라 쓸지 말지를 결정해야 할듯 하다.
	
}
