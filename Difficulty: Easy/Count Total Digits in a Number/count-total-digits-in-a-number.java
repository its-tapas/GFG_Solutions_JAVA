//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver_class {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // taking testcases

        while (t-- > 0) {
            int n = sc.nextInt(); // taking number "n" as input
            System.out.println(
                new Solution().countDigits(n)); // prints the count of digits
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // complete the below function
    public static int countDigits(int n) {
        // add your code here
        if(n<0) return 0;
        else if(n<10) return 1;
        else return 1+countDigits(n/10);
    }
}
