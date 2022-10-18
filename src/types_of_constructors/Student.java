package types_of_constructors;

public class Student {
    int id;
    String name;
    int age;

    // Default constructor with no parameters
    Student() {
        System.out.println("This is default Constructor");
    }

    // Constructor Overloading

    // Parameterized Constructor
    // Constructor with parameters initialization with 'this' keyword
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Construcor with this keyword\n" + "id = " + id + "\nname = " + name);
    }

    // Parameterized Constructor
    // Constructor with parameters initialization without 'this' keyword
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        System.out.println("Parameterized Construcor without this keyword\n" + "id = " + id + "\nname = " + name
                + "\nage = " + age);
    }

    // Copy Constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
        age = s.age;
        System.out.println("Copy Contructor with object\n" + "id = " + id + "\nname = " + name
                + "\nage = " + age);
    }

    void display() {
        System.out.println("This is display function\nid =" + id + "\nname = " + name + "\nage =" + age);
    }

}
