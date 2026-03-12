package com.seveneleven.trainconsistmanagement.app;

import com.seveneleven.trainconsistmanagement.exception.CargoSafetyException;

public class GoodsBogie {

    private String shape;

    private String cargo;

    public GoodsBogie(String shape, String cargo) {

        this.shape = shape;

        this.cargo = cargo;

    }

    public String getShape() {

        return shape;

    }

    public String getCargo() {

        return cargo;

    }

    public void assignCargo(String cargo) {

        if (shape.equalsIgnoreCase("Rectangular") &&

                cargo.equalsIgnoreCase("Petroleum")) {

            throw new CargoSafetyException(

                    "Unsafe cargo assignment! Petroleum cannot be loaded in Rectangular bogies."

            );

        }

        this.cargo = cargo;

        System.out.println("Cargo assigned successfully → " + cargo);

    }

    @Override

    public String toString() {

        return shape + " bogie carrying " + cargo;

    }

}
 