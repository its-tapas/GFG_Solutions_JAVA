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

    void printTriangle(int N) {
    int iniS = 0;
    for(int i=0;i< N;i++){
          

          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          for(int j=1;j<=N-i;j++){
              System.out.print("*");
          }
          
          iniS+=2;
          
          System.out.println();
      }
      
      
      iniS = 2*N -2;
      for(int i=1;i<=N;i++){
          
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          
          iniS-=2;
          
          System.out.println();
      }
    }
}