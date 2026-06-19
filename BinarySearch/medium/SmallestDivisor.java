package BinarySearch.medium;

import java.util.Arrays;

public class SmallestDivisor {
    public static int bloom(int arr[],int m) {
        Arrays.sort(arr);
        int low=1;
        int high=arr[arr.length-1];
        int result=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(isPossible(arr,mid,m)){
                result=mid;
                high=mid-1;

            }
            else  low=mid+1;
        }

        return result;
    }
    public static boolean isPossible(int arr[],int mid,int k){
        int sum=0;
        for(int i:arr){
             sum+=Math.ceil((double)i/mid);

        }
        return sum<=k;

    }

    public static void main(String[] args) {
        int[] bloomDays =  {1,2,3,4,5};
        int k = 8;

        System.out.println(bloom(bloomDays,k));
    }
}
