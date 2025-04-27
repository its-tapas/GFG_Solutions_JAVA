//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int X = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minimalSum(N, X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minimalSum(int N, int X) {
        // code here
        int count=0;
        while(N>0){
            for(int i=11;i>=0;i--){
                int p=(int)Math.pow(X,i);
                if(p<=N){
                    N=N-p;
                    count++;break;
                }
            }
        }
        return count;
    }
}