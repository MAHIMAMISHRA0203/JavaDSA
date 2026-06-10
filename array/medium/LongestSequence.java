package array.medium;

import java.lang.reflect.Array;
import java.util.*;

public class LongestSequence {
    public static   int seq(int []arr,int k){
        int len=1;
        int max=1;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<k;i++){
          set.add(arr[i]);
        }
        for(int i:set){
            if(set.contains(i-1)){
                len++;
            }
            else{
                len=1;
            }
            max=Math.max(max,len);
        }
        return max;
    }


    public static int approach2(int []arr,int k) {
        HashSet<Integer> set=new HashSet<>();
        int max=1;
        for(int i=0;i<k;i++){
            set.add(arr[i]);
        }
        for(int i:set)
        {
            if(set.contains(i+1)){
                int current=i;
                int len=1;
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
                max=Math.max(max,len);


            }
        }return max;

    }

    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(seq(arr,arr.length));
        System.out.println(approach2(arr,arr.length));




    }
}
