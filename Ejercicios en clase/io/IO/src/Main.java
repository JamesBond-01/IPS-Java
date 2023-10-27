import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("entrada2.bin");
            FileOutputStream fos = new FileOutputStream("salida.bin");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fos.close();
            fis.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}