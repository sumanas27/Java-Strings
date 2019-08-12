import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length()+B.length();
        System.out.println(length);

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String firstLetterA = A.substring(0,1).toUpperCase();
        String restLettersA = A.substring(1).toLowerCase();

        String firstLetterB = B.substring(0,1).toUpperCase();
        String restLettersB = B.substring(1).toLowerCase();
        System.out.println(firstLetterA + restLettersA + " " + firstLetterB + restLettersB);
        
    }
}



