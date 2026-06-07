package array.easy;

public class ConsecutiveOnes {
    public static int check(int []arr){
        int len=0;
        int max=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==1){
              len++;
              max=Math.max(max,len);
          }
          else len=0;
      }

        return max; }

    public static void main(String[] args) {
        int arr[]={1, 0, 1, 1, 0, 1} ;
        System.out.println(check(arr));
    }
}
