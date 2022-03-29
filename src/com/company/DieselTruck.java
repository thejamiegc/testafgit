package com.company;

public class DieselTruck extends DieselCar{
    public DieselTruck(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model,numberOfDoors, kmPrLitre,particleFilter);
    }

    @Override
    public String toString(){
        return  super.toString() + "\n does it have a particlefilter: " + super.hasParticleFilter() +"\n";
    }
}
