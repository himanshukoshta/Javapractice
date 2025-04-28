import java.util.Scanner;
public class Arrayinput {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter size of array :");
        int a=in.nextInt();
        System.out.println("Enter the elements of array :");

        int[] arr=new int[a];
      for(int i=0;i<a;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Element of array are:");
        int j;
        for(j = a; j>0; j--) {
            System.out.println(arr[j]);
        }
        }
    }



