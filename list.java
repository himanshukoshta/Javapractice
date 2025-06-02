import java.util.ArrayList;
import java.util.Collections;

class list{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(99);
        list.add(69);
        list.add(89);
        list.add(59);
        list.add(49);
        list.add(79);
        Collections.sort(list);
        System.out.println(list);
    }
}

