import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedInputStream bi = new BufferedInputStream(
                new FileInputStream("entrada.txt"));
             BufferedOutputStream bo = new BufferedOutputStream(
                new FileOutputStream("salida.txt"));
             BufferedReader br = new BufferedReader(
                new FileReader("entrada.txt"))) {

            int c;
            while ((c = bi.read()) != -1) {
                bo.write(c);
            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}