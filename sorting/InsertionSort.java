package sorting;

public class InsertionSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
    public static void main(String args[]){
        int nums[]={23,7,0,1,4,6,78,3,8,90,2};
        for(int i:sort(nums))
            System.out.println(i);
    }
}
