// Find the Largest of three Numbers
package project_07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        if(firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber + " is the largest number");
        }else if(secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber + " is the largest number");
        }else{
            System.out.println(thirdNumber + " is the largest number");
        }
        input.close();
    }
}
