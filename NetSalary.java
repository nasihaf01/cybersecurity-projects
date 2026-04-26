/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Nasiha
 * Student Id – 33150863 
 * Batch – 2
 */

import java.util.Scanner;
public class NetSalary {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User must enter their basic salary
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
        
        // check if salary is less than or equal to 0
        if(salary<=0){
            // Invalid salary
            System.out.println("Invalid input");
        }
        else{
        // Calculate House rent allowance
        double HRA = 0.15 * salary; 
        
        // Calculate Dearness allowance
        double DA = 0.75 * salary;  
        
        // Calculate Gross salary
        double GS = salary + HRA + DA; 

        // Income Tax
        double incomeTax = 0.35 * GS; 

        // Calculate Net Salary
        double netSalary = GS - incomeTax; 
        
        // Print the calculated values
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + GS);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Net Salary: " + netSalary);
        }
    }
}
