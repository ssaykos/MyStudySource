package c�θ����f��������;

import java.util.Scanner;

public class binggo
{
     public static void main(String[] args)
     {
          Scanner scan = new Scanner(System.in);

          int[] Com_Binggo = new int[25];
          for (int i = 0; i < Com_Binggo.length; i++)
          {
               Com_Binggo[i] = 0;
          }
          int[] Com_View_Binggo = new int[25];
          for (int i = 0; i < Com_View_Binggo.length; i++)
          {
               Com_View_Binggo[i] = 0;
          }
          int[] Com_Sel_Binggo_Num = new int[(25 + 1) / 2];
          for (int i = 0; i < Com_Sel_Binggo_Num.length; i++)
          {
               Com_Sel_Binggo_Num[i] = 0;
          }
          int[] Com_Binggo_Line = new int[12];
          for (int i = 0; i < Com_Binggo_Line.length; i++)
          {
               Com_Binggo_Line[i] = 0;
          }
          int[] Custom_Binggo = new int[25];
          for (int i = 0; i < Custom_Binggo.length; i++)
          {
               Custom_Binggo[i] = 0;
          }
          int[] Custom_Binggo_Line = new int[12];
          for (int i = 0; i < Custom_Binggo_Line.length; i++)
          {
               Custom_Binggo_Line[i] = 0;
          }
          int[] Custom_Sel_Binggo_Num = new int[(25 + 1) / 2];
          for (int i = 0; i < Custom_Sel_Binggo_Num.length; i++)
          {
               Custom_Sel_Binggo_Num[i] = 0;
          }
          int Game_Start_Count = 0;
          int Game_Progress_Count = 0;
          int Every_Binggo_Line_Number = 0;
          int Com_Binggo_Count = 0;
          int Custom_Binggo_Count = 0;
          int Overlap_Check = 0;
          int Com_Binggo_Sel = 0;
          int Custom_Binggo_Sel = 0;


          while (true)

          {

               System.out.println("@@@!!��ǻ�Ϳ� �Բ� �ϴ� �������!!@@@");
               System.out.println("���� ������ ���ô�.");
               System.out.println("����(1),����(2) �߿� ���� �ϼ���.");
               int Sel = scan.nextInt();
               //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
               for (int i = 0; i < 50; i++)
               {
                    System.out.println();
               }
               //------------------------------------------
               switch (Sel)
               {
                    case 1:
                         {
                              Game_Start_Count++;
                              for (int i = 0; i < 25; i++)
                              {
                                   Com_Binggo[i] = ((int) (Math.random() * 25) + 1);
                                   if (i > 0)
                                   {
                                        for (int j = 0; j < i; j++)
                                        {
                                             if (Com_Binggo[i]==Com_Binggo[j])
                                             {
                                                  i--;
                                             }
                                        }
                                   }
                              }
                              for (int i = 0; i < 25; i++)
                              {
                                   Custom_Binggo[i] = ((int) (Math.random() * 25) + 1);
                                   if (i > 0)
                                   {
                                        for (int j = 0; j < i; j++)
                                        {
                                             if (Custom_Binggo[i] == Custom_Binggo[j])
                                             {
                                                  i--;
                                             }
                                        }
                                   }
                              }
                              for (int i = 0; i < 25; i++)
                              {
                                   Com_View_Binggo[i] = 88;
                              }
                              Game_Progress_Count++;
                              while (true)
                              {
                                   //�� ������κ� ������ ����ĭ �� üũ
                                   //�Ʒ����ʹ� ��ǻ���� ���� ���κ�
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 4; i <= 20; i += 4)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[0] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 5; i++)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[1] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 5; i < 10; i++)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[2] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 10; i < 15; i++)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[3] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 15; i < 20; i++)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[4] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 20; i < 25; i++)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[5] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 25; i += 6)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[6] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 25; i += 5)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[7] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 1; i < 25; i += 5)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[8] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 2; i < 25; i += 5)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[9] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 3; i < 25; i += 5)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[10] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 4; i < 25; i += 5)
                                   {
                                        if (Com_View_Binggo[i] != 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Com_Binggo_Line[11] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Com_Binggo_Count = 0;
                                   for (int i = 0; i < Com_Binggo_Line.length; i++)
                                   {
                                        if (Com_Binggo_Line[i] == 5)
                                        {
                                             Com_Binggo_Count++;
                                        }
                                   }
                                   //��������� ��ǻ���� ���� ���κ� üũ��
                                   //�Ʒ����� ������� ���� ���κ�üũ����
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 4; i <= 20; i += 4)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[0] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 5; i++)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[1] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 5; i < 10; i++)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[2] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 10; i < 15; i++)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[3] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 15; i < 20; i++)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[4] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 20; i < 25; i++)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[5] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 25; i += 6)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[6] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 0; i < 25; i += 5)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[7] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 1; i < 25; i += 5)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[8] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 2; i < 25; i += 5)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[9] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 3; i < 25; i += 5)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[10] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Every_Binggo_Line_Number = 0;
                                   for (int i = 4; i < 25; i += 5)
                                   {
                                        if (Custom_Binggo[i] == 88)
                                        {
                                             Every_Binggo_Line_Number++;
                                             Custom_Binggo_Line[11] = Every_Binggo_Line_Number;
                                        }
                                   }
                                   Custom_Binggo_Count = 0;
                                   for (int i = 0; i < Custom_Binggo_Line.length; i++)
                                   {
                                        if (Custom_Binggo_Line[i] == 5)
                                        {
                                             Custom_Binggo_Count++;
                                        }
                                   }
                                   System.out.println("---!�ڡ١ڡע������סڡ١�!---�������---!�ڡ١ڡע������סڡ١�!---");
                                   System.out.println("-----��������� ���� ���� �� : " + Game_Progress_Count + " ��°----");
                                   System.out.println("------------ �� ǻ �� ��   �� �� �� ------------");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Com_View_Binggo[0] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[0]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[1] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[1]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[2] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[2]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[3] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[3]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[4] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[4]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Com_View_Binggo[5] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[5]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[6] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[6]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[7] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[7]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[8] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[8]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[9] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[9]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Com_View_Binggo[10] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[10]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[11] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[11]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[12] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[12]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[13] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[13]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[14] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[14]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Com_View_Binggo[15] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[15]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[16] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[16]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[17] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[17]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[18] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[18]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[19] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[19]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Com_View_Binggo[20] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[20]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[21] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[21]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[22] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[22]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[23] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[23]);
                                   }
                                   System.out.print(" �� ");
                                   if (Com_View_Binggo[24] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[24]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.printf("��----��----��----��----��----����ǻ���� ���� ���� ��: %d\n", Com_Binggo_Count);
                                   if (Game_Progress_Count % 2 == 1)
                                   {
                                        System.out.printf("��ǻ���� %d��° ��\n", Game_Progress_Count / 2 + 1);
                                   }
                                   System.out.print("��ǻ�Ͱ� ������ �����ȣ:");
                                   for (int i = 0; i < (Com_View_Binggo.length + 1) / 2; i++)
                                   {
                                        if (Com_Sel_Binggo_Num[i] != 0)
                                        {
                                             System.out.printf("%02d", Com_Sel_Binggo_Num[i]);
                                             System.out.print(", ");
                                        }
                                   }
                                   System.out.println();
                                   System.out.println("------------ �� �� �� ��   �� �� �� ------------");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Custom_Binggo[0] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[0]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[1] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[1]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[2] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[2]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[3] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[3]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[4] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[4]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Custom_Binggo[5] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[5]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[6] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[6]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[7] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[7]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[8] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[8]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[9] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[9]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Custom_Binggo[10] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[10]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[11] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[11]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[12] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[12]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[13] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[13]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[14] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[14]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Custom_Binggo[15] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[15]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[16] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[16]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[17] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[17]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[18] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[18]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[19] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[19]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��");
                                   System.out.print("�� ");
                                   if (Custom_Binggo[20] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[20]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[21] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[21]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[22] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[22]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[23] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[23]);
                                   }
                                   System.out.print(" �� ");
                                   if (Custom_Binggo[24] == 88)
                                   {
                                        System.out.print(" " + "��");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[24]);
                                   }
                                   System.out.println(" �� ");
                                   System.out.println("��----��----��----��----��----��������� ���� ���� ��: " + Custom_Binggo_Count);
                                   if (Game_Progress_Count % 2 == 0)
                                   {
                                        System.out.println("���������" + (int) (Game_Progress_Count / 2) + "��° ��");
                                   }
                                   System.out.print("����ڰ� ������ ���� ��ȣ:");
                                   for (int i = 0; i < (Custom_Binggo.length + 1) / 2; i++)
                                   {
                                        if (Custom_Sel_Binggo_Num[i] != 0)
                                        {
                                             System.out.printf("%02d", Custom_Sel_Binggo_Num[i]);
                                             System.out.print(", ");
                                        }
                                   }
                                   System.out.println();
                                   System.out.println("--------------------------------------------");
                                   if (Com_Binggo_Count >= 5 || Custom_Binggo_Count >= 5)
                                   {
                                        if (Com_Binggo_Count > Custom_Binggo_Count)
                                        {
                                             System.out.println("��ǻ���� �¸�\n ����� �й� �Ͽ����ϴ�.");
                                             System.out.println("�������� ���ư��ϴ�.");
                                             delay(5000);
                                             //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------
                                             break;
                                        }
                                        else if (Custom_Binggo_Count > Com_Binggo_Count)
                                        {
                                             System.out.println("������� �¸�\n �ʴ��� �¸� �Ͽ���ϴ�.��");
                                             System.out.println("�������� ���ư��ϴ�.");
                                             delay(5000);
                                           //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------
                                             break;
                                        }
                                        else
                                        {
                                             if (Game_Progress_Count % 2 == 1)
                                             {
                                                  System.out.println("��ǻ���� ���ʷ� ������ �������Ƿ� ��ǻ���� �¸��Դϴ�.");
                                                  System.out.println("��ǻ���� �¸�\n ����� �й� �Ͽ����ϴ�.");
                                                  System.out.println("�������� ���ư��ϴ�.");
                                                  delay(5000);
                                                //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                                  for (int i = 0; i < 50; i++)
                                                  {
                                                       System.out.println();
                                                  }
                                                  //------------------------------------------
                                                  break;
                                             }
                                             else
                                             {
                                                  System.out.println("������� ���ʷ� ������ �������Ƿ� ������� �¸��Դϴ�.");
                                                  System.out.println("������� �¸�\n �ʴ��� �¸� �Ͽ���ϴ�.��");
                                                  System.out.println("�������� ���ư��ϴ�.");
                                                  delay(5000);
                                                //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                                  for (int i = 0; i < 50; i++)
                                                  {
                                                       System.out.println();
                                                  }
                                                  //------------------------------------------
                                                  break;
                                             }
                                        }
                                   }

                                   else
                                   {
                                        if (Game_Progress_Count % 2 == 1)
                                        {
                                             System.out.println("��ǻ���� �����Դϴ�.");
                                             delay(500);
                                             Overlap_Check = 1;
                                             while (Overlap_Check > 0)
                                             {
                                                  Com_Binggo_Sel = ((int) (Math.random() * 25) + 1);
                                                  System.out.print("��ǻ���� ����:" + Com_Binggo_Sel);
                                                  for (int i = 0; i < Com_Binggo.length; i++)
                                                  {
                                                       if (Com_Binggo_Sel == Com_Binggo[i])
                                                       {
                                                            Com_View_Binggo[i] = Com_Binggo[i];
                                                            Com_Binggo[i] = 88;
                                                            Com_Sel_Binggo_Num[(Game_Progress_Count - 1) / 2] =
                                                                 Com_View_Binggo[i];
                                                            Game_Progress_Count++;
                                                            Overlap_Check = 0;
                                                            break;
                                                       }
                                                       else
                                                       {
                                                            Overlap_Check = 1;
                                                       }
                                                  }
                                                  for (int i = 0; i < Custom_Binggo.length; i++)
                                                  {
                                                       if (Com_Binggo_Sel == Custom_Binggo[i])
                                                       {
                                                            Custom_Binggo[i] = 88;
                                                            break;
                                                       }
                                                  }
                                             }

                                             delay(1000);

                                             //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------
                                        }
                                        else
                                        {
                                             System.out.println("������� �����Դϴ�.");
                                             delay(500);

                                             Overlap_Check = 1;
                                             while (Overlap_Check > 0)
                                             {
                                                  System.out.print("������� ����:");
                                                  Custom_Binggo_Sel = scan.nextInt();
                                                  delay(1000);
                                                  for (int i = 0; i < Custom_Binggo.length; i++)
                                                  {
                                                       if (Custom_Binggo_Sel == Custom_Binggo[i])
                                                       {
                                                            Custom_Sel_Binggo_Num[Game_Progress_Count / 2] =
                                                                 Custom_Binggo_Sel;
                                                            Custom_Binggo[i] = 88;
                                                            Game_Progress_Count++;
                                                            Overlap_Check = 0;
                                                            break;
                                                       }
                                                       else
                                                       {
                                                            Overlap_Check = 1;
                                                       }
                                                  }
                                                  if (Overlap_Check == 1)
                                                  {
                                                       System.out.println("�߸� ���� �ϼ˽��ϴ�.");
                                                  }
                                                  for (int i = 0; i < Com_Binggo.length; i++)
                                                  {
                                                       if (Custom_Binggo_Sel == Com_Binggo[i])
                                                       {
                                                            Com_View_Binggo[i] = Com_Binggo[i];
                                                            Com_Binggo[i] = 88;
                                                            break;
                                                       }
                                                  }
                                             }

                                             delay(300);
                                             //--------���⿡ ȭ�� ��(��?)���(��_��) �޼ҵ� �Է�-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------

                                        }
                                   }

                              }
                              break;
                         }
                    case 2:
                         {
                              break;
                         }
                    default:
                         {
                              break;
                         }
               }

          }


     }

     private static void delay(int temp)
     {
          try
          {
               Thread.sleep(temp);
          }
          catch (Exception e)
          {
               System.out.println("������ �Լ� ����\n����:" + e);
          }
     }

}
