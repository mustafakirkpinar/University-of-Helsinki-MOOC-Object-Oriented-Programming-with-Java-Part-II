
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static List<Book> readBooks(String file) throws IOException {
         return Files.lines(Paths.get(file)).
                map((String row) -> {
                    String []a =row.split(",");
                    String name= a[0];
                    int year = Integer.valueOf(a[1]);
                    int page = Integer.valueOf(a[2]);
                    String author = a[3];
                    Book book = new Book (name,year,page,author);
                    return book;
                    }).collect(Collectors.toList());
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

}
