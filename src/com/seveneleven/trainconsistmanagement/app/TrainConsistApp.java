package com.seveneleven.trainconsistmanagement.app;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty train consist using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Display the current train consist (empty list at startup)
        System.out.println("Current Train Consist: " + trainConsist);

        // Program continues...
        System.out.println("Train initialized successfully. Ready for operations!");
    }
}
