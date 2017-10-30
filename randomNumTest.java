import java.util.Scanner;
public class randomNumTest
{
   public static boolean randomNumGame()
   {
      final int MAX_NUM = 10;
      final int MIN_NUM = 1;
      int numGuessed, randNum;
      int count = 1;
      boolean isValid = false;
      Scanner in = new Scanner(System.in);
      
      randNum = ((int)(Math.random() * 100) % MAX_NUM + MIN_NUM);
      
      System.out.println("************Number Game************");
      System.out.println("Guess a number between " + MIN_NUM + " & " + MAX_NUM + ". You will have 3 attempts. Good Luck!\n");
      
      while ((count <= 3) && (!isValid))
      {
         System.out.println("Enter guess number " + count + ": ");
         numGuessed = Integer.parseInt(in.nextLine());
            if (numGuessed < randNum)
            {
               if (count == 3)
               {
                  System.out.println();
               }
               else
               {
                  System.out.println("Guess Higher");
               }
            }
            else if (numGuessed > randNum)
            {
               if (count == 3)
               {
                  System.out.println();
               }
               else
               {
                  System.out.println("Guess Lower");
               }
            }
            
                        
            
            else
            {
               System.out.println("Congratulations! You guessed my number!");
               System.out.println("YOU ARE GRANTED ACCESS TO THE ROOM!\n");
               count = 5;
               isValid = true;
               
            }
         count++;
         
         if ((count == 4) && (!isValid))
         {
            System.out.println("Sorry! You did not guess my number. Better luck next time!\n");
            isValid = false;
            
         }
       }
      
      return isValid;
   }
}