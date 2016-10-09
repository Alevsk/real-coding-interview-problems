import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            String word = sc.next();
            int length = word.length();
            String even = "";
            String odd = "";
            for(int j = 0; j < length; j++) {
               if(j % 2 == 0)
                even += word.charAt(j);
               else
                odd += word.charAt(j);
            }
            
            System.out.println(even + " " + odd);
        }
    }
}