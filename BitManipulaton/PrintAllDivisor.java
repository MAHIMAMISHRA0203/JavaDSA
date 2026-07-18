package BitManipulaton;

import java.util.ArrayList;

public class PrintAllDivisor {
    public static ArrayList<Integer> find(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                ans.add(i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int n=36;
        System.out.println(find(n));
    }
}
