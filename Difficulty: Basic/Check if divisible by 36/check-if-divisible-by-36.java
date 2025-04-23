//{ Driver Code Starts
//Initial Template for Java
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
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkDivisible36(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkDivisible36(String num){
        // code here
        int l = num.length();
        if (l == 0)
            return 0;
      
        if (l == 1 && num.charAt(0) != '0')
            return 0;
      
        // number formed by the last 2 digits
        int two_digit_num = (num.charAt(l-2) - '0')*10 +
                            (num.charAt(l-1) - '0') ;
      
        // if number is not divisible by 4
        if (two_digit_num%4 != 0)
            return 0;
      
        // number is divisible by 4 calculate sum of digits
        int sum = 0;
        for (int i=0; i<l; i++)
            sum += (num.charAt(i) - '0');
      
        // sum of digits is not divisible by 9
        if (sum%9 != 0)
            return 0;
      
        // number is divisible by 4 and 9
        // hence, number is divisible by 36
        return 1;
    }
    
}