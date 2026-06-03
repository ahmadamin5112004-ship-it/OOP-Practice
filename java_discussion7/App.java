package java_discussion7;


class Dog {
  
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Behavior methods
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void spin() {
        System.out.println(name + " is spinning.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");

        dog.bark();
        dog.spin();
        dog.run();
    }
}
