import javax.crypto.spec.PSource;
import java.util.Scanner;
public class classpractice {
    public static void main(String[] args) {
        cars obi=new cars();
        obi.info();
        student1 bj=new student1();
        bj.infor();
        rect bi=new rect();
        bi.area();
        bi.peri();
    }
}
class cars{
    String brandi="Toyota";
    String model="Velfire";
    String price="1.5cr";
    void info()
    {
        System.out.println(brandi+" "+model+" "+price);
    }
}

class student1{
    String name="Abhinav";
    String rollnumber="1008";
    Float marks=(float)73.5;
    String name1="Nav";
    String rollnumber1="1018";
    Float marks1=(float)73;
    String name2="Sank";
    String rollnumber2="1004";
    Float marks2=(float)71.5;
    void infor()
    {
       System.out.println(name+" "+rollnumber+" "+marks);
       System.out.println(name1+" "+rollnumber1+" "+marks1);
        System.out.println(name2+" "+rollnumber2+" "+marks2);
    }
}

class rect{
    float length=(float) 5.5;
    float breadth=(float) 4.5;
    void area()
    {
        System.out.println(length*breadth);
    }
    void peri()
    {
        System.out.println(2*(length+breadth));
    }
}
class bank{
    Scanner se=new Scanner(System.in);
    int accno= se.nextInt();
    String accholdername= se.next();
    int balance= se.nextInt();
    void inform()
    {
        System.out.println(accno);
        System.out.println(accholdername);
        System.out.println(balance);
    }
    void deposit()
    {
        int y=0,s=0,asw=0;
        System.out.println("Press 1 to deposit:");
        s= se.nextInt();
        System.out.println("Enter amount to deposit: ");
        asw= se.nextInt();
        if(s==1)
        {
            y=balance+s;
            System.out.println(y);
        }
        else
            System.out.println("Thank you");
    }
    void withdraw()
    {
    int sw=0;
        int w=0;
        int yt=0;
        System.out.println("Press 0 to withdraw: ");
        sw=se.nextInt();
        if (sw != 0) {
           // break;
        } else
        {
            System.out.println("Enter amount to withdraw: ");
            w=se.nextInt();
            yt=balance-w;
            System.out.println(yt);
        }
        }
    }
    class okkk{
        public static void main(String[] args) {
            bank gh=new bank();
            gh.inform();
            gh.deposit();
            gh.withdraw();
        }
    }


