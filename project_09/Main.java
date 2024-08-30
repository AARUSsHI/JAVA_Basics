// calculator problem

package project_09;
import java.util.Scanner;
public class Main {

    public double addition(double num1, double num2){
        return num1+num2;
    }

    public double subtraction(double num1, double num2){
        return num1-num2;
    }

    public double multiplication(double num1, double num2){
        return num1*num2;
    }

    public double division(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        int choice = input.nextInt();

        Main myobj = new Main();

        if(choice == 1){
            double sum = myobj.addition(num1, num2);
            System.out.println(sum);
        }
        else if(choice == 2){
            double diff = myobj.subtraction(num1, num2);
            System.out.println(diff);
        }
        else if(choice == 3){
            double multi = myobj.multiplication(num1, num2);
            System.out.println(multi);
        }
        else if(choice == 4){
            double div = myobj.division(num1, num2);
            System.out.println(div);
        }else{
            System.out.println("Invalid Choice");
        }
        input.close();
    }

}
