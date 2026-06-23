package BinarySearch.Hard;

public class MaximumOnes {

    public static int firstOne(int arr[]) {

        int low = 0;
        int high = arr.length - 1;

        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Returns row index with maximum number of 1s
    public static int fmaxOne(int arr[][]) {

        int minFirstOneIndex = Integer.MAX_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            int first = firstOne(arr[i]);

            if (first < minFirstOneIndex) {
                minFirstOneIndex = first;
                rowIndex = i;
            }
        }

        return rowIndex;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {0, 0, 1},
                {0, 0, 0}
        };

        System.out.println(
                "The row with maximum no. of 1's is: "
                        + fmaxOne(matrix)
        );
    }
}