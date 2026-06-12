package BinarySearch;

import java.util.Arrays;

public class easy {
    public static boolean search(int []arr,int target){
        int n=arr.length;
        int left=0;int right=n-1;
        while(left<=right){
            int mid=((right-left)+left)/2;
            if(arr[mid]==target)
                return true;
            else if(target>arr[mid])
                left=mid+1;
            else right=mid-1;
        }

return false;
    }

    public static void main(String[] args) {
      int []arr= {-1, 0, 3, 5, 9, 12};
      Arrays.sort(arr);
        System.out.println(search(arr,9));
    }
}
