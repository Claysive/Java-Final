  1 import javax.swing.*;
  2 import java.util.Scanner;
  3 public class RNGGame
  4 {
  5 //Class for combining all the parts together.
  6 public static void main(String[] args)
  7 {
  8   
  9    //All the enemies
 10    Enemy oppenent = new Enemy("Thug", 450);
 11    Enemy boss = new Enemy("Arthur Black", 600);
 12    Enemy oppenent2 = new Enemy("Elite Thug",500);
 13    Enemy boss2 = new Enemy("Captain Greymane",550);
 14    Enemy oppenent3 = new Enemy("Silver Knight",570);
 15    //String to store fight result from calling the StartFight method in the Fight2 class.
 16    String FightResult = " ";
 17    //String to store player name
 18    String playerName;
 19    
 20    //roll for determining if player gets new tier set of armor after defeating bosses. a roll from 1-5,
 21    //if player rolls atleast a 3 or greater they receive the new tier set
 22    int roll = 0;
 23   
 24    Scanner keyboard = new Scanner(System.in);
 25    //variable to track which door player chooses 1,2, or 3.
 26    int playerchoice = 0;
 27    //boolean variables for the three minigames that are behind the doors.
 28    boolean isPalin = false;
 29    boolean isRiddle = false;
 30    boolean isNumber = false;
 31    //Title shows up
 32    JOptionPane.showMessageDialog(null,"RNG: The Video Game");
 33    
 34    //Ask/get player custom name and makes player object with custom name
 35    playerName = JOptionPane.showInputDialog(null,"What is your name?");
 36    
 37    //inventory for player that keeps up with armor tier sets.
 38    //player starts with linen tier set(set 1). As player defeats new bosses , player has a chance to recieve the next tier set.
 39    //the first row represents chest armor pieces(0 = linen,1 = leather,2 = iron, 3 = steel, 4 = adamantite).
 40    //the second row represents head armor, third row is pants armor, fourth row is glove armor, fifth row is boots armor.
 41    //so inventory[0][0] represents the (linen chest), inventory[0][1] represents (leather chest),
 42    //inventory[0][2] represents the (iron chest), inventory[0][3] represents the (steel chest), inventory[0][4] represents the (adamantite chest).
 43    //and so forth for the rest of the armor categories.
 44    //each piece of linen set armor is equivalent to 1 additional armor , so having the full linen set is = to 5 armor for the player.
 45    //each set goes up by 1, so having the full leather armor set is = to 10 armor and so on for the rest of the sets.
 46    //iron/15,steel/20,adamantite/25. So having full adamantite armor reduces enemy damage by 25.
 47    //So to clarify, inventory set armor pieces determine how much armor the player has.
 48    
 49    //Using a Multi-Dimensional array. inventory declared and intialized.
 50    int[][] inventory = {{0,0,0,0,0},
 51                         {0,0,0,0,0},
 52                         {0,0,0,0,0},
 53                         {0,0,0,0,0},
 54                         {0,0,0,0,0}};
 55                         
 56                    inventory[0][0] = 1;
 57                    inventory[1][0] = 1;
 58                    inventory[2][0] = 1;
 59                    inventory[3][0] = 1;
 60                    inventory[4][0] = 1;
 61                                  
 62    //inventory added as third argument to player.
 63    Player player = new Player(playerName, 700,inventory);
 64    
 65    //Story Text Starts.
 66    Story newStory = new Story();
 67    newStory.showText1();
 68    newStory.showText2();
 69    
 70    
 71    //Fight Starts.
 72    Fight fight1 = new Fight();
 73    FightResult = fight1.StartFight(player, oppenent);
 74    //fight result returned to FightResult variable and then output.
 75    JOptionPane.showMessageDialog(null,FightResult);
 76    System.out.println(" ");
 77    
 78    
 79    
 80    //if the player is alive/won the battle, the game goes on
 81    if (player.health > 0)
 82    {
 83                     
 84                     //indicate that there are 3 doors to go through on this floor.
 85                     newStory.miniGame1Text();
 86                    
 87     //roll a number between 1-5 after beating boss to see if player recieves new tier set(set 2 or 3).
 88                    roll = 1 +(int)(Math.random() * 5);
 89       //if roll is greater than or equal to 1, player recieves armor set tier 2(leather armor) for each armor category slot and loses first set which is weaker.
 90                    if(roll >= 1)
 91                    {
 92                    //clear armor tier 1 set(linen armor).
 93               
 94                    //assign new armor tier 2 set(leather armor).
 95                    inventory[0][1] = 1;
 96                    inventory[1][1] = 1;
 97                    inventory[2][1] = 1;
 98                    inventory[3][1] = 1;
 99                    inventory[4][1] = 1;
100                    //set player inventory which alters the amount of armor recieved.
101                    player.setPlayerInventory(inventory);
102                    player.setPlayerArmor(inventory);
103                    }
104                    //if player rolls 3 or higher they reicieve the armor tier 3 set(iron armor)instead.
105                    else if(roll >= 3)
106                    {
107                    inventory[0][2] = 1;
108                    inventory[1][2] = 1;
109                    inventory[2][2] = 1;
110                    inventory[3][2] = 1;
111                    inventory[4][2] = 1;
112                    //set player inventory which alters the amount of armor recieved.
113                    player.setPlayerInventory(inventory);
114                    player.setPlayerArmor(inventory);
115                    }
116                    
117                    //give player a choice to pick one of the three doors.
118                    JOptionPane.showMessageDialog(null,"Choose to go through door 1,2, or 3 by typing 1,2, or 3");
119                    playerchoice = keyboard.nextInt();
120                    
121                    if(playerchoice == 1)
122                    {
123                    //if player chose 1, start palindrom minigame.
124                    newStory.miniGame1Instructions();
125                    isPalin = palindromeTest.palinGame();
126          
127                    if (isPalin)
128                    {
129                    player.levelUp1();
130                    }
131                    else
132                    {
133                    player.heal3();
134                    }
135                    }
136                    else if(playerchoice == 2)
137                    {
138                    //if player chose 2, start riddle minigame.
139                    newStory.miniGame2Instructions();
140                    isRiddle = riddleTest.riddleGame();
141                    if (isRiddle)
142                    {
143                    player.levelUp2();
144                    }
145                    else
146                    {
147                    player.heal4();
148                    }
149                    }
150                    else if(playerchoice == 3)
151                    {
152                    //if player chose 3, start a new oppenent fight.
153                    newStory.showText5();
154                    Fight fight2 = new Fight();
155                    FightResult = fight2.StartFight(player, oppenent2);
156                    if(player.health > 0)
157                    {
158                    //if player beats encounter, level them up with bonus hp
159                    newStory.showText6();
160                    player.levelUp3();
161                    }
162                    else
163                    newStory.gameOver();
164                    }
165                    
166       
167       newStory.showText7();
168       Fight fight3= new Fight();
169       FightResult = fight3.StartFight(player, boss2);
170       
171       JOptionPane.showMessageDialog(null,FightResult);
172        if (player.health > 0)
173       {
174                    newStory.miniGame3Text();
175       //roll a number between 1-5 after beating boss to see if player recieves new tier set(set 4 or 5).
176                    roll = 1 +(int)(Math.random() * 5);
177       //if roll is greater than or equal to 4, player recieves armor set tier 4(steel armor) for each armor category slot and loses first set which is weaker.
178                    if(roll >= 4)
179                    {
180                    
181               
182                    //assign new armor tier 4 set(steel armor).
183                    inventory[0][3] = 1;
184                    inventory[1][3] = 1;
185                    inventory[2][3] = 1;
186                    inventory[3][3] = 1;
187                    inventory[4][3] = 1;
188                    //set player inventory which alters the amount of armor recieved.
189                    player.setPlayerInventory(inventory);
190                    player.setPlayerArmor(inventory);
191                    }
192                    //if player rolls 5 they recieve the armor tier 5(best) set(adamantite armor)instead.
193                    else if(roll == 5)
194                    {
195                    inventory[0][4] = 1;
196                    inventory[1][4] = 1;
197                    inventory[2][4] = 1;
198                    inventory[3][4] = 1;
199                    inventory[4][4] = 1;
200                    //set player inventory which alters the amount of armor recieved.
201                    player.setPlayerInventory(inventory);
202                    player.setPlayerArmor(inventory);
203                    }
204                    
205                   //give player a choice to pick one of the three doors.
206                    JOptionPane.showMessageDialog(null,"Choose to go through door 1,2, or 3 by typing 1,2, or 3");
207                    playerchoice = keyboard.nextInt();
208                    
209                    if(playerchoice == 1)
210                    {
211                    //if player chose 1, start palindrome minigame.
212                    newStory.miniGame1Instructions();
213                    isPalin = palindromeTest.palinGame();
214          
215                    if (isPalin)
216                    {
217                    player.levelUp4();
218                    }
219                    else
220                    {
221                    player.heal1();
222                    }
223                    }
224                    else if(playerchoice == 2)
225                    {
226                    //if player chose 2, start random number minigame.
227                    newStory.miniGame3Instructions();
228                    isNumber = randomNumTest.randomNumGame();
229                    if (isNumber)
230                    {
231                    player.levelUp5();
232                    }
233                    else
234                    {
235                    player.heal2();
236                    }
237                    }
238                    else if(playerchoice == 3)
239                    {
240                    //if player chose 3, start a new oppenent fight.
241                    newStory.showText8();
242                    Fight fight4 = new Fight();
243                    FightResult = fight4.StartFight(player, oppenent3);
244                    if(player.health > 0)
245                    {
246                    //if player beats encounter, level them up with bonus hp
247                    newStory.showText9();
248                    player.levelUp6();
249                    }
250                    else
251                    newStory.gameOver();
252                    }
253 
254          
255          
256          newStory.showText10();
257       }
258       
259       //if the player is dead/lost after the 2nd battle, game over
260       else
261       {
262          newStory.gameOver();
263       }
264       
265     }
266     
267     //if the player is dead/lost after the 1st battle, game over
268     else
269     {
270       newStory.gameOver();
271     }
272       newStory.showText3();
273       Fight fight5 = new Fight();
274       FightResult = fight5.StartFight(player, boss);
275       
276       if (player.health > 0)
277       { 
278          newStory.showText4();
279       }
280       
281       //if the player is dead/lost after the 2nd battle, game over
282       else
283       {
284          newStory.gameOver();
285       }
286       
287 }
288 }
