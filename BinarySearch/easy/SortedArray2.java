package BinarySearch.easy;

public class SortedArray2 {
    public static boolean search(int arr[],int target) {
        int i=0;int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[i]<=arr[mid]){
                if(arr[i]==arr[mid] && arr[mid]==arr[j]){
                    i++;
                    j--;
                    continue;
                }
                if(arr[i]<=target && arr[mid]>target){
                    j=mid-1;
                }
                else i=mid+1;

            }
            else
            if(arr[mid]<target && arr[j]>=target)
                i=mid+1;
            else   j=mid-1;
        }
        return false;



    }

    public static void main(String[] args) {
       int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6} ;int  k = 10;
        System.out.println(search(arr,k));
    }

}
