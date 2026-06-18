package BinarySearch.medium;

public class FindSqrt {
    public static int find(int n) {
        int i=1;int j=n/2;
        int target=n;
        int sqrt=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(mid*mid<=target){

                sqrt=mid;
                i=mid+1;
            }
           else j=mid-1;
        }

return sqrt;
    }

    public static void main(String[] args) {
        int n=100;
        System.out.println(find(n));

    }
}
