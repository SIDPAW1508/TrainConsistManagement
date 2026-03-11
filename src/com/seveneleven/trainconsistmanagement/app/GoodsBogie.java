package com.seveneleven.trainconsistmanagement.app;

public class GoodsBogie {
    private String shape;   // e.g., Cylindrical, Box
    private String cargo;   // e.g., Petroleum, Coal

    public GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    public String getShape() { return shape; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return shape + " bogie carrying " + cargo;
    }
}