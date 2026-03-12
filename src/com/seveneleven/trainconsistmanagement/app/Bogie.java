package com.seveneleven.trainconsistmanagement.app;

import com.seveneleven.trainconsistmanagement.exception.InvalidCapacityException;

public class Bogie {
    private String name;
    private String type;
    private int capacity;

    // Constructor for Passenger bogies (defaults type)
    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity for bogie '" + name + "': " + capacity);
        }
        this.name = name;
        this.type = "Passenger";
        this.capacity = capacity;
    }

    // Constructor for explicit type (Passenger or Goods)
    public Bogie(String name, String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity for bogie '" + name + "': " + capacity);
        }
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return name + " (" + type + ") → " + capacity + " seats";
    }
}

