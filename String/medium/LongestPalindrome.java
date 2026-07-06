package String.medium;

public class LongestPalindrome {
    public static String longest(String s) {
        String temp="";
        String ans="";
        for(int i=0;i<s.length();i++){
             temp+=s.charAt(i);
             if(isPalindrome(temp) &&  temp.length()>ans.length()){
                 ans=temp;
             }
        }
        return ans ;


    }
    public static boolean isPalindrome(String s) {
         int i=0;int j=s.length()-1;
         while(i<=j){
             if(s.charAt(i)!=s.charAt(j))
                 return false;
             i++;
             j--;
         }
return true;
    }


    public static void main(String[] args) {
String s="babad";
        System.out.println(longest(s));
    }
}
