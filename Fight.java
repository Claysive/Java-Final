  1 /*
  2    Small example of some of the methods
  3    and objects being used. 
  4 */
  5 import java.util.Scanner;
  6 import javax.swing.JOptionPane;
  7 
  8 public class Fight
  9 {
 10  //New Method of the fight class called from StoryStart class ,only after certain parts of the story have progressed.
 11  //Just to keep the main method clear of all the code that goes on behind the scenes.
 12  //Returns a String Variable Result to StoryStart displaying a message of who won the fight at the bottom.
 13    public String StartFight(Player player, Enemy boss)
 14    {
 15       //variables for boss/player rolls.
 16       
 17       //String Result for returning to main method of StoryStart Class.
 18       String Result = " ";
 19       int BossRoll = 0;
 20       int PlayerRoll = 0;
 21       int answer;
 22       //variable for setting player Armor.
 23       int playerArmor = 0;
 24       //variables for boss/player hit points.
 25       int PlayerHitPoints;
 26       int BossHitPoints;
 27       //variable for determining low,high,critical hit
 28       int RollDifference;
 29       Scanner keyboard = new Scanner(System.in);
 30       //Player/user starts with five 20 sided dice.
 31       int twentySidedDiceCounter = 5;
 32            
 33       
 34       //Variable for storing player's Hit Points.
 35       PlayerHitPoints = player.getHealth();
 36       //Variable for storing boss's Hit Points.
 37       BossHitPoints = boss.getHealth();
 38     
 39       
 40      
 41       
 42       
 43       //initialize roll counter
 44       int rollCounter = 1;
 45        //While either the player's health or boss's health is greater than 0 , meaning atleast one is still alive and has more than 0 Hit Points.
 46        //And While rollcounter is greater than 1 but less than or equal to 200.
 47       while((player.getHealth() > 0 && boss.getHealth() > 0) && rollCounter >= 1 && rollCounter <= 200){
 48       //If player/user still has atleast one 20 sided die to use allow them to roll 20 sided die til they have 0.
 49       if(twentySidedDiceCounter >= 1)
 50       {
 51      
 52         Object[] diceOptions = {"Use 20-Sided Die", "Stick with 10-Sided Die"};
 53          answer = JOptionPane.showOptionDialog(null, 
 54          player.getName() +"'s health: " + player.health + "\n" + boss.getName() + "'s health: " + boss.health + "\n\n"  + "Do you want to roll a normal 10-sided die? You have a total reserve of " + twentySidedDiceCounter + " twenty-sided die.","Choose Dice",
 55          JOptionPane.PLAIN_MESSAGE,
 56          JOptionPane.QUESTION_MESSAGE,
 57          null,
 58          diceOptions,
 59          diceOptions[0]);
 60          
 61       //if user/player types 1 , they want to use just a 10 sided dice as their roll.
 62          if(answer == 1)
 63          {
 64             //Set the Boss's roll and assign the Boss's roll to BossRoll variable.(Boss can only roll 10 sided dice).
 65             boss.setBossRoll10();
 66             BossRoll = boss.getRoll1();
 67             //Set the Player's roll and assign the Player's roll to PlayerRoll variable.
 68             player.setPlayerRoll10();
 69             PlayerRoll = player.getRoll1();
 70          }
 71          else if(answer == 0 && twentySidedDiceCounter >= 1 )
 72    
 73             {
 74             boss.setBossRoll10();
 75             BossRoll = boss.getRoll1();
 76             //Set the Player's roll and assign the Player's roll to PlayerRoll variable.
 77             //New method created to get player's 20 sided dice roll.
 78             player.setPlayerRoll20();
 79             //return the roll to PlayerRoll variable for determining attack.
 80             PlayerRoll = player.getRoll2();
 81            //System.out.print("You chose to roll a 20 sided dice and rolled a " + PlayerRoll + "\n");
 82             //increase 20 sided die counter so that player will only get a maximum of 5 uses.
 83             twentySidedDiceCounter -= 1;   
 84             //System.out.print("You have " + twentySidedDiceCounter + " 20 sided dice left to use\n");
 85             
 86           }
 87     }
 88     
 89     //Player has run out of 20 sided die rolls and can only Type 1 to roll a 10 sided dice.
 90     else
 91        
 92          {
 93          //notify player that they have run out of 20 sided dice rolls.
 94           
 95          Object[] diceOptions2 = {"Use 10-Sided Die"};
 96          answer = JOptionPane.showOptionDialog(null, 
 97          player.getName() +"'s health: " + player.health + "\n" + boss.getName() + "'s health: " + boss.health + "\n\n"  + "Do you want to roll a normal 10-sided die? You have a total reserve of " + twentySidedDiceCounter + " twenty-sided die.","Choose Dice",
 98          JOptionPane.PLAIN_MESSAGE,
 99          JOptionPane.QUESTION_MESSAGE,
100          null,
101          diceOptions2,
102          diceOptions2[0]);
103          
104          boss.setBossRoll10();
105          BossRoll = boss.getRoll1();
106          //Set the Player's roll and assign the Player's roll to PlayerRoll variable.(Can only roll 10 sided die at this point).
107          player.setPlayerRoll10();
108          PlayerRoll = player.getRoll1();
109          }
110     
111     
112       
113       //Counter to keep up with rolls , so rolls dont go past 200.
114       rollCounter += 1;
115      
116       if(PlayerRoll > BossRoll)
117       {
118       
119          //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
120            RollDifference =  PlayerRoll - BossRoll;
121           
122           if(RollDifference >= 4)
123           {
124             
125              boss.health = player.CriticalHit(boss.health);
126              JOptionPane.showMessageDialog(null,
127              "Your roll: " + PlayerRoll + "\n" +
128              "Enemy's roll: " + BossRoll + "\n\n" +
129              player.getName() + " has landed a CRITICAL HIT!!!!\n"+
130              "The damage dealt was: " + player.damage + "\n\n" +
131              boss.getName() +"'s Health after " + player.getName() + "'s CRITICAL HIT is  " + boss.getHealth()
132              );
133            }
134           
135           
136           else if(RollDifference >= 2)
137           {
138              //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
139              
140              boss.health = player.HighHit(boss.health);
141              JOptionPane.showMessageDialog(null,
142              "Your roll: " + PlayerRoll + "\n" +
143              "Enemy's roll: " + BossRoll + "\n\n" +
144              player.getName() + " has landed a HIGH HIT!!!\n"+
145              "The damage dealt was: " + player.damage + "\n\n" +
146              boss.getName() +"'s Health after " + player.getName() + "'s HIGH HIT is  " + boss.getHealth()
147              );
148     
149            }
150             
151            else if(RollDifference > 0)
152            {
153               //just used for clarity indicating its a High hit attack to pass to the Armor Break Mehtod to determine how much armor is lost.
154               
155                boss.health = player.lowHit(boss.health);
156                JOptionPane.showMessageDialog(null,
157                 "Your roll: " + PlayerRoll + "\n" +
158                 "Enemy's roll: " + BossRoll + "\n\n" +
159                 player.getName() + " has landed a LOW HIT!!!!\n"+
160                 "The damage dealt was: " + player.damage + "\n\n" +
161                 boss.getName() +"'s Health after " + player.getName() + "'s LOW HIT is  " + boss.getHealth()
162              );
163 
164            }
165         }
166         
167       
168        else
169           {
170               if(PlayerRoll < BossRoll)
171                  {
172                    //The Roll Difference will Determine whether its a low,high,or critical hit by either subtracting the players roll from the bosses roll or vice versa.
173                    RollDifference =  BossRoll - PlayerRoll;
174                 
175                    if(RollDifference > 3)
176                    {
177                       //get player armor and assign it to playerArmor
178                       playerArmor = player.getArmor();
179                       //pass playerArmor to CriticalHit function/method as second argument to determine the amount of damage reduction/amount of hp to return.
180                       player.health = boss.CriticalHit(player.health,playerArmor);
181                       
182                       //checks to see which message to display based on player's armor.
183                       if(playerArmor == 5)                    
184                       JOptionPane.showMessageDialog(null,"Because Player Has 5 armor,Damage has been reduced by 5.");
185                       else if(playerArmor == 10)
186                       JOptionPane.showMessageDialog(null,"Because Player Has 10 armor,Damage has been reduced by 10.");
187                       else if(playerArmor == 15)
188                       JOptionPane.showMessageDialog(null,"Because Player Has 15 armor,Damage has been reduced by 15.");
189                       else if(playerArmor == 20)
190                       JOptionPane.showMessageDialog(null,"Because Player Has 20 armor,Damage has been reduced by 20.");
191                       else if(playerArmor == 25)
192                       JOptionPane.showMessageDialog(null,"Because Player Has 25 armor,Damage has been reduced by 25.");
193                       else
194                       JOptionPane.showMessageDialog(null,"Because Player Has 0 armor,Damage has been reduced by 0.");
195                       
196                       JOptionPane.showMessageDialog(null,
197                       "Your roll: " + PlayerRoll + "\n" +
198                       "Enemy's roll: " + BossRoll + "\n\n" +
199                       boss.getName() + " has landed a CRITICAL HIT!!!\n"+
200                       "The damage dealt was: " + boss.damage + "\n\n" +
201                       player.getName() +"'s Health after " + boss.getName() + "'s CRITICAL HIT is  " + player.getHealth()
202                       );
203 
204                     }
205                 
206                 
207                    
208                    else if(RollDifference > 1)
209                    {
210                       //get player armor and assign it to playerArmor
211                       playerArmor = player.getArmor();
212                       //pass playerArmor to HighHit function/method as second argument to determine the amount of damage reduction/amount of hp to return.
213                       player.health = boss.HighHit(player.health,playerArmor);
214                       //checks to see which message to display based on player's armor.
215                       if(playerArmor == 5)                    
216                       JOptionPane.showMessageDialog(null,"Because Player Has 5 armor,Damage has been reduced by 5.");
217                       else if(playerArmor == 10)
218                       JOptionPane.showMessageDialog(null,"Because Player Has 10 armor,Damage has been reduced by 10.");
219                       else if(playerArmor == 15)
220                       JOptionPane.showMessageDialog(null,"Because Player Has 15 armor,Damage has been reduced by 15.");
221                       else if(playerArmor == 20)
222                       JOptionPane.showMessageDialog(null,"Because Player Has 20 armor,Damage has been reduced by 20.");
223                       else if(playerArmor == 25)
224                       JOptionPane.showMessageDialog(null,"Because Player Has 25 armor,Damage has been reduced by 25.");
225                       else
226                       JOptionPane.showMessageDialog(null,"Because Player Has 0 armor,Damage has been reduced by 0.");
227                       
228                       JOptionPane.showMessageDialog(null,
229                       "Your roll: " + PlayerRoll + "\n" +
230                       "Enemy's roll: " + BossRoll + "\n\n" +
231                       boss.getName() + " has landed a HIGH HIT!!!\n"+
232                       "The damage dealt was: " + boss.damage + "\n\n" +
233                       player.getName() +"'s Health after " + boss.getName() + "'s HIGH HIT is  " + player.getHealth()
234                       );
235                     }
236                     
237                
238                    else if(RollDifference > 0)
239                    {
240                         //get player armor and assign it to playerArmor
241                         playerArmor = player.getArmor();
242                         //pass playerArmor to lowHit function/method as second argument to determine the amount of damage reduction/amount of hp to return.
243                         player.health = boss.lowHit(player.health,playerArmor);
244                         //checks to see which message to display based on player's armor.
245                       if(playerArmor == 5)                    
246                       JOptionPane.showMessageDialog(null,"Because Player Has 5 armor,Damage has been reduced by 5.");
247                       else if(playerArmor == 10)
248                       JOptionPane.showMessageDialog(null,"Because Player Has 10 armor,Damage has been reduced by 10.");
249                       else if(playerArmor == 15)
250                       JOptionPane.showMessageDialog(null,"Because Player Has 15 armor,Damage has been reduced by 15.");
251                       else if(playerArmor == 20)
252                       JOptionPane.showMessageDialog(null,"Because Player Has 20 armor,Damage has been reduced by 20.");
253                       else if(playerArmor == 25)
254                       JOptionPane.showMessageDialog(null,"Because Player Has 25 armor,Damage has been reduced by 25.");
255                       else
256                       JOptionPane.showMessageDialog(null,"Because Player Has 0 armor,Damage has been reduced by 0.");
257                       
258                         JOptionPane.showMessageDialog(null,
259                          "Your roll: " + PlayerRoll + "\n" +
260                          "Enemy's roll: " + BossRoll + "\n\n" +
261                          boss.getName() + " has landed a LOW HIT!!!!\n"+
262                          "The damage dealt was: " + boss.damage + "\n\n" +
263                          player.getName() +"'s Health after " + boss.getName() + "'s LOW HIT!!! is  " + player.getHealth()
264                          );
265                    }
266                 }
267                 //if both rolls equal the same, this occurs
268              else if (PlayerRoll == BossRoll)
269           {
270              JOptionPane.showMessageDialog(null,
271              "Your roll: " + PlayerRoll + "\n" +
272              "Enemy's roll: " + BossRoll + "\n\n" +
273              "Tie, no damage dealt"
274              );
275 
276           }
277    
278           }
279                            
280       }
281       PlayerHitPoints = player.health;
282       BossHitPoints = boss.health;
283       //If rollCounter variable which keeps up with rolls goes past 200 the fight is decided as a Tie.
284     
285       //If either player has greater than 0 hit points, once the loop as finished ,player has won the fight
286       if(PlayerHitPoints > 0)
287       {
288        
289        Result = player.getName() + " has won the fight!";
290        return Result;
291       }
292       //Else Boss had more by the end.Boss wins.
293       else if(BossHitPoints > 0)
294       {
295       Result = boss.getName() + " has won the fight.";
296       return Result;
297       }
298       else{
299       //Else its a Tie.
300       Result = "Fight is a Tie";
301       return Result;
302       //If rollCounter variable which keeps up with rolls goes past 200 the fight is decided as a Tie.
303       
304     }
305     
306     }
307      
308       
309       
310       
311    
312 }
