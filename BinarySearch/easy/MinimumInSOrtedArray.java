package BinarySearch.easy;

public class MinimumInSOrtedArray {
    public static int min(int []arr) {
        int i=0;int j=arr.length-1;
        int idx=-1;
        int min=-1;
        while(i<j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] > arr[j]) {
                i = mid + 1;
            }
            else j=mid;

        }
        return arr[i];

    }
    public static void main(String[] args) {
        int arr []= {4,5,6,7,0,1,2,3};
        System.out.println(min(arr));

    }
}
