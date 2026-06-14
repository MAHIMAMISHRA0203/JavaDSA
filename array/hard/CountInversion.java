package array.hard;

public class CountInversion {
    public static int count(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }




        }
return count;

}

    public static void main(String[] args) {
      int  array[] = {5,4,3,2,1};
        System.out.println(count(array));
    }

}
