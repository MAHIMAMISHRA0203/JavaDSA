package String.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String prefix(String nums[]) {
        Arrays.sort(nums);
        String s=nums[0];
        String l=nums[nums.length-1];
        String res="";
        for(int i=0;i<Math.min(s.length(),l.length());i++) {
            if(s.charAt(i)!=l.charAt(i)){
                return res;
            }
            res+=s.charAt(i);




        }
return   res;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(prefix(input));
    }
}
