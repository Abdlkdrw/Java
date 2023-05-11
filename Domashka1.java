/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.domashka1;

import java.util.Scanner;

/**
 *
 * @author Нурулла
 */
public class Domashka1 {

    public static void main(String[] args) {
        System.out.println("Practical task №1. Variant 1. Student Abdulkadyrov N.N. Group RIBO-02-21");
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите фигуру: 1)прямоугольник или 2)треугольник");
        int figure = scan.nextInt();
        switch(figure){
            case 1:
                System.out.print("Введите ширину прямоугольника: ");
                int width = scan.nextInt();
                System.out.print("Введите длину прямоугольника: ");
                int length = scan.nextInt();
                int area = width * length;
                int perimetr = (width + length) * 2;
                System.out.println("Площадь прямоугольника: " + area);
                System.out.println("Периметр прямоугольника: " + perimetr);
                break;
            case 2:
                System.out.print("Чему равна 1-я сторона треугольника: ");
                int side1 = scan.nextInt();
                System.out.print("Чему равна 2-я сторона треугольника: ");
                int side2 = scan.nextInt();
                System.out.print("Чему равна 3-я сторона треугольника: ");
                int side3 = scan.nextInt();
                System.out.print("Чему равна высота, падающая на 1-ю сторону треугольника: ");
                int height = scan.nextInt();
                int area1 = (side1 * height) * 1/2;
                int perimetr1 = side1 + side2 + side3;
                System.out.println("Площадь треугольника: " + area1);
                System.out.println("Периметр треугольника: " + perimetr1);
                break;
            default:
                System.out.println("Введите корректные значения!!!");
                return;
        }
    }
}
