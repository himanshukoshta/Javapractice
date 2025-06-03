class downloadfile{
    public static void file(String file){
        for(int i=1;i<=5;i++)
        {
            System.out.println(file +"  downloading...." + (i*20) + "%");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
        }
        }
        System.out.println(file+ " done");
    }
}
public class thread2 {
    public static void main(String[] args) {
        downloadfile dw=new downloadfile();
        dw.file("file A");
        dw.file("file B");
    }
}
