
public class Literacy implements Comparable<Literacy>{

    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public Literacy(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    
    @Override
    public String toString() {
        // format Niger (2015), female, 11.01572
        return this.country+" ("+this.getYear()+"), "+this.getGender()
                +", "+this.getLiteracyRate(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public int compareTo(Literacy o) {
        
        return  (this.literacyRate-o.getLiteracyRate())>0?1:-1;
    }
    
    
    
}
