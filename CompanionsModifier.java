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
public class CompanionsModifier {
        

    private AllCompanions[] companions;
    
    public void CreateUnit(){
        //create object /String- name/int- healthPoints/int- attackPoints/int- defensePoints/      
        companions = new AllCompanions[9];
        companions[0]  = new AllCompanions("Ponpom","Fighter","Ranger",20,8,6,6);
        companions[1] = new AllCompanions("Chiffy","Assassin","Ranger",16,12,3,8);
        companions[2] = new AllCompanions("Sedenter","Tank","Ranger",28,4,5,4);
        companions[3]  = new AllCompanions("Tayli","Destroyer","Ground",15,15,2,11);
        companions[4] = new AllCompanions("Zwerp","Speedy","Ground",19,7,5,15);
        companions[5] = new AllCompanions("Rardillo","Armored","Ground",23,6,9,2);
        companions[6]  = new AllCompanions("Ovir","Brawler","Sky",21,6,9,5);
        companions[7] = new AllCompanions("Parst","Healer","Sky",17,7,7,7);
        companions[8] = new AllCompanions("Culfrig","Mage","Sky",22,7,4,7);
   }
    
    //accessors
    public AllCompanions getMonsterIndex(int index){
       return companions[index];
   }
    public AllCompanions[] getMonsterIn(){
       return companions;
   }
    public String getMonsterName(int index){
        return companions[index].getName();   
    }
    public String getMonsterFaction(int index){
        return companions[index].getFaction();
    }
    //mutators
    public void getEveryUnitNameType(int start,int length){
        int i = 0;
        for (; start < length; start++) {
            System.out.println((i+1) + " - "   +   companions[start].getName()  +  companions[start].getType());   
            i++;
        }
    }    
}
