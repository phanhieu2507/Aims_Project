package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBER_DVD = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>(MAX_NUMBER_DVD);

    public void addMedia(Media media) {
        if (itemsInStore.size() == MAX_NUMBER_DVD) {
            System.out.println("Store is full");
            return;
        }
        itemsInStore.add(media);
    }
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed");
        } else {
            System.out.println("Not found");
        }
    }
    public void print(){
        for (int i=0;i<this.itemsInStore.size();i++) {
            System.out.println(this.itemsInStore.get(i).toString());
        }
    }

}
