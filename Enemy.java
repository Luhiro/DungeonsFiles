
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
        updateName(N);
        updateCash(C);
        addMonster(unit);
        
    }
    //acessors
    public String getUserName(){
        return name;    
    }
    public int getCompanionsLength(){
        return enemyCompanion.size();
    }
        public AllCompanions getCompanion(int index){
        return enemyCompanion.get(index);
    }
    //mutators
    public void updateName(String updatedName){
        name = updatedName;
    }
    public void updateCash(int updatedCash){
        cash = updatedCash;
    }
    public void addMonster(AllCompanions  unit){
        if(enemyCompanion.size()<3){
            enemyCompanion.add(unit);
        }       
    }
}
