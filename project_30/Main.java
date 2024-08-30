// String Array
package project_30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        String[] myArr = new String[len];
        for(int i=0; i<len; i++){
            myArr[i] = input.next();
        }
        for (int i = 0; i < len; i++) {
            System.out.print(myArr[i] + " ");
        }
        input.close();
    }
}