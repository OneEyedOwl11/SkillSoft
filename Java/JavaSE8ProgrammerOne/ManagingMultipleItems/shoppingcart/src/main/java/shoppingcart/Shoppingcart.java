/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author Adil
 */
public class Shoppingcart {
    public static void main(String[] args) {
        Item item1, item2;
        item1 = new Item();
        item2 = new Item();
        
        item1.desc = "Shirt";
        item1.itemID = 123456;
        item2.desc = "Pants";
        item2.itemID = 654321;
        
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " + item2.itemID);
        
        item1 = item2;
        
        System.out.println("Item1: " + item1.desc + " " + item1.itemID);
        System.out.println("Item2: " + item2.desc + " " + item2.itemID);
    }
}
