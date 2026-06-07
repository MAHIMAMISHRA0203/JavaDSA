package array.easy;

import java.util.Arrays;
import java.util.TreeMap;

public class MissingNumber {
    public static int missing(int arr[]){
Arrays.sort(arr);
int num=arr[0];
for(int i=0;i<arr.length;i++){
    if(num!=arr[i])
        return num;
    num++;
}return -1;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 5};
        System.out.println( missing(arr));
    }
}
