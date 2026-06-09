package array.medium;

import java.util.Arrays;

public class MajorityElement {
    public static int check(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        return arr[(n-1)/2];


     }
     public static int optimalApproach(int arr[]){
        int count=0;
        int candidate=0;
        for(int i:arr){
            if(count==0)
                candidate=i;
            if(i==candidate)
                count++;
            else count--;


        }
        return candidate;

    }

    public static void main(String[] args) {
        int arr[]={1,2,1,9,1,0,1,8,1};
        System.out.println(check(arr));
        System.out.println(optimalApproach(arr));

    }
}
