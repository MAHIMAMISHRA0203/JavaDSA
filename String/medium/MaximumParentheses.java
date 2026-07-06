package String.medium;

public class MaximumParentheses {
    public static int calculate(String s) {
        int count=0;
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')
                count++;
            else if(ch==')')
                count--;
            max=Math.max(count,max);
        }

return max;
    }

    public static void main(String[] args) {
        System.out.println(calculate("(1)+((2))+(((3)))"));
    }
}
