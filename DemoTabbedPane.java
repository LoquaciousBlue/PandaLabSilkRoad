/*
 *  ==================================================================
 *  DemoTabbedPane.java : Tabbed panes allow developers to stack pages
 *  of information into a single point of reference. Each page in a 
 *  tabbed pane is implemented as a panel. Further Java UI components
 *  are added to the panel. This applet implements a tabbed pane 
 *  containing three pages:
 * 
 *   -- Page 1 contains a text field window and a password textfield.
 *   -- Page 2 contains five buttons positioned with a border layout.
 *   -- Page 3 contains contains three labels and three scrolling
 *      textarea windows positioned with a 3-by-2 grid layout.
 * 
 *  Adapted from : S Gutz. Up to Speed with Swing, 2000
 *  Modified by : Mark Austin                              March, 2001
 *  ==================================================================
 */

import java.awt.*;
import javax.swing.*;

public class DemoTabbedPane extends JApplet {

    Container container = null;

    private JTabbedPane tabbedPane;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    public void init() {

       //1. Get a handle on the applet's content pane.

       container = this.getContentPane();

       // NOTE: to reduce the amount of code in this example, it uses
       // panels with a NULL layout.  This is NOT suitable for
       // production code since it may not display correctly for
       // a given look-and-feel.

       JPanel topPanel = new JPanel();
       topPanel.setLayout( new BorderLayout() );
       getContentPane().add( topPanel );

       // Create the tab pages

       createPage1();
       createPage2();
       createPage3();

       // Create a tabbed pane

       tabbedPane = new JTabbedPane();
       tabbedPane.addTab( "Page 1", panel1 );
       tabbedPane.addTab( "Page 2", panel2 );
       tabbedPane.addTab( "Page 3", panel3 );
       topPanel.add( tabbedPane, BorderLayout.CENTER );

    }

    public void createPage1() {
       panel1 = new JPanel();
       panel1.setLayout( null );

       JLabel label1 = new JLabel( "Username:" );
       label1.setBounds( 10, 15, 150, 20 );
       panel1.add( label1 );

       JTextField field = new JTextField();
       field.setBounds( 10, 35, 150, 20 );
       panel1.add( field );

       JLabel label2 = new JLabel( "Password:" );
       label2.setBounds( 10, 60, 150, 20 );
       panel1.add( label2 );

       JPasswordField fieldPass = new JPasswordField();
       fieldPass.setBounds( 10, 80, 150, 20 );
       panel1.add( fieldPass );
    }

    public void createPage2() {
       panel2 = new JPanel();
       panel2.setLayout( new BorderLayout() );

       panel2.add( new JButton( "North" ), BorderLayout.NORTH );
       panel2.add( new JButton( "South" ), BorderLayout.SOUTH );
       panel2.add( new JButton( "East" ), BorderLayout.EAST );
       panel2.add( new JButton( "West" ), BorderLayout.WEST );
       panel2.add( new JButton( "Center" ), BorderLayout.CENTER );
    }

    public void createPage3() {
       panel3 = new JPanel();
       panel3.setLayout( new GridLayout( 3, 2 ) );

       panel3.add( new JLabel( "Field 1:" ) );
       panel3.add( new TextArea() );
       panel3.add( new JLabel( "Field 2:" ) );
       panel3.add( new TextArea() );
       panel3.add( new JLabel( "Field 3:" ) );
       panel3.add( new TextArea() );
    }
}
