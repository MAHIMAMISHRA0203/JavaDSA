package BitManipulaton;

public class SetRightMostBit {
    public static int find(int n) {

        return n|(n+1);


    }

    public static void main(String[] args) {
        System.out.println(find(8));
    }
}
