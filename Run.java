
package DungeonsCrawler;

/**
 *
 * @author nerff
 */
public class Run {
    public static UserInterface userInterface;
    
    public static void main(String[] args) {
        loadObjects();
        userInterface.initializeUserInterface();      
    }
    public static void loadObjects(){
        userInterface = new UserInterface();
    }
}
