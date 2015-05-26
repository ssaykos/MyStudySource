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

	public void lottoPlayBefore(int topMenuSel) {
		// TODO Auto-generated method stub
		switch (topMenuSel) {
		case 1:
			System.out.println("�ּ� 0������ �ִ� 30������ �ζǸ� ���� �� �ֽ��ϴ�.");
			System.out.println("����ڲ��� ������ �ζ��� ������ �����ּ���.");
			break;
		case 2:
			System.out.println("����ڲ��� ������ �ζ��� ������ ���� ��(1~10)");
			System.out.println("����ڲ��� ���Ͻô� �ζ��� ��ȣ�� �����ּ���(1~45)");
			System.out.println("���ٰ� ����� ��ȯ �Ͻ� ��� (0)�� �Է��Ͽ� �ּ���");// �̿����� �ȳ��� lottoPlay���� �Ƹ� �ٽ�..���� �ϸ鼭 �ؾ� �Ұ��̴�..
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
	}

	public void lottoPlay(int selectChoice,int topMenuSel) {
		// TODO Auto-generated method stub
		// ���� �ش� �޼ҵ忡 ���� �´� �Ķ���� ���� ���Ӵ��������� �˻簡 �̷�� ���� �޼ҵ带 ����
		// üũ�� ������ �ش� �޼ҵ尡 ���� �Ǵ�.. �ϴ� �ζ� ī��Ʈ�� �ø����� �Ѵ�..
		LottoVO.LOTTOCOUNT++;
		switch (topMenuSel) {// topMenuSel -> �ֻ��� �޴��� ���� ��  
			// selectChoice -> lottoPlayBefore�� �ȳ��� ���� ������ �޴� ���࿡ ���� ��. 
			case 1 : // �ڵ��ζ� // �ζǹ�ȣ�� ���ϴ� ������ŭ ������.�ش簪�� ����.
				int[] winLotto = new int[7];// �̰��� ��÷ ��ȣ�� ��� ���� 
				int[][] customLotto = new int[selectChoice][6];//2015-05-27 ¥�ٺ��� �������ǵ�..�������̽��� 0�ϰ�츦 ���� ���ߴ�..
																// �������̽��� 0�ϰ�츦 ����� �޼ҵ��� �о�ȭ �ؼ������߰ڴ� 
																//���ζ����ʷ����� �޼ҵ�� �����ζ����ʷ����� �޼ҵ带 ����� 
																//�������̽��� 0�϶� 1�϶� 2~30�϶� 3������ ��쿡 ���� ������ ¥�� �ҵ��ϴ�..
																//0�ϰ�� ��Ʈ 0 �� 1�ϰ�� �迭 2�̻� 30���� �ϰ�� ���մ� ���������� �̿� �ϵ��� �ؾ� �ҵ� �ϴ�..
				for (int i = 0; i < winLotto.length; i++) {
					 winLotto[i]=(int) ((Math.random()*35)+1);// 6���� ��÷��ȣ�� �������� �߰���ȣ.//�ȳ��ϰ� ���� �ش� ���� ���� ó��.. ������ �� �ȵǰڴ� ���� ���� �غ���������.. 21�� ����1�ú��� 2��54�б�����..����..
					 if(i>=1){//�ζ��� �ΰ��̻��� ��ȣ�� �����.
						 for (int j = 0; j < i; j++) {//���� �������� �� ��ȣ�� �� ���� ��ȣ�� �񱳹��� ������ ���� �ݺ����� ������.
							if(winLotto[i]==winLotto[j]){// �񱳸� �Ѵ�.�񱳿��� ���� ��ȣ�� ���ٸ� ���� ��ȣ�� �ٽ� ���� �ϰ�..
								winLotto[i]=(int)((Math.random()*35)+1);
								j=0;// ���� �������� ��ȣ �Ҵ� �Ѱ��� ���Ƽ� �ش� ������ ���Ӱ� �� ��ġ�� ��ȣ�� ������� ������ ������..
								//��ġ�� ��ȣ �ֳ� ���� �ٽ� Ȯ�� �ϵ��� �ݺ����� �������� ��Ʈ���� 0���� �ʱ�ȭ �����ش�.
							}
							if(winLotto[i]<winLotto[j]){//�ζ� ��ȣ�� ���Կ� ���� ����ؔf�ٸ� �غ�������� �˰��̴�.�ڷΰ����� Ŀ���� ���ڰ� ��ġ�ȴٴ°�...
								//��� ���� �� �������� Ʈ���ϰ�� �迭�� ���ڸ� �հ� �ڸ� �ٲ���� �Ѵ�. �� ���ҹ��� ��� �Ѵ�.
								int temp=0;
								temp=winLotto[i];// �̷��� �ӽ� ��Ʈ������ �ϳ� �Ҵ��ϰ� �ű⿡ ���� �迭�� ���� �����ϰ� 
								winLotto[i]=winLotto[j];// ������ ���� �迭 ���� ������ ���� �迭 ���� �ִ� ���� ���� �迭 ���� �ְ�
								winLotto[j]=temp;// ���� �迭�� ���� �迭 ���� �����؊x�� ���纻�� ������.. �հ� ���� ���� �ٲ�� �ش� ��Ʈ ���� �ٵ� ����� �ӽ� ��Ʈ�� ������ �޸𸮴� ���󰣴�
							}
						}
					 }
				}
				for (int i = 0; i < selectChoice; i++) {
					
					for (int j = 0; j < customLotto[selectChoice].length; j++) {
						// ������ ���� ��ŭ�� ����� �ڵ� �ζǹ�ȣ�� �̾ƾ� �Ѵ�..
						// ���� �Ѱ���Ʈ�� 6���� ���ڰ� �������� �ʴ� �ڵ��� ¥���� 3�� ������ ���ư����̴�..;
						customLotto[i][j]=(int) ((Math.random()*35)+1);
						if(j>=1){//i������ �ζǹ�ȣ ��Ʈ�� j��°�� �ζǹ�ȣ�� 2�� �̻� �����ִٸ�..��Ʈ�ȿ� �ߺ���ȣ�� �ִ����� ���� üũ..
							for (int k = 0; k < j; k++) {
								if(customLotto[i][j]==customLotto[i][k]){
									customLotto[i][j]=(int)((Math.random()*35)+1);
									k=0;// ������ ���� ��÷��ȣ �� ��ġ�� Ȯ���ϴ� �κп��� Ȯ��.
								}
								if(customLotto[i][j]<customLotto[i][k]){// �̰͵� ���� ��������(������ -> ū�� ����?)
									int temp=0;
									temp=customLotto[i][j];
									customLotto[i][j]=customLotto[i][k];
									customLotto[i][k]=temp;//22�ϱ��ֿͼ� 4�ú��� 2�ð������� ����..
								}
							}
						}
					}
				}
				// �� �Ǵ� �ؽ������� �����ϱ� ���� ��Ʈ�� �迭���� ��Ʈ�� ������ ��ȯ
				String winLottoNumber="";
				for (int i = 0; i < winLotto.length; i++) {
					winLottoNumber+=winLotto[i];
					if(i < winLotto.length-1){
						winLottoNumber+=" / ";
					}
				}
				// ���� �ζǹ�ȣ�� �̷��������� ������ �Ѱ������� ���ʷ����Ϳ� ���� ������������ ���� ���ζǼ��̺� �޼ҵ带 �����ϰ�
				//�Ʒ��� �ζǹ�ȣ�� ������� �䱸�� ���� 0/1/2~30 �������� ���ʷ����� ����� ���� �����ζ� ���̺� �޼ҵ带 �����ؾ� �ҵ� �ϴ�. 
				//0 �� [����] 1�� ���������� ��Ʈ�� 2���ʹ����������� �̿��� �� ���� ���� ���� �� ��Ʈ�� ��  
				String userLottoNumber="";
				for (int i = 0; i < customLotto.length; i++) {
					for (int j = 0; j < customLotto[selectChoice].length; j++) {
						userLottoNumber+=customLotto[selectChoice][j];
						if(j<customLotto[selectChoice].length-1){
							userLottoNumber+=" / ";
						}
						
					}
					if(i<customLotto.length-1){
						userLottoNumber+="/n";
					}
				}
				
				LottoVO lottoDataBase = new LottoVO();
				
				lottoDataBase.winLottoData.put(LottoVO.LOTTOCOUNT, winLottoNumber);
				lottoDataBase.userLottoData.put(LottoVO.LOTTOCOUNT, userLottoNumber);
				
				//��������� ������ �����ٸ� �ش� ���̽����� �������� ��÷ �ζǹ�ȣ�� ������� �ʵ��� �ϴ� ó���� �ؾ� �Ѵ�.
				//���̿��� �����ϴ� ���� �����غ���������..// ���̿��� ������ �ȵǼ� ��� ����..22�ϱ��ֿͼ� 4�ú��� 2�ð������� ����..
				
				break;
			case 2 ://�����ζ� //
				
				break;
			case 3 :// ��������� ��÷ �ζ� ��ȣ�� ���
	
				break;
			case 4 :// ��������� ����ڰ� �̾ư��� �ζ� ��ȣ�� ���
				// ��� ��÷ �ζǹ�ȣ�� ���� �̸� �̾� ���ϵ� ��������. �׳� ����� Ȯ���� ���� �������� ����.
	
				break;
			case 5 ://��������� ��÷ �ζ� ��ȣ��� ��ȸ���� ����ڰ� �ζǹ�ȣ�� �̾� ���ٸ� �׿� ���� ���..(ȸ���� ����� �ǵ��� �Ѵ�)
	
				break;

			default :// ����ɼ� �ֵ��� �ϴ�?
				break;
		}
	}

	public boolean subMenuSelectCheck(int selectChoice, int topMenuSel) {//22�ϱ��ֿͼ� 4�ú��� 2�ð������� ����..
		boolean subMenuSelectCheck=true;
		// TODO Auto-generated method stub
		//lottoPlay�� �����Ͽ� ��÷ �ζ� ��ȣ�� ����� �ζǹ�ȣ ���� �̰� ��� �����ϱ��� 
		//�ش� ����ڰ� �ֻ��� �޴���� ������ �޴��� ���� ����� �ٸ� ���� �־����� üũ�ϱ����� �޼ҵ�..
		//lottoPlayBefore(int topMenuSel)�� ����ġ���� �Ʒ� �ۿӴ� �����ؼ� �ش�üũ�޼ҵ尡 �˸°� �����ϵ���
		//�����غ���..
		switch (topMenuSel) {
		case 1:
//			System.out.println("�ּ� 0������ �ִ� 30������ �ζǸ� ���� �� �ֽ��ϴ�.");
//			System.out.println("����ڲ��� ������ �ζ��� ������ �����ּ���.");
			if(selectChoice>-1&&selectChoice<31){
				subMenuSelectCheck=true;
			}else{
				subMenuSelectCheck=false;
			}
			break;
		case 2:
//			System.out.println("����ڲ��� ������ �ζ��� ������ ���� ��(1~30)");
//			System.out.println("����ڲ��� ���Ͻô� �ζ��� ��ȣ�� �����ּ���(1~45)");// �̿����� ������ �÷��̸� ������ ���� �����ζ� �Է¹޴� �κп��� �ϵ��� �Ѵ�..
//			System.out.println("���ٰ� ����� ��ȯ �Ͻ� ��� (0)�� �Է��Ͽ� �ּ���");
			if(selectChoice>-1&&selectChoice<31){
				subMenuSelectCheck=true;
			}else{
				subMenuSelectCheck=false;
			}
			break;
		case 3:
//			System.out.println("��������� ��÷ ��ȣ ���");
			// 0�� 3~5�� © �ʿ䰡 ��������..= 0=..���ֿͼ� 4�ú��� 2�ð������� ����..
			break;
		case 4:
//			System.out.println("��������� ���Բ��� �� ȸ������ ����Ͻ� ��÷��ȣ ���� ���");
			break;
		case 5:
//			System.out.println("��������� ��÷ ��ȣ��� �� ȸ�� ������ ���Բ��� ����Ͻ� ��÷��ȣ�� ���� ���");
			break;
		default:
//			System.out.println("����Ǿ����ϴ�");
			break;
		}
		
		return subMenuSelectCheck;
	}
	

}
