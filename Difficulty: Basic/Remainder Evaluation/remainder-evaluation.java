//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.findRemainder(num1, num2);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int findRemainder(int n1, int n2) {
        // code here
        return n1%n2;
    }
}