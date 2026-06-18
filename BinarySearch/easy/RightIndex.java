package BinarySearch.easy;

public class RightIndex {
    public static int index(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target)
                return i;
        }
return -1;

    }

    public static void main(String[] args) {
       int arr[] = {1,2,4,7};
       int x = 6  ;
        System.out.println(index(arr,x));


    }
}
