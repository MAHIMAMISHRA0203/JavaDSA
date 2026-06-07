package array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class UnionOfTwoSortedArrays {
    public static void unionApproach1(int arr1[],int arr2[]){
        Set<Integer> result=new HashSet<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j] ){
                result.add(arr1[i]);
                i++;
            }
              else if(arr1[i]>arr2[j]) {
                 result.add(arr2[j]);
                 j++;
             }
              else {
                  result.add(arr1[i]);
                i++;
                j++;

            }
        }
        while(i<arr1.length ){
            if(!result.contains(arr1[i]) ){
                result.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length ){
            if(!result.contains(arr2[j]) ){
                result.add(arr2[j]);
            }
            j++;
        }
        for(int m:result)
            System.out.print(m+" ");
        System.out.println();

    }
    public static void unionApproach2(int arr1[],int arr2[]){
       TreeMap<Integer,Integer> map=new TreeMap<>();
       for(int i:arr1)
           map.put(i,map.getOrDefault(i,0)+1);
        for(int i:arr2)
            map.put(i,map.getOrDefault(i,0)+1);
       for(int i:map.keySet())
           System.out.print(i+" ");
        System.out.println();
    }
    public static void unionApproach3(int arr1[],int arr2[]){
Set <Integer > set=new HashSet<>();
          for(int i:arr1)
set.add(i);
          for(int i:arr2)
set.add(i);
          for(int i:set)
            System.out.print(i+" ");
    }


    public static void main(String args[]){
        int arr1[]= {1,2,3,4,5} ;
int arr2[]={2,3,4,4,5};
        unionApproach1(arr1,arr2);
        unionApproach2(arr1,arr2);
        unionApproach3(arr1,arr2);


    }
}
