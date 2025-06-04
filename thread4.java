class myrunnable implements Runnable {
    public void run(){
        System.out.println("Thread using Runnable interface");
    }
}

    public class thread4 {
        public static void main(String[] args) {
            myrunnable ob=new myrunnable();
            Thread t1=new Thread(ob);
            t1.start();
            try {
                t1.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int u=1;u<=5;u++)
            {
                System.out.println(u);
            }
            System.out.println("Main thread is running");
        }
}








