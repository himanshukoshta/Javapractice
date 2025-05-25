public class arraysheet {
    public static void main(String[] args) {
        int[] arr={-1,6,0,-5,0,8};
        int index=0;
        int[] newArr=new int[arr.length];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<0)
            {
                newArr[index++]=arr[i];
            }
        }
        for (int j=0;j< arr.length;j++)
        {
            if(arr[j]==0)
            {
                newArr[index++]=arr[j];
            }
        }
        for (int o=0;o< arr.length;o++) {
            if (arr[o] > 0) {
                newArr[index++] = arr[o];
            }
        }
        for (int y=0;y< newArr.length;y++)
        {
            System.out.println(newArr[y]);
        }
    }
}

class kilo{
    public static void main(String[] args) {
        int[] arre={1,2,3,4,5};
        int leastval=arre[arre.length-1];
        for(int i= arre.length-1;i>0;i--)
        {
            arre[i]=arre[i-1];
        }
        arre[0]=leastval;
        for(int l:arre)
        {
            System.out.println(l);
        }
    }
}

class arr{
    public static void main(String[] args) {
        String srt="aaaabbbccc  ";
        int count=1;
        StringBuilder newStr= new StringBuilder();
        for(int a=1;a<srt.length();a++)
        {
            if(srt.charAt(a)==srt.charAt(a-1))
            {
                count++;
            }
            else
            {
                newStr.append(srt.charAt(a-1)).append(count);
                count=1;
            }
        }
        System.out.println(newStr);
    }
}