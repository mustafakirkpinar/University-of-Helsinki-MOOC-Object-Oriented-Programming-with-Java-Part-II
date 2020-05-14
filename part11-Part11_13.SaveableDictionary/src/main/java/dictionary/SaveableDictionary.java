package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveableDictionary {

    private ArrayList<WordPair> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new ArrayList<WordPair>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new ArrayList<WordPair>();
    }

    public void add(String words, String translation) {
        this.dictionary.add(new WordPair(words, translation));
    }

    public String translate(String word) {
        for (WordPair wp : dictionary) {
            if (wp.getKey().equalsIgnoreCase(word)) {
                return wp.getValue();
            }
        }
        for (WordPair wp : dictionary) {
            if (wp.getValue().equalsIgnoreCase(word)) {
                return wp.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {
        for (WordPair wp : dictionary) {
            if (wp.getKey().equalsIgnoreCase(word)) {
                dictionary.remove(wp);
                break;
            }
        }
        for (WordPair wp : dictionary) {
            if (wp.getValue().equalsIgnoreCase(word)) {
                dictionary.remove(wp);
                break;
            }
        }
    }

    public boolean load() {
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNext()) {
                dictionary.add(new WordPair(sc.nextLine()));
            }
        } catch (IOException ex) {
            return false;
        }
        return true;

    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            for (WordPair wp : dictionary) {
                writer.println(wp);
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            return false;
        }
        return true;
    }
}
