package array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static String bruteForce(int []arr,int k){
        int sum=0;
  for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==k){
              return i+" "+j;
          }

      }
        }
  return "does not exist";
      }
    public static String betterApproach(int []arr,int k){
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com=k-arr[i];
            if(map.containsKey(com)){
                return "it exist";
            }
            else map.put(arr[i],0);
        }
        return "does not exist";
    }
    public static String optimalApproach(int []arr,int k){
int [][]nums=new int[arr.length][2];
for(int i=0;i<arr.length;i++){
    nums[i][0]=arr[i];
    nums[i][1]=i;
        }
Arrays.sort(nums,(a, b)->Integer.compare(a[0],b[0]));
int left=0;int right=arr.length-1;
while(left<right){
    int sum=nums[left][0]+nums[right][1];
    if(sum==k)
        return "it exist";
    else if(sum>k){
        right--;
    }
    else left++;
}
        return "does not exist";
    }




    public static void main(String[] args) {
        int arr[]={1,7,4,9,2,3,45,0,10};
        System.out.println(bruteForce(arr,5));
        System.out.println(betterApproach(arr,5));
        System.out.println(optimalApproach(arr,5));


    }
}
