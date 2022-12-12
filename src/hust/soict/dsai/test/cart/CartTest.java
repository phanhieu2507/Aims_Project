package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, "Jame", 19);
        System.out.println(dvd1.getId());
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, "Jame", 19);
        System.out.println(dvd2.getId());
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, "Jame", 19);
        System.out.println(dvd3.getId());
        cart.addMedia(dvd3);

        cart.print();
        cart.searchDiscByTitle("Ala");
        cart.searchDiscByTitle("Ana");
        cart.searchDiscById(2);

    }
}
