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
        int flag=1;
        for (int i=0;i<n;i++){
            if(i%2!=0) flag=0;
            else flag=1;
            
            for (int j=0;j<=i;j++){
                System.out.print(flag+" ");
                flag=1-flag;
            }
                System.out.println();
            
        }
        // code here
    }
}