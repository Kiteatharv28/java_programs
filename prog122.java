import java.util.*;
class TreeDemo {
    public static void main(String [] args){
        Set s=new TreeSet();
        s.add(10);
        s.add(3);
        s.add(18);
        s.add(57);
        s.add(91);
        s.add(10);

        System.out.println(s);
        s.remove(91);
        System.out.println(s);
        System.out.println(s.contains(3));
        System.out.println(s.contains(91));
       // s.clear();
        //System.out.println(s);
        System.out.println(s.size());
    }
}



