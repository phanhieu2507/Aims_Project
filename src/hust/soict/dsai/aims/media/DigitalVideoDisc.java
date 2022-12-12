package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {

    private String director;
    private int length;

    private  static  int nbDigitalVideoDiscs =0;


    public String getDirector() {

        return director;
    }

    public int getLength() {

        return length;
    }

   

    public DigitalVideoDisc(String title) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String toString() {
        return this.getId() + ".DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + ": " + this.getCost() + " $";
    }
    public boolean isMatch(String title) {
        if (this.getTitle().contains(title)) {
            return true;
        }
        return false;
    }

}
