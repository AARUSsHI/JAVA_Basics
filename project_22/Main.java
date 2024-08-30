// search element in an array
package project_22;

public class Main {
    public static void main(String[] args) {
        int[] myArray ={1,2,3,4,5};
        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == 3){
                System.out.println(i);
            }
        }
    }
}
