package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBER_DVD = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBER_DVD];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (this.qtyOrdered < MAX_NUMBER_DVD) {
            this.itemsInStore[this.qtyOrdered] = disc;
            this.qtyOrdered += 1;
            System.out.println("Successfully added!");
        }else {
            System.out.println("Full of Discs !");
        }
    }
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for(int i = 0; i<qtyOrdered; i++){
            if(itemsInStore[i]==disc){
                if (i == qtyOrdered-1){
                    itemsInStore[i] = null;
                    qtyOrdered--;
                    found = true;
                } else {
                    for (int j = i; j<qtyOrdered-1; j++){
                        itemsInStore[j]=itemsInStore[j+1];
                    }
                    qtyOrdered--;
                    found = true;
                }
                System.out.println("Disc removed");
                break;
            }
        }
        if (found == false){
            System.out.println("Disc not found");
        }
    }
    public void print(){
        for (int i=0;i<this.qtyOrdered;i++) {
            System.out.println(this.itemsInStore[i].toString());
        }
    }

}
