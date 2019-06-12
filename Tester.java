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

    game.Start(scanner, calender, game);

    game.Role(scanner, player, game, calender);

    game.People(scanner, p1, p2, p3, p4, p5, game, calender);

    game.FirstBuy(scanner, game);

    game.Buy(scanner, game, calender, player);

    game.Season(scanner, calender, game);


    game.Travel(player, scanner, calender, game, p1, p2, p3, p4, p5);



  } //main bracket
}
