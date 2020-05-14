package dictionary;

public class WordPair {

    String key;
    String value;

    public WordPair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public WordPair(String key) {
        String[] pair = key.split(":");
        this.key = pair[0];
        this.value = pair[1];
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }

}
