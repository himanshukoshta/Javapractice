public class string {
    public static void main(String[] args) {
        String s="Himanshu Koshta";
            System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(5));
        System.out.println(s.indexOf("a"));
        int count =0;
        for (char i:s.toLowerCase().toCharArray()){
            if("aeiou".indexOf(i)==-1){  //consonant
                count++;
            }
        }
        System.out.println("Consonant "+ count);
        int count1 =0;
        for (char g:s.toLowerCase().toCharArray()){
            if("aeiou".indexOf(g)!=-1)
            {
                count1++;
            }
        }
        System.out.println("Vowels "+count1);
    }
}

class brummm{
    public static void main(String[] args) {
        String e="himnshu";
        String rev="";
        for (int i=e.length()-1;i>=0;i--)
        {
            rev+=e.charAt(i);
        }
        System.out.println(rev.equalsIgnoreCase(e));
    }
}

class ratatata{
    public static void main(String[] args) {
        String r="Himanshu";
        String rs="uhsnamih";
        String y="";
        for (int o = rs.length()-1; o>=0; o--)
        {
            y+=rs.charAt(o);
        }
        System.out.println(r.equalsIgnoreCase(y));
    }
}