// Sort an array in descending order
package project_24;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] myArray = {3,2,5,6,1};
        Arrays.sort(myArray);
        for(int i=(myArray.length-1); i>=0; i--){
            System.out.print(myArray[i] + " ");
        }
    }
}
