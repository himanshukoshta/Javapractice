import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }


    public int compareTo(Student o) {
        return this.age - o.age;
    }
    }

    class list2{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(15,"Ram"));
        list.add(new Student(10,"Mohit"));
        list.add(new Student(13,"Honey"));
        Collections.sort(list);
        for (Student o:list)
            System.out.println(o);
    }
}