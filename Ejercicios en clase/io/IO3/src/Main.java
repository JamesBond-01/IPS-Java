import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedInputStream bi = new BufferedInputStream(
                new FileInputStream("entrada.bin")); BufferedOutputStream bo = new BufferedOutputStream(
                new FileOutputStream("salida.bin"))) {
            long start = System.currentTimeMillis();
            int c;
            while ((c = bi.read()) != -1) {
                bo.write(c);
            }
            long end = System.currentTimeMillis();
            System.out.println("Tiempo: " + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}