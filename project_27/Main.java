// copy all elements of one array to another array
package project_27;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,2,4,5,3};
        int[] newArray = new int[myArray.length];
        for(int i=0; i<myArray.length; i++){
            newArray[i] = myArray[i];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
