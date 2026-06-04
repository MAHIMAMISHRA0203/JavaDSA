package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Frequency {

    public static List<List<Integer>> freq(int num[]){
        List<List<Integer>>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<num.length;i++){
           map.put(num[i],map.getOrDefault(num[i],0)+1);



        }
        for(int i:map.keySet()){
            List<Integer> l=new ArrayList<>();
            l.add(i);
            l.add(map.get(i));

            list.add(l);
        }
        return list;
    }
    public static void main(String args[]){
                int num[]={2,5,2,7,1,3,1};
                System.out.println(freq(num));



    }

}
