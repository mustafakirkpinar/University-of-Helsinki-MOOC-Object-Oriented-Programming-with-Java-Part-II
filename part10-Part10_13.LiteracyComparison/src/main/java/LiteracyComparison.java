

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;


public class LiteracyComparison {
    
    public static void printSortedLiteracy (String file) {
    
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(p ->  new Literacy(p[3].trim(),Integer.valueOf(p[4].trim()),p[2].trim().split(" ")[0],Double.valueOf(p[5].trim())))
                    .sorted()
                    .forEach((t) -> System.out.println(t));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        printSortedLiteracy("literacy.csv");
    }
}
