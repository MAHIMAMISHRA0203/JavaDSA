package Recursion;//Sum of Numbers fro 1 to N

class SumOfN {
    public int NnumbersSum(int N) {
        //your code goes here
        if(N==0)return 0;
        return N+NnumbersSum(N-1);
        // return sum;
    }
}