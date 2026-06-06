package sorting;

public class BubbleSortRecursion {
    public static void sort(int arr[], int n){
        if(n==1)return;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        sort(arr,n-1);

    }
    public static void main(String args[]){
        int arr[]={23,7,0,1,4,6,78,3,8,90,2};
        sort(arr,arr.length-1);
        for(int i:arr)
            System.out.println(i);
    }
}
