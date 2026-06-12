package array.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void  triangle(int level){
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<level;i++){
            ArrayList<Integer> temp=new ArrayList<>();

            for(int j=0;j<i+1;j++){
                if(i==j ||j==0 ||i==0) {
                     temp.add(1);
                }
                else
                  temp.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j)) ;
            }
            arr.add(temp);
        }

        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
        public static List<List<Integer>> generate(int rows) {
            List<List<Integer>> list=new ArrayList<>();

            for(int i=0;i<rows;i++){
                int ans=1;
                List<Integer> temp=new ArrayList<>();
                for(int j=0;j<=i;j++){

                    temp.add(ans);
                    ans=(ans*(i-j))/(j+1);


                }
                list.add(temp);
            }
            return list;

        }

    public static void main(String[] args) {

        triangle(6);
        System.out.println(generate(6));
    }
}
