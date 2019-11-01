
package MonsterDungeon;

/**
 *
 * @author nerff
 */
public class AntiAirUnits {
    
    private String name;
    
    private int level;
    private int healthPoints;
    private int attackPoints;
    private int defensePoints;
    private int totalAAMOnsters;
   
    public AntiAirUnits(){
    }
    
    public AntiAirUnits(String N,int HP,int A, int D){
        name = N;
        healthPoints = HP;
        attackPoints = A;
        defensePoints = D; 
        totalAAMOnsters++;
    }

    
    //accessors
    public String getName(){
        return name;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public int getAttackPoints(){
        return attackPoints;
    }
    public int getDefensePoints(){
        return defensePoints;
    }   
    public int getTotalAA(){
        return totalAAMOnsters;
    }
    

    //mutators
    
    
    
    
    
    
    
    
    
    
    
}
