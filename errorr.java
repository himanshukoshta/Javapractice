//error handling
import java.util.Scanner;
   public class errorr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        try {
            float c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("hiii");
        System.out.println("byeee");
    }
}

class arrerror{
    public static void main(String[] args) {
        int[] arrr={1,2,3,4,5,6,7};
        try {
            System.out.println(arrr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println("");
        }finally {
            System.out.println("baaki sab theek");
        }
    }
}

class type{
    public static void main(String[] args) {
        int[] arrt={2,3,5,5,-1,0,4};

    }
}
