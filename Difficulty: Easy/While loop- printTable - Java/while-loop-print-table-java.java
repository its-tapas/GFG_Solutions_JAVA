//{ Driver Code Starts
import java.util.Scanner;


// } Driver Code Ends

class Solution {
    public void calculateMultiples(int n) {
        // code here
        int i=10;
        while(i>0){
        
        System.out.print((i*n)+" ");
        i--;
        }
}
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Create an instance of Solution and call the method
        Solution solution = new Solution();
        solution.calculateMultiples(n);
    }
}

// } Driver Code Ends