/**
 * Consigna:
 * 1)
 *    Necesitamos una app que se ejecute cada 1 minuto que lea desde un archivo en disco ($HOME/bulk.txt)
 *    una lista de archivos , donde cada linea del archivo representa una ruta absoluta a un archivo particular.
 *    Dicha app debe procesar un conjunto de 10 entradas a la vez, en donde cada entrada debe ser procesada de la forma:
 *        i) Si el archivo no existe, debe crearlo.
 *        ii) Si existe, debe borrarlo.
 *    Si en alguna de los dos puntos anteriores falla, se debe generar un archivo de traza con los archivos que no se
 *    pudieron borrar/crear, anteponiendo una B/C.
 */

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class FileProcessor {
    private static final String INPUT_FILE = System.getProperty("user.home") + "/bulk.txt";
    private static final String TRACE_FILE = System.getProperty("user.home") + "/trace.txt";

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(FileProcessor::processFiles, 0, 1, TimeUnit.MINUTES);
    }

    private static void processFiles() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            List<String> lines = new ArrayList<>();
            for (String line; (line = reader.readLine()) != null; ) {
                lines.add(line);
                if (lines.size() == 10) {
                    processBatch(lines);
                    lines.clear();
                }
            }
            processBatch(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processBatch(List<String> lines) {
        for (String line : lines) {
            Path path = Paths.get(line);
            try {
                if (Files.exists(path)) {
                    Files.delete(path);
                    appendToTraceFile("B " + line);
                } else {
                    Files.createFile(path);
                    appendToTraceFile("C " + line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void appendToTraceFile(String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TRACE_FILE, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
