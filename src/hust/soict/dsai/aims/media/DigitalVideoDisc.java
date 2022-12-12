package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{



    public DigitalVideoDisc(String title, String category,  float cost, String director, int length) {
        super(title,category,cost,director,length);
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
