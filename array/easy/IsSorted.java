package array.easy;

public class IsSorted {
    public static boolean check(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                return false;

        }

   return true; }

    public static void main(String[] args) {
        int arr[]={1,7,4,9,2,3,45,0,10};
        System.out.println(check(arr));
    }
}
