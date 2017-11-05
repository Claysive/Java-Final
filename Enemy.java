  1 /*
  2    Starting point for a boss class, or any of the
  3    opponents for that matter. 
  4 */
  5 
  6 public class Enemy
  7 {
  8    //int used to set/get random number roll from 1-10.
  9    int roll1;
 10    int roll2;
 11    //Highest Value you want the roll to be.
 12    static final int HIGHEST_DIE_VALUE10 = 10;
 13    static final int HIGHEST_DIE_VALUE20 = 20;
 14     //Lowest Value you want the roll to be.
 15    static final int LOWEST_DIE_VALUE10 = 1;
 16    static final int LOWEST_DIE_VALUE20 = 1;
 17    private final String name;
 18    public int health;
 19    public int damage;
 20    public int playerArmor = 0;
 21    
 22    //extra parameter added (armor).
 23    public Enemy(String name, int health)
 24    {
 25       this.name = name;
 26       this.health = health;
 27       
 28    }
 29    
 30    public String getName()
 31    {
 32       return name;
 33    }
 34    
 35    public int getHealth()
 36    {
 37       return health;
 38    }
 39   
 40 
 41    
 42    public void setBossRoll10()
 43    {
 44    
 45    roll1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE10 + LOWEST_DIE_VALUE10);
 46    }
 47   
 48 
 49    public int getRoll1()
 50    {
 51    return roll1;
 52    }
 53    //method for getting Players Roll.
 54  
 55     // method to perform a low damage hit on an opponent
 56     // added armor as second argument to determine damage reduction and hp returned.
 57    public int lowHit(int start,int armor)
 58    {
 59       //Damage is reduced based off armor
 60       playerArmor = armor;
 61       damage = ((int)(Math.random() * 100) % 25 + 35);
 62       int hp = start;
 63       
 64       if(playerArmor == 5)
 65       {
 66       damage = damage - 5;
 67       hp = start - damage;
 68       }
 69       else if(playerArmor == 10)
 70       {
 71       damage = damage - 10;
 72       hp = start - damage;
 73       }
 74       else if(playerArmor == 15)
 75       {
 76       damage = damage - 15;
 77       hp = start - damage;
 78       }
 79       else if(playerArmor == 20)
 80       {
 81       damage = damage - 20;
 82       hp = start - damage;
 83       }
 84       else if(playerArmor == 25)
 85       {
 86       damage = damage - 25;
 87       hp = start - damage;
 88       }
 89       else
 90       {
 91       damage = damage ;
 92       hp = start - damage;
 93       }
 94       
 95       //modified to turn hp to 0 once it drops below or equals 0.
 96       if(hp <= 0)
 97       hp = 0;
 98       return hp;
 99    }
100     // method to perform a High damage hit on an opponent
101     // added armor as second argument to determine damage reduction and hp returned.
102    public int HighHit(int start,int armor)
103    {
104       //Damage is reduced based off armor
105       playerArmor = armor;
106       damage = ((int)(Math.random() * 100) %  36 + 60);
107       int hp = start;
108       
109       if(playerArmor == 5)
110       {
111       damage = damage - 5;
112       hp = start - damage;
113       }
114       else if(playerArmor == 10)
115       {
116       damage = damage - 10;
117       hp = start - damage;
118       }
119       else if(playerArmor == 15)
120       {
121       damage = damage - 15;
122       hp = start - damage;
123       }
124       else if(playerArmor == 20)
125       {
126       damage = damage - 20;
127       hp = start - damage;
128       }
129       else if(playerArmor == 25)
130       {
131       damage = damage - 25;
132       hp = start - damage;
133       }
134       else
135       {
136       damage = damage; 
137       hp = start - damage;
138       }
139       
140       
141       //modified to turn hp to 0 once it drops below or equals 0.
142       if(hp <= 0)
143       hp = 0;
144       return hp;
145    }
146     // method to perform a Critical damage hit on an opponent
147     // added armor as second argument to determine damage reduction and hp returned.
148      public int CriticalHit(int start,int armor)
149    {
150       //Damage is reduced based off armor
151       playerArmor = armor;
152       damage = ((int)(Math.random() * 100) % 90 + 130);
153       int hp = start;
154       
155       if(playerArmor == 5)
156       {
157       damage = damage - 5;
158       hp = start - damage;
159       }
160       else if(playerArmor == 10)
161       {
162       damage = damage - 10;
163       hp = start - damage;
164       }
165       else if(playerArmor == 15)
166       {
167       damage = damage - 15;
168       hp = start - damage;
169       }
170       else if(playerArmor == 20)
171       {
172       damage = damage - 20;
173       hp = start - damage;
174       }
175       else if(playerArmor == 25)
176       {
177       damage = damage - 25;
178       hp = start - damage;
179       }
180       else
181       {
182       damage = damage; 
183       hp = start - damage;
184       }
185       
186       //modified to turn hp to 0 once it drops below or equals 0.
187       if(hp <= 0)
188       hp = 0;
189       return hp;
190    }
191 
192 
193 }
