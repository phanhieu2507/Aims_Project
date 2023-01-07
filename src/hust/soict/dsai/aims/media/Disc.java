package hust.soict.dsai.aims.media;

public class Disc extends Media {
    public String director;
    public int length;

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public Disc(String title){
        super(title);
        this.director = "Anonymous";
        this.length = 0;
    }

    public Disc(String title, float cost){
        super(title, cost);
        this.director = "Anonymous";
        this.length = 0;
    }

    public Disc(String title, String category, float cost){
        super(title, cost);
        this.director = "Anonymous";
        this.length = 0;
    }

    public Disc(String title, String category, String director, float cost){
        super(title, category, cost);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length, float cost){
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

}
