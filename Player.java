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
   
   //armor is determined by inventory pieces.
   public int armor = 0;
   //used to store armor pieces for player.
   public int [][] inventory = {{0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0},
                                {0,0,0,0,0}};
                                
   //added health modifier to constructor
   public Player(String name, int health,int[][] inventory, double mod)
   {
      this.name = name;
      this.health = (int) ((health * mod) + 0.5);
      this.inventory = inventory;
      
      
   //player starts with linen armor and has a chance to get a whole new set of armor after each boss encounter to be assigned in RNGGame.
   
   //the linen set consists of linen chest at [0][0]
   //linen head at[1][0]
   //linen pants at[2][0]
   //linen gloves at[3][0]
   //linen boots at[4][0]
   //and so on for the other sets.
   if(inventory[0][0] == 1)
    if(inventory[1][0] == 1)
     if(inventory[2][0] == 1)
      if(inventory[3][0] == 1)
       if(inventory[4][0] == 1)
       
            armor = 5;
       else
            armor = 0;
            
   //leather armor set        
   if(inventory[0][1] == 1)
    if(inventory[1][1] == 1)
     if(inventory[2][1] == 1)
      if(inventory[3][1] == 1)
       if(inventory[4][1] == 1)
       
            armor = 10;
       else
            armor = 0;
            
    //iron armor set        
   if(inventory[0][2] == 1)
    if(inventory[1][2] == 1)
     if(inventory[2][2] == 1)
      if(inventory[3][2] == 1)
       if(inventory[4][2] == 1)
       
            armor = 15;
       else
            armor = 0;
            
    //steel armor set        
   if(inventory[0][3] == 1)
    if(inventory[1][3] == 1)
     if(inventory[2][3] == 1)
      if(inventory[3][3] == 1)
       if(inventory[4][3] == 1)
       
            armor = 20;
       else
            armor = 0;
            
    //adamantite armor set        
   if(inventory[0][4] == 1)
    if(inventory[1][4] == 1)
     if(inventory[2][4] == 1)
      if(inventory[3][4] == 1)
       if(inventory[4][4] == 1)
       
            armor = 25;
       else
            armor = 0;
            
      this.armor = armor; 
      
   }
   //sets players armor based off the inventory multi-dimensional array which is being passed as an argument.
   public void setPlayerArmor(int[][] inv)
   {
   
   inventory = inv;
   //player starts with linen armor and has a chance to get a whole new set of armor after each boss encounter to be assigned in RNGGame.
   
   //the linen set consists of linen chest at [0][0]
   //linen head at[1][0]
   //linen pants at[2][0]
   //linen gloves at[3][0]
   //linen boots at[4][0]
   //and so on for the other sets.
   if(inventory[0][0] == 1)
    if(inventory[1][0] == 1)
     if(inventory[2][0] == 1)
      if(inventory[3][0] == 1)
       if(inventory[4][0] == 1)
       
            armor = 5;
       else
            armor = 0;
            
   //leather armor set        
   if(inventory[0][1] == 1)
    if(inventory[1][1] == 1)
     if(inventory[2][1] == 1)
      if(inventory[3][1] == 1)
       if(inventory[4][1] == 1)
       
            armor = 10;
       else
            armor = 0;
            
    //iron armor set        
   if(inventory[0][2] == 1)
    if(inventory[1][2] == 1)
     if(inventory[2][2] == 1)
      if(inventory[3][2] == 1)
       if(inventory[4][2] == 1)
       
            armor = 15;
       else
            armor = 0;
            
    //steel armor set        
   if(inventory[0][3] == 1)
    if(inventory[1][3] == 1)
     if(inventory[2][3] == 1)
      if(inventory[3][3] == 1)
       if(inventory[4][3] == 1)
       
            armor = 20;
       else
            armor = 0;
            
    //adamantite armor set        
   if(inventory[0][4] == 1)
    if(inventory[1][4] == 1)
     if(inventory[2][4] == 1)
      if(inventory[3][4] == 1)
       if(inventory[4][4] == 1)
       
            armor = 25;
       else
            armor = 0;
            
            
   
   
   }
   public int getArmor()
   {
   //returns armor.
   return armor;
   }
   //sets players inventory with the multidimensional array.
   public void setPlayerInventory(int[][] inv)
   {
   inventory = inv;
   
   }
   //gets players inventory.
   public int[][] getPlayerInventory()
   {
   return inventory;
   }
   
   public int getHealth() // maybe not needed since health is public and can be accessed by using Player.health but could be usefull for just viewing health and not changing it
   {
      return health;
   }  
     public int setHealth(int Health) // maybe not needed since health is public and can be accessed by using Player.health but could be usefull for just viewing health and not changing it
   {
      health = Health;
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
      damage = ((int)(Math.random() * 100) % 90 + 130);
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
   public void levelUp4()
   {
      this.health = 1800;
      Story.levelUp4Text();
   }
   public void levelUp5()
   {
      this.health = 2000;
      Story.levelUp5Text();
   }
    public void levelUp6()
   {
      this.health = 2200;
      Story.levelUp6Text();
   }
   //method to heal the player after defeating first boss. This is only if the mini game to unlock the door was failed
   public void heal1()
   {
      this.health = 700;
      Story.healText1();
   }
   //method to heal the player after defeating second boss. This is only if the mini game to unlock the door was failed
   public void heal2()
   {
      this.health = 900;
      Story.healText2();
   }
   //method to heal the player after defeating third boss. This is only if the mini game to unlock the door was failed
   public void heal3()
   {
      this.health = 1200;
      Story.healText3();
   }
    public void heal4()
   {
      this.health = 1400;
      Story.healText4();
   }
   

}
