package types_of_variables;

public class Test {
    static int m = 100;// static variable

    static void method() {
        int n = 90;// local variable
        System.out.println("this is local variable " + n);
    }

    public static void main(String args[]) {
        int data = 50;// instance variable

        System.out.println("this is static variable " + m);
        method();
        System.out.println("this is instace varibale " + data);
    }

}
