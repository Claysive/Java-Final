/*
   We can use this as a starting point for keeping the story text seperate 
   from Main. Might need a little adjusting. 
*/

import javax.swing.JOptionPane;

public class Story
{




   
   
   public static void showText1()
   {
      JOptionPane.showMessageDialog(null, "There's a price on Darren Crane's head, for a hefty sum of gold. Word around town says that he's the leader of the Emerald Hand, his gang of criminals. \nHim and his gang have been terrorizing the town for years now. Crane has his eyes over the whole town; from common folk to the town's guard, Crane controls everything.\nIt's said that the Hand's hideout is on the outskirts of town, in an old tower, five stories high. \n\nYou prepare your gear and set out to get paid."
      ); 
   }
   
   public static void showText2()
   {
      JOptionPane.showMessageDialog(null, "On the first floor, you spot a thug just lumbering about. After a few seconds, he spots you as well, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
   }
   
   public static void showText3()
   {
      JOptionPane.showMessageDialog(null, "The thug was no match for you. You carry on to search the rest of the floor until you encounter a rather fancy looking door. Opening the door reveals a man who seems more powerful than the rest. \nThe man calls himself ''Arthur Black''. He, as well, shouts all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
   }
   
   public static void showText4()
   {
      JOptionPane.showMessageDialog(null, "With the entire floor cleared, it's safe to go up to the next floor. It goes without saying that there will be tougher opponents from here on out, but you're in too deep now. \nAfter a moment's rest, you head on up to continue your job.\n\n\nThanks for playing our demo, we hope you enjoyed it. Peace.");
   }
   
   public static void gameOver()
   {
      JOptionPane.showMessageDialog(null, "Ruh Roh, you died. RNGsus was not in your favor. Try again."); 
   }
   
   public static void miniGame1Text()
   {
      JOptionPane.showMessageDialog(null, "There is a door just beyond Mr. Black's body. It would be wise to check it out. " +
      "\nThere could be some treasure in there.");
   }
   
   public static void miniGame1Instructions()
   {
      JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
      "right below it. It reads \"Enter a palindrome to unlock the door!\" ");
   }
   
   public static void levelUp1Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 200.");
   }
   
   public static void healText()
   {
      
   }

}