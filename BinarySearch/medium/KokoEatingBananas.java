package BinarySearch.medium;

import java.util.Arrays;

public class KokoEatingBananas {
    public static int findMin(int a[],int h){
        int i=1;
        int j= Arrays.stream(a).max().getAsInt();
int ans=-1;
        while(i<=j){
            int mid=(j+i)/2;
            if(calTime(a,mid)<=h){
                ans=mid;
                j=mid-1;

            }
            else i=mid+1;

        }
return ans;
    }
    public static long calTime(int a[],int speed){
        long time=0;
    for(int i:a){
         time+=(int)Math.ceil((double) i/speed);
    }
    return time;
    }
    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int h = 8;
        System.out.println(findMin(piles,h));
    }
}
