import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("dude.jpeg");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); //create a label
        label.setText("Bro, do you even code?"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTRE, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);  //set text TOP,CENTER,BOTTOM of ImageIcon
        label.setForeground(new Color(0x00FF00));  //set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(50); //set gap of text to image
        label.setBackground(Color.black);  //set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //sets border
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within the label


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);


    }
}