

public class CyberDemon extends Demon
{
     CyberDemon() {
        super();
    }
    
    CyberDemon(int s, int h) {
        super(h, s);
        
    }
    
    public int attack (){
        // ask creature to attack
        int tempAttackDamage;
        tempAttackDamage = super.attack();
        
        tempAttackDamage *= 2;
         
        return tempAttackDamage;
    }
}
