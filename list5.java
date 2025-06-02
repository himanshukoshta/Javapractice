//sorting by the length of their names if the age is same without using comparator
import java.util.ArrayList;
import java.util.Collections;

class Sstudent implements Comparable<Sstudent>{
    int age;
    String name;

    public Sstudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }


    public int compareTo(Sstudent o) {
        if(this.age==o.age)
        {
            return this.name.length()-o.name.length();
        }
        else{
            return this.age - o.age;
        }
    }
}
class list5{
    public static void main(String[] args) {
        ArrayList<Sstudent> list=new ArrayList<>();
        list.add(new Sstudent(10,"Ram"));
        list.add(new Sstudent(10,"Mo"));
        list.add(new Sstudent(13,"Honey"));
        Collections.sort(list);
        for (Sstudent o:list)
            System.out.println(o);
    }
}