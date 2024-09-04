package project_35;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int arr = input.nextInt();
        System.out.println("Enter the size of array: ");
        int len = input.nextInt();
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<len; i++){
            int element = input.nextInt();
            myArray.add(element);
        }
        System.out.println("Printing array: ");
        for(int i=0; i<len; i++){
            System.out.print(myArray.get(i)+" ");
        }
        System.out.println();
        System.out.println(Collections.max(myArray));
        System.out.println(Collections.min(myArray));
        input.close();
    }
}
