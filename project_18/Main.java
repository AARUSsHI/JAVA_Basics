// insert a string into another string
package project_18;

public class Main {
    public static void main(String[] args) {
        String str = "GeeksGeeks";
        String finalStr = "";
        for(int i=0; i<str.length(); i++){
            if(i == 4){
                finalStr = finalStr.concat("for");
            }else{
                finalStr = finalStr.concat(str.charAt(i)+"");
            }
        }
        System.out.println(finalStr);
    }
}
