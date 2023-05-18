/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.domashka3;

import java.util.Scanner;

/**
 *
 * @author Нурулла
 */
public class Domashka3 {

    public static void main(String[] args) {
        System.out.println("Practica3 task №1. Variant 1. Student Abdulkadyrov N.N. Group RIBO-02-21");
        Scanner scan = new Scanner(System.in);
        Car car = new Car();
        System.out.print("Введите марку вашего автомобиля: ");
        String model = scan.next();
        car.setModel(model);
        System.out.print("Введите цвет вашего автомобиля: ");
        String color = scan.next();
        car.setColor(color);
        System.out.print("Введите год выпуска вашего автомобиля: ");
        int releaseYear = scan.nextInt();
        car.setReleaseYear(releaseYear);
        System.out.print("Введите пробег вашего автомобиля: ");
        int mileage = scan.nextInt();
        car.setMileage(mileage);
        System.out.println(car.toString());
        
        CarService cs = new CarService("Мосвка, Киевская улица");
        cs.modify(car);
        System.out.println(car.toString());
    }
}
