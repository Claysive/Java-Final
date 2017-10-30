import javax.swing.*;
public class RNGGame
{
//Class for combining all the parts together.
public static void main(String[] args)
{
  
   //All the enemies
   Enemy oppenent = new Enemy("Thug", 450);
   Enemy boss = new Enemy("Arthur Black", 600);
   //String to store fight result from calling the StartFight method in the Fight2 class.
   String FightResult = " ";
   //String to store player name
   String playerName;
   
   //boolean variables for the minigames
   boolean isPalin = false;
   
   //Title shows up
   JOptionPane.showMessageDialog(null,"RNG: The Video Game");
   
   //Ask/get player custom name and makes player object with custom name
   playerName = JOptionPane.showInputDialog(null,"What is your name?");
   Player player = new Player(playerName, 700);
   
   //Story Text Starts.
   Story newStory = new Story();
   newStory.showText1();
   newStory.showText2();
   
   
   //Fight Starts.
   Fight fight1 = new Fight();
   FightResult = fight1.StartFight(player, oppenent);
   //fight result returned to FightResult variable and then output.
   JOptionPane.showMessageDialog(null,FightResult);
   System.out.println(" ");
   
   
   //if the player is alive/won the battle, the game goes on
   if (player.health > 0)
   {
      
      newStory.showText3();
      
      Fight fight2 = new Fight();
      FightResult = fight1.StartFight(player, boss);
      
      JOptionPane.showMessageDialog(null,FightResult);
      
      if (player.health > 0)
      {
         newStory.miniGame1Text();
         newStory.miniGame1Instructions();
         isPalin = palindromeTest.palinGame();
         
            if (isPalin)
            {
               player.levelUp1();
            }
         
         //System.out.println(player.getHealth());
         //newStory.showText4();
      }
      
      //if the player is dead/lost after the 2nd battle, game over
      else
      {
         newStory.gameOver();
      }
      
    }
    
    //if the player is dead/lost after the 1st battle, game over
    else
    {
      newStory.gameOver();
    }

}
}