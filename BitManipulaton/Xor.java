package BitManipulaton;

public class Xor {
    public static int cal(int n,int m) {
        int ans=0;
        for(int i=n;i<=m;i++){
            ans=ans^i;
        }

return ans;
    }
    public static int cal2(int n,int m) {

        return xorTilln(n-1)^xorTilln(m);
    }
    public static int xorTilln(int n){
        if(n%4==0)return n;
        if(n%4==1)return 1;
        if(n%4==2)return n+1;
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(cal(3,5));
        System.out.println(cal2(3,5));
    }
}
