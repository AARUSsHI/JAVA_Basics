// splitting array list into 2 halves

package project_36;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        System.out.println("Enter the length of array: ");
        int len = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<len; i++){
            int element = input.nextInt();
            myArr.add(element);
        }
        System.out.println("Printing the orignal array: ");
        for(int i=0; i<len; i++){
            System.out.print(myArr.get(i)+" ");
        }
        System.out.println();
        ArrayList<Integer> myArr1 = new ArrayList<Integer>();

        ArrayList<Integer> myArr2 = new ArrayList<Integer>();
        for(int i=0; i<(len/2); i++){
            int element = myArr.get(i);
            myArr1.add(element);
        }
        for(int i=(len/2); i<len; i++){
            int element = myArr.get(i);
            myArr2.add(element);
        }
        System.out.println("Printing fist sub array: ");
        for(int i=0; i<myArr1.size(); i++){
            System.out.print(myArr1.get(i)+ " ");
        }
        
        System.out.println();
        System.out.println("printing the second sub array: ");
        for(int i=0; i<myArr2.size(); i++){
            System.out.print(myArr2.get(i) + " ");
        }
        input.close();
    }
}
