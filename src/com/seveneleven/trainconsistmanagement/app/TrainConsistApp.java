package com.seveneleven.trainconsistmanagement.app;

import java.util.ArrayList;
import java.util.List;

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

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // Check existence
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}
