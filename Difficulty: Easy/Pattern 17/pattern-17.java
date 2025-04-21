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
        // code here
    for (int i=0;i<n;i++){
        for (int k=0;k<n-i-1;k++){
        System.out.print(" ");
        }
        
        char ch='A';
        int breakpoint=(2*i+1)/2;
        
        for(int j=0;j<2*i+1;j++){
            System.out.print(ch);
            if (j<breakpoint) ch++;
            else ch--;
            
        }
        
        System.out.println();
    }
    }
}