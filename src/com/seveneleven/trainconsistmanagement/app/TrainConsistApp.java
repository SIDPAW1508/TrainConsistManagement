package com.seveneleven.trainconsistmanagement.app;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

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
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Final Bogie IDs (unique only): " + bogieIds);
        System.out.println("\nUC3 operations completed successfully...\n");

        // UC4: Maintain Ordered Bogie IDs
        System.out.println("===========================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs (LinkedList)");
        System.out.println("===========================================\n");

        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies in order
        trainConsist.addFirst("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        System.out.println("Train Consist after adding bogies:");
        System.out.println(trainConsist + "\n");

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2:");
        System.out.println(trainConsist + "\n");

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 operations completed successfully...");
    }
}
