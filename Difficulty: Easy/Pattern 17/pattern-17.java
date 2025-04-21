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
        int s=n-i-1;
        for (int k=0;k<s;k++){
            
        System.out.print(" ");
        }
        char ch='A';
        for(char j=0;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        ch--;
        ch--;
        for(int k=i;k>0;k--){
            System.out.print(ch);
            ch--;
        }
        System.out.println();
    }
    }
}