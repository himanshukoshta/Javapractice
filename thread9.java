import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class thread9 {
    public static void main(String[] args) {
        ArrayList<String> se=new ArrayList<>();
        se.add("rahul");
        se.add("ram");
        se.add("raj");
        se.add("aaj");
        se.add("ki");
        se.add("raat");
        Collections.sort(se, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        System.out.println(se);
    }
}


 class threadd9 {
    public static void main(String[] args) {
        ArrayList<String> se=new ArrayList<>();
        se.add("rahul");
        se.add("ram");
        se.add("raj");
        se.add("aaj");
        se.add("ki");
        se.add("raat");
        Collections.sort(se, (c,d)->c.compareTo(d));
        System.out.println(se);
    }
}
