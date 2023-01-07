package hust.soict.dsai.aims.screen;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField director;
    private JTextField length;

    public AddDigitalVideoDiscToStoreScreen(Store store, Cart cart, ControllerScreen c) {
        super(store, cart, c);

    }
    @Override
    void updateAdd(JPanel panel) {
        this.numberInput = 6;
        // SpringLayout layout =new SpringLayout();
        // JPanel p = new JPanel(layout);
        JLabel directorLabel = new JLabel("director", JLabel.TRAILING);
        panel.add(directorLabel);
        director = new JTextField(2);
        director.setPreferredSize(new Dimension(150, 20));
        directorLabel.setLabelFor(director);
        panel.add(director);
        JLabel lengthLabel = new JLabel("length", JLabel.TRAILING);
        panel.add(lengthLabel);
        length = new JTextField(2);
        lengthLabel.setLabelFor(length);
        panel.add(length);
        JButton tes = new JButton("add");
        tes.setVisible(false);
        panel.add(tes);
        panel.setPreferredSize(new Dimension(100, 300));
        addBtn = new JButton("add");
        addBtn.addActionListener(e -> {
            addMedia();
        });
        panel.add(addBtn);
    }

    public void addMedia() {
        String title = this.title.getText();
        String director = this.director.getText();
        String category = this.category.getText();
        float cost = Float.parseFloat(this.cost.getText());
        int length = Integer.parseInt(this.length.getText());
        DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
        this.store.addMedia(dvd);
        JOptionPane.showMessageDialog(null, "add DVD successfully!");
        clearTextField();

    }
    public void clearTextField(){
        this.title.setText("");
        this.director.setText("");
        this.cost.setText("");
        this.length.setText("");
        this.category.setText("");
    }


}
