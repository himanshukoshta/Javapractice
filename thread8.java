public class thread8 {
    private boolean isSignal=false;

    public synchronized void sendSignal(){
        isSignal=true;
        System.out.println("Producer: sending signal...");
        notify();
    }
    public synchronized void getSendSignal(){
        while (!isSignal){
            try {
                System.out.println("Consumer: waiting for signal...");
                wait();
            }catch (InterruptedException e){
            }
        }
        System.out.println("Consumer: got the signal! Proceeding....");
    }

    public static void main(String[] args) {
        thread8 oh=new thread8();
        Thread  consumer =new Thread(()->{
            oh.getSendSignal();
        });
        Thread producer =new Thread(()->{
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){

            }
            oh.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}
