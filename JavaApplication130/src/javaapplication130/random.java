/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication130;

import java.util.Random;

/**
 *
 * @author PERSONAL
 */
class random extends Random {

    public static void main(String[] args) {
        int u_arr = (int) (Math.random()*(15-5)) + 5;
        System.out.println(u_arr);
        int ser_time = (int) (Math.random()*(20-6)) + 6;
        System.out.println(ser_time);
    }
    
}
