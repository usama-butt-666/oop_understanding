package types_of_constructors;

public class Test {

    public static void main(String args[]) {

        // default constructor
        Student s1 = new Student();
        s1.display();

        // Paramaertized constructor initialized with this keyword
        Student s2 = new Student(111, "sam");
        s2.display();

        // Paramaertized constructor initialized without this keyword
        Student s3 = new Student(111, "sam", 23);
        s3.display();

        // Paramaertized Copy constructor initialized with object
        Student s4 = new Student(s3);
        s4.display();

        // Copy values without Constructor
        System.out.println("This is Copy values without Constructor");
        s1.id = s3.id;
        s1.name = s3.name;
        s1.age = s3.age;
        s1.display();
    }

}
