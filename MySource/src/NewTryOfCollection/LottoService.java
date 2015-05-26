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

	public void lottoPlayBefore(int topMenuSel) {
		// TODO Auto-generated method stub
		switch (topMenuSel) {
		case 1:
			System.out.println("최소 0개에서 최대 30개까지 로또를 뽑을 수 있습니다.");
			System.out.println("사용자께서 뽑으실 로또의 갯수를 적어주세요.");
			break;
		case 2:
			System.out.println("사용자께서 뽑으실 로또의 갯수를 적은 후(1~10)");
			System.out.println("사용자께서 원하시는 로또의 번호를 적어주세요(1~45)");
			System.out.println("적다가 오토로 전환 하실 경우 (0)을 입력하여 주세요");// 이에대한 안내는 lottoPlay에서 아마 다시..진행 하면서 해야 할것이다..
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
	}

	public void lottoPlay(int selectChoice,int topMenuSel) {
		// TODO Auto-generated method stub
		// 먼저 해당 메소드에 대한 맞는 파라미터 값이 들어왓는지에대한 검사가 이루어 지는 메소드를 실행
		// 체크가 끝나면 해당 메소드가 실행 되니.. 일단 로또 카운트를 올리도록 한다..
		LottoVO.LOTTOCOUNT++;
		switch (topMenuSel) {// topMenuSel -> 최상위 메뉴에 대한 값  
			// selectChoice -> lottoPlayBefore의 안내에 의한 차상위 메뉴 실행에 대한 값. 
			case 1 : // 자동로또 // 로또번호를 원하는 갯수만큼 뽑은뒤.해당값을 저장.
				int[] winLotto = new int[7];// 이것은 당첨 번호를 담기 위한 
				int[][] customLotto = new int[selectChoice][6];//2015-05-27 짜다보니 생각난건데..셀렉초이스가 0일경우를 생각 안했다..
																// 셀렉초이스가 0일경우를 대비한 메소드의 분업화 해서만들어야겠다 
																//윈로또제너레이터 메소드와 유저로또제너레이터 메소드를 만들고 
																//셀렉초이스가 0일때 1일때 2~30일때 3가지의 경우에 따른 로직을 짜야 할듯하다..
																//0일경우 인트 0 을 1일경우 배열 2이상 30이하 일경우 써잇는 이중포문을 이용 하도록 해야 할듯 하다..
				for (int i = 0; i < winLotto.length; i++) {
					 winLotto[i]=(int) ((Math.random()*35)+1);// 6개의 당첨번호와 마지막의 추가번호.//안내하고 받은 해당 값에 대한 처리.. 졸려서 더 안되겠다 내일 마져 해보도록하자.. 21일 새벽1시부터 2시54분까지의..삽질..
					 if(i>=1){//로또의 두개이상의 번호가 들어갈경우.
						 for (int j = 0; j < i; j++) {//가장 마지막에 들어간 번호와 그 앞의 번호의 비교문을 돌리기 위해 반복문을 돌리고.
							if(winLotto[i]==winLotto[j]){// 비교를 한다.비교에서 같은 번호가 들어간다면 뒤의 번호를 다시 설정 하고..
								winLotto[i]=(int)((Math.random()*35)+1);
								j=0;// 가장 마지막의 번호 할당 한것이 같아서 해당 로직에 들어왓고 또 겹치는 번호가 들어가리라는 보장이 없으니..
								//겹치는 번호 있나 없나 다시 확인 하도록 반복문의 증가연산 인트값을 0으로 초기화 시켜준다.
							}
							if(winLotto[i]<winLotto[j]){//로또 번호를 가게에 가서 출력해봣다면 해본사람들은 알것이다.뒤로갈수록 커지는 숫자가 배치된다는걸...
								//고로 위의 비교 연산으로 트루일경우 배열의 숫자를 앞과 뒤를 바꿔줘야 한다. 즉 스왑문을 써야 한다.
								int temp=0;
								temp=winLotto[i];// 이렇게 임시 인트변수를 하나 할당하고 거기에 뒤의 배열의 값을 복사하고 
								winLotto[i]=winLotto[j];// 템프에 뒤의 배열 값이 들어갔으니 뒤의 배열 값이 있던 곳에 앞의 배열 값을 넣고
								winLotto[j]=temp;// 앞의 배열에 뒤의 배열 값을 복사해둿던 복사본을 넣으면.. 앞과 뒤의 값이 바뀌고 해당 인트 문의 바디를 벗어나면 임시 인트형 변수의 메모리는 날라간다
							}
						}
					 }
				}
				for (int i = 0; i < selectChoice; i++) {
					
					for (int j = 0; j < customLotto[selectChoice].length; j++) {
						// 선택한 갯수 만큼의 사용자 자동 로또번호를 뽑아야 한다..
						// 위의 한개세트인 6개의 숫자가 겹쳐지지 않는 코딩을 짜려면 3중 포문이 돌아갈것이다..;
						customLotto[i][j]=(int) ((Math.random()*35)+1);
						if(j>=1){//i갯수의 로또번호 셋트중 j번째의 로또번호가 2개 이상 들어와있다면..세트안에 중복번호가 있는지에 대한 체크..
							for (int k = 0; k < j; k++) {
								if(customLotto[i][j]==customLotto[i][k]){
									customLotto[i][j]=(int)((Math.random()*35)+1);
									k=0;// 이유는 위의 당첨번호 가 겹치나 확인하는 부분에서 확인.
								}
								if(customLotto[i][j]<customLotto[i][k]){// 이것도 위의 오름차순(작은수 -> 큰수 정렬?)
									int temp=0;
									temp=customLotto[i][j];
									customLotto[i][j]=customLotto[i][k];
									customLotto[i][k]=temp;//22일광주와서 4시부터 2시간동안의 삽질..
								}
							}
						}
					}
				}
				// 맵 또는 해쉬맵으로 저장하기 위한 인트형 배열값을 스트링 값으로 변환
				String winLottoNumber="";
				for (int i = 0; i < winLotto.length; i++) {
					winLottoNumber+=winLotto[i];
					if(i < winLotto.length-1){
						winLottoNumber+=" / ";
					}
				}
				// 위의 로또번호는 이러나저러나 무조건 한가지여서 제너레이터에 따른 한종류로직을 갖는 윈로또세이브 메소드를 생성하고
				//아래의 로또번호는 사용자의 요구에 따라서 0/1/2~30 세종류의 제너레이터 결과에 따른 유저로또 세이브 메소드를 생성해야 할듯 하다. 
				//0 은 [없음] 1은 원포문으로 스트링 2부터는이중포문을 이용한 줄 수에 따른 여러 줄 스트링 값  
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
				
				//여기까지의 포문이 끝났다면 해당 케이스문을 빠져나가 당첨 로또번호가 사라지지 않도록 하는 처리를 해야 한다.
				//브이오에 저장하는 것을 생각해보도록하자..// 브이오가 정립이 안되서 잠시 보류..22일광주와서 4시부터 2시간동안의 삽질..
				
				break;
			case 2 ://수동로또 //
				
				break;
			case 3 :// 현재까지의 당첨 로또 번호들 출력
	
				break;
			case 4 :// 현재까지의 사용자가 뽑아갔던 로또 번호들 출력
				// 사실 당첨 로또번호가 없이 이리 뽑아 볼일도 없겠으나. 그냥 기능의 확인을 위해 만들어보도록 하자.
	
				break;
			case 5 ://현재까지의 당첨 로또 번호들과 각회마다 사용자가 로또번호를 뽑아 갔다면 그에 대한 출력..(회차별 출력이 되도록 한다)
	
				break;

			default :// 종료될수 있도록 하는?
				break;
		}
	}

	public boolean subMenuSelectCheck(int selectChoice, int topMenuSel) {//22일광주와서 4시부터 2시간동안의 삽질..
		boolean subMenuSelectCheck=true;
		// TODO Auto-generated method stub
		//lottoPlay를 실행하여 추첨 로또 번호와 사용자 로또번호 들을 뽑고 디비에 저장하기전 
		//해당 사용자가 최상위 메뉴대비 차상위 메뉴에 대한 설명과 다른 값을 넣었는지 체크하기위한 메소드..
		//lottoPlayBefore(int topMenuSel)의 스위치문을 아래 퍼왓다 참조해서 해당체크메소드가 알맞게 동작하도록
		//구현해보자..
		switch (topMenuSel) {
		case 1:
//			System.out.println("최소 0개에서 최대 30개까지 로또를 뽑을 수 있습니다.");
//			System.out.println("사용자께서 뽑으실 로또의 갯수를 적어주세요.");
			if(selectChoice>-1&&selectChoice<31){
				subMenuSelectCheck=true;
			}else{
				subMenuSelectCheck=false;
			}
			break;
		case 2:
//			System.out.println("사용자께서 뽑으실 로또의 갯수를 적은 후(1~30)");
//			System.out.println("사용자께서 원하시는 로또의 번호를 적어주세요(1~45)");// 이에대한 로직은 플레이를 실행할 때의 수동로또 입력받는 부분에서 하도록 한다..
//			System.out.println("적다가 오토로 전환 하실 경우 (0)을 입력하여 주세요");
			if(selectChoice>-1&&selectChoice<31){
				subMenuSelectCheck=true;
			}else{
				subMenuSelectCheck=false;
			}
			break;
		case 3:
//			System.out.println("현재까지의 당첨 번호 출력");
			// 0과 3~5는 짤 필요가 없었던듯..= 0=..광주와서 4시부터 2시간동안의 삽질..
			break;
		case 4:
//			System.out.println("현재까지의 고객님께서 각 회차마다 사용하신 당첨번호 내역 출력");
			break;
		case 5:
//			System.out.println("현재까지의 당첨 번호들과 각 회차 마다의 고객님께서 사용하신 당첨번호의 내역 출력");
			break;
		default:
//			System.out.println("종료되었습니다");
			break;
		}
		
		return subMenuSelectCheck;
	}
	

}
