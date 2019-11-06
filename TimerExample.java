   import java.util.*;
   import javax.swing.event.*;
   import javax.swing.*;
   import java.awt.*;
   import java.awt.image.*;
   import java.awt.event.*;
   import java.util.Random;
   import javax.swing.Timer;

public class TimerExample extends JFrame
   {
      Random rand = new Random();
      private int currRand;
      private ImageIcon image1;
		private ImageIcon image2;
		private ImageIcon image3;
      private JPanel panel;
      private JLabel label;
		private int noDoubles;
		
		
   
      public TimerExample() 
      {
         setSize(1000,1000);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("RandomPictureTimer");
      	
         ImageIcon image1 = new ImageIcon("1.png");
			ImageIcon image2 = new ImageIcon("2.png");
			ImageIcon image3 = new ImageIcon("3.png");
      
         label= new JLabel();
         panel = new JPanel();
			
        Timer timer = new Timer(3000,new TimerListener());
         timer.start();
		
			panel.add(label);
			add(panel);
			setVisible(true);
  
        
      }
      private class TimerListener implements ActionListener
    	{
         public void actionPerformed(ActionEvent e)
        {
            noDoubles=rand.nextInt(3);
			
					if(currRand==noDoubles)
					{
							
							noDoubles=currRand;
					}
					else
					{
						currRand = rand.nextInt(3);
					 if(currRand==3) 
		               {
		                  System.out.println("3");
								image3= new ImageIcon("3.png");
								label.setIcon(image3);
								repaint();
		               }
		               else if (currRand ==2)
		               {
		                  System.out.println("2");
								image2 = new ImageIcon("2.png");
								label.setIcon(image2);
								repaint();
		               }
		               else if (currRand==1)
		               {
		                  System.out.println("1");
								image1= new ImageIcon("1.png");
								label.setIcon(image1);
								repaint();
		               }
						}
			  
         }
      }
     
      public static void main(String args[])
      {
         new TimerExample();
      }
   } 

