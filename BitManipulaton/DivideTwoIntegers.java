package BitManipulaton;

public class DivideTwoIntegers{
    public static long divideOptimal(int n,int m) {

        if (m == 0)
            throw new ArithmeticException("Division by zero");
        if (n == Integer.MIN_VALUE && m == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = !((n >= 0 && m < 0) || (n < 0 && m >= 0));

        long dividend = Math.abs((long) n);
        long divisor = Math.abs((long) m);

        int quotient = 0;

        int res=0;
        while (dividend>divisor) {

            int shift = 0;

            while (dividend>=divisor<<(shift+1)) {
                shift++;
            }
            dividend-=divisor<<shift;
            quotient+=1<<shift;


        }

        if(sign)return -1*quotient;
        return quotient;

}
    public static int divideNaive(int n,int m) {
        if (m == 0)
            throw new ArithmeticException("Division by zero");
        if (n == Integer.MIN_VALUE && m == -1) {
            return Integer.MAX_VALUE;
        }
        boolean sign = !((n >= 0 && m < 0) || (n < 0 && m >= 0));

        long dividend = Math.abs((long) n);
        long divisor = Math.abs((long) m);

        int ans = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ans++;
        }

        return sign ? ans : -ans;

    }

public static void main(String[] args) {
        System.out.println(divideNaive(22,3));
    System.out.println(divideOptimal(10,3));

}
}
