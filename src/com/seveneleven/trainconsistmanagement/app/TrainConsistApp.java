package com.seveneleven.trainconsistmanagement.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

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
        trainConsist.addFirst("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        System.out.println("Train Consist after adding bogies:");
        System.out.println(trainConsist + "\n");

        trainConsist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car at position 2:");
        System.out.println(trainConsist + "\n");

        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After removing first and last bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 operations completed successfully...\n");

        // UC5: Preserve Insertion Order with Uniqueness
        System.out.println("===========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies (LinkedHashSet)");
        System.out.println("===========================================\n");

        Set<String> trainFormation = new LinkedHashSet<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate ignored

        System.out.println("Final Train Formation (in insertion order):");
        System.out.println(trainFormation);

        System.out.println("\nUC5 operations completed successfully...\n");

        // UC6: Map Bogie to Capacity
        System.out.println("===========================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("===========================================\n");

        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " seats");
        }

        System.out.println("\nUC6 operations completed successfully...");
        System.out.println("===========================================");// UC7: Sort Bogies by Capacity
        System.out.println("===========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("===========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 operations completed successfully...\n");

        // UC8: Filter Passenger Bogies Using Streams
        System.out.println("===========================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("===========================================\n");

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        List<Bogie> highCapacityBogies = bogies.stream()
                                               .filter(b -> b.getCapacity() > 60)
                                               .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        highCapacityBogies.forEach(System.out::println);

        System.out.println("\nUC8 operations completed successfully...\n");

        // UC9: Group Bogies by Type
        System.out.println("===========================================");
        System.out.println("UC9 - Group Bogies by Type (Collectors.groupingBy)");
        System.out.println("===========================================\n");

        // Add some Goods bogies to the same list
        bogies.add(new Bogie("Cargo-1", "Goods", 100));
        bogies.add(new Bogie("Cargo-2", "Goods", 120));

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                                                       .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(System.out::println);
        });

        System.out.println("\nUC9 operations completed successfully...");
    }
}
