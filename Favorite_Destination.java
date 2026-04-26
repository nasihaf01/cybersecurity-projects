/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 * @author Nasiha
 * Student Id – 33150863 
 * Batch – 2
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Favorite_Destination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // create list to store city names
        ArrayList<String> destinations = new ArrayList<String>();
        // create list to store votes
        ArrayList<Integer> counts = new ArrayList<Integer>();

        // ask user to enter their favorite cities
        System.out.println("Enter the city you would love to visit "
                + "(type QUIT/EXIT to finish):");

        // count votes for each city
        votes(input, destinations, counts);

        // display votes for each city
        result(destinations, counts);

        // find city highest vote
        String favoriteCity = FavCity(destinations, counts);

        // favorite city result
        FavcityResult(favoriteCity, counts);
    }

    // Method to count votes for each city
    public static void votes(Scanner scanner, ArrayList<String> destinations, 
            ArrayList<Integer> counts) {
        while (true) {
            String input = scanner.nextLine();

            // check if input is quit or exit
            if(input.equalsIgnoreCase("QUIT")|| input.equalsIgnoreCase("EXIT")) 
            {
                break; // exit if input is quit or exit
            }

            // Check if the city is already exists
            boolean found = false;
            for (int i = 0; i < destinations.size(); i++) {
                if (destinations.get(i).equalsIgnoreCase(input)) {
                    // if yes increment the vote
                    counts.set(i, counts.get(i) + 1);
                    found = true;
                    break;
                }
            }

            // If city is not found add to list
            if (!found) {
                destinations.add(input);
                counts.add(1);
            }
        }
    }

    // Method to display votes for each city 
    public static void result(ArrayList<String> destinations, 
            ArrayList<Integer> counts) {
        System.out.println("\nVotes for each city:");
        for (int i = 0; i < destinations.size(); i++) {
            // print each city and its votes
            System.out.println(destinations.get(i) + ": " + counts.get(i) 
                    + " votes");
        }
    }

    // Method to find the city with maximum votes
    public static String FavCity(ArrayList<String> destinations, 
            ArrayList<Integer> counts) {
        // variable to store city
        String favoriteCity = "";
        // variable to store votes
        int maxCount = 0;

        // check through the lists to find city with maximum votes
        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i) > maxCount) {
                maxCount = counts.get(i);
                // update the favourite city
                favoriteCity = destinations.get(i);
            }
        }
        return favoriteCity;
    }

    // Method to display the favorite city and its vote
    public static void FavcityResult(String favoriteCity, 
            ArrayList<Integer> counts) {
        if (!favoriteCity.isEmpty()) {
            // find city with maximum vote
            int maxCount = 0;
            for (int count : counts) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            // display the favorite city and its vote
            System.out.println("\nThe favorite city to visit is: " 
                    + favoriteCity + " with " + maxCount + " votes.");
        } else {
            // if no cities were entered
            System.out.println("No cities were entered.");
        }
    }
}
