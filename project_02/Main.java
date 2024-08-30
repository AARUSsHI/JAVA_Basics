// Multiplication oof two float numbers
package project_02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber*secondNumber);
        input.close();
    }
}
