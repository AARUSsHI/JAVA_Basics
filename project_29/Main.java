// add all numbers in an array
package project_29;
public class Main {
    public void addAllNumbers(int... arr){
        int len = arr.length;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.addAllNumbers(1,2,3,4,5,6,7);
    }
}
