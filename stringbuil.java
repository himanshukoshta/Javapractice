import java.util.Scanner;
public class stringbuil {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder(10);
        str.append("hello hii byee");
        System.out.println(str.length());
        System.out.println(str.capacity());
        String str1="hello";
        System.out.println(str1.concat("hiiiiiiiiiiiiiiiiii"));
        System.out.println(str1);
    }
}
class we{
    static void sum()
    {
     int a=12;
     int b=45;
        System.out.println("Sum="+(a+b));
    }

    public static void main(String[] args) {
        sum();
    }
}
class sw{
    static void sum(int a)
    {
        int su=0;
        while(a>0)
        {
            int digit=a%10;
            su+=digit;
            a/=10;
        }
        System.out.println(su);
    }

    public static void main(String[] args)
    {
        sum(1234);
    }
    }
class ok{
    static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[]args) {
        int output = sum(202, 7);
        System.out.println(output);
    }
}
class doo{
   // int a=12; //instance variable
    static int b=23; //static variable
    public static void main(String[]args){
        //doo obj=new doo();
        //System.out.println(doo.b);
    int c=90;//local variable
        System.out.println(c);
    }
}

class  ki{
    static void arr(){
        int[] arrr={1,2,5,8,6,3};
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<arrr.length;i++)
        {
            if(arrr[i]==a)
            {
                System.out.println("found");
                break;
            } else if (arrr[i]!=a)
            {
                System.out.println("not found");

            }
        }
    }
    public static void main(String[]args)
    {
        arr();
    }
}