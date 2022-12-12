package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;

public class Cart {

    public  static  final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

    public void addMedia (Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Cart is full");
            return;
        }
        itemsOrdered.add(media);
    }
    public void removeMedia (Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed");
        }
        System.out.println("Not found");
    }

    public float totalCost(){
        float sum = 0.0f;
        for(int i = 0; i<itemsOrdered.size(); i++){
                sum+=itemsOrdered.get(i).getCost();
        }
        return sum;
    }
    public void print(){
        System.out.println("***********************CART**********************\nOrdered Items:\n");
        for (int i=0;i<this.itemsOrdered.size();i++) {
            System.out.println(this.itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " +this.totalCost()+"$\n");
        System.out.println("*************************************************\n");
    }
    public boolean searchDiscById(int id){
        for (int i = 0 ;i<itemsOrdered.size();i++){
            if (itemsOrdered.get(i).getId()==id){
                System.out.println(itemsOrdered.get(i).toString());
                return true;
            }
        }
        System.out.println("Disc not found");
        return false;
    }
    public void searchDiscByTitle(String title){
        boolean found = false;
        for (int i = 0 ;i<itemsOrdered.size();i++){
            if(itemsOrdered.get(i) instanceof DigitalVideoDisc){
                DigitalVideoDisc disc = (DigitalVideoDisc) itemsOrdered.get(i);
                if (disc.isMatch(title)==true){
                    System.out.println(disc.toString());
                    found = true;
                }
            }
        }
        if(found == false) {
            System.out.println("Disc not found");
        }
    }
}
