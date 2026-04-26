/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 * @author Nasiha
 * Student Id – 33150863 
 * Batch – 2
 */

public class Flag {
    
    public static void main(String[] args) throws InterruptedException {

        // Flag with stars and stripes
        // Declare and initialize i
        for (int i = 0; i < 5; i++) {

            // print line 0, 2 & 4 of flag with stars and stripes
            if (i % 2 == 0) {
                System.out.println("       * * * * *  ===============");
            } else {
                System.out.println("      * * * * * * ===============");
            }

            // Adding delay to simulate animation
            Thread.sleep(500); // Delay of 500ms between each line
        }

        // Stripes below the stars
        // print stripes four times
        for (int i = 0; i < 4; i++) {
            System.out.println("      ===========================");
            Thread.sleep(500); // Delay for animation effect
        }

        // Stick below the flag
        int stickHeight = 7;
        // print vertical bar six times
        for (int i = 0; i < stickHeight; i++) {
            System.out.println("      |");
            Thread.sleep(500); // Delay for animation effect
        }

        // Stairs below the stick
        int rows = 7; 
        int width = 3;

        // loop through each row for stairs
        for (int m = 0; m < rows; m++) {
            // loop through each column
            for (int n = 0; n < 40; n++) {
                // if row is even
                if (m % 2 == 0) {
                    // print a dash
                    if (n >= 6 - width && n <= 6 + width) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                } 
                // if row is odd
                else {
                    // print vertical bar at the edges
                    if (n == 6 - width || n == 6 + width) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            // Expand the stairs
            if (m % 2 != 0) {
                width++;
            }
            System.out.print("\n");

            // Adding delay to simulate animation
            Thread.sleep(500); // Delay for animation effect
        }
    }
}
