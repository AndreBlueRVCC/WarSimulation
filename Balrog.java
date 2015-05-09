
/**
 * Write a description of class Hawkmen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balrog extends Demon
{
  public int attack() {
      int tempAttackDamage;
      tempAttackDamage = super.attack();
      tempAttackDamage += super.attack();
      
      return tempAttackDamage;
    }
}

