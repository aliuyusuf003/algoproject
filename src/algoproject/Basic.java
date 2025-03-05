/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoproject;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Basic {
    
    static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.nextLine();
        String output = "";
        
        for(int i = 0; i <input.length();i++){
            output = input.charAt(i) + output;
        }        
        System.out.println("The reversed string is :"+output);
    }
    
    
}
