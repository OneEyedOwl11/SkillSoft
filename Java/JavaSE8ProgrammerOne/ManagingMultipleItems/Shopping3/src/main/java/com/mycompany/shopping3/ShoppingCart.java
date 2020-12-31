/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopping3;

/**
 *
 * @author Adil
 */
public class ShoppingCart {
    public static void main(String args[]) {
        Customer cust1 = new Customer("Frank Jones", "555-44-3212");
        
        System.out.println("Customer name: " + cust1.getName() + " SSN:" + cust1.getSSN());
        
        
        
        
        
        
        
        
        /*Item item1 = new Item();
        
        item1.setItemFields("belt", 1,19.50);
        item1.displayItem();
        
        int retcode = item1.setItemFields("shirt",2,34.99,'');
        
        if (retcode<0){
            System.out.println("Invalid color code. item not added");
        } else {
            item1.displayItem();
        }
        /*if (item1.setColor('B')){
            System.out.println("Item1.color = " + item1.color);
        }
        else System.out.println("Invalid Color");*/
    }
    
}
