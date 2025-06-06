 class withdrawll extends Thread{
    static int totalamount=1000;
    int amount;

    public withdrawll(int amount)
    {
        this.amount=amount;
    }

    public void run()
    {
        synchronized (withdrawll.class) {
            if (totalamount >= amount) {
                System.out.println(Thread.currentThread().getName()+" "+ amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                totalamount -= amount;
                System.out.println(Thread.currentThread().getName()+" "+ totalamount);
            } else {
                System.out.println("Invaild amount");
            }
        }
    }
}
public class thread6 {
    public static void main(String[] args) {
        withdrawll wt=new withdrawll(700);
        withdrawll wt1=new withdrawll(500);
        wt.start();
        wt1.start();
    }
}
