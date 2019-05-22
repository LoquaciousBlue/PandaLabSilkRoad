import java.util.Scanner;
import java.util.Random;

public class DemoTester {
  public static void main (String args[]) {

    //Creating all objects but Persons
    SilkRoad game = new SilkRoad();
    Player player = new Player();
    Time calender = new Time();
    Scanner scanner = new Scanner(System.in);
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Person p4 = new Person();
    Person p5 = new Person();

    while(true) {
      game.clearScreen();
      game.TravelMenu(player, calender, game, p1, p2, p3, p4, p5);
      calender.newDay();
      int temp = p1.getHealth();
      p1.setHealth(temp-1);
      temp = p2.getHealth();
      p2.setHealth(temp-2);
      temp = p3.getHealth();
      p3.setHealth(temp-3);
      temp = p4.getHealth();
      p4.setHealth(temp-4);
      String boop = scanner.nextLine();
    }


    /**
    while(calender.getSeason() != 3 && calender.getDay() != 91) {
      System.out.println(calender.getDate());
      calender.newDay();
      //System.out.println(calender.getDay());
      //System.out.println(calender.getSeason());
    }
    */

    /**
    int temp = calender.getDay();
    System.out.println(temp);
    calender.setDay(100);
    temp = calender.getDay();
    System.out.println(temp);
    calender.newDay();
    System.out.println(calender.getSeason());
    System.out.println(calender.getDay());


    */

    /**
    Creates a delay of 1 second
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(temp);

    */




  } //main bracket
}
