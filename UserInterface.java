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
import java.util.Scanner;

public class UserInterface {
    public Scanner input = new Scanner(System.in);
    public CompanionsModifier companion;
    public MonsterRandomizer randomizer;
    public BagModifier bagModifier;
    public Battle battle;
    public Enemy enemy;
    Player player;
       
    int certifyAnswer = 0;
    int action = 0;
    String wait;
    
    public void initializeUserInterface() { 
        loadObjetcs();
        welcome();
        chooseMonster(); 
        tutorial();
    }
    public void loadObjetcs(){
        companion = new CompanionsModifier();
        player = new Player();
        randomizer= new MonsterRandomizer();
        bagModifier = new BagModifier();
        battle = new Battle();
        companion.CreateUnit();
    }
    public void welcome(){

        System.out.println("Voice: Hi and welcome to the world of Faiym \n");
        System.out.println("Voice: Here our way of living and to get money we go on adventures ");
        System.out.println("Voice: with our trusty companion, we go on a journey to have a wonderfull adventure");
        do{           
            System.out.println("Voice: So first things first, tell me what is your name\n-----");
            player.updateUserName();
            System.out.println("-----\nVoice: Mhhhh, so your name is "+ player.getUserName()+ " am i correct ?");
            System.out.println("      0 - No        1 - Yes");
            certifyAnswer = input.nextInt();           
        }while(certifyAnswer == 0);
        System.out.println("-----\nVoice: So tell me");
        do{
            System.out.println("Voice: What is your Gender\n-----");
            player.updateGender();
            System.out.println("----\nVoice: Mhhhh, so you're a " + player.getGender() + " am i correct ?");
            System.out.println("      0 - No        1 - Yes");
            certifyAnswer = input.nextInt();
        }while(certifyAnswer == 0);
        System.out.println("Voice: So " + player.getUserName() + " ,now that we know you let's choose a companion to join you!!!\n-----");

}
    
    public void chooseMonster(){
        int monsterChooser = 0;
        System.out.println("Voice: We usually specify in training one of each three mainly types of companions");
        System.out.println("Voice: For now choose one you like to have!");
        System.out.println("1- Ranger      2- Ground      3- Sky");
        do{
            System.out.println("-----\nchoose one\n-----");
                    System.out.printf("1- %s (%s)  \n",companion.getMonsterName(0),companion.getMonsterIndex(0).getType());
                    System.out.printf("2- %s  (%s)  \n" ,companion.getMonsterName(5),companion.getMonsterIndex(5).getType());
                    System.out.printf("3- %s (%s)  \n",companion.getMonsterName(7),companion.getMonsterIndex(7).getType());
                    monsterChooser = input.nextInt();    
                    switch(monsterChooser){
                        case 1:
                            player.addMonster(randomizer.randomize(companion.getMonsterIndex(0),3));
                            break;
                        case 2:
                            player.addMonster(randomizer.randomize(companion.getMonsterIndex(5),3));
                            break;
                        case 3:
                            player.addMonster(randomizer.randomize(companion.getMonsterIndex(7),3));
                            break;
                    }            
                    System.out.printf("-----\nVoice: So you would like to choose %s\n",player.getCompanion(0).getName());                    
                    System.out.println("-----\n      0 - No        1 - Yes");
                    certifyAnswer = input.nextInt();    
                    if(certifyAnswer == 0){
                        player.removeMonster(player.getCompanion(0));
                    }
        }while(certifyAnswer == 0);         
    }
    public void tutorial(){
        System.out.println("-----\nVoice: Now that you are ready let me tell some things ");
        System.out.println("Voice: Troughout your adventure you can check your Companion stats");
        System.out.println("Voice: Try accessing your companion menu by clicking 1");
        System.out.println("1 - see companions\n-----");
        action = input.nextInt();
        if(action == 1){
            player.displayCompanions();
        }
        System.out.printf("\nVoice: Perfect %s if you ever feel the need to check your companions do that ",player.getUserName());
        System.out.println("\nVoice: Now let's check What is in your bag ");
        System.out.println("Voice: Try accessing your bag menu by clicking 1");
        action = input.nextInt();
        if(action == 1){
            player.displayBag();
        }
        System.out.println("Voice: Mhhh, you don't have anything yet ");
        System.out.println("Voice: here take some potions to help your companion in times of need!");      
        player.addItem(3,bagModifier.createPotion("Small Potion", 10));
        player.displayBag();
        System.out.println("Now let's try and fight against a dummy and see how well you do");
        battle.normalBattle(player,new Enemy("Dummy",0,randomizer.randomize(companion.getMonsterIndex(7),3)));
        
        
        System.out.println("Voice: Well now that you are prepared");
        System.out.println("Voice: Good luck on your journey and remember you choose the way you decide to fight");      
    }
}
