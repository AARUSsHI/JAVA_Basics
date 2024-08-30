// Swapping two numbers
package project_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The first number is: " + number1);
        System.out.println("The second number is: " + number2);
        input.close();
    }
}
