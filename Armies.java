import java.util.Random;
import java.util.Random;
import java.util.*;


public class Armies
{
    private Random rand = new Random();
    private Creature Army1Fighter;
    private Creature Army2Fighter;
    
    ArrayList<Creature> Army1 = new ArrayList<Creature>();
    ArrayList<Creature> Army2 = new ArrayList<Creature>();
    
 
    public Armies()
        {
        
            for (int i=0; i < 15; i++)
            {
                int NextCreature = rand.nextInt(5);
                
                if (NextCreature == 1) {
                    Army1.add (new Human());
                }
                if (NextCreature == 2) {
                    Army1.add (new Elf());
                }
                if (NextCreature == 3) {
                    Army1.add (new Dwarf());
                }
                if (NextCreature == 4) {
                    Army1.add (new Balrog());
                }
                else {
                    Army1.add (new CyberDemon());
                }
            }
            
            
             for (int i=0; i < 15; i++)
            {
                int NextCreature = rand.nextInt(5);
                
                if (NextCreature == 1) {
                    Army2.add (new Human());
                }
                if (NextCreature == 2) {
                    Army2.add (new Elf());
                }
                if (NextCreature == 3) {
                    Army2.add (new Dwarf());
                }
                if (NextCreature == 4) {
                    Army2.add (new Balrog());
                }
                else {
                    Army2.add (new CyberDemon());
                }
            }
        }
        public Creature Battle()
        {
            
            Army1Fighter = Army1.get(0);
            Army2Fighter = Army2.get(0);
        
        
        
            Army1Fighter.takeDamage(Army2Fighter.attack());
            Army2Fighter.takeDamage(Army1Fighter.attack());
            
            if (!Army1Fighter.isAlive());{
                Army1.remove(Army1Fighter);
            }
            if (!Army2Fighter.isAlive());{
                Army2.remove(Army2Fighter);
            }
            return null;
        }
         public void runToCompletion(){
            while(Army1.size() > 0 && Army2.size() > 0) {
                Battle();
            }
            
            if(Army2.size() == 0) {
                System.out.println("Army 1 is victorious");
            }
            else if (Army1.size() == 0) {
                System.out.println("Army 2 is victorious");
            }
        }
    }
        
           
    

   
        
    
        
        
       