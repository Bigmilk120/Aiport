package com.airport.Models;

import org.springframework.data.annotation.Id;


public class Plane {
    @Id
    private
    int ID;
    private String brandName;
    private String model;
    private int fuelTank; //0 - empty, 100 - full
    private int passagersLimit;

    public Plane() {
    }

    public Plane(int ID, String brandName, String model, int fuelTank, int passagersLimit) {
        this.ID = ID;
        this.brandName = brandName;
        this.model = model;
        this.fuelTank = fuelTank;
        this.passagersLimit = passagersLimit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getPassagersLimit() {
        return passagersLimit;
    }

    public void setPassagersLimit(int passagersLimit) {
        this.passagersLimit = passagersLimit;
    }
}
