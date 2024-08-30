// addition using constructor
package project_12;
import java.util.Scanner;
public class Main {
    
    private int num1;
    private int num2;
    public Main(int number1, int number2){
        this.num1 = number1;
        this.num2 = number2;
    }

    public int addition(){
        return this.num1 + this.num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        Main obj = new Main(num1, num2);
        System.out.println(obj.addition());
        input.close();
    }
}
