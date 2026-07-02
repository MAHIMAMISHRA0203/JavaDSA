package String.easy;

import java.util.*;

public class SortByFrequency {
    public static Set<Character> find(String s) {
        int alpha[]=new int[26];
        for(char ch:s.toCharArray()){
            alpha[ch-'a']++;
        }
        List<int[]>list=new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if(alpha[i]>0){
                list.add(new int[]{i,alpha[i]});
            }

        }
        list.sort((a,b)->b[1]-a[1]);
        StringBuilder str=new StringBuilder();
        for(int i[]:list){
            while(i[1]-->0){
                str.append((char)(i[0]+'a'));
            }
        }
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }

return set;

    }

    public static void main(String[] args) {
        System.out.println(find("tree"));


    }
}
