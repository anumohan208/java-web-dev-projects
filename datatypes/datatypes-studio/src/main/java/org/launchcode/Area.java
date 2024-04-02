package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter radius of the circle");
             radius = input.nextDouble();
        }while (radius<0);
        double area = Circle.getArea(radius);
        System.out.println("Area of the circle : " + area);
    }
}
