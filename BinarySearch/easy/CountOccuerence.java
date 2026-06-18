package BinarySearch.easy;

public class CountOccuerence {
    public static int first(int arr[],int target) {
        int i=0;int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                idx=mid;
                j=mid-1;
            }
            else if(arr[mid]>target){
                j=mid-1;

            }
            else
                i=mid+1;
        }
        return idx;


    }
    public static int last(int arr[],int target) {

        int i=0;int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                idx=mid;
                i=mid+1;
            }
            else if(arr[mid]>target){
                j=mid-1;

            }
            else
                i=mid+1;
        }
        return idx;

    }

    public static void main(String[] args) {
      int arr[]=  {1, 1, 2, 2, 2, 2, 2, 3};
      int target=2;
        System.out.println(last(arr,target)-first(arr,target)+1);
    }
}
