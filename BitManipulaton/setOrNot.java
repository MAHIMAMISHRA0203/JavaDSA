package BitManipulaton;

public class setOrNot {
    public static boolean check(int n,int i) {
        String binary="";
      int rem=0;
        while(n!=0){
            rem=n%2;
            binary+=rem;
            n=n/2;

        }
        if(binary.charAt(binary.length()-i-1)=='1')
            return true;
        return false;


    }
    public static boolean check2(int n,int i){
        return (n&(1<<i))!=0;
    }

    public static void main(String[] args) {
         int n=5;int i=0;
        System.out.println(check2(n,1));
    }
}
