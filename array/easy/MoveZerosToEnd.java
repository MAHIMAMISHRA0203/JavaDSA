package array.easy;

import java.util.Arrays;

import static java.util.Collections.swap;

public class MoveZerosToEnd {
    public static void bruteForce(int arr[]){
      int nums[]=new int [arr.length];
        Arrays.fill(nums,0);
        int j=0;
        for(int i:arr)
            if(i!=0)
                nums[j++]=i;
        for(int i:nums)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void optimised(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 ){
               int temp=arr[i];
                arr[i]=arr[j];
                 arr[j]=temp;
                 j++;
            }

        }
        for(int i:arr)
            System.out.print(i+" ");


    }
    public static void main(String args[]){
        int arr[]={0,1,0,2,0,3,4,5,0,6,7,8,0};

        bruteForce(arr);
        optimised(arr);
    }
}
