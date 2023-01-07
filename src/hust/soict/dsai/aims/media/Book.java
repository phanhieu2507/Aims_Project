package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private static int QUANTITY = 0;
    private List<String> author = new ArrayList<String>();
    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public void addAuthor(String authorName) {
        boolean found = false;
        for (int i = 0; i < this.author.size(); i++) {
            if(this.author.get(i).equals(authorName)) {
                found = true;
            };
        }
        if(!found) {
            this.author.add(authorName);
            System.out.println("author added!");
        } else {
            System.out.println("author already in arraylist!");
        }
    }

    public void removeAuthor(String authorName) {
        boolean found = false;
        for (int i = 0; i < this.author.size(); i++) {
            if(this.author.get(i).equals(authorName)) {
                this.author.remove(i);
                found = true;
            };
        }
        if(found) {
            System.out.println("author removed!");
        } else {
            System.out.println("author is not already in arraylist!");
        }
    }

    public Book(String title, float cost, String category, List<String> authors) {
        super(title, category, cost);
        Book.QUANTITY += 1;
        this.id = Book.QUANTITY;
        this.author = authors;
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        Book.QUANTITY += 1;
        this.id = (Book.QUANTITY);
        List<String> authors = new ArrayList<String>();
        authors.add("Unknown");
        this.author = authors;
    }

    public Book(String title, float cost) {
        super(title, cost);
        Book.QUANTITY += 1;
        this.id = (Book.QUANTITY);
        List<String> authors = new ArrayList<String>();
        authors.add("Unknown");
        this.author = authors;
    }


    public String toString() {
        return this.getId() + ".Book - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
    }

}
