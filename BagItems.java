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
public class BagItems {
    private String itemName;
    
    private int restoreHealth;
    
    //accessors
    public String getItemName(){
        return itemName;
    }
    public int getRestore(){
        return restoreHealth;
    }
    //mutators
    public void setItemName(String S){
        itemName = S;
    }
    public void setItemRestore(int R){
        restoreHealth = R;
    }
}
