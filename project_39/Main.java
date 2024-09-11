package project_39;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int len = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int[] myArray = new int[len];

        for(int i=0; i<len; i++){
            arrayList.add(input.nextInt());
        }

        for(int i=0; i<len; i++){
            myArray[i] = arrayList.get(i);
        }

        System.out.println(Arrays.toString(myArray));

        input.close();
    }
}
