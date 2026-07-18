package BitManipulaton;

import java.util.ArrayList;

public class PrimeFactors {
    public static void find(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        while((n&1)==0){
            arr.add(2);
            n=n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
                arr.add(i);
            n=n/i;
        }
        if(n>1)
            arr.add(n);
        for(int i:arr)
            System.out.println(i);

    }

    public static void main(String[] args) {
        int nums=7;
        find(nums);
    }

}
