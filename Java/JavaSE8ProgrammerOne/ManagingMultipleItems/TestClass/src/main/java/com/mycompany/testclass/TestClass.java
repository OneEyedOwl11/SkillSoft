/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testclass;

/**
 *
 * @author Adil
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=9,y=3;
        
        if (x/y<3) {
            x+=y;
        }
        else {
            x*=y;
        }
        System.out.println("After if statement " + x);
        
        x=9;
        y=3;
        x=((x/y)<3)?(x+=y):(x*=y);
        System.out.println("After ternary operation " + x);
    }
    
}
