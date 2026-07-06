package String.medium;

import java.util.HashMap;
import java.util.Map;

public class NumberToRoman {
    public static int calculate(String n) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int ans=0;
        for(int i=0;i<n.length()-1;i++){
            if(roman.get(n.charAt(i))<roman.get(n.charAt(i+1))){
                ans-=roman.get(n.charAt(i));
            }
            else
                ans+=roman.get(n.charAt(i));
        }

return ans+roman.get(n.charAt(n.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(calculate("MCMXCIV"));
    }
}
