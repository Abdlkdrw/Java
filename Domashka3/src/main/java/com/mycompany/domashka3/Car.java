/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domashka3;

/**
 *
 * @author Нурулла
 */
public class Car {
    private String model;
    private int releaseYear;
    private int mileage;
    private String color;
    
    public void setModel(String model){  //Сеттер для марки авто
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    
    public void setColor(String color){       //Сеттер для цвета авто
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    
    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }
    
    @Override
    public String toString(){
        return "{ Модель машины: " + getModel() + 
                ", год выпуска: " + getReleaseYear() + 
                ", пробег: " + getMileage() + 
                ", цвет: " + getColor() + "}";
    }
    
    
}
