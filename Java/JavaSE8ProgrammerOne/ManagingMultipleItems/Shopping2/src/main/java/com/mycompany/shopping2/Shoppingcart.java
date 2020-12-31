/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopping2;

/**
 *
 * @author Adil
 */
public class Shoppingcart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String custName = "Sally Smith";
        String firstName;
        int spaceIndex;
        
        StringBuilder sb;
        //get the index of the space character " "
        
        spaceIndex = custName.indexOf(" ");
        
        //Use substring method to locate first name
        
        firstName = custName.substring(0, spaceIndex);
        
        System.out.println(firstName);
        
        sb = new StringBuilder(firstName);
        
        System.out.println(sb);
        
        sb.append(" Smith");
        
        System.out.println(sb);
        
        int int1;
        long long1 = 99_000_000_000L;
        float flt1 = 13.5F;
        char ch1 = 'U';
        
        System.out.println("Long1: " + long1);
        
        int1 = (int) long1;
        
        System.out.println("long1 assigned to int1: " + int1);
    }
    
}
