package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

    public  static  final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0 ;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered<MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered = qtyOrdered +1;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc dvd : dvdList) {
            this.addDigitalVideoDisc(dvd);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for(int i = 0; i<qtyOrdered; i++){
            if(itemsOrdered[i]==disc){
                if (i == qtyOrdered-1){
                    itemsOrdered[i] = null;
                    qtyOrdered--;
                    found = true;
                } else {
                    for (int j = i; j<qtyOrdered-1; j++){
                        itemsOrdered[j]=itemsOrdered[j+1];
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
    public float totalCost(){
        float sum = 0.0f;
        for(int i = 0; i<qtyOrdered; i++){
                sum+=itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void print(){
        System.out.println("***********************CART**********************\nOrdered Items:\n");
        for (int i=0;i<this.qtyOrdered;i++) {
            System.out.println(this.itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " +this.totalCost()+"$\n");
        System.out.println("*************************************************\n");
    }
    public boolean searchDiscById(int id){
        for (int i = 0 ;i<qtyOrdered;i++){
            if (itemsOrdered[i].getId()==id){
                System.out.println(itemsOrdered[i].toString());
                return true;
            }
        }
        System.out.println("Disc not found");
        return false;
    }
    public void searchDiscByTitle(String title){
        boolean found = false;
        for (int i = 0 ;i<qtyOrdered;i++){
            if (itemsOrdered[i].isMatch(title)==true){
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        }
        if(found == false) {
            System.out.println("Disc not found");
        }
    }
}
