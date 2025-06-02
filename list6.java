//sorting by the length of their names if the age is same  using comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student101{
    int age;
    String name;
    int rollno;

    public Student101(int age,int rollno,String name)
    {
        this.age=age;
        this.rollno=rollno;
        this.name=name;
    }

    public String  toString()
    {
        return age+" "+rollno+" "+name;
    }
}


class sortByAge implements Comparator<Student101> {
    public int compare(Student101 a1,Student101 a2) {
        if (a1.age == a2.age) {
            return a2.name.compareTo(a1.name);
        } else {
            return Integer.compare(a2.age, a1.age);
        }
    }
}
public class list6 {
    public static void main(String[] args) {
        ArrayList<Student101> list=new ArrayList<>();
        list.add(new Student101(20,55,"Babita"));
        list.add(new Student101(50,65,"Champak"));
        list.add(new Student101(40,20,"Tarak"));
        list.add(new Student101(50,45,"Jetha"));

        Collections.sort(list,new sortByAge());
        for(Student101 s:list)
            System.out.println(s);
    }
}
