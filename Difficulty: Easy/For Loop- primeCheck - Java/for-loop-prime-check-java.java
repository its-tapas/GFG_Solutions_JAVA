//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.isPrime(n);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends



class Solution {
    public static String isPrime(int n) {
        // code here
        if(n<2) return "No";
        for(int i=2;i<=Math.sqrt(n);i++) if (n%i==0) return "No";
        return "Yes";
    }
}
