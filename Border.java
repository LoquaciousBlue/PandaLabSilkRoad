    import java.awt.*;  
    import javax.swing.*;  
      
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


    public class Border {  
    JFrame f;  
  	JLabel label2 = new JLabel();
    Border(){  
        f=new JFrame();  
          
        JButton b1=new JButton("NORTH");;  
        JButton b2=new JButton("SOUTH");;  
        JButton b3=new JButton("EAST");;  
        JButton b4=new JButton("WEST");;  
        JButton b5=new JButton("CENTER");;  
          
        f.add(b1,BorderLayout.NORTH);  
        f.add(b2,BorderLayout.SOUTH);  
               label2.setIcon(new ImageIcon("ReadyPlayerTest.jpg"));










b1.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {
	
        f.remove(label2);  

	label2.setIcon(new ImageIcon("a.JPG"));
	f.add(label2,BorderLayout.CENTER);
	
	f.revalidate();
	f.repaint();

  }
});

b2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e)
  {

        f.remove(label2);  
	label2.setIcon(new ImageIcon("ReadyPlayerTest.jpg"));
	f.add(label2,BorderLayout.CENTER);
	
	f.revalidate();
	f.repaint();

  }
});







	f.add(label2,BorderLayout.CENTER);
        f.setSize(1000,1000);  
        f.setVisible(true);  
    }  
/*
    public static void main(String[] args) {  
        new Border();  
    } 
*/ 
    }  
