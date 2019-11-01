package MonsterDungeon;

import java.util.Scanner;

/**
 *
 * @author nerff
 */
public class Player {
    public Scanner input = new Scanner(System.in);
    
    private String userName;
    private String userGender;
    private int genderChooser;
    
    //accessors
    public String getUserName(){
        return userName;    
    }
    public String getGender(){
        return userGender;
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
}
