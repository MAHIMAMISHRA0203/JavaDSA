package BinarySearch.medium;

import java.util.Arrays;

public class SplitArray {
    public static boolean isOkay(int arr[],int mid,int students){
        int sum=0;
        int div=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];

            }
            else {
                sum=arr[i];
                div++;
            }
        }
        return (div<=students) ;

    }
    public static int pages(int arr[],int k) {
        int low= Arrays.stream(arr).max().getAsInt();
        int high= Arrays.stream(arr).sum();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isOkay(arr,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }


        return ans ;

    }

    public static void main(String[] args) {
        int [] arr ={3,5,1};
        int m = 3;
        int ans = pages(arr,  m);
        System.out.println("The answer is: " + ans);

    }
}

