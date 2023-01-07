package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class AddItemToStoreScreen extends JFrame {
    protected Store store;
    protected Cart cart;
    protected JTextField title;
    protected JTextField category;
    protected JTextField cost;
    protected JButton addBtn;
    protected ControllerScreen c;
    protected JPanel center;
    protected int numberInput=3;
    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Option");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookMenu= new JMenuItem("Add Book");
        addBookMenu.addActionListener(e->{
            c.showAddBookScreen();
        });
        smUpdateStore.add(addBookMenu);
        JMenuItem addCDMenu=new JMenuItem("Add CD");
        addCDMenu.addActionListener(e->{
            c.showAddCDCreen();
        });
        smUpdateStore.add(addCDMenu);
        JMenuItem addDVDMenu= new JMenuItem("Add DVD");
        addDVDMenu.addActionListener(e->{
            c.showAddDVDScreen();
        });
        smUpdateStore.add(addDVDMenu);

        menu.add(smUpdateStore);
        JMenuItem viewStoreMenu= new JMenuItem("View store");
        viewStoreMenu.addActionListener(e->{
            c.showStoreScreen();
        });
        menu.add(viewStoreMenu);

        JMenuItem viewCartMenu= new JMenuItem("View cart");
        viewCartMenu.addActionListener(e->{
            c.showCartScreen();
        });
        menu.add(viewCartMenu);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton btnCart = new JButton("View cart");

        btnCart.setPreferredSize(new Dimension(100, 50));
        btnCart.setMaximumSize(new Dimension(100, 50));
        btnCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.showCartScreen();
                System.out.println("test nơư");
            }
        });


        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(btnCart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    void updateAdd(JPanel panel) {
        JButton tes=new JButton("add");
        center.add(tes,BorderLayout.CENTER);
//    	c.updateAddItem();
    }

    JPanel createCenter() {
        center = new JPanel();
        center.setLayout(new BorderLayout());
        SpringLayout layout =new SpringLayout();
        JPanel p = new JPanel(layout);
//		title= new  JTextField();
//		center.add(new JTextField("Text field", 15));
//		center.add(new JTextField("gfg field", 100));
//		center.add(new JLabel("title"));
        JLabel titleLabel=new JLabel("title", JLabel.TRAILING);
        p.add(titleLabel);
        title= new JTextField(10);
        titleLabel.setLabelFor(title);
        title.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                System.out.print("hello");
                JButton tes=new JButton("add");
                center.add(tes,BorderLayout.CENTER);
                c.updateAddItem();
                //statements!!!

            }});

        p.add(title);
        JLabel categoryLabel=new JLabel("category", JLabel.TRAILING);
        p.add(categoryLabel);
        category = new JTextField(10);
        p.add(category);
        categoryLabel.setLabelFor(category);
        JLabel costLabel=new JLabel("cost", JLabel.TRAILING);
        p.add(costLabel);
        cost = new JTextField(10);
        costLabel.setLabelFor(cost);
        p.add(cost);

//		for (int i = 0; i < numPairs; i++) {
//		    JLabel l = new JLabel(labels[i], JLabel.TRAILING);
//		    p.add(l);
//		    JTextField textField = new JTextField(10);
//		    listText.add(textField);
//		    l.setLabelFor(textField);
//		    p.add(textField);
//		}
//		System.out.print(listText.size());
//		JButton tes=new JButton("add");
//		tes.setVisible(false);
//		p.add(tes);
//		p.setPreferredSize(new Dimension(300, 300));
//		addBtn= new JButton("add");
//		addBtn.addActionListener(e->{
//			addMedia();
//		});
//		p.add(addBtn);
        updateAdd(p);
        SpringUtilities.makeCompactGrid(p,
                this.numberInput, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad

//		//Lay out the panel.
//		SpringUtilities.makeCompactGrid(p,
//		                                numPairs, 2, //rows, cols
//		                                6, 6,        //initX, initY
//		                                6, 6);       //xPad, yPad
        p.setMaximumSize( new Dimension(
                100,
                300
        ) );

        center.add(p,BorderLayout.NORTH);
        return center;
    }


    public AddItemToStoreScreen(Store store, Cart cart,ControllerScreen c) {
        this.store = store;
        this.cart = cart;
        this.c=c;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);

    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Aller", 87, 19.95f);
        System.out.println(dvd1.getId());
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        System.out.println(dvd2.getId());
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        System.out.println(dvd3.getId());
        store.addMedia(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Aller", 87, 19.95f);
        System.out.println(dvd4.getId());
        store.addMedia(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        System.out.println(dvd5.getId());
        store.addMedia(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        System.out.println(dvd6.getId());
        store.addMedia(dvd6);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Aller", 87, 19.95f);
        System.out.println(dvd7.getId());
        store.addMedia(dvd7);

        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        System.out.println(dvd8.getId());
        store.addMedia(dvd8);
        store.addMedia(dvd8);
        store.addMedia(dvd8);

//		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Aladin",
//		"Animation", 18.99f);
//		System.out.println(dvd9.getId());
//		store.addMedia(dvd9);

//		new StoreScreen(store, cart);
    }
    public void  addMedia() {
        System.out.println("add");
    }

}
