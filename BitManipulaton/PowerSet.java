package BitManipulaton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {
    public static List<List<Integer>> set(int nums[]) {
        int n=nums.length;
        int subsets=1<<n;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<subsets;i++){
            List<Integer> list=new ArrayList<>();
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if((i &(1<<j))!=0){
                    list.add(nums[j]);
                }

            }
            ans.add(list);
        }

return ans;

    }

    public static void main(String[] args) {
        int nums[]={5,7,8};
        System.out.println(set(nums));
    }
}
