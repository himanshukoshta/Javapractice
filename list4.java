//sort by rollno in descending order using Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class goku{
    int age;
    int rollno;
    String name;

    public goku(int age,int rollno,String name)
    {
        this.age=age;
        this.rollno=rollno;
        this.name=name;
    }

    public String toString()
    {
        return age+" "+rollno+" "+name;
    }
}
class sortByRollno implements Comparator<goku> {
    public int compare(goku a1,goku a2) {
        return Integer.compare(a2.rollno,a1.rollno);
    }
}
public class list4 {
    public static void main(String[] args) {
        ArrayList<goku> list = new ArrayList<>();
        list.add(new goku(20, 55, "Iyer"));
        list.add(new goku(40, 20, "Daya"));
        list.add(new goku(70, 65, "Bhide"));
        list.add(new goku(50, 45, "Popat"));
        Collections.sort(list,new sortByRollno());
        for(goku g:list)
            System.out.println(g);
    }
}