package array.easy;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int arr[],int low,int high){
        if(low<high){
            int pivotIdx=quickSort(arr, low,high);
            sort(arr, low, pivotIdx-1);
            sort(arr, pivotIdx+1,high);
        }

    }
    public static int quickSort(int arr[],int low, int high){
        int pivot=arr[high];

        int j=low-1;
        for(int i=low;i<high;i++){

            if(arr[i]<=pivot){
                j++;
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
            }
        }
        int temp=arr[j+1];
        arr[j+1]=arr[high];
        arr[high]=temp;
        return j+1;
    }
    public static void main(String args[]){
        int arr[]={1,7,4,9,2,3,45,0,10};
        sort(arr,0,arr.length-1);
        for(int i:arr)
        System.out.println(i);
    }
}
