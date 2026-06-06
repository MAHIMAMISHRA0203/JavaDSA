package array.easy;

import java.util.Arrays;

public class SecondLargest {
    public static int largest(int arr[]){
       Arrays.sort(arr);
       return arr[arr.length-2];
    }
    public static void main(String args[]){
        int arr[]={1,7,4,9,2,3,45,0,10};
        System.out.println(largest(arr));
    }
}
