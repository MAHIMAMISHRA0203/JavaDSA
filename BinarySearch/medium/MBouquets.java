package BinarySearch.medium;

import java.util.Arrays;

public class MBouquets {
    public static int bloom(int arr[],int m,int n) {
        int minDays= Arrays.stream(arr).min().getAsInt();
        int maxDays= Arrays.stream(arr).max().getAsInt();
        int low=minDays;
        int high=maxDays;
        int result=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(isPossible(arr,mid,n,m)){
                result=mid;
                high=mid-1;

            }
           else  low=mid+1;
        }

return result;
    }
    public static boolean isPossible(int arr[],int mid,int m,int k){
        int count=0;
        int bouquets=0;
        for(int i:arr){
            if(i<=mid){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }

            else count=0;
        }
        return bouquets>=m;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        System.out.println(bloom(bloomDays,k,m));
    }
}
