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
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public Scanner input = new Scanner(System.in);
    
    private String userName;
    private String userGender;
    private int genderChooser;
    private int companionChooser;
    private int actionChooser;
    
    private ArrayList<AllCompanions> playerCompanion = new ArrayList<AllCompanions>();
    private ArrayList<BagItems> bagItems = new ArrayList<BagItems>();
  
    //accessors
    public String getUserName(){
        return userName;    
    }
    public String getGender(){
        return userGender;
    }
    public AllCompanions getCompanion(int index){
        return playerCompanion.get(index);
    }
    //mutators
    public void updateUserName(){
        String updateName = input.nextLine();
        userName = updateName;  
    }
    public void updateGender(){
        System.out.println("    1- male       2- female");
        genderChooser = input.nextInt();
        if(genderChooser == 1){
            userGender = "Male";
        }
        else if(genderChooser == 2){
            userGender = "Female";
        }
    }
    public void addItem(int Q,BagItems item){
        for (int i = 0; i < Q; i++) {
            bagItems.add(item);    
        }
    }
    public void addMonster(AllCompanions  unit){
        if(playerCompanion.size()<3){
            playerCompanion.add(unit);
        }       
    }
    public void removeMonster(AllCompanions unit){
        playerCompanion.remove(unit);
    }
    
    
    //display
    public void displayCompanions(){
        System.out.println("----------------\n");
        for (int i = 0; i < playerCompanion.size(); i++) {
            System.out.printf("(%d)- %s\n",i+1,playerCompanion.get(i).getName());      
        } 
        System.out.println("\n----------------");
        System.out.println("Choose a companion");
        companionChooser = input.nextInt();
        System.out.println("What Would you like to do ?");
        System.out.println("1-see summary     2- nothing");
        actionChooser = input.nextInt();
        switch(actionChooser){
            case 1:
                displayStats(companionChooser-1);
                break;
            case 2:    
                break;
        }       
    }
    
    public void displayStats(int choose){
        System.out.println("Name: "+ playerCompanion.get(choose).getName());
        System.out.println("Level: " + playerCompanion.get(choose).getLevel());
        System.out.println("Health: " + playerCompanion.get(choose).getHealthPoints());
        System.out.println("Attack: " + playerCompanion.get(choose).getAttackPoints());
        System.out.println("Defense: " + playerCompanion.get(choose).getDefensePoints());    
        System.out.println("Speed: " + playerCompanion.get(choose).getSpeed());
    }
    public void displayBag(){
        System.out.println("----------------\n");
        for (int i = 0; i < bagItems.size(); i++) {
            System.out.printf("(%d)- %s\n",i+1,bagItems.get(i).getItemName());      
        } 
        System.out.println("\n----------------");       
    }
}
