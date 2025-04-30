//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy4 (s));
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


// User function Template for Java

class Sol {
    int divisibleBy4(String N) {
        // Your Code Here
        int l=N.length();
        if (l==1){
            if((Integer.parseInt(N))%4==0) return 1;
            else return 0;
        }
        if (Integer.parseInt(N.substring(l-2))%4==0) return 1;
        else return 0;
    }
}