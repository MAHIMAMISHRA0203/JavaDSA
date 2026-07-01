package String.easy;

public class LargestOddNumber {
    public static String find(String s) {
        int idx=-1;
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                idx=i;
                break;
            }
        }
        if(idx==-1)return "Not found";
        int i=0;
        while(i<=idx && s.charAt(i)=='0'){
            i++;

        }
        return s.substring(i,idx);



    }

    public static void main(String[] args) {
        String s="5347";
        System.out.println(find(s));
    }

}
