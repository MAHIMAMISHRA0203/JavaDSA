package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static  void merge(int arr[], int low,int high){
        if(low>=high )
            return;
        int mid=(high+low)/2;
        merge( arr, low, mid);
        merge( arr, mid+1, high);
        sort(arr,low,mid,high);



    }
    public static void sort(int arr [], int low ,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> temp=new ArrayList<>();
        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);


    }

    public static void main(String args[]){
        int nums[]={23,7,0,1,4,6,78,3,8,90,2};
        merge(nums,0,nums.length-1);
        for(int i:nums)
            System.out.println(i);
    }
}
