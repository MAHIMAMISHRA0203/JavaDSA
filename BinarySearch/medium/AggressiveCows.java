package BinarySearch.medium;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canPlaced(int arr[],int mid,int k){
      int  count=1;
      int pastplace=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]-pastplace>=mid) {
               count++;
               pastplace=arr[i];
           }
       }
       if(count>=k)return true;
       else return false;

    }
    public static int cows(int arr[],int k) {
        Arrays.sort(arr);
        int low= Arrays.stream(arr).min().getAsInt();
        int high= Arrays.stream(arr).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canPlaced(arr,mid,k)){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }


return ans ;


    }

    public static void main(String[] args) {
        int arr[] = {0,3,4,7,10,9} ;
        int cows=4;
        System.out.println(cows(arr,cows));
    }
}
