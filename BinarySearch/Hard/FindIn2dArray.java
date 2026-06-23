package BinarySearch.Hard;

public class FindIn2dArray {
    public static boolean search(int []arr,int target){
        int n=arr.length;
        int left=0;int right=n-1;
        while(left<=right){
            int mid=((right-left)+left)/2;
            if(arr[mid]==target)
                return true;
            else if(target>arr[mid])
                left=mid+1;
            else right=mid-1;
        }

        return false;
    }
    public static boolean find(int arr[][],int target) {
        boolean ans=false;

        for(int [] i:arr){
            int nums[]=i;

            if(nums[0]<=target &&nums[nums.length-1]>=target){
             if (search(nums,target))
                 return true;

            }}
            return ans;
        }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;

        int m = matrix[0].length;

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;

            else if (matrix[row][col] < target)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target=8;
        System.out.println(find(matrix,target));
        System.out.println(searchMatrix(matrix,target));
    }
}
