package array.easy;

public class LongestSubarrayWithKSum {


    public static int check(int []arr,int k){
        int sum=0;int len=0;int max=0;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            sum+=arr[i];
           while(sum>k){
               sum-=arr[j];
               j++;
           }
            if(sum==k){
                max=Math.max(max,i-j+1);
            }

        }

        return max; }


    public static void main(String[] args) {
        int arr[]={1,7,4,9,2,3,45,0,10};
        int k=11;
        System.out.println(check(arr,k));

    }
}
