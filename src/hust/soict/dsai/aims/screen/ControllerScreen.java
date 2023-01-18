package hust.soict.dsai.aims.screen;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;

public class ControllerScreen {
    public static JFrame storeScreen;
    public static JFrame cartScreen;
    public static JFrame addDVDScreen;
    public static JFrame addBookScreen;
    public static JFrame addCDScreen;
    private Cart cart;
    private Store store;
    public ControllerScreen() {
        cart= new Cart();
        store=new Store();
        addDVDScreen= new AddDigitalVideoDiscToStoreScreen(store, cart, this);
        addDVDScreen.setTitle("Add DVD");
        addBookScreen= new AddBookToStoreScreen(store, cart, this);
        addBookScreen.setTitle("Add Book");
        addCDScreen= new AddCompactDiscToStoreScreen(store, cart, this);
        addCDScreen.setTitle("Add CD");
        storeScreen= new StoreScreen(store,cart,this);
        cartScreen= new CartScreen(cart,this);
        showStoreScreen();
//		showAddDVDScreen();
    }
    public static void main(String args[]) {
        new ControllerScreen();
    }
    //
    public void updateAddItem() {
    }
    public void showStoreScreen() {
        SwingUtilities.updateComponentTreeUI(storeScreen);
        storeScreen.dispose();
        storeScreen= new StoreScreen(store,cart,this);
        storeScreen.setVisible(true);
        cartScreen.setVisible(false);
        addDVDScreen.setVisible(false);
        addCDScreen.setVisible(false);
        addBookScreen.setVisible(false);

    }
    public void showCartScreen() {
        storeScreen.setVisible(false);
        cartScreen.setVisible(true);
        addDVDScreen.setVisible(false);
        addCDScreen.setVisible(false);
        addBookScreen.setVisible(false);
    }
    public void showAddDVDScreen() {
        storeScreen.setVisible(false);
        cartScreen.setVisible(false);
        addDVDScreen.setVisible(true);
        addCDScreen.setVisible(false);
        addBookScreen.setVisible(false);
    }
    public void showAddCDCreen() {
        storeScreen.setVisible(false);
        cartScreen.setVisible(false);
        addDVDScreen.setVisible(false);
        addCDScreen.setVisible(true);
        addBookScreen.setVisible(false);
    }
    public void showAddBookScreen() {
        storeScreen.setVisible(false);
        cartScreen.setVisible(false);
        addDVDScreen.setVisible(false);
        addCDScreen.setVisible(false);
        addBookScreen.setVisible(true);
    }
}