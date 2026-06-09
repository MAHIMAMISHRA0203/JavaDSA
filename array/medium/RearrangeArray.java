package array.medium;

import java.util.ArrayList;

public class RearrangeArray {
    public static void bruteForce(int []arr){

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i:arr){
            if(i>0) pos.add(i);
            else neg.add(i);

        }
        for(int i=0;i<arr.length/2;i++) {
            System.out.print(pos.get(i) + " ");
            System.out.print(neg.get(i) + " ");

        }
        System.out.println();


    }
    public static void optimised(int arr[]){
        int neg=1;int pos=0;
        int n=arr.length;
        int ans []=new int [n];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;

            }else {
                ans[neg]=arr[i];
                neg+=2;
            }

        }
        for(int i:ans)
            System.out.print(i+" ");

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,-1,-2,-3};
        bruteForce(arr);
        optimised(arr);
    }
}
