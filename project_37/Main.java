// sort in descending order
package project_37;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        System.out.println("Enter the length of the array: ");
        int len = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<len; i++){
            int element = input.nextInt();
            myArray.add(element);
        }
        Collections.sort(myArray);
        System.out.println("printing sorted array in descending order ");
        for(int i=(len-1); i>=0; i--){
            System.out.print(myArray.get(i) + " ");
        }
        input.close();
    }
}
