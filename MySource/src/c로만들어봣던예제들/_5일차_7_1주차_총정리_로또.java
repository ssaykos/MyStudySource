package c�θ����f��������;
import java.util.Scanner;
public class _5����_7_1����_������_�ζ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		int[] MainLotto=new int [7];
		int[] CustomLotto=new int [6];
		int LottoCount=0;
		
		while(true)
		{
			LottoCount++;
			System.out.println("�ζǸ� �̾ƺ��ô�.");
			System.out.println("���� �� �����Ͻÿ�");
			System.out.println("1.�ڵ��ζ� 2.�����ζ� 0.����");
			int Sel=scan.nextInt();
			
			if(Sel==0)
			{
				System.out.println("�����մϴ�.");
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
				System.out.println("�� "+LottoCount+" ȸ�� �ζ� ��÷");
				System.out.print("�ζ� ��÷ ��ȣ:");
				for(int i=0;i<MainLotto.length-1;i++)
				{
					System.out.printf("  "+"%02d",MainLotto[i]);
				}
				System.out.print("   ���ʽ� ��ȣ: "+MainLotto[6]);
				System.out.print("\n�ζ� �� ��ȣ:");
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
					System.out.print(""+i+"��°�� �ζ� ��ȣ�� �����ÿ�:");
					CustomLotto[i]=scan.nextInt();
					if(i>0)
					{
						for(int j=0;j<i;j++)
						{
							if(CustomLotto[i]==CustomLotto[j])
							{
								System.out.println("��ģ �ζ� ��ȣ�� �ֽ��ϴ�. �ٽ� �����ֽñ� �ٶ��ϴ�.");
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
				System.out.println("�� "+LottoCount+" ȸ�� �ζ� ��÷");
				System.out.print("�ζ� ��÷ ��ȣ:");
				for(int i=0;i<MainLotto.length-1;i++)
				{
					System.out.printf("  "+"%02d",MainLotto[i]);
				}
				System.out.print("   ���ʽ� ��ȣ: "+MainLotto[6]);
				System.out.print("\n�ζ� �� ��ȣ:");
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
