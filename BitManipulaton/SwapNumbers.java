package BitManipulaton;

public class SwapNumbers {
    public static void swapNums(int n,int m) {
        System.out.println(n+" "+m);

        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println(n+" "+m);

    }

    public static void main(String[] args) {
        swapNums(5,8);
    }
}
