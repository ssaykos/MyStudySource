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
			System.out.println("�߸��� ���� �Է��ϼ˽��ϴ�.\n0~5�� ���� �Է°���");
		}
	}

	public boolean lottoPlayBefore(int topMenuSel) {
		// TODO Auto-generated method stub
		boolean topMenu=true;
		switch (topMenuSel) {
		case 1:
			System.out.println("����ڲ��� ������ �ζ��� ������ �����ּ���.");
			break;
		case 2:
			System.out.println("����ڲ��� ������ �ζ��� ������ ���� ��(1~10)");
			System.out.println("����ڲ��� ���Ͻô� �ζ��� ��ȣ�� �����ּ���(1~45)");
			break;
		case 3:
			System.out.println("��������� ��÷ ��ȣ ���");
			break;
		case 4:
			System.out.println("��������� ���Բ��� �� ȸ������ ����Ͻ� ��÷��ȣ ���� ���");
			break;
		case 5:
			System.out.println("��������� ��÷ ��ȣ��� �� ȸ�� ������ ���Բ��� ����Ͻ� ��÷��ȣ�� ���� ���");
			break;
		default:
			System.out.println("����Ǿ����ϴ�");
			break;
		}
		return topMenu;
	}

	public void lottoPlay(int selectChoice,int topMenuSel) {
		// TODO Auto-generated method stub
		switch (topMenuSel) {// topMenuSel -> �ֻ��� �޴��� ���� ��  
			// selectChoice -> lottoPlayBefore�� �ȳ��� ���� ������ �޴� ���࿡ ���� ��. 
			case 1 :
				
				break;
			case 2 :
				
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
