package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<>();

        // create cd, dvd, book
        Track track = new Track("The Lion King 3", 12);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(track);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", 20f, "simba", 2);
        CompactDisc cd = new CompactDisc("King Man", "Action", 22f, "Jame", "Jame", 3);
        Book book = new Book("The Lion King", "Animation", 1.2f);

        mediae.add(dvd);
        mediae.add(cd);
        mediae.add(book);

        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
