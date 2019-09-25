import java.util.Scanner;
import java.util.Random;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Tester {
  public static void main (String args[]) {

    //Creating all objects but Persons
    JFrame frame = new JFrame();
    SilkRoad game = new SilkRoad();
    Player player = new Player();
    Time calender = new Time();
    Scanner scanner = new Scanner(System.in);
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Person p4 = new Person();
    Person p5 = new Person();

    game.Start(frame, scanner, calender, game);

    game.Role(scanner, player, game, calender);

    game.People(scanner, p1, p2, p3, p4, p5, game, calender);

    game.FirstBuy(scanner, game);

    game.Buy(scanner, game, calender, player);

    game.Season(scanner, calender, game);


    game.Travel(player, scanner, calender, game, p1, p2, p3, p4, p5);



  } //main bracket
}
