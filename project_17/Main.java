// print even length words
package project_17;

public class Main {
    public static void main(String[] args) {
        String str = "This a large string";
        for(int i=0; i<str.length(); i++){
            if(i%2 != 0){
            System.out.println(str.charAt(i));
            }
        }
    }
}
