import java.util.Scanner;
public class practi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();
        int b1=sc.nextInt();
        int c1=sc.nextInt();
        if(a1>b1 && a1>c1)
        {
            System.out.println("a is greater");
        } else if (b1>c1) {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }

    }
}
class pr{
    public static void main(String[] args) {
        Scanner ne=new Scanner(System.in);
        int num=ne.nextInt();
        if(num>=90)
        {
            System.out.println("Grade A");
        } else if (num>=75) {
            System.out.println("Grade B");
        } else if (num>=60) {
            System.out.println("Grade C");
        }
        else
            System.out.println("Fail");
    }
}
class op{
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        char ch='9';
        if(ch>='A'&& ch<='Z')
        {
            System.out.println("Uppercase");
        } else if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else
            System.out.println("Invalid input");
    }
}
