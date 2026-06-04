package Recursion;

public class Nto1 {
    public void printNumbers(int n) {
        // Your code goes here
        if(n==0)return;
        printNumbers(n-1);
        System.out.println(n);
    }
}