import java.util.Scanner;
import java.io.IOException;
public class Game {
   public static void print(String[][] input)
   {   int y,z;
      for(y=0;y<3;y++) {
         for(z=0;z<3;z++)
            System.out.print(input[y][z]+" ");
         System.out.println();
      }
   }
   public void clrscr() {
       try {
           if (System.getProperty("os.name").contains("Windows")) {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
           }
           else {
               Runtime.getRuntime().exec("clear");
           }
       } catch (IOException | InterruptedException ex) {
         
       } 
   }
    public static void main(String args[])
    {
      Game clear = new Game();
        String xo[][]= {{"","",""},{"","",""},{"","","_"}},numeric[][]= {{"1","2","3"},{"4","5","6"},{"7","8","9"}},question;
      int col=3,rows=3,up=0,down=0,nrchoice,horizontal=0,vertical=0,check=0,x = 0,y=0,right=0,princ=0,sec=0,option,winner=0,i,j,contor=1,player1=1,player2=1;
      Scanner read= new Scanner(System.in);
      int frequency[]= {0,0,0,0,0,0,0,0,0};
      contor=1;
      clear.clrscr();
      while(winner==0 && (player1<=5 || player2<=4) )
      {
      //Show details
          System.out.println("--XO--");
         System.out.println("Player 1 -> X");
         System.out.println("Player 2 -> O");
         System.out.println();
         print(numeric);
         System.out.println();
       System.out.println("To mark your choose press numeric keys 1-9");
      //Show array 2d
      print(xo);
      System.out.println();
      //Player1 input
      if(contor%2==1)
      {
      System.out.print("Player1:");
      do{
      option=read.nextInt();
      if(option<1 || option>9 || frequency[option-1]==1)
         System.out.println("Please enter a valid option");
      }while(option<1 || option>9 || frequency[option-1]==1);
      player1++;
      switch(option)
      {
      case 1:{xo[0][0]="X";
      frequency[0]=1;
      }
      break;
      case 2:{ xo[0][1]="X";
      frequency[1]=1;
      }
      break;
      case 3: {xo[0][2]="X";
      frequency[2]=1;
      }
      break;
      case 4:{ xo[1][0]="X";
      frequency[3]=1;
      }
      break;
      case 5:{ xo[1][1]="X";
      frequency[4]=1;
      }
      break;
      case 6:{ xo[1][2]="X";
      frequency[5]=1;
      }
      break;
      case 7: {xo[2][0]="X";
      frequency[6]=1;
      }
      break;
      case 8:{ xo[2][1]="X";
      frequency[7]=1;
      }
      break;
      case 9:{xo[2][2]="X";
      frequency[8]=1;
      }
      break;
      }
   
      //Check line winner for X
      for(i=0;i<rows;i++)
      {   horizontal=1;
         for(j=0;j<col;j++)
            if(xo[i][j]!="X")
               horizontal=0;
         if(horizontal==1)
            break;
      }
      //Check cols winner for X
      for(j=0;j<col;j++)
      {
            vertical=1;
            for(i=0;i<rows;i++)
               if(xo[i][j]!="X")
                  vertical=0;
            if(vertical==1)
               break;
        }
      // Check first diag for X
      princ=1;
      for(i=0;i<rows;i++)
         if(xo[i][i]!="X")
               princ=0;
      //Check second diag for X
      sec=1;
      for(i=0;i<rows;i++)
         for(j=0;j<col;j++)
               if(i+j==rows-1 && xo[i][j]!="X")
                  sec=0;
      if(horizontal==1 || vertical==1 || princ==1 || sec==1)
      {
          clear.clrscr();
             System.out.println("--XO--");
               System.out.println("Player 1 -> X");
               System.out.println("Player 2 -> O");
               System.out.println();
               print(numeric);
               System.out.println();
               System.out.println("To mark your choose press numeric keys 1-9");
             print(xo);
             System.out.println("Winner is Player1");
             System.out.println("Do you want to play again?(Yes/No)");
             question=read.next();
             if(question.equalsIgnoreCase("Yes"))
          {
             winner=0;
             contor=0;
             player1=1;
             player2=1;
             frequency= new int[]{0,0,0,0,0,0,0,0,0};
              xo= new String[][]{{"","",""},{"","",""},{"","","_"}};
          }
          else
            {clear.clrscr();
             System.out.println("Ending...");
             winner=1;
             } 
      }
      }
      //Player2 input
      else 
      {
         System.out.print("Player2:");
         do{
         option=read.nextInt();
         if(option<1 || option>9 || frequency[option-1]==1)
            System.out.println("Please enter a valid option");
         }while(option<1 || option>9 || frequency[option-1]==1);
         player2++;
         switch(option)
         {
         case 1:{xo[0][0]="O";
         frequency[0]=1;
         }
         break;
         case 2:{ xo[0][1]="O";
         frequency[1]=1;
         }
         break;
         case 3: {xo[0][2]="O";
         frequency[2]=1;
         }
         break;
         case 4:{ xo[1][0]="O";
         frequency[3]=1;
         }
         break;
         case 5:{ xo[1][1]="O";
         frequency[4]=1;
         }
         break;
         case 6:{ xo[1][2]="O";
         frequency[5]=1;
         }
         break;
         case 7: {xo[2][0]="O";
         frequency[6]=1;
         }
         break;
         case 8:{ xo[2][1]="O";
         frequency[7]=1;
         }
         break;
         case 9:{xo[2][2]="O";
         frequency[8]=1;
         }
         break;
         }
      
         //Check line winner for O
         for(i=0;i<rows;i++)
         {   horizontal=1;
            for(j=0;j<col;j++)
               if(xo[i][j]!="O")
                  horizontal=0;
            if(horizontal==1)
               break;
         }
         //Check cols winner for O
         for(j=0;j<col;j++)
         {
               vertical=1;
               for(i=0;i<rows;i++)
                  if(xo[i][j]!="O")
                     vertical=0;
               if(vertical==1)
                  break;
            }
         // Check first diag for O
         princ=1;
         for(i=0;i<rows;i++)
            if(xo[i][i]!="O")
                  princ=0;
         //Check second diag for O
         sec=1;
         for(i=0;i<rows;i++)
            for(j=0;j<col;j++)
                  if(i+j==rows-1 && xo[i][j]!="O")
                     sec=0;
         //Check winner  X
         if(horizontal==1 || vertical==1 || princ==1 || sec==1)
         {
             clear.clrscr();
                System.out.println("--XO--");
                  System.out.println("Player 1 -> X");
                  System.out.println("Player 2 -> O");
                  System.out.println();
                  print(numeric);
                  System.out.println();
                  System.out.println("To mark your choose press numeric keys 1-9");
                print(xo);
                System.out.println("Winner is Player2");
                System.out.println("Do you want to play again?(Yes/No)");
                question=read.next();
                //Reset table
                if(question.equalsIgnoreCase("Yes"))
             {
                winner=0;
                contor=0;
                player1=1;
                player2=1;
                frequency= new int[]{0,0,0,0,0,0,0,0,0};
                 xo= new String[][]{{"","",""},{"","",""},{"","","_"}};
             }
                //Exit
             else
               {clear.clrscr();
                System.out.println("Ending...");
                winner=1;
                } 
         }
        }
      //Case no winner 
      if(contor==9)
      {
         winner=1;
         clear.clrscr();
            System.out.println("--XO--");
            System.out.println("Player 1 -> X");
            System.out.println("Player 2 -> O");
            System.out.println();
            print(numeric);
            System.out.println();
            System.out.println("To mark your choose press numeric keys 1-9");
             print(xo);
         System.out.println("No winner");
         System.out.println("Do you want to play again?(Yes/No)");
             question=read.next();
             if(question.equalsIgnoreCase("Yes"))
             {
                winner=0;
                contor=0;
                player1=1;
                player2=1;
               frequency=new int[]{0,0,0,0,0,0,0,0,0};
                 xo= new String[][]{{"","",""},{"","",""},{"","","_"}};
             }
             else{clear.clrscr();
                System.out.println("Ending...");
                winner=1;
                }
      }
      contor++;
      if(winner==0)
      clear.clrscr();
      }
    }
}