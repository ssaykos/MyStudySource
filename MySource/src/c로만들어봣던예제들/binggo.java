package c로만들어봣던예제들;

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

               System.out.println("@@@!!컴퓨터와 함께 하는 빙고게임!!@@@");
               System.out.println("빙고를 시작해 봅시다.");
               System.out.println("시작(1),종료(2) 중에 선택 하세요.");
               int Sel = scan.nextInt();
               //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
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
                                   //각 빙고라인별 선택한 빙고칸 수 체크
                                   //아래부터는 컴퓨터의 빙고 라인별
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
                                   //여기까지가 컴퓨터의 빙고 라인별 체크수
                                   //아래부터 사용자의 빙고 라인별체크갯수
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
                                   System.out.println("---!★☆★§♡♥♡§★☆★!---빙고게임---!★☆★§♡♥♡§★☆★!---");
                                   System.out.println("-----빙고게임의 현재 진행 턴 : " + Game_Progress_Count + " 번째----");
                                   System.out.println("------------ 컴 퓨 터 의   빙 고 판 ------------");
                                   System.out.println("┌----┬----┬----┬----┬----┐");
                                   System.out.print("│ ");
                                   if (Com_View_Binggo[0] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[0]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[1] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[1]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[2] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[2]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[3] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[3]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[4] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[4]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Com_View_Binggo[5] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[5]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[6] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[6]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[7] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[7]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[8] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[8]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[9] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[9]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Com_View_Binggo[10] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[10]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[11] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[11]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[12] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[12]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[13] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[13]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[14] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[14]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Com_View_Binggo[15] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[15]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[16] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[16]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[17] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[17]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[18] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[18]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[19] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[19]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Com_View_Binggo[20] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[20]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[21] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[21]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[22] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[22]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[23] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[23]);
                                   }
                                   System.out.print(" │ ");
                                   if (Com_View_Binggo[24] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Com_View_Binggo[24]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.printf("└----┴----┴----┴----┴----┘컴퓨터의 빙고 라인 수: %d\n", Com_Binggo_Count);
                                   if (Game_Progress_Count % 2 == 1)
                                   {
                                        System.out.printf("컴퓨터의 %d번째 턴\n", Game_Progress_Count / 2 + 1);
                                   }
                                   System.out.print("컴퓨터가 선택한 빙고번호:");
                                   for (int i = 0; i < (Com_View_Binggo.length + 1) / 2; i++)
                                   {
                                        if (Com_Sel_Binggo_Num[i] != 0)
                                        {
                                             System.out.printf("%02d", Com_Sel_Binggo_Num[i]);
                                             System.out.print(", ");
                                        }
                                   }
                                   System.out.println();
                                   System.out.println("------------ 사 용 자 의   빙 고 판 ------------");
                                   System.out.println("┌----┬----┬----┬----┬----┐");
                                   System.out.print("│ ");
                                   if (Custom_Binggo[0] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[0]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[1] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[1]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[2] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[2]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[3] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[3]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[4] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[4]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Custom_Binggo[5] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[5]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[6] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[6]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[7] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[7]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[8] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[8]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[9] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[9]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Custom_Binggo[10] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[10]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[11] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[11]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[12] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[12]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[13] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[13]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[14] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[14]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Custom_Binggo[15] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[15]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[16] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[16]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[17] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[17]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[18] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[18]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[19] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[19]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("├----┼----┼----┼----┼----┤");
                                   System.out.print("│ ");
                                   if (Custom_Binggo[20] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[20]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[21] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[21]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[22] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[22]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[23] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[23]);
                                   }
                                   System.out.print(" │ ");
                                   if (Custom_Binggo[24] == 88)
                                   {
                                        System.out.print(" " + "★");
                                   }
                                   else
                                   {
                                        System.out.printf("%02d", Custom_Binggo[24]);
                                   }
                                   System.out.println(" │ ");
                                   System.out.println("└----┴----┴----┴----┴----┘사용자의 빙고 라인 수: " + Custom_Binggo_Count);
                                   if (Game_Progress_Count % 2 == 0)
                                   {
                                        System.out.println("사용자의의" + (int) (Game_Progress_Count / 2) + "번째 턴");
                                   }
                                   System.out.print("사용자가 선택한 빙고 번호:");
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
                                             System.out.println("컴퓨터의 승리\n 당신은 패배 하였습니다.");
                                             System.out.println("메인으로 돌아갑니다.");
                                             delay(5000);
                                             //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------
                                             break;
                                        }
                                        else if (Custom_Binggo_Count > Com_Binggo_Count)
                                        {
                                             System.out.println("사용자의 승리\n 너님이 승리 하였답니다.凸");
                                             System.out.println("메인으로 돌아갑니다.");
                                             delay(5000);
                                           //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
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
                                                  System.out.println("컴퓨터의 차례로 게임이 끝났으므로 컴퓨터의 승리입니다.");
                                                  System.out.println("컴퓨터의 승리\n 당신은 패배 하였습니다.");
                                                  System.out.println("메인으로 돌아갑니다.");
                                                  delay(5000);
                                                //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
                                                  for (int i = 0; i < 50; i++)
                                                  {
                                                       System.out.println();
                                                  }
                                                  //------------------------------------------
                                                  break;
                                             }
                                             else
                                             {
                                                  System.out.println("사용자의 차례로 게임이 끝났으므로 사용자의 승리입니다.");
                                                  System.out.println("사용자의 승리\n 너님이 승리 하였답니다.凸");
                                                  System.out.println("메인으로 돌아갑니다.");
                                                  delay(5000);
                                                //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
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
                                             System.out.println("컴퓨터의 차례입니다.");
                                             delay(500);
                                             Overlap_Check = 1;
                                             while (Overlap_Check > 0)
                                             {
                                                  Com_Binggo_Sel = ((int) (Math.random() * 25) + 1);
                                                  System.out.print("컴퓨터의 선택:" + Com_Binggo_Sel);
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

                                             //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
                                             for (int i = 0; i < 50; i++)
                                             {
                                                  System.out.println();
                                             }
                                             //------------------------------------------
                                        }
                                        else
                                        {
                                             System.out.println("사용자의 차례입니다.");
                                             delay(500);

                                             Overlap_Check = 1;
                                             while (Overlap_Check > 0)
                                             {
                                                  System.out.print("사용자의 선택:");
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
                                                       System.out.println("잘못 선택 하셧습니다.");
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
                                             //--------여기에 화면 지(비?)우는(ㅜ_ㅜ) 메소드 입력-----------
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
               System.out.println("딜레이 함수 오류\n원인:" + e);
          }
     }

}
