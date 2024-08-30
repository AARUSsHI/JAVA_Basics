// print the month of the year
package project_10;
import java.util.Scanner;
public class Main {

    public void month(int num){
        if(num == 1){
            System.out.println("Jan");
        }else if(num == 2){
            System.out.println("Feb");
        }else if(num == 3){
            System.out.println("March");
        }else if(num == 4){
            System.out.println("April");
        }else if(num == 5){
            System.out.println("May");
        }else if(num == 6){
            System.out.println("June");
        }else if(num == 7){
            System.out.println("July");
        }else if(num == 8){
            System.out.println("August");
        }else if(num == 9){
            System.out.println("Sep");
        }else if(num == 10){
            System.out.println("October");
        }else if(num == 11){
            System.out.println("November");
        }else if(num == 12){
            System.out.println("December");
        }else{
            System.out.println("Invalid Choice!!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Main obj = new Main();
        obj.month(num);
        input.close();
    }
}
