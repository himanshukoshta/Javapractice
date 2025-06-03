class filedown extends Thread{
    String filename;

    public filedown(String filename){
        this.filename=filename;
    }
    public void run(){
    for(int o=1;o<=5;o++){
        System.out.println(filename +"  downloading...." + (o*20) + "%");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
    }
        System.out.println(filename+ " done");
}
}
public class thread3 {
    public static void main(String[] args) {
        filedown f1=new filedown("File A");
        filedown f2=new filedown("File B");
        f1.start();
        f2.start();
    }
}
