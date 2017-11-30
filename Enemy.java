/*
   Starting point for a boss class, or any of the
   opponents for that matter. 
*/

public class Enemy
{
   //int used to set/get random number roll from 1-10.
   int roll1;
   int roll2;
   //Highest Value you want the roll to be.
   static final int HIGHEST_DIE_VALUE10 = 10;
   static final int HIGHEST_DIE_VALUE20 = 20;
    //Lowest Value you want the roll to be.
   static final int LOWEST_DIE_VALUE10 = 1;
   static final int LOWEST_DIE_VALUE20 = 1;
   private final String name;
   public int health;
   public int damage;
   public int playerArmor = 0;
   
   //extra parameter added (armor).
   //added health modifier to constructor
   public Enemy(String name, int health, double mod)
   {
      this.name = name;
      this.health = (int) ((health * mod) + 0.5);
      
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getHealth()
   {
      return health;
   }
  

   
   public void setBossRoll10()
   {
   
   roll1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE10 + LOWEST_DIE_VALUE10);
   }
  

   public int getRoll1()
   {
   return roll1;
   }
   //method for getting Players Roll.
 
    // method to perform a low damage hit on an opponent
    // added armor as second argument to determine damage reduction and hp returned.
   public int lowHit(int start,int armor)
   {
      //Damage is reduced based off armor
      playerArmor = armor;
      damage = ((int)(Math.random() * 100) % 25 + 35);
      int hp = start;
      
      if(playerArmor == 5)
      {
      damage = damage - 5;
      hp = start - damage;
      }
      else if(playerArmor == 10)
      {
      damage = damage - 10;
      hp = start - damage;
      }
      else if(playerArmor == 15)
      {
      damage = damage - 15;
      hp = start - damage;
      }
      else if(playerArmor == 20)
      {
      damage = damage - 20;
      hp = start - damage;
      }
      else if(playerArmor == 25)
      {
      damage = damage - 25;
      hp = start - damage;
      }
      else
      {
      damage = damage ;
      hp = start - damage;
      }
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }
    // method to perform a High damage hit on an opponent
    // added armor as second argument to determine damage reduction and hp returned.
   public int HighHit(int start,int armor)
   {
      //Damage is reduced based off armor
      playerArmor = armor;
      damage = ((int)(Math.random() * 100) %  36 + 60);
      int hp = start;
      
      if(playerArmor == 5)
      {
      damage = damage - 5;
      hp = start - damage;
      }
      else if(playerArmor == 10)
      {
      damage = damage - 10;
      hp = start - damage;
      }
      else if(playerArmor == 15)
      {
      damage = damage - 15;
      hp = start - damage;
      }
      else if(playerArmor == 20)
      {
      damage = damage - 20;
      hp = start - damage;
      }
      else if(playerArmor == 25)
      {
      damage = damage - 25;
      hp = start - damage;
      }
      else
      {
      damage = damage; 
      hp = start - damage;
      }
      
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }
    // method to perform a Critical damage hit on an opponent
    // added armor as second argument to determine damage reduction and hp returned.
     public int CriticalHit(int start,int armor)
   {
      //Damage is reduced based off armor
      playerArmor = armor;
      damage = ((int)(Math.random() * 100) % 90 + 130);
      int hp = start;
      
      if(playerArmor == 5)
      {
      damage = damage - 5;
      hp = start - damage;
      }
      else if(playerArmor == 10)
      {
      damage = damage - 10;
      hp = start - damage;
      }
      else if(playerArmor == 15)
      {
      damage = damage - 15;
      hp = start - damage;
      }
      else if(playerArmor == 20)
      {
      damage = damage - 20;
      hp = start - damage;
      }
      else if(playerArmor == 25)
      {
      damage = damage - 25;
      hp = start - damage;
      }
      else
      {
      damage = damage; 
      hp = start - damage;
      }
      
      //modified to turn hp to 0 once it drops below or equals 0.
      if(hp <= 0)
      hp = 0;
      return hp;
   }


}
