//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.factorSum(N));
                
System.out.println("~");
}
        }
}    
// } Driver Code Ends


// User function Template for Java
class Solution {
    public long factorSum(int N) {
        // code here.
        if(N==0) return 0;
        if(N==1) return 1;
        long s=0;
        int n= (int)Math.sqrt(N);
        for(int i=1;i<=n;i++){
            if(N%i==0){
                s+=i;
                if(i!=N/i) {s=s+N/i;}
            }
        }
        return s;
        
    }
}