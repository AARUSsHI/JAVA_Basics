// pyramid * pattern
package project_20;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=(number-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=((i*2)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
