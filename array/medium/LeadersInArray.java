package array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.TreeSet;

public class LeadersInArray {
    public static ArrayList<Integer> leader(int arr[],int n){
        int max=-1;
       ArrayList<Integer> res=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max) {

                res.add(arr[i]);
                max=arr[i] ;

            }

        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int arr[]= {10, 22, 12, 3, 0, 6};
      ArrayList<Integer> list= leader(arr ,arr.length);
        System.out.println(list);
    }
}
