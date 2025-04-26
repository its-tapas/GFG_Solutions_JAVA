//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Iterate over the first half and for every index i,
        // swap arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    
}

/* Method 2: recursion time: O(n) Space O(n)

    {
        int n=arr.length;
        revar(arr,0,n-1);
    }
    public static void revar(int []arr,int l,int r){
        if(l>r) return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        revar(arr,l+1,r-1);
    }
    
*/

/* Method 3: Two pointer time O(n) space O(1)
        
        int l=0,r=arr.length-1;
        while(l<r){
            int temp=arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
        
*/
