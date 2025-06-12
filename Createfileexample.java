import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Createfileexample {
    public static void main(String[] args) {
        try{
            File file=new File("new.txt");
            if(file.createNewFile()){
                System.out.println("File created "+file.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}

class wolf{
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("new.txt");
            writer.write("Hello, this is a text message written to this file");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class ratt {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            Scanner sd = new Scanner(file);
            while (sd.hasNextLine()) {
                String data = sd.nextLine();
                System.out.println(data);
            }
            sd.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

class goat{
    public static void main(String[] args) {
        File file=new File("new.txt");
        if(file.delete()){
            System.out.println("Deleted file "+ file);
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}