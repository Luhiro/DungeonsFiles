
package MonsterDungeon;

/**
 *
 * @author nerff
 */
public class AntiAirUnitsModifier {
    

    public AntiAirUnits[] airUnits;
    
    public void CreateUnit(){
        //create object /String- name/int- healthPoints/int- attackPoints/int- defensePoints/  
        airUnits = new AntiAirUnits[3];
        airUnits[0]  = new AntiAirUnits("Shilley",10,2,5);
        airUnits[1] = new AntiAirUnits("Sniffy",8,4,4);
        airUnits[2] = new AntiAirUnits("Sdenter",15,1,3);
   }
    
    //accessors
   public AntiAirUnits[] getMonsterArray(){
       return airUnits;
   }
    
    //mutators
    public void getEveryUnitName(){
        for (int i = 0; i < airUnits.length; i++) {
            System.out.println(airUnits[i].getName());            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
