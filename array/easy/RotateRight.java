package array.easy;

public class RotateRight {
    public static void rotate(int arr[],int n){
        int nums[]=new int [arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[(i-n+arr.length)%arr.length];
        }
        for(int i:nums)
            System.out.print(i+" ");
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};

        rotate(arr,5);
    }
}
