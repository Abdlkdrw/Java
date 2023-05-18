/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domashka3;

/**
 *
 * @author Нурулла
 */
public class CarService {
    private String location;

    public CarService(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    
    
    public void modify(Car car){
        String newColor = car.getColor();
        newColor = newColor.toUpperCase();
        String newModel = car.getModel();
        newModel = newModel.replace("a", "o");
        newModel = newModel.replace("i", "e");
        newModel = newModel.toLowerCase();
        car.setColor(newColor);
        car.setModel(newModel);
    }
}
