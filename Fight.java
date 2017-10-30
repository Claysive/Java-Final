/*
   Small example of some of the methods
   and objects being used. 
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Fight
{
 //New Method of the fight class called from StoryStart class ,only after certain parts of the story have progressed.
 //Just to keep the main method clear of all the code that goes on behind the scenes.
 //Returns a String Variable Result to StoryStart displaying a message of who won the fight at the bottom.
   public String StartFight(Player player, Enemy boss)
   {
      //variables for boss/player rolls.
      
      //String Result for returning to main method of StoryStart Class.
      String Result = " ";
      int BossRoll = 0;
      int PlayerRoll = 0;
      int answer;
      //variables for boss/player hit points.
      int PlayerHitPoints;
      int BossHitPoints;
      //variable for determining low,high,critical hit
      int RollDifference;
      Scanner keyboard = new Scanner(System.in);
      //Player/user starts with five 20 sided dice.
      int twentySidedDiceCounter = 5;
           
      
      //Variable for storing player's Hit Points.
      PlayerHitPoints = player.getHealth();
      //Variable for storing boss's Hit Points.
      BossHitPoints = boss.getHealth();
    
      
     
      
      
      //initialize roll counter
      int rollCounter = 1;
       //While either the player's health or boss's health is greater than 0 , meaning atleast one is still alive and has more than 0 Hit Points.
       //And While rollcounter is greater than 1 but less than or equal to 200.
      while((player.getHealth() > 0 && boss.getHealth() > 0) && rollCounter >= 1 && rollCounter <= 200){
      //If player/user still has atleast one 20 sided die to use allow them to roll 20 sided die til they have 0.
      if(twentySidedDiceCounter >= 1)
      {
     
        Object[] diceOptions = {"Use 20-Sided Die", "Stick with 10-Sided Die"};
         answer = JOptionPane.showOptionDialog(null, 
         player.getName() +"'s health: " + player.health + "\n" + boss.getName() + "'s health: " + boss.health + "\n\n"  + "Do you want to roll a normal 10-sided die? You have a total reserve of " + twentySidedDiceCounter + " twenty-sided die.","Choose Dice",
         JOptionPane.PLAIN_MESSAGE,
         JOptionPane.QUESTION_MESSAGE,
         null,
         diceOptions,
         diceOptions[0]);
         
      //if user/player types 1 , they want to use just a 10 sided dice as their roll.
         if(answer == 1)
         {
            //Set the Boss's roll and assign the Boss's roll to BossRoll variable.(Boss can only roll 10 sided dice).
            boss.setBossRoll10();
            BossRoll = boss.getRoll1();
            //Set the Player's roll and assign the Player's roll to PlayerRoll variable.
            player.setPlayerRoll10();
            PlayerRoll = player.getRoll1();
         }
         else if(answer == 0 && twentySidedDiceCounter >= 1 )
   
            {
            boss.setBossRoll10();
            BossRoll = boss.getRoll1();
            //Set the Player's roll and assign the Player's roll to PlayerRoll variable.
            //New method created to get player's 20 sided dice roll.
            player.setPlayerRoll20();
            //return the roll to PlayerRoll variable for determining attack.
            PlayerRoll = player.getRoll2();
           //System.out.print("You chose to roll a 20 sided dice and rolled a " + PlayerRoll + "\n");
            //increase 20 sided die counter so that player will only get a maximum of 5 uses.
            twentySidedDiceCounter -= 1;   
            //System.out.print("You have " + twentySidedDiceCounter + " 20 sided dice left to use\n");
            
          }
    }
    
    //Player has run out of 20 sided die rolls and can only Type 1 to roll a 10 sided dice.
    else
       
         {
         //notify player that they have run out of 20 sided dice rolls.
          
         Object[] diceOptions2 = {"Use 10-Sided Die"};
         answer = JOptionPane.showOptionDialog(null, 
         player.getName() +"'s health: " + player.health + "\n" + boss.getName() + "'s health: " + boss.health + "\n\n"  + "Do you want to roll a normal 10-sided die? You have a total reserve of " + twentySidedDiceCounter + " twenty-sided die.","Choose Dice",
         JOptionPane.PLAIN_MESSAGE,
         JOptionPane.QUESTION_MESSAGE,
         null,
         diceOptions2,
         diceOptions2[0]);
         
         boss.setBossRoll10();
         BossRoll = boss.getRoll1();
         //Set the Player's roll and assign the Player's roll to PlayerRoll variable.(Can only roll 10 sided die at this point).
         player.setPlayerRoll10();
         PlayerRoll = player.getRoll1();
         }
    
    
      
      //Counter to keep up with rolls , so rolls dont go past 200.
      rollCounter += 1;
     
      if(PlayerRoll > BossRoll)
      {
      
         //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
           RollDifference =  PlayerRoll - BossRoll;
          
          if(RollDifference >= 4)
          {
            
             boss.health = player.CriticalHit(boss.health);
             JOptionPane.showMessageDialog(null,
             "Your roll: " + PlayerRoll + "\n" +
             "Enemy's roll: " + BossRoll + "\n\n" +
             player.getName() + " has landed a CRITICAL HIT!!!!\n"+
             "The damage dealt was: " + player.damage + "\n\n" +
             boss.getName() +"'s Health after " + player.getName() + "'s CRITICAL HIT is  " + boss.getHealth()
             );
           }
          
          
          else if(RollDifference >= 2)
          {
             //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
             
             boss.health = player.HighHit(boss.health);
             JOptionPane.showMessageDialog(null,
             "Your roll: " + PlayerRoll + "\n" +
             "Enemy's roll: " + BossRoll + "\n\n" +
             player.getName() + " has landed a HIGH HIT!!!\n"+
             "The damage dealt was: " + player.damage + "\n\n" +
             boss.getName() +"'s Health after " + player.getName() + "'s HIGH HIT is  " + boss.getHealth()
             );
    
           }
            
           else if(RollDifference > 0)
           {
              //just used for clarity indicating its a High hit attack to pass to the Armor Break Mehtod to determine how much armor is lost.
              
               boss.health = player.lowHit(boss.health);
               JOptionPane.showMessageDialog(null,
                "Your roll: " + PlayerRoll + "\n" +
                "Enemy's roll: " + BossRoll + "\n\n" +
                player.getName() + " has landed a LOW HIT!!!!\n"+
                "The damage dealt was: " + player.damage + "\n\n" +
                boss.getName() +"'s Health after " + player.getName() + "'s LOW HIT is  " + boss.getHealth()
             );

           }
        }
        
      
       else
          {
              if(PlayerRoll < BossRoll)
                 {
                   //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
                   RollDifference =  BossRoll - PlayerRoll;
                
                   if(RollDifference > 3)
                   {
                      
                      player.health = boss.CriticalHit(player.health);
                      JOptionPane.showMessageDialog(null,
                      "Your roll: " + PlayerRoll + "\n" +
                      "Enemy's roll: " + BossRoll + "\n\n" +
                      boss.getName() + " has landed a CRITICAL HIT!!!\n"+
                      "The damage dealt was: " + boss.damage + "\n\n" +
                      player.getName() +"'s Health after " + boss.getName() + "'s CRITICAL HIT is  " + player.getHealth()
                      );

                    }
                
                
                   
                   else if(RollDifference > 1)
                   {
                      
                      player.health = boss.HighHit(player.health);
                      JOptionPane.showMessageDialog(null,
                      "Your roll: " + PlayerRoll + "\n" +
                      "Enemy's roll: " + BossRoll + "\n\n" +
                      boss.getName() + " has landed a HIGH HIT!!!\n"+
                      "The damage dealt was: " + boss.damage + "\n\n" +
                      player.getName() +"'s Health after " + boss.getName() + "'s HIGH HIT is  " + player.getHealth()
                      );
                    }
                    
               
                   else if(RollDifference > 0)
                   {
                        player.health = boss.lowHit(player.health);
                        JOptionPane.showMessageDialog(null,
                         "Your roll: " + PlayerRoll + "\n" +
                         "Enemy's roll: " + BossRoll + "\n\n" +
                         boss.getName() + " has landed a LOW HIT!!!!\n"+
                         "The damage dealt was: " + boss.damage + "\n\n" +
                         player.getName() +"'s Health after " + boss.getName() + "'s LOW HIT!!! is  " + player.getHealth()
                         );
                   }
                }
                //if both rolls equal the same, this occurs
             else if (PlayerRoll == BossRoll)
          {
             JOptionPane.showMessageDialog(null,
             "Your roll: " + PlayerRoll + "\n" +
             "Enemy's roll: " + BossRoll + "\n\n" +
             "Tie, no damage dealt"
             );

          }
   
          }
                           
      }
      PlayerHitPoints = player.health;
      BossHitPoints = boss.health;
      //If rollCounter variable which keeps up with rolls goes past 200 the fight is decided as a Tie.
    
      //If either player has greater than 0 hit points, once the loop as finished ,player has won the fight
      if(PlayerHitPoints > 0)
      {
       Result = player.getName() + " has won the fight!";
       return Result;
      }
      //Else Boss had more by the end.Boss wins.
      else if(BossHitPoints > 0)
      {
      Result = boss.getName() + " has won the fight.";
      return Result;
      }
      else{
      //Else its a Tie.
      Result = "Fight is a Tie";
      return Result;
      //If rollCounter variable which keeps up with rolls goes past 200 the fight is decided as a Tie.
      
    }
    
    }
     
      
      
      
   
}