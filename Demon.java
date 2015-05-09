
/**
 * Write a description of class Beast here.
 * 
 * @Andre Blue
 * @April 20, 2015
 */
public class Demon extends Creature
{
   
    Demon() {
        super();
    }
    
    Demon(int s, int h) {
        super(h, s);
        
    }
    
    public int attack (){
        // ask creature to attack
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        // rolld dice. if >10%, damage = damage 2x
        if (rand.nextInt(20) == 0) {
            tempAttackDamage += 50;
     
        }
        
        return tempAttackDamage;
    }
}
  

        
 
