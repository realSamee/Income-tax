/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author SaLiy5109
 */

import java.util.Scanner;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Tax rates
        final double PERC1 = 0.15;
        final double PERC2 = 0.205;
        final double PERC3 = 0.26;
        final double PERC4 = 0.29;
        final double PERC5 = 0.33;
        
                                        final double B_TAX_1 = 50197 ; 
        final double A_TAX_2 = 50197 ;  final double B_TAX_2 = 100392; 
        final double A_TAX_3 = 100392 ; final double B_TAX_3 = 155625; 
        final double A_TAX_4 = 155625 ; final double B_TAX_4 = 221708; 
        final double A_TAX_5 = 221708; 
        
        double salary;
        double taxPerc = 0;
        double incomeTax;
        System.out.println("Enter your salary:");
        salary = input.nextDouble();
        
        //Getting correct tax rate
        if (salary < B_TAX_1) {taxPerc = PERC1;}
        if (salary > A_TAX_2) {if (salary < B_TAX_2) {taxPerc = PERC2;}}
        if (salary > A_TAX_3) {if (salary < B_TAX_3) {taxPerc = PERC3;}}
        if (salary > A_TAX_4) {if (salary < B_TAX_4) {taxPerc = PERC4;}}
        if (salary > A_TAX_5) {taxPerc = PERC5;}
        
        incomeTax = salary * taxPerc;
        System.out.println("Your income tax is " + incomeTax);
    }
}
