public class thread7 {
    public static void main(String[] args) {
        System.out.println("idhar dekhiyega");
        Thread t1=new Thread(()->{
            System.out.println("hiii");
        });
        Thread t2=new Thread(()->{
            System.out.println("byee");
        });
        t1.start();
        t2.start();
    }
}

class mmythread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(getName() + " is running with priority "+(i*10) + "%");
        Thread.yield();
        }
    }
}

class yoou{
    public static void main(String[] args) {
        mmythread tr1=new mmythread();
        mmythread tr2=new mmythread();

        tr1.setName("Low priority thread");
        tr2.setName("High priority thread");

        tr1.setPriority(Thread.MIN_PRIORITY);
        tr2.setPriority(Thread.MAX_PRIORITY);

        tr1.start();
        tr2.start();
    }
}