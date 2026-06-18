package BinarySearch.easy;

public class FindPeakElement {
    public static int peak(int []arr) {
        int i=0;int j=arr.length-1;
        int idx=-1;
        int min=-1;
        while(i<j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] <arr[mid+1]) {
                i = mid + 1;
            }
            else j=mid;

        }
        return i;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,5,1};
        System.out.println(peak(arr));

    }
}
