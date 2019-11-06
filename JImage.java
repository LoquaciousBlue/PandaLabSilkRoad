import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
 import java.awt.FlowLayout;
import java.net.URL;
 import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
 
import javax.imageio.ImageIO;
 
public class JImage{
  BufferedImage bi = null;
  JImage(){
    try{


       bi = ImageIO.read(new File("/home/ealdrich/OregonTrail/YouTried.jpg"));



//new URL("https://images.findagrave.com/photos/2008/209/28582429_121726221313.jpg")
      JFrame f = new JFrame("PANDA");
    f.setLayout(new FlowLayout());
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      MyJPanel p = new MyJPanel();
      p.setPreferredSize(new Dimension(bi.getWidth(), bi.getHeight()));

	JButton b = new JButton("BOOP");
	JButton c = new JButton("BEEP");
	JButton d = new JButton("YEET");
	f.add(b);
	f.add(c);
	f.add(d);
      f.add(p);
	f.setSize(1000,1000);
      f.pack();


f.setLocationRelativeTo(null);
      f.setVisible(true);
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  
  class MyJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawImage(bi, 0, 0, this);
    }
  } 
}
