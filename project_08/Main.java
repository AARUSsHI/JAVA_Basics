// Find if a Given Year is a Leap Year
package project_08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredYear = input.nextInt();
        if(enteredYear%4 == 0 && enteredYear%400 == 0){
            System.out.println(enteredYear + " is a Leap Year");
        }else{
            System.out.println(enteredYear + " is not a Leap Year");
        }
        input.close();
    }
}
