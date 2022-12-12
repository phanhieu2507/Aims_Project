package hust.soict.dsai.aims.media;

import java.util.Comparator;
public abstract class Media {
    public int id ;
    public static int nbMedia = 0;
    public String title;
    public String category;
    public float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }



    public String getCategory() {
        return category;
    }



    public float getCost() {
        return cost;
    }
    public Media (String title, String category, float cost ) {
        this.id = ++nbMedia ;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Media) {
            return this.getTitle().equals(((Media) obj).getTitle());
        }
        return false;
    }

}
