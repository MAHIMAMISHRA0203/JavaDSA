package BinarySearch.medium;

public class NthRoot {

        public static int find(int n,int m) {
            int i=1;int j=m;
            int target=m;
            while(i<=j){
                int mid=i+(j-i)/2;
                int val=(int)Math.pow(mid,n);
                if(val==target){

                  return mid;
                }
                else if (val<m) i=mid+1;
                else j=mid-1;
            }

            return -1;
        }

        public static void main(String[] args) {
            int n=2,m=64;
            System.out.println(find(n,m));

        }


}
