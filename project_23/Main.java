// largest element in an array
package project_23;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] myArray = {2,3,4,5,6};
        Arrays.sort(myArray);
        int len = myArray.length;
        System.out.println(myArray[len-1]);
    }
}
