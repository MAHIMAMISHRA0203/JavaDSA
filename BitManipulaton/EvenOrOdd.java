package BitManipulaton;

public class EvenOrOdd {
    public static boolean find(int n) {
        boolean ans=(n&1)==1;
        return ans;


    }

    public static void main(String[] args) {
        System.out.println(find(7));
    }
}
