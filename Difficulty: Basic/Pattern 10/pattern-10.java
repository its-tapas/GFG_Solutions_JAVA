//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        for (int i=0;i<2*n-1;i++){
            int flag=i+1;
            
            if(i>=n) flag=2*n-1-i;
            
            for(int j=0;j<flag;j++){
            System.out.print("* ");
            }
            
            System.out.println();
            
            
        }
        // code here
    }
}