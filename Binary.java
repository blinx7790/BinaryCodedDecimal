/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

import java.util.Scanner;

/**
 *
 * @author Parks
 */
public class Binary {

   //Binary converted decimal
   //take a number one digit
   //at a time and convert
   //that number to binary
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a number to convert to binary");
        //get the input from the user
        String biString = scanner.nextLine();
        
        
        //get the length of the user input
        int biLen = biString.length();
        
        //grab each number one at a time to convert to binary
        for(int i = 0; biLen > i; i++){
            char biChar = biString.charAt(i);
            int biInt = Integer.parseInt(String.valueOf(biChar));
            
            //format the binary with leading 0's
            System.out.print(String.format("%4s", Integer.toBinaryString(biInt))
                    .replace(" ", "0") + " ");
    }
    }
    
}
