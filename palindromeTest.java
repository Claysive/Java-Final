import java.util.Scanner;

public class palindromeTest
{
   
   public static boolean checkPalindrome()
      {
      String strReverse = "";
      String strForward;
      int length;
      int lastspace;
      int x = 0;
      Scanner in = new Scanner(System.in);
      boolean palindrome = false;
   
     
         String strTemp = "";
         String strTemp2 = "";
         String strTemp3 = "";
         System.out.println("Enter a word or phrase to check if it is a palindrome: ");
         strForward = in.nextLine();
         length = strForward.length();
         lastspace =  -1;
         
         for(int i = length - 1; i >= 0; i--)
         {
            strReverse = strReverse + strForward.charAt(i);
         }
         
         strTemp = strReverse;
         
         while (x < strTemp.length())
         {
            if (strTemp.charAt(x) == ' ')
            {
               strTemp2 = strTemp2 + strTemp.substring(lastspace + 1, x);
               lastspace = x;
            }
            
            x++;
         }
         strTemp2 = strTemp2 + strTemp.substring(lastspace + 1, x);
         
         strTemp = strForward;
         x = 0;
         lastspace = -1;
         
         while (x < strTemp.length())
         {
            
            if (strTemp.charAt(x) == ' ')
            {
               strTemp3 = strTemp3 + strTemp.substring(lastspace + 1, x);
               lastspace = x;
            }
            
            x++;
         }
         strTemp3 = strTemp3 + strTemp.substring(lastspace + 1, x);
         
         strForward = strTemp3;
         strReverse = strTemp2;
      
         if (strForward.equalsIgnoreCase(strReverse))
         {
            palindrome = true;
            System.out.println("The word or phrase is a palindrome! Good Job!");
         }
         else
         {
            System.out.println("The word or phrase is not a palindrome. Try Again!");
            x = 0;
            lastspace = -1;
            strReverse = "";
         }
      
      
      
         return palindrome;
     }
     
      public static boolean palinGame()
      {
      boolean palin = false;
      boolean isValid;
      int count = 1;
      
      System.out.println("************Palindrome Game************");
      System.out.println("You will have 3 attempts to enter a palindrome! Good Luck!\n");
      while ((count <= 3) && (!palin))
      {
         palin = checkPalindrome();
         count++;
         
         if ((count == 4) && (!palin))
            System.out.println("Oops! Looks like you are out of tries! Thats too bad!\n");
      }
      
      if (palin)
      {
         System.out.println("YOU ARE GRANTED ACCESS TO THE ROOM!\n");
         isValid = true;
         return isValid;
      } 
      else
      {
         isValid = false;
         return isValid;
      }
     }
   
}