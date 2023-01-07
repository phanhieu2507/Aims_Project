package hust.soict.dsai.aims.screen;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField listAuthor;

    public AddBookToStoreScreen(Store store, Cart cart, ControllerScreen c) {
        super(store, cart, c);

    }
    @Override
    void updateAdd(JPanel panel) {
        this.numberInput = 5;

        JLabel listAuthorLabel = new JLabel("Authors(Names are separated by a comma)", JLabel.TRAILING);
        panel.add(listAuthorLabel);
        listAuthor = new JTextField(2);
        listAuthor.setPreferredSize(new Dimension(150, 20));
        listAuthorLabel.setLabelFor(listAuthor);
        panel.add(listAuthor);

        JButton tes = new JButton("add");
        tes.setVisible(false);
        panel.add(tes);
        panel.setPreferredSize(new Dimension(100, 300));
        addBtn = new JButton("add");
        addBtn.addActionListener(e -> {
            addMediaToStore();
        });
        panel.add(addBtn);
    }

    public void addMediaToStore() {
        String title = this.title.getText();
        String listAuthor = this.listAuthor.getText();
        String[] arrayAuthor=listAuthor.split(",");
        String category = this.category.getText();
        float cost = Float.parseFloat(this.cost.getText());
        Book book = new Book(title, category, cost);
        for(String author:arrayAuthor) {
            book.addAuthor(author);
        }
        this.store.addMedia(book);
        JOptionPane.showMessageDialog(null, "add Book successfully!");
        clearTextField();

    }
    public void clearTextField(){
        this.title.setText("");
        this.listAuthor.setText("");
        this.cost.setText("");
        this.category.setText("");
    }


}