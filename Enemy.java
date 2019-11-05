
package DungeonsCrawler;

import java.util.ArrayList;

/**
 *
 * @author nerff
 */
public class Enemy {
    private String name;
    private int cash;
    
    private ArrayList<AllCompanions> enemyCompanion = new ArrayList<AllCompanions>();
    
    public Enemy(String N,int C,AllCompanions unit){
        
        addMonster(unit);
        
    }
        public void addMonster(AllCompanions  unit){
        if(enemyCompanion.size()<3){
            enemyCompanion.add(unit);
        }       
    }
}
