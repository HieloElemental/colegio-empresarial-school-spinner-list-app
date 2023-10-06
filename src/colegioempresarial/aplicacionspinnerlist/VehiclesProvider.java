/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioempresarial.aplicacionspinnerlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Maria Alejandro Escobar Castro
 * @grade 11C
 */

public class VehiclesProvider {
    private List<Vehicle> vehicles;
    private int nextId;
    
    public VehiclesProvider() {
        this.vehicles = new ArrayList<>();
        this.nextId = 1;
        initializeDefaultVehicles();
    }

    private void initializeDefaultVehicles() {
        addVehicle(new Vehicle(0, "Toyota", "Camry", 200, 25000));
        addVehicle(new Vehicle(0, "Honda", "Civic", 180, 22000));
    }
    
    public List<Vehicle> listVehicles(){
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicle.setId(nextId++);
        vehicles.add(vehicle);
    }

    public Vehicle getVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }
    
    public boolean setVehicleById(Vehicle vehicle) {
        for (Vehicle subVehicle: vehicles){
            if (subVehicle.getId() == vehicle.getId()){
                subVehicle.setBrand(vehicle.getBrand());
                subVehicle.setModel(vehicle.getModel());
                subVehicle.setHorsepower(vehicle.getHorsepower());
                subVehicle.setValue(vehicle.getValue());
                return true;
            }
        }
        return false;
    }

    public void removeVehicleById(int id) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
        }
    }
}
