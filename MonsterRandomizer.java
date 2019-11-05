/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DungeonsCrawler;

/**
 *
 * @author nerff
 */
import java.util.Random;
    
public class MonsterRandomizer {
    
    CompanionsModifier companionMod;
    public Random random = new Random();
    int statRandomize ;     
    int statByLevel = 0;
    
    public AllCompanions randomize(AllCompanions unit,int level){
        statByLevel = 0;
        int randomize = random.nextInt(2*level)-level;
        unit = new AllCompanions(unit.getName(),unit.getType(),unit.getFaction(),unit.getHealthPoints(),unit.getAttackPoints(),unit.getDefensePoints(),unit.getSpeed());  
        unit.setLevel(level);
        
        for (int i = 1; i < level; i++) {
            statRandomize = random.nextInt(2)+1;    
            statByLevel = statByLevel+statRandomize;
        }
        unit.setHealthPoints(unit.getHealthPoints()+randomize+statByLevel);
        
        statByLevel = 0;
        for (int i = 1; i < level; i++) {
            statRandomize = random.nextInt(3)+1;    
            statByLevel = statByLevel+statRandomize;     
        }
        unit.setAttackPoints(unit.getAttackPoints()+randomize+statByLevel);
        
        statByLevel = 0;
        for (int i = 1; i < level; i++) {
            statRandomize = random.nextInt(3)+1;    
            statByLevel = statByLevel+statRandomize;       
        }
        unit.setDefensePoints(unit.getDefensePoints() + randomize + statByLevel);
        
        statByLevel = 0;
        for (int i = 1; i < level; i++) {
            statRandomize = random.nextInt(3)+1;    
            statByLevel = statByLevel+statRandomize;       
        }
        unit.setSpeed(unit.getSpeed()+randomize+statByLevel);
        statByLevel = 0;
        return unit;
    }
}