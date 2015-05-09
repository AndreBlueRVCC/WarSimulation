
/**
 * Write a description of class Elf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
   
    Elf() {
        super();
    }
    
    Elf(int s, int h) {
        super(h, s);
        
    }
    
    public int attack (){
        // ask creature to attack
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        // rolld dice. if >10%, damage = damage 2x
        if (rand.nextInt(10) == 0) {
            tempAttackDamage *= 2;
            System.out.println("DAMN SON");
        }
        
        return tempAttackDamage;
    }
}
  
