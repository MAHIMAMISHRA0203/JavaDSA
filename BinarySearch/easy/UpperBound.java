package BinarySearch.easy;

public class UpperBound {
    public static int find(int arr[],int low,int high,int target){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>target){
                ans=mid;
                high=mid-1;

            }
            else {
                low=mid+1;
            }


        }
        return ans;
    }

    public static void main(String[] args) {
        int  arr[] = {1,2,2,3};
        System.out.println(find(arr,0,arr.length-1,2));
    }
}
