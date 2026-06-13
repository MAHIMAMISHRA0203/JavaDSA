package array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MergeOverlappingSubintervals {
    public static void brute(int arr[][]){
        Arrays.sort(arr,(a, b)-> a[0]-b[0]);
        HashMap<Integer,Integer>map=new HashMap<>();
      List  <List<Integer>> res=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];

        for(int i=1;i<arr.length;i++){
            List<Integer> list=new ArrayList<>();
            if(arr[i][0]<=end){
               end=Math.max(end,arr[i][1]);

            }
            else{
                map.put(start,end);
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        map.put(start,end);

for(int i:map.keySet())
    System.out.println(i+" "+map.get(i));


    }
    public static void optimal(int arr[][]){
        Arrays.sort(arr,(a, b)-> a[0]-b[0]);
        HashMap<Integer,Integer>map=new HashMap<>();
        List  <List<Integer>> res=new ArrayList<>();
      int i=0;int j=i+1;
      int n=arr.length;
        while(i<n){
            int start=arr[i][0];
            int end=arr[i][1];
            while(j<n && arr[j][0]<=end){
                end=Math.max(end,arr[j][1]);
                j++;
            }
            map.put(start,end);
            i=j;


      }

        for(int ii:map.keySet())
            System.out.println(ii+" "+map.get(ii));


    }

    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        brute(arr);
        optimal(arr);

    }
}
