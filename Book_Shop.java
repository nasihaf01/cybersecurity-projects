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
public class Book_Shop {
    public static void main(String[] args) {
        // Books and their prices
        String[] books = { "Java Programming",
                           "Python Programming",
                           "C++ Programming",
                           "Data Structures",
                           "Algorithms",
                           "Web Development",
                           "Database Systems",
                           "Operating Systems",
                           "Software Engineering",
                           "Computer Networks" };
        
        double[] prices = {29.99, 24.99, 27.99, 32.50, 35.00,
                           30.00, 28.99, 33.00, 40.00, 31.50};
        
        Scanner input = new Scanner(System.in);
        
        // total cost of books
        double total = 0;
        
        System.out.println("Welcome to the Online Book Shop!");
        
        // display books and prices
        booknames(books, prices);
        
        while (true) {
            // input books to buy
            int choice = bookchoice(input, books.length);
            // exit loop if input is 0
            if (choice == 0) {
                break;
            }
            // input quantity of chosen book
            int quantity = bookquantity(input, books[choice - 1]);
            // if quantity is greater than 0 calculate cost
            if (quantity <= 0) {
                continue;
            }
            // Total cost
            total += prices[choice - 1] * quantity;
            // Display the chosen the book
            System.out.println("Added " + quantity + " copy/copies of '" + 
                    books[choice - 1] + "' to your cart.");
        }
        // Display total cost
        System.out.println("\nYour total amount is: " + total);
        System.out.println("\nThank you for purchasing from us. Visit again!");
    }
   
    // Method to display books and prices
    public static void booknames(String[] books, double[] prices) {
        System.out.println("\nBooks to buy: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " - " + prices[i]);
        }
    }

    // Method to ask user to choose a book
    public static int bookchoice(Scanner input, int numberofbooks) {
        System.out.print("\nChoose a book to buy (or 0 to exit): ");
        int choice = input.nextInt();
        // Check if chosen book is from the list
        if (choice < 0 || choice > numberofbooks) {
            System.out.println("\nWrong input. Choose a valid book number.");
            return bookchoice(input, numberofbooks); // ask for input again
        }
        return choice;
    }

    // Method to ask user for the quantity of chosen book
    public static int bookquantity(Scanner input, String bookname) {
        System.out.print("Enter the quantity of '" + bookname + "': ");
        int quantity = input.nextInt();
        // if quantity is less than 0 ask for input again
        if (quantity <= 0) {
            System.out.println("Quantity should be more than 0. Try again.");
            return bookquantity(input, bookname); 
        }
        return quantity;
    } 
}
