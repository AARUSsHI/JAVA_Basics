// print reverse string
package project_15;
public class Main {
    public static void main(String[] args) {
        String str = "Geeks";
        for(int i=(str.length()-1); i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
