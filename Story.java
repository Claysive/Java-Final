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
      JOptionPane.showMessageDialog(null, "You carry on to search the floor until you encounter a rather fancy looking door. Opening the door reveals a man who seems more powerful than the rest. \nThe man calls himself ''Arthur Black''. He, as well, shouts all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
   }
   
   public static void showText4()
   {
      JOptionPane.showMessageDialog(null, "With the entire floor cleared, you come to realize there is no stair way leading further up.\nThis was the last floor and Darren Crane was nowhere to be found.He must of tucked tail and ran as soon as he realized your power.\n Quess you will have to keep looking elsewhere for him. \n\n\nThanks for playing our demo, we hope you enjoyed it. Peace.");
   }
     public static void showText5()
   {
      JOptionPane.showMessageDialog(null, "Behind the third door, you spot a Elite thug sitting in the corner waiting for you\n. After a few seconds, he spots you as well, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
   }
     public static void showText6()
   {
      JOptionPane.showMessageDialog(null, "The Elite thug was no match for you. You carry on to search the rest of the floor until you encounter a stairway leading up to the next floor. You Proceed upwards praying that you've dealt with the last of these lowly criminals. ");
   }
      public static void showText7()
   {
      JOptionPane.showMessageDialog(null, "As you reach the last step onto the next floor you notice a man halfway covered in the shadows of this dark floor. He walks into the light and says im Captain Greymane and you will go no further worm. You prepare for battle.");
   }
     public static void showText8()
   {
      JOptionPane.showMessageDialog(null, "Behind the third door, you spot a a Knight dressed in Silver Armor sharpening his sword casually\n. After a few seconds, he spots you, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
   }
      public static void showText9()
   {
      JOptionPane.showMessageDialog(null, "You deliver a final blow that opens a wide gash in the knights torso and as he falls to the ground he mumbles something that you cant quite make out and then dies.");
   }
      public static void showText10()
   {
      JOptionPane.showMessageDialog(null, "With the second floor cleared you find the some stairs leading up to what must be the final floor only to realize its not.\n You see another set of stairs and no rooms on this floor so you continue on up.You ready yourself for what could be a final confrontation.");
   }
   public static void gameOver()
   {
      JOptionPane.showMessageDialog(null, "Ruh Roh, you died. RNGsus was not in your favor. Try again."); 
   }
   
   public static void miniGame1Text()
   {
      JOptionPane.showMessageDialog(null, "There are three doors just beyond the thugs body. It would be wise to check them out. " +
      "\nThere could be some treasure in there.");
   }
    public static void miniGame2Text()
   {
      JOptionPane.showMessageDialog(null, "There are three doors just beyond the thugs body. It would be wise to check them out. " +
      "\nThere could be some treasure in there.");
   }
      public static void miniGame3Text()
   {
      JOptionPane.showMessageDialog(null, "There are three doors just beyond the Captains body. It would be wise to check them out. " +
      "\nThere could be some treasure in there.");
   }
   public static void miniGame1Instructions()
   {
      JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
      "right below it. It reads \"Enter a palindrome to unlock the door!\" ");
   }
    public static void miniGame2Instructions()
   {
      JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
      "right below it. It reads \"Solve the riddle to unlock the door!\" ");
   }
     public static void miniGame3Instructions()
   {
      JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
      "right below it. It reads \"Enter the correct number to unlock the door!\" ");
   }
   
   public static void levelUp1Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 200.");
   }
   
    public static void levelUp2Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 300.");
   }
   
    public static void levelUp3Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 400.");
   }
   public static void levelUp4Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 200.");
   }
   public static void levelUp5Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 200.");
   }
   public static void levelUp6Text()
   {
      JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
      "it, you have been healed, along with your overall health being increased by 200.");
   }
   
   public static void healText1()
   {
      JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
      "drinking it, your health has been restored to 700. ");
   }
   
   public static void healText2()
   {
      JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
      "drinking it, your health has been restored to 900. ");
   }
   
   public static void healText3()
   {
      JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
      "drinking it, your health has been restored to 1200. ");
   }
     public static void healText4()
   {
      JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
      "drinking it, your health has been restored to 1400. ");
   }
}
