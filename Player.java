/*
   This will be just a basic class for the player
   that we can use for our midterm.
   Hopefully gives us a starting point.
*/

public class Player
{  
   //int used to set/get random number roll from 1-10.
   int roll1;
   //int used to set/get random number roll from 1-20.
   int roll2;
   //Highest Value you want the roll to be for 10 sided dice.
   static final int HIGHEST_DIE_VALUE10 = 10;
   //Highest Valule you want the roll to be for 20 sided dice.
    static final int HIGHEST_DIE_VALUE20 = 20;
   //Lowest Value you want the roll to be for 10 sided dice.
   static final int LOWEST_DIE_VALUE10 = 1;
   //Lowest Value you want the roll to be for 20 sided dice.
    static final int LOWEST_DIE_VALUE20 = 1;
   private final String name;
   public int health; //made public so that other objects can change health based on attacks
   public int damage;
 
   public Player(String name, int health)
   {
      this.name = name;
      this.health = health;
      
   }
   
   
   public int getHealth() // maybe not needed since health is public and can be accessed by using Player.health but could be usefull for just viewing health and not changing it
   {
      return health;
   }  
   
   // method to return the players name
   public String getName()
   {
      return name;
   }


   //method for setting Players Roll changed to names to better match players choice of 10 sided dice roll or 20 sided dice roll.
   
   //method for 10 sided dice roll
   public void setPlayerRoll10()
   {
   
   roll1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE10 + LOWEST_DIE_VALUE10);
   }
  //method for 20 sided dice roll
  
    public void setPlayerRoll20()
   {
   
   roll2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE20 + LOWEST_DIE_VALUE20);
   
   }
   //get 10 sided dice roll method.
   public int getRoll1()
   {
   return roll1;
   }
   //get 20 sided dice roll method.
   public int getRoll2()
   {
   return roll2;
   }
   // method to perform a low damage hit on an opponent
   public int lowHit(int start)
   {
      damage = ((int)(Math.random() * 100) % 20 + 35);
      int hp = start - damage; 
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }
   
   // method to perform a high damage hit on an opponent
   public int HighHit(int start)
   {
      damage = ((int)(Math.random() * 100) % 50 + 80);
      int hp = start - damage;
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }
   //method to perform a Critical damage hit on an opponent
   public int CriticalHit(int start)
   {
      damage = ((int)(Math.random() * 100) % 50 + 80);
      int hp = start - damage;
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }
   //method to level the player up upon completion of the first mini game
   public void levelUp1()
   {
      this.health = 900;
      Story.levelUp1Text();
   }
   //method to level the player up upon completion of the second mini game
   public void levelUp2()
   {
      this.health = 1200;
      Story.levelUp2Text();
   }
   //method to level the player up upon completion of the third mini game
   public void levelUp3()
   {
      this.health = 1600;
      Story.levelUp3Text();
   }
   

}