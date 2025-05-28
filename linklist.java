import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class linklist {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        long start=System.nanoTime();
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.remove(0);
   //     arr.clear();

       System.out.println(arr);
       System.out.println(arr.contains(4));
        long end=System.nanoTime();
        System.out.println(end-start);
    }
}
//linkedSet
class io{
    public static void main(String[] args) {
        LinkedList<Integer> arrr = new LinkedList<>();
        for (int i=0;i<=50;i++)
        {
            arrr.add(i);
            System.out.print(arrr.get(i)+" ");
        }
    }
}
//hashset
class OK{
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println(set);
    }
}
//treeset
class oK{
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println(set);
    }
}
//first repeating element

class ko{
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        int[] arrer={1,2,4,3,6,77,7,8,77};
        for(int y:arrer)
        {
            if(set.contains(y))
            {
                System.out.println(y);
                break;
            }
            else {
                set.add(y);
            }
        }
    }
}

class kko{
    public static void main(String[] args) {
        int count=0;
        TreeSet<Integer> set=new TreeSet<>();
        int[] arrer={1,2,4,3,6,77,7,2,8,77,5,};
        for(int y:arrer)
        {
            if(set.contains(y))
            {
                System.out.println(y);
                count++;
                break;
            }
            else {
                set.add(y);
            }
        }
        System.out.println(count);
    }
}
