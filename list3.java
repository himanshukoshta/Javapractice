import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student1{
    int age;
    String name;
    int rollno;

    public Student1(int age,int rollno,String name)
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

class sortByName implements Comparator<Student1> {
    public int compare(Student1 a1,Student1 a2) {
        return a1.name.compareTo(a2.name);
    }
}

class sortByRoll implements Comparator<Student1> {
    public int compare(Student1 a1,Student1 a2) {
        return Integer.compare(a1.rollno,a2.rollno);
    }
}
public class list3 {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(20,55,"Babita"));
        list.add(new Student1(40,20,"Tarak"));
        list.add(new Student1(70,65,"Champak"));
        list.add(new Student1(50,45,"Jetha"));
        Collections.sort(list,new sortByName());
        for(Student1 s:list)
            System.out.println(s);
        System.out.println();
        Collections.sort(list,new sortByRoll());
        for(Student1 s:list)
            System.out.println(s);
    }
}
