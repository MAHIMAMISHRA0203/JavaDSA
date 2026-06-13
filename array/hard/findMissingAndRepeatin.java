package array.hard;

public class findMissingAndRepeatin {
    public static void find(int arr[]){
        int n=arr.length;
        int assumedSum=(n*(n+1))/2;
        int actualSum=0;
        int squareassumedSum=(n*(n+1)*(2*n+1))/6;
        int squareactualSum=0;
        for(int i:arr)
            squareactualSum+=i*i;
        for(int i:arr)
            actualSum+=i;
        int val1=actualSum-assumedSum;
        int val2=squareactualSum-squareassumedSum;
       val2= val2/val1;
        int x=(val2+val1)/2;
        int y=x-val1;
        System.out.println(x+" "+y);



    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        find(nums);
    }
}
