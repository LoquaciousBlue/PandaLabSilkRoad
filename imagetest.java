import java.awt.*;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class imagetest extends JFrame {
  private ImageIcon image1;
  private JLabel label1;
  private JLabel label2;
  private JTextField item1;
  imagetest() {
    //setLayout(new FlowLayout());
    setLayout(new GridLayout());

    item1 = new JTextField(10);
    add(item1);

    image1 = new ImageIcon(getClass().getResource("Panda.JPG"));
    label1 = new JLabel(image1);
    add(label1);


    label2 = new JLabel("TESTING");
    label2.setToolTipText("Testing2");
    add(label2);


    thehandler handler = new thehandler();
    item1.addActionListener(handler);
  }

  private class thehandler implements ActionListener{
    public void actionPerformed(ActionEvent event){

      String boop = "yeet";
      String test = "lol";

      if(event.getSource()==item1) {
        System.out.println(event.getActionCommand());

        test=String.format(event.getActionCommand());

        if (test.compareTo("1") == 0) {
          System.out.println("WIN");
        }


        boop=String.format("field 1: %s", event.getActionCommand());
      }
      System.out.println(boop);

    JOptionPane.showMessageDialog(null, boop);
    }

  }

  public static void main (String args[]) {
    imagetest gui = new imagetest();
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(100,100);
    gui.setVisible(true);
    gui.pack();
    gui.setTitle("PANDA");
  }
}
