// constructor overloading
package project_13;
import java.util.Scanner;
public class Main {  
    public Main(String name){
        System.out.println("My name is " + name);
    }

    public Main(String name, int age){
        System.out.println("My name is " + name + " and my age is " + age);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        @SuppressWarnings("unused")
        Main obj = new Main("Aarushi");
        @SuppressWarnings("unused")
        Main obj1 = new Main("Aarushi", 20);

        input.close();
    }
}
