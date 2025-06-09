import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter the element of an array: ");
        for (int p=0;p< arr.length;p++){
            arr[p]= sc.nextInt();
            sum+=arr[p];
        }
        System.out.println(sum);
    }
}

class arr2{
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int q= se.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] we=new int[q];
        int max=we[0];
        for (int a=0;a< we.length;a++)
        {
            we[a]= se.nextInt();
            if(we[a]>max){
                max=we[a];
            }
        }
        System.out.println(max);
    }
}

class qa{
    public static void main(String[] args) {
        Scanner ws=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int z= ws.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] de=new int[z];
        int even=0;
        int odd=0;
        for (int s=0;s< de.length;s++)
        {
            de[s]= ws.nextInt();
            if(de[s]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}

class as{
    public static void main(String[] args) {
        Scanner wss=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int z1= wss.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] dee=new int[z1];
        for (int d=0;d<dee.length;d++) {
            dee[d] = wss.nextInt();
        }
        System.out.println("Enter the element to find in an array: ");
        int u= wss.nextInt();
        boolean ok=false;
            for (int val:dee) {
                if (val == u) {
                    ok = true;
                    break;
                }
            }
                if(ok){
                    System.out.println(u + " is present in the array");
                }
                else {
                    System.out.println(u + " not found in the array");
                }

    }
}

class was{
    public static void main(String[] args) {
        Scanner re=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int r= re.nextInt();
        System.out.println("Enter the elements of an array: ");
        int[] tr=new int[r];
        for(int d=0;d< tr.length;d++)
        {
            tr[d]= re.nextInt();

        }
        System.out.println("Reversed array: ");
        for (int f= tr.length-1;f>=0;f--){
            System.out.println(tr[f]);
        }
    }
}