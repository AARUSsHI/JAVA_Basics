// replace a character at a specific index
package project_34;

public class Main {
     public static void main(String[] args) {
        String str = "This as text";
        String finalString = "";

        for(int i=0; i<str.length(); i++){
            if(i == 5){
                finalString = finalString.concat("i");
            }else{
                finalString = finalString.concat(str.charAt(i) + "");
            }
        }
        System.out.println(finalString);
     }    
}
