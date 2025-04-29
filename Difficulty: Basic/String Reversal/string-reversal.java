//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                
System.out.println("~");
}
        }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String reverseString(String s) {
        // code here.
        int[] freq=new int[256];
        StringBuilder sb=new StringBuilder();
        for(int v=s.length()-1;v>=0;v--){
            char c=s.charAt(v);
            if(freq[c]==0&&c!=' '){
                sb.append(c);
                freq[c]=1;
            }
        }
        
        return sb.toString();
    }
}