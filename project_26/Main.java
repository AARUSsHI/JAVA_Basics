// Remove same elements from the array
package project_26;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] myArray = {2,3,5,4,6,7,4,1,4};
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == 4){
                myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
