import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            //Comando para generar archivo con cosas random
            // dd if=/dev/random of=entrada.bin bs=1394121 count=1
            //Ejecutar en consola
            FileInputStream fis = new FileInputStream("entrada.bin");
            FileOutputStream fos = new FileOutputStream("salida.bin");
            byte[] buffer = new byte[1024];
            long start = System.currentTimeMillis();
            int c;
            while ((c = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, c);
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo: " + (end - start));
            fos.close();
            fis.close();

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}