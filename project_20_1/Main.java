package project_20_1;

public class Main {
    public static void main(String[] args) {
        String name = "My name is Aarushi";
        int len = name.length();
        System.out.println("Length of string :- " + len);
        System.out.println("Iteraring String");
        for(int i=0;i<len;i++){
            System.out.println(name.charAt(i));
        }
        String subString1 = name.substring(3);
        System.out.println(subString1);
        String subString2 = name.substring(3,7);
        System.out.println(subString2);
        System.out.println(name.charAt(9));
        int nameIndex = name.indexOf("name");
        System.out.println("Index of 'name' is: " + nameIndex);
        System.out.println(name.contains("My1"));

        String name1 = "Aarushi ";
        String realName = "Billi";
        System.out.println(name1.equals(realName));
        String fullName = name1.concat(realName);
        System.out.println(fullName);
        @SuppressWarnings("static-access")
        String joinedName = name1.join(",",name1,realName);
        System.out.println(joinedName);
        String replacedName = fullName.replace("Aarushi","Kali");
        System.out.println(replacedName);


    }

}
