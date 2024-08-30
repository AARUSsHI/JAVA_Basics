package project_11;
import java.util.Scanner;
public class Main {

    public void table(int number){
        for(int i=1; i<=10; i++){
            System.out.println(number * i);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Main obj = new Main();
        obj.table(number);
        input.close();
    }
}
