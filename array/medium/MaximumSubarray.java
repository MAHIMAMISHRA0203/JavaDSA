package array.medium;

public class MaximumSubarray {
    public static int find(int []arr){
        int sum=0;int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0)
                sum=0;

        }

        return max;

        }

    public static void main(String[] args) {
        int arr[]={2, 3, 5, -2, 7, -4};
        System.out.println(find(arr));
    }
}

