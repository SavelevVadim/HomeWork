package lesson4;

public class Cat {
    private String name;
    private int age;
    private int weight;


    public Cat(String name, int age) {
        this(name, age,12);

    }

    public Cat(String name, int age,int weight) {
        this.name = name;
        this.age = age;
        this.weight= weight;
    }


}
