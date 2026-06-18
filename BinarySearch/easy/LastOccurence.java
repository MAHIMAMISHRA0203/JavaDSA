package BinarySearch.easy;

public class LastOccurence {
    public static int find(int arr[],int target) {
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
int arr[]={3, 4, 13, 13, 13, 20, 40};
        System.out.println(find(arr,13));
    }
}
