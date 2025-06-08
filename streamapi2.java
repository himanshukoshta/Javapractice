import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamapi2 {
    public static void main(String[] args) {
        List<Integer> lop= Arrays.asList(5,10,15,20,25);
        int sum=lop.stream().reduce(100,(a,b)->a+b);
        System.out.println(sum);
    }
}


class stree{
    public static void main(String[] args) {
        List<Integer> woh=Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13);

        List<Integer> aa=woh.stream()
                .filter(n->n>2)
                .collect(Collectors.toList());
        System.out.println(aa);

        List<Integer> rahi=woh.stream()
                .filter(n->n%2==0)
                .map(n->n*5)
                .collect(Collectors.toList());
        System.out.println(rahi);

        int sums=rahi.stream().reduce(0,(c, d)->c+d);
        System.out.println(sums);
        int oo=woh.stream().reduce(5,(c, d)->c>d?c:d);
        System.out.println(oo);
        int stree=woh.stream().reduce(0,(c, d)->c<d?c:d);
        System.out.println(stree);
        

    }
}