package array.medium;

public class NextPermutation {
    public static void find(int arr[]){
        int n=arr.length;
        int breakPoint=-1;

        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                breakPoint=i-1;
                break;

            }
        }
        if(breakPoint==-1) {
            reverse(arr,0,n-1);
            print(arr);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[breakPoint]){
                swap(arr,i ,breakPoint);
                break;

            }
        }
        reverse(arr,breakPoint+1,n-1);

     print(arr);




    }
    public  static void print(int arr[]){
        for(int i:arr)
            System.out.print(i+" ");
    }


    public static int [] reverse(int arr[], int start,int end){
          while(start<end){
              swap( arr,start,end);
              start++;
              end--;
          }
          return arr;
    }
    public static int [] swap(int arr[],int idx1, int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
        return arr;

    }

    public static void main(String[] args) {
        int arr[]={3,2,1};
        find(arr);
       }}
