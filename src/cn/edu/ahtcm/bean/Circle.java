package cn.edu.ahtcm.bean;

import java.util.Scanner;

public class Circle {
    public double r;

    public double area() {
        return Math.PI * r * r;
    }

    public double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double area = circle.area();
        System.out.println("circle.area()" + area);
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        double area1 = circle.area(v);
        scanner.close();
        System.out.println("circle.area(double r)" + area1);
    }
}
