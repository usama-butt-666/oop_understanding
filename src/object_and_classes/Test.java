package object_and_classes;

public class Test {
    public static void main(String args[]) {
        // Creating an object or instance
        Student s1 = new Student();

        s1.id = 1;
        System.out.println(s1.id);// accessing member through reference variable

        s1.name = "james";
        System.out.println(s1.name);

        s1.insertRecord(3, "mick");
        s1.displayInformation();
    }
}
