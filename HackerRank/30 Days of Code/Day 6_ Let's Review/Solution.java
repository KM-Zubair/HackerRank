
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    static Scanner scan = new Scanner(System.in);
    static final int T = scan.nextInt(); 
    

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        char[][] ara = new char[T][];
        String name;
        for (int i= 0 ; i < T ; i++) {
            name = scan.next();
            ara[i] = name.toCharArray();
            for(int j = 0; j < name.length();j++) {
                if(j%2 == 0) {
                    System.out.print(ara[i][j]);
                }
                
            }
            System.out.print(" ");
            for(int j = 0; j < name.length();j++) {
                if(j%2 != 0) {
                    System.out.print(ara[i][j]);
                }
                
            }
            
            System.out.println();
            
        }
        
        
                
    
    }
}



