package cn.edu.ahtcm.bean;

public class TestCircle {
    public static void main(String[] args) {
        Circle c2 = new Circle();
        c2.r = 5.1;
        double area = c2.area();
        System.out.println("c2.area();" + area);
    }
}
