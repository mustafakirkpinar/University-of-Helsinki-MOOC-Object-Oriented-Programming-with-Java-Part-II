
public class Main {

    public static void main(String[] args) {
        Abbreviations test = new Abbreviations();
        test.addAbbreviation("1", "1");
        test.addAbbreviation("1", "2");
        test.addAbbreviation("1", "3");
        test.addAbbreviation("1", "4");
        System.out.println(test.findExplanationFor("1"));
    }
}
