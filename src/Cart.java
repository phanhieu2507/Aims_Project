public class Cart {

    public  static  final int MAX_NUMBERS_ORDERED = 20;
    private  DigitalVideoDisc itemsOrdered[] =
            new  DigitalVideoDisc[MAX_NUMBERS_ORDERED];
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
    private void removeDigitalVideoDisc(DigitalVideoDisc disc) {

    }
    public float totalCost(){
        float sum = 0;
        for (DigitalVideoDisc disc: itemsOrdered) {
            if(disc!=null){
                sum+=disc.getCost();
            }
        }
        return sum;
    }
}
