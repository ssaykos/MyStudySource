package c로만들어봣던예제들;
import java.util.Scanner;
public class _5일차_7_1주차_총정리_로또 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int[] MainLotto=new int [7];
		int[] CustomLotto=new int [6];
		int LottoCount=0;
		
		while(true)
		{
			LottoCount++;
			System.out.println("로또를 뽑아봅시다.");
			System.out.println("다음 중 선택하시오");
			System.out.println("1.자동로또 2.수동로또 0.종료");
			int Sel=scan.nextInt();
			
			if(Sel==0)
			{
				System.out.println("종료합니다.");
				break;
			}
			switch(Sel)
			{
			case 1:
			{
				for(int i=0;i<MainLotto.length;i++)
				{
					MainLotto[i]=(int)(((Math.random())*35)+1);
					if(i>0)
					{
						for(int j=0;j<i;j++)
						{
							if(MainLotto[i]==MainLotto[j])
							{
								i--;
							}
							else if(i<MainLotto.length-1&&MainLotto[i]<MainLotto[j])
							{
								int SwapTemp=MainLotto[i];
								MainLotto[i]=MainLotto[j];
								MainLotto[j]=SwapTemp;
							}
						}
					}
				}
				for(int i=0;i<CustomLotto.length;i++)
				{
					CustomLotto[i]=(int)(((Math.random())*35)+1);
					if(i>0)
					{
						
						for(int j=0;j<i;j++)
						{
							if(CustomLotto[i]==CustomLotto[j])
							{
								i--;
							}
							else if(i<CustomLotto.length&&CustomLotto[i]<CustomLotto[j])
							{
								int SwapTemp=CustomLotto[i];
								CustomLotto[i]=CustomLotto[j];
								CustomLotto[j]=SwapTemp;
							}
						}
					}
				}
				System.out.println("-----------------------------------------------------------");
				System.out.println("제 "+LottoCount+" 회차 로또 추첨");
				System.out.print("로또 추첨 번호:");
				for(int i=0;i<MainLotto.length-1;i++)
				{
					System.out.printf("  "+"%02d",MainLotto[i]);
				}
				System.out.print("   보너스 번호: "+MainLotto[6]);
				System.out.print("\n로또 고객 번호:");
				for(int i=0;i<CustomLotto.length;i++)
				{
					System.out.printf("  "+"%02d",CustomLotto[i]);
				}
				System.out.println("\n--------------------------------------------------------------");
			}
				break;
			case 2:
			{
				for(int i=0;i<CustomLotto.length;i++)
				{
					System.out.print(""+i+"번째의 로또 번호를 적으시오:");
					CustomLotto[i]=scan.nextInt();
					if(i>0)
					{
						for(int j=0;j<i;j++)
						{
							if(CustomLotto[i]==CustomLotto[j])
							{
								System.out.println("겹친 로또 번호가 있습니다. 다시 적어주시기 바랍니다.");
								i--;
							}
							else if(i<CustomLotto.length&&CustomLotto[i]<CustomLotto[j])
							{
								int SwapTemp=CustomLotto[i];
								CustomLotto[i]=CustomLotto[j];
								CustomLotto[j]=SwapTemp;
							}
						}
					}
				}
				for(int i=0;i<MainLotto.length;i++)
				{
					MainLotto[i]=(int)(((Math.random())*35)+1);
					if(i>0)
					{
						for(int j=0;j<i;j++)
						{
							if(MainLotto[i]==MainLotto[j])
							{
								i--;
							}
							else if(i<MainLotto.length-1&&MainLotto[i]<MainLotto[j])
							{
								int SwapTemp=MainLotto[i];
								MainLotto[i]=MainLotto[j];
								MainLotto[j]=SwapTemp;
							}
						}
					}
				}
				for(int i=0;i<MainLotto.length;i++)
				{
					MainLotto[i]=(int)(((Math.random())*35)+1);
					if(i>0)
					{
						for(int j=0;j<i;j++)
						{
							if(MainLotto[i]==MainLotto[j])
							{
								i--;
							}
							else if(i<MainLotto.length-1&&MainLotto[i]<MainLotto[j])
							{
								int SwapTemp=MainLotto[i];
								MainLotto[i]=MainLotto[j];
								MainLotto[j]=SwapTemp;
							}
						}
					}
				}
				System.out.println("-----------------------------------------------------------");
				System.out.println("제 "+LottoCount+" 회차 로또 추첨");
				System.out.print("로또 추첨 번호:");
				for(int i=0;i<MainLotto.length-1;i++)
				{
					System.out.printf("  "+"%02d",MainLotto[i]);
				}
				System.out.print("   보너스 번호: "+MainLotto[6]);
				System.out.print("\n로또 고객 번호:");
				for(int i=0;i<CustomLotto.length;i++)
				{
					System.out.printf("  "+"%02d",CustomLotto[i]);
				}
				System.out.println("\n--------------------------------------------------------------");
				
			}
				break;
			}
			
		}
	}

}
