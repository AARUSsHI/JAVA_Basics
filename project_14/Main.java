package project_14;
import java.util.Scanner;
public class Main {
    private double num1;
    private double num2;
    private int choice;
    public Main(double number1, double number2, int choice){
        this.num1 = number1;
        this.num2 = number2;
        this.choice = choice;
    }

    public void calculator(){
        switch(this.choice){
            case 1:
                System.out.println(this.num1 + this.num2);
                break;
            
            case 2:
                System.out.println(this.num1 - this.num2);
                break;
            
            case 3:
                System.out.println(this.num1 * this.num2);
                break;

            case 4:
                System.out.println(this.num1 / this.num2);
                break;
            default:
                System.out.println("Invalid!!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        int choice = input.nextInt();

        Main obj = new Main(num1, num2, choice);

        obj.calculator();

        input.close();
    }
}
