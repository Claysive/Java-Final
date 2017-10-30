import java.util.Scanner;

public class riddleTest
{
   public static boolean riddleGame()
   {
      boolean isValid = false;
      final String riddle = "What word becomes shorter when you add two letters to it?";
      final String answer = "short";
      String guess;
      int count = 1;
      Scanner in = new Scanner(System.in);
      
      System.out.println("************Solve The Riddle************\n");
      
      while ((count <= 3) && (!isValid))
      {
         System.out.println(riddle);
         guess = in.nextLine();
         
            if (guess.equalsIgnoreCase(answer))
            {
               System.out.println("You have solved the riddle! Good Job!");
               System.out.println("YOU HAVE BEEN GRANTED ACCESS TO THE ROOM!\n");
               isValid = true;
            }
            else
            {
               if (count == 3)
               {
                  System.out.println("Sorry, that is not correct. Better luck next time!");
               }
               else
               {
                  System.out.println("Sorry, that is not correct. Try again!");
               }
            }
            
          count++;
      }
      
      return isValid;
      
   }
}