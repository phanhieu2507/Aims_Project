package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Jame", 19, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King",
                "Animation", "Jame", 19, 19.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King",
                "Animation", "Jame", 19, 19.95f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.print();
        store.removeMedia(dvd3);
        store.print();
    }
}
