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
public class EnemyModifier {
    
    Enemy enemy;
    
    public void createEnemy(){
        enemy = new Enemy("",1,randomizer.randomize(companion.getMonsterIndex(7),3));
        
    }
}
