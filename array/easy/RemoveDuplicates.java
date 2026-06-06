package array.easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static   int remove(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
                arr[idx++] = i;
            }

        }            return idx;

    }

    public static void main(String args[]) {
        int arr[] = {1, 1, 9, 1, 2, 3, 4, 6, 6, 1, 3};

      int idx=  remove(arr);
            for(int i=0;i<idx;i++)
                System.out.println(arr[i]);

    }
}
