package BitManipulaton;

public class CHeckIsPowerOfTwo {
    public static boolean find(int n) {

        return n>0 &&(n &(n-1))==0;


    }

    public static void main(String[] args) {
        System.out.println(find(8));
    }
}
