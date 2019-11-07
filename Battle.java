
package DungeonsCrawler;

/**
 *
 * @author nerff
 */
import java.util.Scanner;

public class Battle {
   Scanner input = new Scanner(System.in);
   int actionChooser;
   int damage;
   
    public void trainerBattle(Player playerUnit,Enemy enemyUnit){
        System.out.println("\n--------------------------------------");
        System.out.printf("%s , decides to Challenge you!",enemyUnit.getUserName());
        System.out.println("\n--------------------------------------\n");
        while(enemyUnit.getCompanionsLength() > 0){
            System.out.println("\n--------------------------------------\n");
            System.out.printf("%s,(%s)",playerUnit.getUserName(),playerUnit.getCompanionsLength());
            System.out.printf("       Against           %s,(%s)",enemyUnit.getUserName(),enemyUnit.getCompanionsLength());
            System.out.printf("\nLevel: %d",playerUnit.getCompanion(0).getLevel());
            System.out.printf("                       Level: %d",enemyUnit.getCompanion(0).getLevel());
            System.out.printf("\n  %s",playerUnit.getCompanion(0).getName());
            System.out.printf("           |            %s",enemyUnit.getCompanion(0).getName());
            System.out.printf("\n  %s-HP",playerUnit.getCompanion(0).getHealthPoints());
            System.out.printf("            |            %s-HP",enemyUnit.getCompanion(0).getHealthPoints());
            System.out.println("\nWhat will you do?\n---------");
            System.out.println("1- Fight          2- Defend");
            System.out.println("3- Bag            4- Run");
            actionChooser = input.nextInt();
           switch(actionChooser){
                case 1:
                    damageCalculator(playerUnit.getCompanion(0),enemyUnit.getCompanion(0));
                    break;                   
                case 2:
                    
                    break;
                case 3:
                    playerUnit.displayBag();
                    break;                    
                case 4:  
                    System.out.println("-----\nYou can't Run from a Trainer Battle\n-----\n");
                    break;
           }
        }
        
       
    }
    //make a decent battle calculator
    private void damageCalculator(AllCompanions player,AllCompanions enemy){
        damage = 0;
        damage = damage+1;
        damage = damage + ((player.getAttackPoints()- enemy.getDefensePoints())) + (player.getAttackPoints()/enemy.getDefensePoints());
        if(damage <0){
            damage = 1;        
        }
        enemy.setHealthPoints(enemy.getHealthPoints()-damage);
        
    
    }  
}