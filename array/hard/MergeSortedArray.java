package array.hard;

public class MergeSortedArray {

    public static void merge(int arr1[],int arr2[]){{
        int i=arr1.length-arr2.length-1;
        int j=arr1.length-1;
        int k=arr2.length-1;
        while(i>=0 &&k>=0){
            if(arr1[i]<arr2[k]){
                arr1[j]=arr2[k];
                k--;
            }
            else {
                arr1[j] = arr1[i];
                i--;
            }
            j--;
        }
        while (k >= 0) {
            arr1[j] = arr2[k];
            k--;
            j--;
        }
    }

for(int i:arr1)
    System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        merge(nums1,nums2);
    }
}
