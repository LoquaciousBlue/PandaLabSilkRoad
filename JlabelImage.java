import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class JlabelImage extends JFrame {
	int boop = 0;
  JButton b = new JButton("BOOP");
  JButton c = new JButton("CLOOF");
    JLabel label3 = new JLabel("bop"+boop);
    JLabel label2 = new JLabel();
  public JlabelImage() throws HeadlessException {

    setSize(900, 1350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));


	label2.setIcon(new ImageIcon("ReadyPlayerTest.jpg"));





	getContentPane().add(b);
	getContentPane().add(c);

b.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    System.out.println("TEST");
	boop++;
    System.out.println(boop);
	
	getContentPane().remove(b);
	getContentPane().add(c);
	getContentPane().remove(label2);
	label2.setIcon(new ImageIcon("a.JPG"));
	getContentPane().add(label2);
	
	revalidate();
	repaint();

  }
});

c.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

    System.out.println("TEST");
	boop++;

	getContentPane().remove(c);
	getContentPane().add(b);

	getContentPane().remove(label2);
	label2.setIcon(new ImageIcon("ReadyPlayerTest.jpg"));
	getContentPane().add(label2);
	
	label3.setText("45"+boop);
	revalidate();
	repaint();

  }
});
getContentPane().add(label3);
getContentPane().add(label2);

	
	

  }

  public static void main(String[] args) {
    new JlabelImage().setVisible(true);
  }
}
