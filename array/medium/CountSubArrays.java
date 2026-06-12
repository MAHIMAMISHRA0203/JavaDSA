package array.medium;

public class CountSubArrays {
    public static  int  count(int arr[],int k){
        int n=arr.length;
        int i=0;int j=0;
        int sum=0;
        int count=0;
        while(j<n){
            sum+=arr[j];
            while(sum>k){
                sum-=arr[i];
                i++;
            }
            if(sum==k){
                count++;
            }

j++;
        }
     return count;
    }

    public static void main(String[] args) {
        int arr[]={1};
        int k=0;
        System.out.println(count(arr,k));
    }
}
