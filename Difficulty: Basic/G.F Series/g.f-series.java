//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {

    static void gfSeries(int N) {
        long a=0,b=1;
        // code here

        System.out.print(a+" "+b+" ");
        ser(a,b,N-2);
    }
    
    static void ser(long a, long b,int n){
        if(n==0) {
            System.out.println();
            return;
        }
        long t3=(a*a)-b;
        System.out.print(t3+" ");
        ser(b,t3,n-1);
        
    }
    
}
