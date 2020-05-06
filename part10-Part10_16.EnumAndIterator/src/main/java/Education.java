
public enum Education {
    
    PHD ("Doctoral degree"),
    MA ("Masters degree"),
    BA ("Bachelors degree"),
    HS ("High School diploma");
    
    private String title;
    
    private Education (String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
