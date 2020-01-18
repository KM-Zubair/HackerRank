import java.util.*;



public class Solution {
	
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String , Integer> method=  new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            String name1 = name.toLowerCase();
            int phone = in.nextInt();
            // Write code here    
            method.put(name1 , phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            
            // Write code here
            if (method.get(s) != null) 
            System.out.println(s + "=" +method.get(s));
            else 
            System.out.println("Not found");
        }
        
        in.close();
        method.clear();
    }
	
}
