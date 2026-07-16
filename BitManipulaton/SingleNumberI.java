package BitManipulaton;

public class SingleNumberI {
    public static int find(int nums[]) {
        int ans=0;
        for(int i:nums)
            ans^=i;
        return ans;


    }

    public static void main(String[] args) {
        int nums[]={2,1,2};
        System.out.println(find(nums));
    }
}
