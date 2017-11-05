  1 /*
  2    We can use this as a starting point for keeping the story text seperate 
  3    from Main. Might need a little adjusting. 
  4 */
  5 
  6 import javax.swing.JOptionPane;
  7 
  8 public class Story
  9 {
 10 
 11 
 12 
 13 
 14    
 15    
 16    public static void showText1()
 17    {
 18       JOptionPane.showMessageDialog(null, "There's a price on Darren Crane's head, for a hefty sum of gold. Word around town says that he's the leader of the Emerald Hand, his gang of criminals. \nHim and his gang have been terrorizing the town for years now. Crane has his eyes over the whole town; from common folk to the town's guard, Crane controls everything.\nIt's said that the Hand's hideout is on the outskirts of town, in an old tower, five stories high. \n\nYou prepare your gear and set out to get paid."
 19       ); 
 20    }
 21    
 22    public static void showText2()
 23    {
 24       JOptionPane.showMessageDialog(null, "On the first floor, you spot a thug just lumbering about. After a few seconds, he spots you as well, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
 25    }
 26    
 27    public static void showText3()
 28    {
 29       JOptionPane.showMessageDialog(null, "You carry on to search the floor until you encounter a rather fancy looking door. Opening the door reveals a man who seems more powerful than the rest. \nThe man calls himself ''Arthur Black''. He, as well, shouts all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
 30    }
 31    
 32    public static void showText4()
 33    {
 34       JOptionPane.showMessageDialog(null, "With the entire floor cleared, you come to realize there is no stair way leading further up.\nThis was the last floor and Darren Crane was nowhere to be found.He must of tucked tail and ran as soon as he realized your power.\n Quess you will have to keep looking elsewhere for him. \n\n\nThanks for playing our demo, we hope you enjoyed it. Peace.");
 35    }
 36      public static void showText5()
 37    {
 38       JOptionPane.showMessageDialog(null, "Behind the third door, you spot a Elite thug sitting in the corner waiting for you\n. After a few seconds, he spots you as well, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
 39    }
 40      public static void showText6()
 41    {
 42       JOptionPane.showMessageDialog(null, "The Elite thug was no match for you. You carry on to search the rest of the floor until you encounter a stairway leading up to the next floor. You Proceed upwards praying that you've dealt with the last of these lowly criminals. ");
 43    }
 44       public static void showText7()
 45    {
 46       JOptionPane.showMessageDialog(null, "As you reach the last step onto the next floor you notice a man halfway covered in the shadows of this dark floor. He walks into the light and says im Captain Greymane and you will go no further worm. You prepare for battle.");
 47    }
 48      public static void showText8()
 49    {
 50       JOptionPane.showMessageDialog(null, "Behind the third door, you spot a a Knight dressed in Silver Armor sharpening his sword casually\n. After a few seconds, he spots you, shouting out all sorts of words we cant type out here. \n\nThe both of you prepare for battle.");
 51    }
 52       public static void showText9()
 53    {
 54       JOptionPane.showMessageDialog(null, "You deliver a final blow that opens a wide gash in the knights torso and as he falls to the ground he mumbles something that you cant quite make out and then dies.");
 55    }
 56       public static void showText10()
 57    {
 58       JOptionPane.showMessageDialog(null, "With the second floor cleared you find the some stairs leading up to what must be the final floor only to realize its not.\n You see another set of stairs and no rooms on this floor so you continue on up.You ready yourself for what could be a final confrontation.");
 59    }
 60    public static void gameOver()
 61    {
 62       JOptionPane.showMessageDialog(null, "Ruh Roh, you died. RNGsus was not in your favor. Try again."); 
 63    }
 64    
 65    public static void miniGame1Text()
 66    {
 67       JOptionPane.showMessageDialog(null, "There are three doors just beyond the thugs body. It would be wise to check them out. " +
 68       "\nThere could be some treasure in there.");
 69    }
 70     public static void miniGame2Text()
 71    {
 72       JOptionPane.showMessageDialog(null, "There are three doors just beyond the thugs body. It would be wise to check them out. " +
 73       "\nThere could be some treasure in there.");
 74    }
 75       public static void miniGame3Text()
 76    {
 77       JOptionPane.showMessageDialog(null, "There are three doors just beyond the Captains body. It would be wise to check them out. " +
 78       "\nThere could be some treasure in there.");
 79    }
 80    public static void miniGame1Instructions()
 81    {
 82       JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
 83       "right below it. It reads \"Enter a palindrome to unlock the door!\" ");
 84    }
 85     public static void miniGame2Instructions()
 86    {
 87       JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
 88       "right below it. It reads \"Solve the riddle to unlock the door!\" ");
 89    }
 90      public static void miniGame3Instructions()
 91    {
 92       JOptionPane.showMessageDialog(null, "Looks like the door is locked. It has a small engraving with a keypad and screen\n" +
 93       "right below it. It reads \"Enter the correct number to unlock the door!\" ");
 94    }
 95    
 96    public static void levelUp1Text()
 97    {
 98       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
 99       "it, you have been healed, along with your overall health being increased by 200.");
100    }
101    
102     public static void levelUp2Text()
103    {
104       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
105       "it, you have been healed, along with your overall health being increased by 300.");
106    }
107    
108     public static void levelUp3Text()
109    {
110       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
111       "it, you have been healed, along with your overall health being increased by 400.");
112    }
113    public static void levelUp4Text()
114    {
115       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
116       "it, you have been healed, along with your overall health being increased by 200.");
117    }
118    public static void levelUp5Text()
119    {
120       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
121       "it, you have been healed, along with your overall health being increased by 200.");
122    }
123    public static void levelUp6Text()
124    {
125       JOptionPane.showMessageDialog(null, "You have found a treasure chest inside of the room. It contains a potion. After drinking\n" +
126       "it, you have been healed, along with your overall health being increased by 200.");
127    }
128    
129    public static void healText1()
130    {
131       JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
132       "drinking it, your health has been restored to 700. ");
133    }
134    
135    public static void healText2()
136    {
137       JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
138       "drinking it, your health has been restored to 900. ");
139    }
140    
141    public static void healText3()
142    {
143       JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
144       "drinking it, your health has been restored to 1200. ");
145    }
146      public static void healText4()
147    {
148       JOptionPane.showMessageDialog(null, "Although you have failed to open the door, you have stumbled across a small potion. After\n" +
149       "drinking it, your health has been restored to 1400. ");
150    }
151 }
152 
