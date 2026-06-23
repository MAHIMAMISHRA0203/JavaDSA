package String.easy;

public class ReverseWordsInAString {
    public static String reverse(String s) {
        String []arr=s.split(" ");
        String result="";
        for(int i=arr.length-1;i>=0;i--){
            result+=arr[i]+" ";
        }
return result;

    }

        public static String reverseWords(String s) {

            String[] arr = s.trim().split("\\s+");

            StringBuilder result = new StringBuilder();

            for (int i = arr.length - 1; i >= 0; i--) {
                result.append(arr[i]);

                if (i != 0) {
                    result.append(" ");
                }
            }

            return result.toString();
        }



    public static void main(String[] args) {
      String  s = "welcome to the jungle";
        System.out.println(reverse(s));
    }

}
