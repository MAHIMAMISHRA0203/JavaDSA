package String.medium;

import java.util.*;

public class SortByFrequency {
    public static String find(String s) {
        int alpha[]=new int[128];
        for(char ch:s.toCharArray()){
            alpha[ch]++;
        }
        List<int[]>list=new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            if(alpha[i]>0){
                list.add(new int[]{i,alpha[i]});
            }

        }
        list.sort((a,b)->b[1]-a[1]);
        StringBuilder str=new StringBuilder();
        for(int i[]:list){
            while(i[1]-->0){
                str.append((char)(i[0]));
            }
        }
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }

return str.toString();

    }

    public static void main(String[] args) {
        System.out.println(find("pABBB"));


    }
}
