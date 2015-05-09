import java.util.Random;

/** 
 * @Andre Blue
 * April 20, 2015
 * All demons must die
 */
public abstract class Creature
{
    protected static Random rand = new Random();
    
    private int health; //determines death @ 0
    private int strength; //determines max damage
   
    Creature(){
        health = 12;
        strength = 12;
        
    }
    
    /**
     * h & s indicate health and strength
     * 
     * @param h initial health
     * @param s strength (used for damage calculation)
     */
    Creature(int h, int s) {
        health = h;
        strength = s;
    }
    
    /**
     * attack causes 1-strength points of damage
     * 
     * @return damage done by the attack
     */
    public int attack(){
        return rand.nextInt(strength) + 1;
    }
    /**
     * taking damage removes d units from creature's health
     * 
     * @param d = damage to subtract from health
     */
    public void takeDamage(int damage){
        health -= damage;
    
    }
    
    /**
     * @ return true if health > 0, else false
     */
    public boolean isAlive() {
        boolean alive = false;
        
        if (health > 0) {
            alive = true;
        }
       return alive;
        
        }

    }


