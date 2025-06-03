import com.sun.jdi.ThreadReference;

class mythread extends Thread{
    public void run()
    {
        System.out.println("hii");
    }
}
public class thread {
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        System.out.println("bye bye");
    }
}
class threadd extends Thread{
    public  void run()
    {
        System.out.println("hiii");
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("Byee");
    }
}

class dothread{
    public static void main(String[] args) {
        threadd te=new threadd();
        te.start();

    }
}
