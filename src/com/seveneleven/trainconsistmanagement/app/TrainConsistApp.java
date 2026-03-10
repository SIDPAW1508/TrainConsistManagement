package com.seveneleven.trainconsistmanagement.app;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train
        List<String> passengerBogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + passengerBogies.size());
        System.out.println("Current Train Consist: " + passengerBogies);
        System.out.println("Train initialized successfully. Ready for operations!\n");

        // UC2: Add Passenger Bogies
        System.out.println("===========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===========================================\n");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...\n");

        // UC3: Track Unique Bogie IDs
        System.out.println("===========================================");
        System.out.println("UC3 - Track Unique Bogie IDs (HashSet)");
        System.out.println("===========================================\n");

        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set
        System.out.println("Final Bogie IDs (unique only): " + bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}
