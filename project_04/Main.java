// Number is odd or even
package project_04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number%2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        input.close();
    }
}
