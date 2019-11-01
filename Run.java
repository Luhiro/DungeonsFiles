package MonsterDungeon;

/**
 *
 * @author nerff
 */

public class Run {
    public static UserInterface userInterface;
    
    public static void main(String[] args) {
        userInterface = new UserInterface();
        userInterface.initializeUserInterface();      
    }
}
