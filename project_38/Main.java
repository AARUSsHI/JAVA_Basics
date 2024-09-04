// convert a list of string to comma separated strings
package project_38;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter the length of the array: ");
        int len = input.nextInt();

        System.out.println("Enter the words: ");
        for(int i=0; i<len; i++){
            String words = input.next();
            arr.add(words);  
        }
        String str = "";
        for(int i=0; i<len; i++){
            if(i == (len-1)){
                str = str.concat(arr.get(i) + "");
            }else{
                str = str.concat(arr.get(i) + ",");
            }
        }
        System.out.println("The final string is: ");
        System.out.println(str);
        input.close();
    }    
}
