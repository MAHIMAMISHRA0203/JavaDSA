package sorting;

public class SelectionSort {
    public static int[] sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[min]>arr[j]){
                   min=j;
               }

           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
        }
        return arr;
    }
    public static void main(String args[]){
        int nums[]={23,7,0,1,4,6,78,3,8,90,2};
        for(int i:sort(nums))
            System.out.println(i);
    }
}
