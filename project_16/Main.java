// compare 2 strings
package project_16;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();
        
        if(str1.equals(str2)){
            System.out.println("str1 == str2");
        }else{
            System.out.println("str1 != str2");
        }
        input.close();
    }
}
