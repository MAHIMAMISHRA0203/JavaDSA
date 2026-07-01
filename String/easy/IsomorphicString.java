package String.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static boolean check(String s,String t) {
        Map<Character,Character> map=new HashMap<>();
        char [] tarr= t.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)!=tarr[i]) {
                return false;

            }else map.put(s.charAt(i),t.charAt(i));
        }

return true;
    }
    public static boolean check2(String s,String t) {
        int tarr[]=new int[256];
        int sarr[]=new int[256];



        for(int i=0;i<s.length();i++){
           if(sarr[s.charAt(i)]!=tarr[t.charAt(i)])
               return false;
           sarr[s.charAt(i)]=i+1;
           tarr[t.charAt(i)]=i+1;
        }

        return true;
    }


    public static void main(String[] args) {
     String   s = "paper", t = "timle";
        System.out.println(check(s,t));
    }
}
