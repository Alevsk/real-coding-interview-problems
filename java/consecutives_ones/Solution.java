import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int max = 0;
        while(n > 0) {
            int reminder = n % 2;
            n = n / 2; 
            if(reminder == 1)
                count++;
            else
                count = 0;
            
            if(count > max)
                max = count;
        }

        System.out.println(max);
        
    }
}