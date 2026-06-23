package String.easy;

public class removeOuterParentheses {
    public static String remove(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
      String  s = "((()))";
        System.out.println(remove(s));

    }
}
