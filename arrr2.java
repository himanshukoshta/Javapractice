public class arrr2 {
    public static void main(String[] args) {
        int[] ar1={1,2,3};
        int[] ar2={4,5,6};
        int[] sum=new int[ar1.length];
        for (int i=0;i<ar1.length;i++)
        {
            sum[i]=ar1[i]+ar2[i];
        }
        for (int val:sum){
            System.out.println(val);
        }
    }
}

class ro{
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] are1={1,2,4};
        boolean isEqual= java.util.Arrays.equals(arr1,are1);
        if(isEqual)
        {
            System.out.println("Arrays are equal");
        }
        else
            System.out.println("Arrays are not equal");
    }
}

class fr{
    public static void main(String[] args) {
        int[] arw1={1,2,3};
        int[] arw2={4,5,6};
        int[] sx=new int[arw1.length+arw2.length];
        for (int s=0;s<arw1.length;s++)
        {
            sx[s]=arw1[s];
        }
        for (int s=0;s<arw2.length;s++)
        {
            sx[arw1.length+s]=arw2[s];
        }
        System.out.println("Merged array: ");
        for (int vl:sx)
            System.out.println(vl);
    }
}

class waq{
    public static void main(String[] args) {
        int[] arre1={1,2,3,7};
        int[] arre2={7,4,2,6};
        System.out.println("Common element: ");
        for (int f=0;f<arre1.length;f++){
            for (int g=0;g<arre2.length;g++)
            {
                if(arre1[f]==arre2[g])
                {
                    System.out.println(arre1[f]);
                    break;
                }
            }
        }
    }
}

class th{
    public static void main(String[] args) {
        int[] arrt1={1,2,3,7};
        int[] arrt2={7,4,2,6};
        //element not in arrt2
        for (int h=0;h<arrt1.length;h++)
        {
            boolean lo=false;
            for (int j=0;j<arrt2.length;j++)
            {
                if(arrt1[h]==arrt2[j])
                {
                    lo=true;
                    break;
                }
            }
            if(!lo){
                System.out.println(arrt1[h]+ " ");
            }
        }
        //element not found in arrt1
        for (int h=0;h<arrt2.length;h++)
        {
            boolean lo1=false;
            for (int j=0;j<arrt1.length;j++)
            {
                if(arrt2[h]==arrt1[j])
                {
                    lo1=true;
                    break;
                }
            }
            if(!lo1){
                System.out.println(arrt2[h]+ " ");
            }
        }
    }
}

class gol{
    public static void main(String[] args) {
        int[] arrq1={1,2,3,7};
        int[] srt=new int[arrq1.length];
        for (int k=0;k<arrq1.length;k++)
        {
            srt[k]=arrq1[k];
        }
        for (int g:srt)
            System.out.println(g);
    }
}
class roll{
    public static void main(String[] args) {
        int[] arrf1={1,2,3,7};
        int[] arrf2={9,4,2,6};
        int max=Integer.MIN_VALUE;
        for (int l:arrf1)
        {
            if(l>max)
            {
                max=l;
            }
        }
        for (int n:arrf2)
        {
            if (n>max)
                max=n;
        }
        System.out.println(max);
    }
}