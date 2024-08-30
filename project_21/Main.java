package project_21;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int len = input.nextInt();
        int[] myArray = new int[len];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<len; i++){
            myArray[i] = input.nextInt();
        }
        System.out.println("Printing the elements of the array: ");
        for(int i=0; i<len; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));
        input.close();
    }
}
