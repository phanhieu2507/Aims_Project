package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {


    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public CompactDisc( String title, String category, float cost, String artist,String director, int length) {
        super(title, category, director, length,cost);
        this.artist = artist;
    }
    public CompactDisc(String title, float cost){
        super(title, cost);
    }

    public CompactDisc(String title, String category, float cost){
        super(title, category, cost);
    }

    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        boolean found = false;
        for (int i = 0; i < this.tracks.size(); i++) {
            if(this.tracks.get(i).equals(track)) {
                found = true;
            };
        }
        if(!found) {
            this.tracks.add(track);
            System.out.println("track added!");
        } else {
            System.out.println("track already in arraylist!");
        }
    }

    public void removeTrack(Track track) {
        boolean found = false;
        for (int i = 0; i < this.tracks.size(); i++) {
            if(this.tracks.get(i).equals(track)) {
                this.tracks.remove(i);
                found = true;
            };
        }
        if(found) {
            System.out.println("tracks removed!");
        } else {
            System.out.println("track is not already in arraylist!");
        }
    }
    public int getLength () {
        int sum = 0;
        for (int i = 0; i < this.tracks.size(); i++) {
            sum+= this.tracks.get(i).getLength();
            };
        return sum;
    }
    public void play() {
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.get(i).play();
        }
    }
    public String toString() {
        return this.getId() + ".CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector()
                + " - " + this.getLength() + " - " + this.getArtist() + ": " + this.getCost() + " $";
    }

}
