package com.seveneleven.trainconsistmanagement.app;

public class Bogie {
    private String name;
    private String type; // Passenger or Goods
    private int capacity;

    // Constructor for UC7/UC8 (defaults type to Passenger)
    public Bogie(String name, int capacity) {
        this.name = name;
        this.type = "Passenger"; // default type
        this.capacity = capacity;
    }

    // Constructor for UC9 (explicit type)
    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return name + " (" + type + ") → " + capacity + " units";
    }
}
