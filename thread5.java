class withdrawl extends Thread{
    static int totalamount=1000;
    int amount;

    public withdrawl(int amount)
    {
        this.amount=amount;
    }

    public void run()
    {
        if(totalamount>=amount){
            System.out.println("is going to be withdrawl" +" "+amount);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        totalamount-=amount;
        System.out.println("Balance: "+totalamount);
    }
        else{
            System.out.println("Invaild amount");
        }
    }
}
public class thread5 {
    public static void main(String[] args) {
        withdrawl wt=new withdrawl(800);
        withdrawl wt1=new withdrawl(500);
        wt.start();
        wt1.start();
    }
}
