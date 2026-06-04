package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HighestFrequency {

        public static int freq(int num[]){
            List<List<Integer>>list=new ArrayList<>();
            HashMap<Integer,Integer> map=new HashMap<>();

            for(int i=0;i<num.length;i++){
                map.put(num[i],map.getOrDefault(num[i],0)+1);

            }
            int max=0;
            int res=0;
            for(int i:map.keySet()){
               if(map.get(i)>max)
                   res=i;
                   max=map.get(i);
            }
            return res;
        }
        public static void main(String args[]){
            int num[]={2,5,2,7,1,3,1,2,2};

            System.out.println(freq(num));



        }



}
