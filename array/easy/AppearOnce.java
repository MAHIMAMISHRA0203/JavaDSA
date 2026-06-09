package array.easy;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {
    public static int check(int []arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(int i:map.keySet())
            if(map.get(i)==1)
            return i;

        return -1; }
    public static int check2(int []arr){
int xor=0;
for(int i:arr){
xor=xor^i;
        }


        return xor; }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3};
        System.out.println(check(arr));
        System.out.println(check2(arr));

    }
}
