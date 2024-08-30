// Merge two arrays
package project_25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] marks1 = {2,3,4};
        int[] marks2 = {1,6};
        int len1 = marks1.length;
        int len2 = marks2.length;
        int[] totalMarks = new int[len1+len2];

        for(int i=0; i<len1; i++){
            totalMarks[i] = marks1[i];
        }
        for(int i=0; i<len2; i++){
            totalMarks[i+len1] = marks2[i];
        }
        Arrays.sort(totalMarks);
        System.out.println(Arrays.toString(totalMarks));
    }
}
