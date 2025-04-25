//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.facDigits(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    public static double M_E = 2.71828182845904523536;
    public static double M_PI = 3.141592654;

    static int facDigits(int n) {
        
        // code here
        if (n < 0)
            return 0;

        // base case
        if (n <= 1)
            return 1;

        // Use Kamenetsky formula to calculate
        // the number of digits
        double x = (n * Math.log10(n / M_E) +
                    Math.log10(2 * M_PI * n) / 
                    2.0);

        int D= (int)Math.floor(x) + 1;
        return D;
    }
}
