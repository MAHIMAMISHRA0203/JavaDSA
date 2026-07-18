package BitManipulaton;

public class SingleNumberIII {
    public static void find(int nums[]){
        int xor=0;
        for(int i:nums)
            xor^=i;
        int temp=(xor&(xor-1))^xor;
        int g1=0;
        int g2=0;
        for(int i:nums){
            if((i&temp)!=0){
                g1^=i;
            }
            else g2^=i;

        }

        System.out.println(g1+" "+g2);
    }

    public static void main(String[] args) {
        int nums[]={1, 2, 1, 3, 5, 2};
        find(nums);
    }
}
