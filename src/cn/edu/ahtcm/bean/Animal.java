package cn.edu.ahtcm.bean;

public class Animal {
    public String name;
    public String weight;
    public String color;



    public Animal(String name, String weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {
    }

    public void run() {
        System.out.println(" run fastly ");
    }

    public void run(String name) {
        System.out.println(name + " run fastly ");
    }

    public void eat() {
        System.out.println("I love bone");
    }

    public static void main(String[] args) {
        Animal a =
                new Animal("cat", "57kg", "green");
        System.out.println(" name " + a.name +
                " weight " + a.weight + " color " + a.color);
        a.run();
        a.eat();
        a.run(a.name);
//        System.out.println();
    }
}
