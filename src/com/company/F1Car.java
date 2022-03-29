package com.company;

public class F1Car extends AFuelCar{

    public F1Car(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    public String toString(){
        return "this is the new feature";
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
