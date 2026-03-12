package com.seveneleven.trainconsistmanagement.app;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.seveneleven.trainconsistmanagement.exception.CargoSafetyException;
import com.seveneleven.trainconsistmanagement.exception.InvalidCapacityException;
public class TrainConsistApp {
   public static void main(String[] args) {
       System.out.println("=== Train Consist Management App ===");
       // UC1: Initialize Train
       List<String> passengerBogies = new ArrayList<>();
       System.out.println("Initial bogie count: " + passengerBogies.size());
       System.out.println("Current Train Consist: " + passengerBogies);
       System.out.println("Train initialized successfully. Ready for operations!\n");

       // UC2
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

       // UC3
       System.out.println("===========================================");
       System.out.println("UC3 - Track Unique Bogie IDs (HashSet)");
       System.out.println("===========================================\n");
       Set<String> bogieIds = new HashSet<>();
       bogieIds.add("BG101");
       bogieIds.add("BG102");
       bogieIds.add("BG103");
       bogieIds.add("BG101");
       bogieIds.add("BG102");
       System.out.println("Final Bogie IDs (unique only): " + bogieIds);
       System.out.println("\nUC3 operations completed successfully...\n");

       // UC4
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

       // UC5
       System.out.println("===========================================");
       System.out.println("UC5 - Preserve Insertion Order of Bogies (LinkedHashSet)");
       System.out.println("===========================================\n");
       Set<String> trainFormation = new LinkedHashSet<>();
       trainFormation.add("Engine");
       trainFormation.add("Sleeper");
       trainFormation.add("Cargo");
       trainFormation.add("Guard");
       trainFormation.add("Sleeper");
       System.out.println("Final Train Formation (in insertion order):");
       System.out.println(trainFormation);
       System.out.println("\nUC5 operations completed successfully...\n");

       // UC6
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

       // UC7
       System.out.println("===========================================");
       System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
       System.out.println("===========================================\n");
       List<Bogie> bogies = new ArrayList<>();
       try {
           bogies.add(new Bogie("Sleeper", "Passenger", 72));
           bogies.add(new Bogie("AC Chair", "Passenger", 56));
           bogies.add(new Bogie("First Class", "Passenger", 24));
           bogies.add(new Bogie("Sleeper", "Passenger", 5));
       } catch (InvalidCapacityException e) {
           System.out.println("❌ Error: " + e.getMessage());
       }
       System.out.println("Before Sorting:");
       bogies.forEach(System.out::println);
       bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
       System.out.println("\nAfter Sorting by Capacity (Descending):");
       bogies.forEach(System.out::println);
       System.out.println("\nUC7 operations completed successfully...\n");
    // UC8

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


       // UC9

       System.out.println("===========================================");

       System.out.println("UC9 - Group Bogies by Type (Collectors.groupingBy)");

       System.out.println("===========================================\n");

       try {

           bogies.add(new Bogie("Cargo-1", "Goods", 100));

           bogies.add(new Bogie("Cargo-2", "Goods", 120));

       } catch (InvalidCapacityException e) {

           System.out.println(e.getMessage());

       }

       System.out.println("All Bogies:");

       bogies.forEach(System.out::println);

       Map<String, List<Bogie>> groupedBogies =

               bogies.stream().collect(Collectors.groupingBy(Bogie::getType));

       System.out.println("\nGrouped Bogies by Type:");

       groupedBogies.forEach((type, list) -> {

           System.out.println(type + ":");

           list.forEach(System.out::println);

       });

       System.out.println("\nUC9 operations completed successfully...");


       // UC10

       System.out.println("===========================================");

       System.out.println("UC10 - Count Total Seats in Train (reduce)");

       System.out.println("===========================================\n");

       int totalSeats = bogies.stream()

               .map(Bogie::getCapacity)

               .reduce(0, Integer::sum);

       System.out.println("Total Seating Capacity of Train: " + totalSeats + " seats");

       System.out.println("\nUC10 operations completed successfully...");


       // UC11

       System.out.println("===========================================");

       System.out.println("UC11 - Validate Train ID & Cargo Codes (Regex)");

       System.out.println("===========================================\n");

       String trainId1 = "TRN-1234";

       String trainId2 = "TRAIN12";

       String cargoCode1 = "PET-AB";

       String cargoCode2 = "PET-12";

       Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");

       Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

       validateInput(trainId1, trainIdPattern, "Train ID");

       validateInput(trainId2, trainIdPattern, "Train ID");

       validateInput(cargoCode1, cargoCodePattern, "Cargo Code");

       validateInput(cargoCode2, cargoCodePattern, "Cargo Code");

       System.out.println("\nUC11 operations completed successfully...");


       // UC12

       System.out.println("===========================================");

       System.out.println("UC12 - Safety Compliance Check for Goods Bogies");

       System.out.println("===========================================\n");

       List<GoodsBogie> goodsBogies = new ArrayList<>();

       goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

       goodsBogies.add(new GoodsBogie("Box", "Coal"));

       goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

       System.out.println("Goods Bogies:");

       goodsBogies.forEach(System.out::println);

       boolean isSafe = goodsBogies.stream()

               .allMatch(b -> !(b.getShape().equals("Cylindrical")
&& !b.getCargo().equals("Petroleum")));

       System.out.println("\nSafety Compliance Result:");

       if (isSafe) {

           System.out.println("✅ Train formation is SAFE.");

       } else {

           System.out.println("❌ Train formation is NOT SAFE. Invalid cargo assignment detected.");

       }

       System.out.println("\nUC12 operations completed successfully...");


       // UC13

       System.out.println("===========================================");

       System.out.println("UC13 - Performance Comparison (Loops vs Streams)");

       System.out.println("===========================================\n");

       List<Bogie> performanceBogies = new ArrayList<>();

       try {

           for (int i = 1; i <= 10000; i++) {

               performanceBogies.add(new Bogie("Bogie-" + i, i % 100 + 20));

           }

       } catch (InvalidCapacityException e) {

           System.out.println(e.getMessage());

       }

       long startLoop = System.nanoTime();

       List<Bogie> highCapacityLoop = new ArrayList<>();

       for (Bogie b : performanceBogies) {

           if (b.getCapacity() > 60) {

               highCapacityLoop.add(b);

           }

       }

       long endLoop = System.nanoTime();

       long loopDuration = endLoop - startLoop;

       long startStream = System.nanoTime();

       List<Bogie> highCapacityStream = performanceBogies.stream()

               .filter(b -> b.getCapacity() > 60)

               .collect(Collectors.toList());

       long endStream = System.nanoTime();

       long streamDuration = endStream - startStream;

       System.out.println("Loop-based filtering found " + highCapacityLoop.size() + " bogies.");

       System.out.println("Execution time (Loop): " + loopDuration + " ns");

       System.out.println("\nStream-based filtering found " + highCapacityStream.size() + " bogies.");

       System.out.println("Execution time (Stream): " + streamDuration + " ns");

       System.out.println("\nUC13 operations completed successfully...");


       // UC14

       System.out.println("===========================================");

       System.out.println("UC14 - Handle Invalid Bogie Capacity (Custom Exception)");

       System.out.println("===========================================\n");

       List<Bogie> bogiesException = new ArrayList<>();

       try {

           bogiesException.add(new Bogie("Sleeper", 72));

           bogiesException.add(new Bogie("AC Chair", 56));

           bogiesException.add(new Bogie("First Class", 0));

       } catch (InvalidCapacityException e) {

           System.out.println("❌ Error: " + e.getMessage());

       }

       System.out.println("\nFinal Bogie List:");

       bogiesException.forEach(System.out::println);

       System.out.println("\nUC14 operations completed successfully...");
    // UC15
       System.out.println("===========================================");
       System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
       System.out.println("===========================================\n");
       GoodsBogie goodsBogie = new GoodsBogie("Rectangular", "Coal");
       System.out.println("Initial Bogie State:");
       System.out.println(goodsBogie);
       try {
          System.out.println("\nAttempting to assign cargo: Petroleum");
          goodsBogie.assignCargo("Petroleum");
       } catch (CargoSafetyException e) {
          System.out.println("❌ Error: " + e.getMessage());
       } finally {
          System.out.println("Finalizing cargo assignment operation...");
       }
       System.out.println("\nFinal Bogie State:");
       System.out.println(goodsBogie);
       System.out.println("\nUC15 operations completed successfully...");
    // UC16
       System.out.println("===========================================");
       System.out.println("UC16 - Sort Passenger Bogies by Capacity (Bubble Sort)");
       System.out.println("===========================================\n");
       // Passenger bogie capacities
       int[] capacities = {72, 56, 24, 80, 60};
       System.out.println("Original Passenger Bogie Capacities:");
       for (int c : capacities) {
          System.out.print(c + " ");
       }
       System.out.println("\n");
       // Bubble Sort Algorithm
       for (int i = 0; i < capacities.length - 1; i++) {
          for (int j = 0; j < capacities.length - i - 1; j++) {
              if (capacities[j] > capacities[j + 1]) {
                  // swap
                  int temp = capacities[j];
                  capacities[j] = capacities[j + 1];
                  capacities[j + 1] = temp;
              }
          }
       }
       // Display sorted result
       System.out.println("Sorted Passenger Bogie Capacities:");
       for (int c : capacities) {
          System.out.print(c + " ");
       }
       System.out.println("\n\nUC16 operations completed successfully...");

   }


   private static void validateInput(String input, Pattern pattern, String label) {

       Matcher matcher = pattern.matcher(input);

       if (matcher.matches()) {

           System.out.println(label + " '" + input + "' is VALID.");

       } else {

           System.out.println(label + " '" + input + "' is INVALID.");

       }

   }
   

}
