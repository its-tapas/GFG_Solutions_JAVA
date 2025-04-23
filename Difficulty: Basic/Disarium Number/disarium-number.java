//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isDisarium(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isDisarium(int n) {
        // code here
        int i=1,N=0,a=n;
        double sum=0;
        while(a>0){
            N=N*10+a%10;
            a=a/10;
        }
        int p=0;
        while(N>0){
            p=N%10;
            sum=sum+Math.pow(p,i);
            
            i++;
            N/=10;
        }
        if (sum==n) return 1;
        else return 0;
    }
};