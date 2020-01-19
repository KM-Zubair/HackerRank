
import java.util.*;



public class Solution {
	

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        char[] array = Integer.toBinaryString(n).toCharArray();
        
        int count = 0;
        int max =0;
        
        // 	0100110
        //	count 0, 1, 0, 0, 1, 1, 0
        //	max  1+1 = 2
        
        for (int i = 0; i < array.length; i++) {
        	if (array[i] == '1')
        		count++;
        	else count = 0;
        	
        	if(count > max) {
        		max = count;
        	}
        }
        
        System.out.println(max);
                    
        scanner.close();
    }
}





