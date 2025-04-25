//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.gcd(a, b);

            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int gcd(int a, int b) {
        // method 1: Euclidean Algorithm - Subtraction
        
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        while(a!=b){
            if(a>b) a = a-b;
            if(b>a) b = b-a;
            
        }
        return a;

        

        
    }
}

/*
Method 2: Simple
    {
        if (a==0) return b;
        if (b==0) return a;
        int r=Math.min(a,b);
        while(r>0){
            if(a%r==0 && b%r==0){
                break;
            }
            r--;
        }
        return r;
    }

*/
