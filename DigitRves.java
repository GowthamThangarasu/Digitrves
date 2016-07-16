/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitrves;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class DigitRves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, rev = 0;
   Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse  ");
   n=sc.nextInt();
 
   while (n != 0)
   {
      rev = rev * 10;
      rev = rev + n%10;
      n       = n/10;
   }
 
        System.out.println("Reverse of entered number is ="+rev);
 
       }
    
}
