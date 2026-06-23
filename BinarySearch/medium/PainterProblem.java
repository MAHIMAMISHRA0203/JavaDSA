package BinarySearch.medium;

import java.util.Arrays;

public class PainterProblem {
    public static boolean isOkay(int arr[],int mid,int students){
        int count=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];

            }
            else {
                pages=arr[i];
                count++;
            }
        }
        return (count<=students) ;

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
        int [] arr ={10, 20, 30, 40} ;
        int m = 2;
        int ans = pages(arr,  m);
        System.out.println("The answer is: " + ans);

    }
}
