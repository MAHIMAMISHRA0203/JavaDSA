package BinarySearch.easy;

public class LowerBound {
    public static int find(int arr[],int low,int high,int target){
      int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]>=target){
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
       int  arr[] = {3,5,8,15,19};
        System.out.println(find(arr,0,arr.length-1,9));
    }
}
