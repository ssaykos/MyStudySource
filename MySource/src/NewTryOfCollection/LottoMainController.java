package NewTryOfCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMainController {
	public static void main(String[] args) {
		LottoService lotto = new LottoService();// �ǵ��� �ֿ� ����� ���񽺿��� ó�� �ϵ��� �ϱ� ���� �ν��Ͻ� ����//�ִ��� ������ ���񽺷� �ø����� �Ѵ�.
		Scanner scanner = new Scanner(System.in);
		boolean topMenu=false;
		while(!topMenu){
			System.out.println("�ζ� ���α׷��� �����մϴ�.");
			System.out.println("���� �� ����� ���ڸ� �Է��϶�� ���� ������ ���� �߿� �Է��ϼ���.");
			System.out.println("0.����");
			System.out.println("1. �ڵ� �ζǹ�ȣ ���.");
			System.out.println("2. ���� �ζǹ�ȣ ���.");//�� �� ������ 3~5�� ����� 1���� 2���� ����Ͽ� �����Ͱ��� ���� �Ǿ������� ���� �ǵ��� �ϱ�.//���� �Ǹ� �Ʒ��� ������ �պ��� �Ѵ�.
			System.out.println("3. ��������� ��÷ �ζ� ��ȣ ���");
			System.out.println("4. ��������� ���Բ��� ���� �ζ� ��ȣ ���� ���");
			System.out.println("5. ��������� ��÷ �ζ� ��ȣ�� ������ ���� �ζ� ��ȣ ���� ���");
			System.out.println("���� �Ͻ� �׸��� ���ڸ� �Է��ϼ���(0~5) ->");
			// ������ �������� ��÷ ��ȣ�� ����ϴ� �͵� �ʿ� �Ҳ���. � Ư�� ȸ�������� ��ϸ� ����ϴ� �͵� ���� ���̳�..�������� ���ص� ���� �ΰ����� �������� ������? �ʹ�.
			int topMenuSel=0;
			
			try {//� û������ �ɺ��� ����ڰ� 0-5�� ���ڷ� �޴��� �����϶�� �ȳ��� �����ϰ� ���ڸ� ���� �־��� ��쿡 ���� ������ ó��. 
				topMenuSel = scanner.nextInt();
				boolean sel=false;//0-5�� ���ڰ� �´����� ���� üũ�� �Ҷ� üũ�� ����ϸ� Ʈ�簪�� ���ͼ� �ݺ����� ���������� ���� ���Ϸ� �ٲ� �ٽ� ���� �ʵ����ϴ�
								//�ݺ����� üũ ����� ����ϴ� ����
				while(!sel){
					sel=lotto.menuSelectCheck(topMenuSel); // 0-5�� ���ڸ� ��� �϶�� ������ �Ǽ��γ� �峭���� �ٸ� ���ڸ� �־��� ��쿡 ���� üũó��.
					lotto.menuSelectFalse(sel);
				}
			} catch (java.util.InputMismatchException e) {
				// TODO: handle exception
				System.out.println("�߸��� ���� �Էµ����� ���� ������ �߻� �Ͽ����ϴ�. �ٽ� ���� �����ּ���.");
				return;
			}
			
			try {
				boolean sel = false;
				while (!sel) {
					sel=lotto.lottoPlayBefore(topMenuSel);// ������ �޴��� ���� ���� �ؾ� �� �ൿ�� ���� �ȳ�.
					int selectChoice= scanner.nextInt();
					lotto.lottoPlay(selectChoice);//�ȳ��ϰ� ���� �ش� ���� ���� ó��.. ������ �� �ȵǰڴ� ���� ���� �غ���������.. 1�ú��� 2��54�б�����..����..
				}
			} catch (java.util.InputMismatchException e) {
				// TODO: handle exception
				System.out.println("�߸��� ���� �Էµ����� ���� ������ �߻� �Ͽ����ϴ�. �ٽ� ���� �����ּ���.");
				return;
			}
			
					
		}
		
		
	}
}
