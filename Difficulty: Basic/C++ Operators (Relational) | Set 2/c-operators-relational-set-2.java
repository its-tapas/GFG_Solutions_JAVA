//{ Driver Code Starts
//Initial Template for Java
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
            String[] inp=read.readLine().split(" ");
            int A=Integer.parseInt(inp[0]);
            int B=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.compareNum(A,B));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String compareNum(int A, int B) {
        // code here
        if (A<B) return (A+" is less than "+B);
        else if(A==B) return (A+" is equals to "+B);
        else return (A+" is greater than "+B);
    }
}
