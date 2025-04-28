public class l {
    public static void main(String[] args) {
        String str = "hellosi";
        String str1 = "hiiio";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str.charAt(i) == str1.charAt(j)) {
                    count++;

                }
            }
        }
        System.out.println(count);

    }
}
class yu{
    public static void main(String[] args) {
        String palin = "rrrraa";
        int count = 0;
        int counta = 0;
        char[] q = {'a', 'e', 'i', 'o', 'u'};
        char[] arr = palin.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < q.length; j++) {
                if (arr[i] == q[j]) {
                    count++;

                } else {
                    counta = arr.length - count;
                }

            }
        }
        if (count > 0) {
            System.out.println("Total vowels:" + count);
            System.out.println("Total consonent:" + counta);
            System.out.println("vowel");
        } else {
            System.out.println("Total vowels:" + count);
            System.out.println("Total consonent:" + counta);
            System.out.println("consonent");
        }
    }
}
 class ioo {
    public static void main(String[] args) {
        int a=123;
        int aa=0;
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        for(int i=0;i<3;i++)
        {
            aa+=a%10;
            a/=10;
        }
        System.out.println(aa);
    }
}
