package String.easy;

public class Rotation {
    public static boolean check(String s, String goal) {
if(s.length()!=goal.length())
    return false;
String r=s+s;
return r.contains(goal);



    }

    public static void main(String[] args) {
        System.out.println(check("rotation", "tionrota"));

    }
}
