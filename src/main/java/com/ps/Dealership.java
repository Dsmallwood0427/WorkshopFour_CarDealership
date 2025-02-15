package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        this.inventory = new ArrayList<>();
    }

    public Dealership() {
        
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(int year){
        return null;
    }
    public List<Vehicle> getVehiclesByColor(String color){
        return null;
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }
    public List<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }
    public List<Vehicle> getAllVehicles(){
        return this.inventory;
    }
    public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> findByMakeModel(String rmMake, String rmModel) {
    }

    public List<Vehicle> listAllVehicles() {
    }

    public List<Vehicle> findByPriceRange(double minPrice, double maxPrice) {
    }

    public List<Vehicle> findByYear(int fYear) {
    }

    public List<Vehicle> findByColor(String fColor) {
    }

    public List<Vehicle> findByMileageRange(int minMileage, int maxMileage) {
    }
}