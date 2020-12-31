/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopping3;

import java.util.Set;

/**
 *
 * @author Adil
 */
public class Item {
    /*char color;
    
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    }*/
    
    public void displayItem() {
        System.out.println("item: " + desc + ", " + quantity + ", " + price + ", " + colorCode);
    }
    
    public void setItemFields(String desc, int qty, double pr) {
        this.desc = desc;
        this.quantity = qty;
        this.price = pr;
    }
    
    
    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}
