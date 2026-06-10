package array.medium;

public class Rotate90 {
    public static void rotate(int arr[][],int n){
        int res[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[j][n-1-i]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int arr[][]={{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        rotate(arr,arr.length);
    }
}
