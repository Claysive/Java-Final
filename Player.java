  1 /*
  2    This will be just a basic class for the player
  3    that we can use for our midterm.
  4    Hopefully gives us a starting point.
  5 */
  6 
  7 public class Player
  8 {  
  9    //int used to set/get random number roll from 1-10.
 10    int roll1;
 11    //int used to set/get random number roll from 1-20.
 12    int roll2;
 13    //Highest Value you want the roll to be for 10 sided dice.
 14    static final int HIGHEST_DIE_VALUE10 = 10;
 15    //Highest Valule you want the roll to be for 20 sided dice.
 16     static final int HIGHEST_DIE_VALUE20 = 20;
 17    //Lowest Value you want the roll to be for 10 sided dice.
 18    static final int LOWEST_DIE_VALUE10 = 1;
 19    //Lowest Value you want the roll to be for 20 sided dice.
 20     static final int LOWEST_DIE_VALUE20 = 1;
 21    private final String name;
 22    public int health; //made public so that other objects can change health based on attacks
 23    public int damage;
 24    
 25    //armor is determined by inventory pieces.
 26    public int armor = 0;
 27    //used to store armor pieces for player.
 28    public int [][] inventory = {{0,0,0,0,0},
 29                                 {0,0,0,0,0},
 30                                 {0,0,0,0,0},
 31                                 {0,0,0,0,0},
 32                                 {0,0,0,0,0}};
 33                                 
 34    public Player(String name, int health,int[][] inventory)
 35    {
 36       this.name = name;
 37       this.health = health;
 38       this.inventory = inventory;
 39       
 40       
 41    //player starts with linen armor and has a chance to get a whole new set of armor after each boss encounter to be assigned in RNGGame.
 42    
 43    //the linen set consists of linen chest at [0][0]
 44    //linen head at[1][0]
 45    //linen pants at[2][0]
 46    //linen gloves at[3][0]
 47    //linen boots at[4][0]
 48    //and so on for the other sets.
 49    if(inventory[0][0] == 1)
 50     if(inventory[1][0] == 1)
 51      if(inventory[2][0] == 1)
 52       if(inventory[3][0] == 1)
 53        if(inventory[4][0] == 1)
 54        
 55             armor = 5;
 56        else
 57             armor = 0;
 58             
 59    //leather armor set        
 60    if(inventory[0][1] == 1)
 61     if(inventory[1][1] == 1)
 62      if(inventory[2][1] == 1)
 63       if(inventory[3][1] == 1)
 64        if(inventory[4][1] == 1)
 65        
 66             armor = 10;
 67        else
 68             armor = 0;
 69             
 70     //iron armor set        
 71    if(inventory[0][2] == 1)
 72     if(inventory[1][2] == 1)
 73      if(inventory[2][2] == 1)
 74       if(inventory[3][2] == 1)
 75        if(inventory[4][2] == 1)
 76        
 77             armor = 15;
 78        else
 79             armor = 0;
 80             
 81     //steel armor set        
 82    if(inventory[0][3] == 1)
 83     if(inventory[1][3] == 1)
 84      if(inventory[2][3] == 1)
 85       if(inventory[3][3] == 1)
 86        if(inventory[4][3] == 1)
 87        
 88             armor = 20;
 89        else
 90             armor = 0;
 91             
 92     //adamantite armor set        
 93    if(inventory[0][4] == 1)
 94     if(inventory[1][4] == 1)
 95      if(inventory[2][4] == 1)
 96       if(inventory[3][4] == 1)
 97        if(inventory[4][4] == 1)
 98        
 99             armor = 25;
100        else
101             armor = 0;
102             
103       this.armor = armor; 
104       
105    }
106    //sets players armor based off the inventory multi-dimensional array which is being passed as an argument.
107    public void setPlayerArmor(int[][] inv)
108    {
109    
110    inventory = inv;
111    //player starts with linen armor and has a chance to get a whole new set of armor after each boss encounter to be assigned in RNGGame.
112    
113    //the linen set consists of linen chest at [0][0]
114    //linen head at[1][0]
115    //linen pants at[2][0]
116    //linen gloves at[3][0]
117    //linen boots at[4][0]
118    //and so on for the other sets.
119    if(inventory[0][0] == 1)
120     if(inventory[1][0] == 1)
121      if(inventory[2][0] == 1)
122       if(inventory[3][0] == 1)
123        if(inventory[4][0] == 1)
124        
125             armor = 5;
126        else
127             armor = 0;
128             
129    //leather armor set        
130    if(inventory[0][1] == 1)
131     if(inventory[1][1] == 1)
132      if(inventory[2][1] == 1)
133       if(inventory[3][1] == 1)
134        if(inventory[4][1] == 1)
135        
136             armor = 10;
137        else
138             armor = 0;
139             
140     //iron armor set        
141    if(inventory[0][2] == 1)
142     if(inventory[1][2] == 1)
143      if(inventory[2][2] == 1)
144       if(inventory[3][2] == 1)
145        if(inventory[4][2] == 1)
146        
147             armor = 15;
148        else
149             armor = 0;
150             
151     //steel armor set        
152    if(inventory[0][3] == 1)
153     if(inventory[1][3] == 1)
154      if(inventory[2][3] == 1)
155       if(inventory[3][3] == 1)
156        if(inventory[4][3] == 1)
157        
158             armor = 20;
159        else
160             armor = 0;
161             
162     //adamantite armor set        
163    if(inventory[0][4] == 1)
164     if(inventory[1][4] == 1)
165      if(inventory[2][4] == 1)
166       if(inventory[3][4] == 1)
167        if(inventory[4][4] == 1)
168        
169             armor = 25;
170        else
171             armor = 0;
172             
173             
174    
175    
176    }
177    public int getArmor()
178    {
179    //returns armor.
180    return armor;
181    }
182    //sets players inventory with the multidimensional array.
183    public void setPlayerInventory(int[][] inv)
184    {
185    inventory = inv;
186    
187    }
188    //gets players inventory.
189    public int[][] getPlayerInventory()
190    {
191    return inventory;
192    }
193    
194    public int getHealth() // maybe not needed since health is public and can be accessed by using Player.health but could be usefull for just viewing health and not changing it
195    {
196       return health;
197    }  
198      public int setHealth(int Health) // maybe not needed since health is public and can be accessed by using Player.health but could be usefull for just viewing health and not changing it
199    {
200       health = Health;
201       return health;
202    } 
203    // method to return the players name
204    public String getName()
205    {
206       return name;
207    }
208 
209 
210    //method for setting Players Roll changed to names to better match players choice of 10 sided dice roll or 20 sided dice roll.
211    
212    //method for 10 sided dice roll
213    public void setPlayerRoll10()
214    {
215    
216    roll1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE10 + LOWEST_DIE_VALUE10);
217    }
218   //method for 20 sided dice roll
219   
220     public void setPlayerRoll20()
221    {
222    
223    roll2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE20 + LOWEST_DIE_VALUE20);
224    
225    }
226    //get 10 sided dice roll method.
227    public int getRoll1()
228    {
229    return roll1;
230    }
231    //get 20 sided dice roll method.
232    public int getRoll2()
233    {
234    return roll2;
235    }
236    // method to perform a low damage hit on an opponent
237    public int lowHit(int start)
238    {
239       damage = ((int)(Math.random() * 100) % 20 + 35);
240       int hp = start - damage; 
241       
242       //modified to turn hp to 0 once it drops below or equals 0.
243       if(hp <= 0)
244       hp = 0;
245       return hp;
246    }
247    
248    // method to perform a high damage hit on an opponent
249    public int HighHit(int start)
250    {
251       damage = ((int)(Math.random() * 100) % 50 + 80);
252       int hp = start - damage;
253       
254       //modified to turn hp to 0 once it drops below or equals 0.
255       if(hp <= 0)
256       hp = 0;
257       return hp;
258    }
259    //method to perform a Critical damage hit on an opponent
260    public int CriticalHit(int start)
261    {
262       damage = ((int)(Math.random() * 100) % 90 + 130);
263       int hp = start - damage;
264       
265       //modified to turn hp to 0 once it drops below or equals 0.
266       if(hp <= 0)
267       hp = 0;
268       return hp;
269    }
270    
271    //method to level the player up upon completion of the first mini game
272    public void levelUp1()
273    {
274       this.health = 900;
275       Story.levelUp1Text();
276    }
277    //method to level the player up upon completion of the second mini game
278    public void levelUp2()
279    {
280       this.health = 1200;
281       Story.levelUp2Text();
282    }
283    //method to level the player up upon completion of the third mini game
284    public void levelUp3()
285    {
286       this.health = 1600;
287       Story.levelUp3Text();
288    }
289    public void levelUp4()
290    {
291       this.health = 1800;
292       Story.levelUp4Text();
293    }
294    public void levelUp5()
295    {
296       this.health = 2000;
297       Story.levelUp5Text();
298    }
299     public void levelUp6()
300    {
301       this.health = 2200;
302       Story.levelUp6Text();
303    }
304    //method to heal the player after defeating first boss. This is only if the mini game to unlock the door was failed
305    public void heal1()
306    {
307       this.health = 700;
308       Story.healText1();
309    }
310    //method to heal the player after defeating second boss. This is only if the mini game to unlock the door was failed
311    public void heal2()
312    {
313       this.health = 900;
314       Story.healText2();
315    }
316    //method to heal the player after defeating third boss. This is only if the mini game to unlock the door was failed
317    public void heal3()
318    {
319       this.health = 1200;
320       Story.healText3();
321    }
322     public void heal4()
323    {
324       this.health = 1400;
325       Story.healText4();
326    }
327    
328 
329 }
