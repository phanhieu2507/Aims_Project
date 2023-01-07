package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

    private static int nbDigitalVideoDiscs = 0;


    public DigitalVideoDisc(String title){
        super(title);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = (nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, float cost){
        super(title, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = (nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, float cost){
        super(title, category, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = (nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost){
        super(title, category, director, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = (nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super(title, category, director, length, cost);
        DigitalVideoDisc.nbDigitalVideoDiscs += 1;
        this.id = (nbDigitalVideoDiscs);
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
    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

}
