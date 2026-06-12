package array.hard;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
    public static void bruteForce(int arr[],int target){
        int n=arr.length;
        System.out.println("brute");

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
    public static void betterApproach(int arr[],int target){
        int n=arr.length;
;
        System.out.println("better");
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();

            for(int j=i+1;j<n;j++){
                int temp=target-(arr[i]+arr[j]);
                if(set.contains(temp)){
                    System.out.println(arr[i]+" "+arr[j]+" "+temp);
                }
                 set.add(arr[j]);


            }
        }
    }
    public static void optimalApproach(int arr[],int target) {
        int n = arr.length;
        System.out.println("optimised");

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + " " + arr[left] + " " + arr[right]);
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1])
                        left++;
                    while (left < right && arr[right] == arr[right + 1])
                        right--;}
              else if (sum < target)
                        left++;
                    else right--;
                }

            }





    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        int target=0;
        bruteForce(arr,target);
        betterApproach(arr,target);

        optimalApproach(arr,target);


    }
}
