
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer> arr = new ArrayList<>();
        int giveA = 0;
        int giveB = 0;
        int j;
        
        for ( j = 0 ; j < a.size() ; j++) {
            if (a.get(j) > b.get(j))
                giveA++;
            else if (b.get(j) > a.get(j))
                giveB++;
                     
        }
        
        arr.add(giveA);
        arr.add(giveB);
        
        
        
        return arr;
    }

    public static void main(String[] args) throws IOException {
        
        
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            // I've used BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(("G:/code.txt")));
            // in my computer instead of the next line 
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
            
            
            String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a.add(aItem);
            }

            String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int bItem = Integer.parseInt(bItems[i]);
                b.add(bItem);
            }

            List<Integer> result = compareTriplets(a, b);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
            
           System.out.println(result);
            
            bufferedReader.close();
            bufferedWriter.close();
            
            
        }
        catch (NullPointerException e) {
            System.out.println("Error finding data from the file ");
        }
        
        
        
    }
}





