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
public class BagModifier {
    
    private BagItems bagItems;
    
    public BagItems createPotion(String S,int R){
        bagItems = new BagItems();
        bagItems.setItemName(S);
        bagItems.setItemRestore(R);
        return bagItems;       
    }
}
