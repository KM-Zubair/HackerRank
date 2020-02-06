
import java.util.*;


public class Solution {
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
        	arr[i] = scanner.nextInt();
        }
        
        for (int i = n -1; i >= 0 ; i--) {
        
        	System.out.print(arr[i]);
        	System.out.print(" ");
        	
        }
        scanner.close();
    }
}



