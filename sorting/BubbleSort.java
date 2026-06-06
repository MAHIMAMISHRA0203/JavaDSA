package sorting;

public class BubbleSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        int nums[]={23,7,0,1,4,6,78,3,8,90,2};
        for(int i:sort(nums))
        System.out.println(i);
    }
}
