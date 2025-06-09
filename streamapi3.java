import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamapi3 {
    public static void main(String[] args) {
        List<Integer> aa = Arrays.asList(1,2,3,4,5);
        List<Integer> re=aa.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(re);
    }
}

class Streee{
    public static void main(String[] args) {
        List<String> pritam=Arrays.asList("Ram","Shyam","Lakshman","Sita");
        List<String> pyaare=pritam.stream()
                .filter(n->n.length()>3)
                .map(n->n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(pyaare);
    }
}

class sarkatta{
    public static void main(String[] args) {
        List<Integer> bandook=Arrays.asList(1,2,3,4,5);
        int me=bandook.stream()
                .filter(n->n%2!=0)
                .reduce(0,(a,b)->a+b);
        System.out.println(me);
    }
}

class gabbar{
    public static void main(String[] args) {
        List<String> na=Arrays.asList("Ram","Shyam","Lakshman","Sita");
        List<Integer> sambha=na.stream()
                .map(n->n.length())
                .collect(Collectors.toList());
        System.out.println(sambha);
    }
}

class laila{
    public static void main(String[] args) {
        List<Integer> basanti=Arrays.asList(999,1000,1500,1000,2000);
        int sum=basanti.stream().distinct().filter(n->n>1000).reduce(0,(l,k)->l+k);
        System.out.println(sum);
    }
}

class majnu{
    public static void main(String[] args) {
        List<String> nana=Arrays.asList("Ram","Shyam","Lakshman","Sita");
        String noo= nana.stream().filter(n -> n.length() > 4).collect(Collectors.joining(" "));
        System.out.println(noo);
    }
}

class tom{
    public static void main(String[] args) {
        List<Integer> oo=Arrays.asList(10,14,22,30);
        boolean rrr=oo.stream()
                .anyMatch(n->n%7==0);
                //.collect(Collectors.toList());
        System.out.println(rrr);
    }
}

class jerry{
    public static void main(String[] args) {
        List<Integer> baburao=Arrays.asList(1,2,3,4);
        int pro=baburao.stream().reduce(1,(s,e)->s*e);
        System.out.println(pro);
    }
}


