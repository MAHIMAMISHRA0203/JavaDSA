package array.hard;

public class  MajorityElement2 {
    public static int major(int arr[]){
        int can1=0,can2=0,count1=0,count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==can1)
                count1++;
            else if(can2==arr[i])
                count2++;
            else if(count1==0){
                can1=arr[i];
                count1++;
            }
            else if(count2==0){
                can2=arr[i];
                count2++;
            }
            else {count1--;count2--;}

        }
        count1=0;count2=0;
        for(int num:arr){
            if(can1==num)
                count1++;
            else count2++;


        }
        if(count1>arr.length/3)
            return can1;
        else return can2;


    }

    public static void main(String[] args) {
        int arr[]={2,5,2,67,8,86,2,2,2,2};
        System.out.println(major(arr));
    }

}
