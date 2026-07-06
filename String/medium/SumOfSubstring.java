package String.medium;

import java.util.HashMap;

public class SumOfSubstring {
    public static int sum(String s){
        int beauty=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(char ch: map.keySet()){
                    max=Math.max(map.get(ch),max);
                    min=Math.min(map.get(ch),min);


                }
                beauty+=(max-min);


            }
        }
        return beauty;
    }


    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(sum(s));
    }
}
