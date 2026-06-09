package array.medium;

public class BuyAndSellStock {
    public static int bruteForce(int []arr){
        int profit=0;
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                profit=arr[j]-arr[i];

                max=Math.max(max,profit);
            }
        }

        return max;
    }
    public static int optimslApproach(int []arr){
        int profit=0;
        int max=0;
        int minPrice=arr[0];
        for(int i:arr){
            minPrice=Math.min(minPrice,i);
            profit=i-minPrice;
            max=Math.max(max,profit);
        }


        return max;
    }


    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(bruteForce(arr));
        System.out.println(optimslApproach(arr));

    }
}
