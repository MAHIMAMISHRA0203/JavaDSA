package String.medium;

import java.util.HashMap;
import java.util.HashSet;

public class CountNumberOfSubstrings {
    public static int count(String s,int k){
        int ans = 0;

        for(int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            for(int j = i; j < s.length(); j++) {

                set.add(s.charAt(j));

                if(set.size() == k)
                    ans++;

                if(set.size() > k)
                    break;
            }
        }

        return ans;
    }
    public static int optimal(String s,int k){
        int left=0;int ans=0;
        HashMap<Character,Integer>map=new HashMap<>() ;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()>k){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;


            }
            ans+=right-left+1;

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(count("pqpqs",2));
    }
}
