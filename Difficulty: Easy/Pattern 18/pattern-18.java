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
        for (int i=0;i<n;i++){
            for (char j=(char)((int)('A'+n-1));j>=(char)((int)('A'+n-i-1));j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // code here
    }
}