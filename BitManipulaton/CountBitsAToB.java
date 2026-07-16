package BitManipulaton;

public class CountBitsAToB {
    public static int count(int a ,int b) {
        int count=0;
        a=a^b;
       for(int i=0;i<32;i++){

               count+=(a&1);
               a=a>>1;
        }


return count;

    }

    public static void main(String[] args) {
        System.out.println(count(10,7));
    }
}
