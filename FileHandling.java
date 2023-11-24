import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String args[]) {

        try {
            File myOjb = new File("musty.txt");
            if(myOjb.createNewFile()) {
                System.out.println("File is created:" + myOjb.getName());
            }else{
                System.out.println("File is already exist");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
