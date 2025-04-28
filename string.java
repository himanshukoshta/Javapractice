public class string {
   public static void main(String[] args) {
        String str="hiiii";
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(newstr.indexOf(c)==-1)
            {
                newstr+=c;
            }
        }
        System.out.println(newstr);
   }
}
class string1{
    public static void main(String[] args) {
     //   String str=new String("hello");
      //  String str1=new String("hello");
       // System.out.print(str1 == str);

        String se="hhlooio";
        char[] ch=se.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            
            {
                if(ch[i]==ch[j])
                {
                    System.out.println(ch[j]);
                    return;
                }
            }
        }
    }
}