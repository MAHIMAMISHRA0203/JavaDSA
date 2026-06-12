package array.hard;

import java.util.HashMap;

public class LongestSubArrayZero {
    public static int brute(int arr[]){
        int max=0;int len=0;int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0)
                max=i+1;
            else if(map.containsKey(sum))
                max=Math.max(max,i-map.get(sum));
            else map.put(sum,i);

       } return max;
       }

    public static void main(String[] args) {
        int arr[]={9, -3, 3, -1, 6, -5};
        System.out.println(brute(arr));
    }
}
