package NewTryOfCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LottoVO {
	// VO�� ���� ������ ���̽��� ������ ����ϴ� Ŭ���� ��� �����.
	// �׷��ٸ� �� ȸ�� ������ �ζ� ��÷ ��ȣ�� 
	//�� ȸ���� ����ڰ� ���� ��ȣ ���� �׶� ���� ���� ��ŭ ������ �־�� �Ѵ�.
	//�� ����ڰ� XX ȸ�� �� N�� 6���� �ζ� ��ȣ�� �����޴ٸ�,
	//���� ȸ���� �׵��� ����ڰ� �̿��ߴ� ��� ������ �̰� �ʹٸ�..
	//1���� XXȸ�� �� �̿��ߴ� ȸ���� ��÷ ��ȣ 7�ڸ�(���� ���ڸ��� ���ʽ���ȣ)
	//����ڰ� �̾Ҵ� ��ȣ 6�ڸ�  �Ѽ�Ʈ�� N(1~100)���� ��Ʈ�� ���;� �Ѵ�.
	// �׸��� �̿����� �ʾҴ� ȸ���� ��÷ ��ȣ�� ��µǾ� �Ѵ�
//	public int[] WINLOTTO = new int[7];
//	private int[][] selLotto= new int[30][6];
	public static int LOTTOCOUNT=0;// �ش� ���� ���� �� ���̸�,���α׷��� ����ɶ����� �����ϰ�.. ���α׷�����..
	//�� �ش� ������Ʈ�� ������ ������.. ��Ƴ��Ƽ� �����Ǿ�� �ϴ� ���̴�.. �ζǰ� ��ȸ ��÷ �Ǿ������� �˼� �ִ� ���̴�.
	//ArrayList<Integer> winlotto = new ArrayList<Integer>();//���� �ݷ��ǿ� ����ϴٴ°� �˰ٴ�..��_��;;
	//���� �ζ� ��÷ ��ȣ�� ���� �ζ� ī��Ʈ�� �������� ���� 7���� ��Ʈ���迭���� ��Ʈ�� ������ �־�� �Ѵ�.//21�� ��������..
	//HashMap<Integer, ArrayList<Integer>> winlottoMemory =new HashMap<Integer, ArrayList<Integer>>(?);
	//???????????????????????????????????????????????????????????????//�� �ٷ� ���� ���� 22�� ���ֻ���4�û���
	//ArrayList<Integer> customerlotto = new ArrayList<Integer>();//21�� ��������
	//���� ����� �ζ� ��ȣ�� ���� �ζ� ī��Ʈ�� �������� ���� 6���� ��Ʈ�� ��Ʈ�� ���߹迭 ���� ��Ʈ�� ������ �־�� �Ѵ�.
	//�׷��ٸ� ���� �ΰ����� ��� ����Ʈ�� �´°� �ؽ����� �´°� ���� �´°� �װ��� �����̴�..���� 
	//2015-05-27 ���񽺿��� �ζ� ȸ���� ���� ī��Ʈ�� �ζ� ��ȣ���� ��Ʈ������ �ٲپ� �Է¹��� �����̴�.
	//�׷� �ؽ������� ��÷�ζ� ��ȣ�� ����� �ζ� ��ȣ �ΰ����� ������ �����ϸ� 3/4/5�� ����� ���� �� �� ���� ���ϴ�.
	Map<Integer, String> winLottoData = new HashMap<Integer, String>();
	Map<Integer, String> userLottoData = new HashMap<Integer, String>();
	
	
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
//	}  // �̰͵��� ������ ���������� ���� ������ �����ؾ� �ҵ� �ϴ�.
	
}
