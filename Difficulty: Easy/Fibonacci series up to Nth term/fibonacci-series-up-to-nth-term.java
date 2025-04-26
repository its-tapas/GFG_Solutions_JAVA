//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
        if (n == 0) {
            return new int[]{0};
        }
        if (n == 1) {
            return new int[]{0, 1};
        }
        int mod = 1000000007;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % mod;
        }

        return fib;
        
    }
        
        /* Method 2- Recursive Approach
        {
        int s[]=new int[n+1];
        s[0]=0;
        for (int i=1;i<=n;i++){
            s[i]=fib(i);
        }
        return s;
        }
    public int fib(int n){
        
        if(n==2 || n==1) return 1;
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    */
    
}