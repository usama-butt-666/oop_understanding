package object_and_classes;

// Java Program to illustrate how to define a
// class and fields
// Defining a Student class.
class Student {
    // defining fields
    int id;// field or data member or instance variable
    String name;

    void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}
