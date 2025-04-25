//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        if (n == 0)
            return 1;
        int r=0,N=n;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        int ans=power(N,r); // calling the recursive method to find the power rasied ans
        return ans;
        
    }
    
    // Will find the power raised answer in INTEGER format using recursion
    public int power(int n,int x){ 
        if(x==0){
            return 1;
        }
        return n*power(n,x-1);
    }
}
