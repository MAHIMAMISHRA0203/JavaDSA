package BinarySearch.easy;

public class FloorAndCeil {
    public static int ceil(int arr[],int x) {
        int low=0;int high=arr.length-1;
int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;
            }


            else low=mid+1;
        }

return ans;
    }
    public static int floor(int arr[],int x) {
        int low=0;int high=arr.length-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }


            else high=mid-1;
        }

        return ans;
    }

    public static void main(String[] args) {
       int arr[] ={3, 4, 4, 7, 8, 10}, x= 5;
        System.out.println(floor(arr,x)+" "+ceil(arr,x));
    }
}
