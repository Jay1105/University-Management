package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/abtt.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 50, 300, 350);
        add(image);
        
        JLabel heading = new JLabel("<html>University Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By:");
        name.setBounds(70, 170, 400, 30);
        name.setFont(new Font("Tahoma", Font.PLAIN, 25));
        add(name);
        
        JLabel name2 = new JLabel("Jay Chotalia");
        name2.setBounds(70, 220, 400, 30);
        name2.setFont(new Font("Tahoma", Font.PLAIN, 23));
        add(name2);
        
        JLabel maill = new JLabel("jaychotalia11@gmail.com");
        maill.setBounds(70, 260, 400, 30);
        maill.setFont(new Font("Tahoma", Font.PLAIN, 23));
        add(maill);
       
        JLabel contact = new JLabel("+91 9082154930");
        contact.setBounds(70, 300, 400, 30);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 23));
        add(contact);
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}
