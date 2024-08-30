package project_31;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        System.out.println("Enter the size of the array:");
        int len = input.nextInt();
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<len;i++){
            int a = input.nextInt();
            myArray.add(a);
        }
        System.out.println("Printing the elements of the array:");
        for(int i=0; i<len; i++){
            System.out.print(myArray.get(i) + " ");
        }
        System.out.println();
        System.out.println("Length of Array :-"+myArray.size());
        input.close();
    }
}
