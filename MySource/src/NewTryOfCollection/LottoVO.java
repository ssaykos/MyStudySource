package NewTryOfCollection;

import java.util.ArrayList;

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
