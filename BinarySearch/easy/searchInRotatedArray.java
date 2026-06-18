package BinarySearch.easy;

public class searchInRotatedArray {
    public static int  search(int arr[],int target)
    {
        int i=0;int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[i]<=arr[mid]){
                if(arr[i]<=target && arr[mid]>target){
                    j=mid-1;
                }
             else i=mid-1;

            }
            else
                if(arr[mid]<target && arr[j]>=target)
                    i=mid+1;
                else   j=mid-1;
        }
        return idx;


    }

    public static void main(String[] args) {
       int[] nums = {4, 5, 6, 7, 0, 1, 2};int k = 0;
        System.out.println(search(nums,k));
    }
}
