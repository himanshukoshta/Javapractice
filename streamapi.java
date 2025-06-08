import java.util.*;
import java.util.stream.*;
public class streamapi {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(5,10,15,20,25);

        List<Integer> evenlist=list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(evenlist);
        List<Integer> oddlist=list.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println(oddlist);
    }
}

class istream{
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(2,3,5,8,7,10);

        List<Integer> loki=li.stream()
                .map(n->n*5)
                .collect(Collectors.toList());
        System.out.println(loki);
    }
}


class ostream{
    public static void main(String[] args) {
        List<Integer> lik=Arrays.asList(5,10,15,20,25);

        List<Integer> os=lik.stream()
                .filter(n->n%2!=0)
                .map(n->n*5)
                .collect(Collectors.toList());
        System.out.println(os);
    }
}