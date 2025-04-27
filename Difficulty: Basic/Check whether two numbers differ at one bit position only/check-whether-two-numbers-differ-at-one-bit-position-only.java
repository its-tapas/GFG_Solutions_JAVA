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
            long a = sc.nextLong();
            long b = sc.nextLong();

            Solution ob = new Solution();
            System.out.println(ob.DifferOne(a, b));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static long DifferOne(long a, long b) {
        // complete the function here
        long c=a^b;
        boolean d= c!=0 && ((c & (c-1))==0);
        if (d==true) return 1;
        else return 0;
    }
}