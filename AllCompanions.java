
package DungeonsCrawler;

/**
 *
 * @author nerff
 */
public class AllCompanions {
        
    private String name;
    private String type;
    private String faction;
    
    private int count = 0;
    private int level;
    private int healthPoints;
    private int attackPoints;
    private int defensePoints;
    private int speed;
    private int index;
    private int experience;
    
    
    public AllCompanions(String N,String T,String F,int HP,int A, int D,int S){
        index = count;
        name = N;
        type = T;
        faction = F;
        healthPoints = HP;
        attackPoints = A;
        defensePoints = D; 
        speed = S;
        count++;
    }
    
    //accessors
    public int getLevel(){
        return level;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getFaction(){
        return faction;
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
    public int getSpeed(){
        return speed;
    }
    public int getIndex(){
        return index;
    }
    //mutators
    public void setLevel(int L){
        level = L;
    }
    public void setHealthPoints(int HP){
        healthPoints = HP;
    }
    public void setAttackPoints(int A){
        attackPoints = A;
    }
    public void setDefensePoints(int D){
        defensePoints = D;
    }
    public void setSpeed(int S){
        speed = S;
    }
    
}
