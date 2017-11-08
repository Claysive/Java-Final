import javax.swing.*;
import java.util.Scanner;
public class RNGGame
{
//Class for combining all the parts together.
public static void main(String[] args)
{
  
   //All the enemies
   Enemy oppenent = new Enemy("Thug", 450);
   Enemy boss = new Enemy("Arthur Black", 600);
   Enemy oppenent2 = new Enemy("Elite Thug",500);
   Enemy boss2 = new Enemy("Captain Greymane",550);
   Enemy oppenent3 = new Enemy("Silver Knight",570);
   //String to store fight result from calling the StartFight method in the Fight2 class.
   String FightResult = " ";
   //String to store player name
   String playerName;
   
   //roll for determining if player gets new tier set of armor after defeating bosses. a roll from 1-5,
   //if player rolls atleast a 3 or greater they receive the new tier set
   int roll = 0;
  
   Scanner keyboard = new Scanner(System.in);
   //variable to track which door player chooses 1,2, or 3.
   int playerchoice = 0;
   //boolean variables for the three minigames that are behind the doors.
   boolean isPalin = false;
   boolean isRiddle = false;
   boolean isNumber = false;
   //Title shows up
   JOptionPane.showMessageDialog(null,"RNG: The Video Game");
   
   //Ask/get player custom name and makes player object with custom name
   playerName = JOptionPane.showInputDialog(null,"What is your name?");
   
   //inventory for player that keeps up with armor tier sets.
   //player starts with linen tier set(set 1). As player defeats new bosses , player has a chance to recieve the next tier set.
   //the first row represents chest armor pieces(0 = linen,1 = leather,2 = iron, 3 = steel, 4 = adamantite).
   //the second row represents head armor, third row is pants armor, fourth row is glove armor, fifth row is boots armor.
   //so inventory[0][0] represents the (linen chest), inventory[0][1] represents (leather chest),
   //inventory[0][2] represents the (iron chest), inventory[0][3] represents the (steel chest), inventory[0][4] represents the (adamantite chest).
   //and so forth for the rest of the armor categories.
   //each piece of linen set armor is equivalent to 1 additional armor , so having the full linen set is = to 5 armor for the player.
   //each set goes up by 1, so having the full leather armor set is = to 10 armor and so on for the rest of the sets.
   //iron/15,steel/20,adamantite/25. So having full adamantite armor reduces enemy damage by 25.
   //So to clarify, inventory set armor pieces determine how much armor the player has.
   
   //Using a Multi-Dimensional array. inventory declared and intialized.
   int[][] inventory = {{0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0},
                        {0,0,0,0,0}};
                        
                   inventory[0][0] = 1;
                   inventory[1][0] = 1;
                   inventory[2][0] = 1;
                   inventory[3][0] = 1;
                   inventory[4][0] = 1;
                                 
   //inventory added as third argument to player.
   Player player = new Player(playerName, 700,inventory);
   
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
                    
                    //indicate that there are 3 doors to go through on this floor.
                    newStory.miniGame1Text();
                   
    //roll a number between 1-5 after beating boss to see if player recieves new tier set(set 2 or 3).
                   roll = 1 +(int)(Math.random() * 5);
      //if roll is greater than or equal to 1, player recieves armor set tier 2(leather armor) for each armor category slot and loses first set which is weaker.
                   if(roll >= 1)
                   {
                   //clear armor tier 1 set(linen armor).
              
                   //assign new armor tier 2 set(leather armor).
                   inventory[0][1] = 1;
                   inventory[1][1] = 1;
                   inventory[2][1] = 1;
                   inventory[3][1] = 1;
                   inventory[4][1] = 1;
                   //set player inventory which alters the amount of armor recieved.
                   player.setPlayerInventory(inventory);
                   player.setPlayerArmor(inventory);
                   }
                   //if player rolls 3 or higher they reicieve the armor tier 3 set(iron armor)instead.
                   else if(roll >= 3)
                   {
                   inventory[0][2] = 1;
                   inventory[1][2] = 1;
                   inventory[2][2] = 1;
                   inventory[3][2] = 1;
                   inventory[4][2] = 1;
                   //set player inventory which alters the amount of armor recieved.
                   player.setPlayerInventory(inventory);
                   player.setPlayerArmor(inventory);
                   }
                   
                   //give player a choice to pick one of the three doors.
                   JOptionPane.showMessageDialog(null,"Choose to go through door 1,2, or 3 by typing 1,2, or 3");
                   playerchoice = keyboard.nextInt();
                   
                   if(playerchoice == 1)
                   {
                   //if player chose 1, start palindrom minigame.
                   newStory.miniGame1Instructions();
                   isPalin = palindromeTest.palinGame();
         
                   if (isPalin)
                   {
                   player.levelUp1();
                   }
                   else
                   {
                   player.heal3();
                   }
                   }
                   else if(playerchoice == 2)
                   {
                   //if player chose 2, start riddle minigame.
                   newStory.miniGame2Instructions();
                   isRiddle = riddleTest.riddleGame();
                   if (isRiddle)
                   {
                   player.levelUp2();
                   }
                   else
                   {
                   player.heal4();
                   }
                   }
                   else if(playerchoice == 3)
                   {
                   //if player chose 3, start a new oppenent fight.
                   newStory.showText5();
                   Fight fight2 = new Fight();
                   FightResult = fight2.StartFight(player, oppenent2);
                   if(player.health > 0)
                   {
                   //if player beats encounter, level them up with bonus hp
                   newStory.showText6();
                   player.levelUp3();
                   }
                   else
                   newStory.gameOver();
                   }
                   
      
      newStory.showText7();
      Fight fight3= new Fight();
      FightResult = fight3.StartFight(player, boss2);
      
      JOptionPane.showMessageDialog(null,FightResult);
       if (player.health > 0)
      {
                   newStory.miniGame3Text();
      //roll a number between 1-5 after beating boss to see if player recieves new tier set(set 4 or 5).
                   roll = 1 +(int)(Math.random() * 5);
      //if roll is greater than or equal to 4, player recieves armor set tier 4(steel armor) for each armor category slot and loses first set which is weaker.
                   if(roll >= 4)
                   {
                   
              
                   //assign new armor tier 4 set(steel armor).
                   inventory[0][3] = 1;
                   inventory[1][3] = 1;
                   inventory[2][3] = 1;
                   inventory[3][3] = 1;
                   inventory[4][3] = 1;
                   //set player inventory which alters the amount of armor recieved.
                   player.setPlayerInventory(inventory);
                   player.setPlayerArmor(inventory);
                   }
                   //if player rolls 5 they recieve the armor tier 5(best) set(adamantite armor)instead.
                   else if(roll == 5)
                   {
                   inventory[0][4] = 1;
                   inventory[1][4] = 1;
                   inventory[2][4] = 1;
                   inventory[3][4] = 1;
                   inventory[4][4] = 1;
                   //set player inventory which alters the amount of armor recieved.
                   player.setPlayerInventory(inventory);
                   player.setPlayerArmor(inventory);
                   }
                   
                  //give player a choice to pick one of the three doors.
                   JOptionPane.showMessageDialog(null,"Choose to go through door 1,2, or 3 by typing 1,2, or 3");
                   playerchoice = keyboard.nextInt();
                   
                   if(playerchoice == 1)
                   {
                   //if player chose 1, start palindrome minigame.
                   newStory.miniGame1Instructions();
                   isPalin = palindromeTest.palinGame();
         
                   if (isPalin)
                   {
                   player.levelUp4();
                   }
                   else
                   {
                   player.heal1();
                   }
                   }
                   else if(playerchoice == 2)
                   {
                   //if player chose 2, start random number minigame.
                   newStory.miniGame3Instructions();
                   isNumber = randomNumTest.randomNumGame();
                   if (isNumber)
                   {
                   player.levelUp5();
                   }
                   else
                   {
                   player.heal2();
                   }
                   }
                   else if(playerchoice == 3)
                   {
                   //if player chose 3, start a new oppenent fight.
                   newStory.showText8();
                   Fight fight4 = new Fight();
                   FightResult = fight4.StartFight(player, oppenent3);
                   if(player.health > 0)
                   {
                   //if player beats encounter, level them up with bonus hp
                   newStory.showText9();
                   player.levelUp6();
                   }
                   else
                   newStory.gameOver();
                   }

         
         
         newStory.showText10();
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
      newStory.showText3();
      Fight fight5 = new Fight();
      FightResult = fight5.StartFight(player, boss);
      
      if (player.health > 0)
      { 
         newStory.showText4();
      }
      
      //if the player is dead/lost after the 2nd battle, game over
      else
      {
         newStory.gameOver();
      }
      
}
}
