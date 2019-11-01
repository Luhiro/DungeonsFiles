
package MonsterDungeon;

/**
 *
 * @author nerff
 */
import java.util.Scanner;

public class UserInterface {
    public Scanner input = new Scanner(System.in);
    public AntiAirUnitsModifier antiAirUnit;
    Player player;
    
    int certifyAnswer = 0;
    
    public void initializeUserInterface() { 
        antiAirUnit = new AntiAirUnitsModifier();
        player = new Player();
        welcome();
        antiAirUnit.CreateUnit();
        chooseMonster();       
    }
    public void welcome(){

        System.out.println("Hi and welcome to our world \n");
        System.out.println("Here to survive and get money we adventure into a dungeon");
        System.out.println("with our trusty monster and try to reach the treasures deep in it the dungeon");
        do{           
            System.out.println("So tell me what is your name\n-----");
            player.updateUserName();
            System.out.println("-----\nMhhhh, so your name is "+ player.getUserName()+ " am i correct ?");
            System.out.println("      0 - No        1 - Yes");
            certifyAnswer = input.nextInt();           
        }while(certifyAnswer == 0);
        System.out.println("----\nSo tell me");
        do{
            System.out.println("What is your Gender\n-----");
            player.updateGender();
            System.out.println("----\nMhhhh, so you're a " + player.getGender() + " am i correct ?");
            System.out.println("      0 - No        1 - Yes");
            certifyAnswer = input.nextInt();
        }while(certifyAnswer == 0);
        System.out.println("So " + player.getUserName() + " let's choose a monster to join you!!!\n-----");
}
    
    public void chooseMonster(){
        
        System.out.println("There is mainly three types of monsters");
        System.out.println("So which type would you like to choose");
        System.out.println("1- AntiAir      2- Ground      3- Sky");
        int typeChooser = input.nextInt();
        System.out.println("choose one\n");
        switch(typeChooser){
            case 1:
                antiAirUnit.getEveryUnitName();                               
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        
        
        }
       
        
        
    
    }
  
}
