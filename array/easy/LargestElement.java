package array.easy;

public class LargestElement {
    public static int largest(int arr[]){
        int max=0;
        for(int i:arr)
                max=Math.max(i,max);
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,7,4,9,2,3,45,0,10};
        System.out.println(largest(arr));

    }
}
