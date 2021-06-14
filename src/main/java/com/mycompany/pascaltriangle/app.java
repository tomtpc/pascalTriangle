/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.pascaltriangle;

import java.util.Scanner;

/**
 * 
 * @author TomTPC < vanthanh7452 at Gmail.com >
 */
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: "); int h = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i <= h; i++){
            for(int j = 0 ; j<= 2*h ; j ++){
                int x = j - h;
                if(x < 0) x *= -1;
                int output = i - x;
                if(output > 0) System.out.printf("%8d",output);
                else System.out.printf("\t");
            }
            System.out.println("");
        }
    }
}
