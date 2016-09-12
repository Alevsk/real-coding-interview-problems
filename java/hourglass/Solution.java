/*

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
     /*
        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0
     */       

        int bigger = -9999;
        for(int i = 0;i < 6;i++) {
            
            int ip1 = i + 1;
            int ip2 = i + 2;
            
            if(ip1 > 5 || ip2 > 5)
                break;
            
            for(int j = 0;j < 6; j++) {
               
               int sum = 0;
               int jp1 = j+1;
               int jp2 = j+2;
                
               if(jp1 > 5 || jp2 > 5)
                break;
                
               sum += arr[i][j];
               sum += arr[i][jp1];
               sum += arr[i][jp2];
               sum += arr[ip1][jp1];
               sum += arr[ip2][j];
               sum += arr[ip2][jp1];
               sum += arr[ip2][jp2];
                
               if(sum >= bigger)
                   bigger = sum;
                
            }
        }
        
        System.out.print(bigger);
    }
}
