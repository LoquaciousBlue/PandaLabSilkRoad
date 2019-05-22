import java.util.Scanner;
import java.util.Random;

public class Tester {
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

    game.Start(scanner, game);

    game.Role(scanner, player, game);

    game.People(scanner, p1, p2, p3, p4, p5, game);

    game.FirstBuy(scanner, game);

    game.Buy(scanner, game, calender, player);

    game.Season(scanner, calender, game);





    int temp = calender.getDay();
    System.out.println(temp);
    calender.setDay(100);
    temp = calender.getDay();
    System.out.println(temp);
    calender.newDay();
    System.out.println(calender.getSeason());
    System.out.println(calender.getDay());
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(temp);






  } //main bracket
}
