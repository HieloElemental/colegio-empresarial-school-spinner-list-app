/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioempresarial.aplicacionspinnerlist;

/**
 *
 * @author Usuario
 */
public class Vehicle {
    private int id;
    private String brand;
    private String model;
    private int horsepower;
    private float value;
    
    public Vehicle(int id, String brand, String model, int horsepower, float value){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.value = value;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public int getHorsepower(){
        return horsepower;
    }
    
    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }
    
    public float getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}

