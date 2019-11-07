package DungeonsCrawler;

/**
 *
 * @author nerff
 */
public class EnemyModifier {
    
    Enemy enemy;
    MonsterRandomizer randomizer;
    CompanionsModifier companion;
    
    public void createEnemy(){
        enemy = new Enemy("Professor",500,randomizer.randomize(companion.getMonsterIndex(7),3));
        
    }
}
