import java.util.Scanner;


public class SilkRoad {
  float FoodMult = 1;
  float tradeRate = 1;

  public SilkRoad() {}

  public void StartScreen() {
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("======================================================");
    System.out.println("");
    System.out.println("The Silk Road");
    System.out.println("");
    System.out.println("By: Edwin Aldrich");
    System.out.println("");
    System.out.println("======================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Enter 'Ready' when you're ready to begin your adventure");
  }

  public void RolePick() {

  }

  public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }







  public static void main (String args[]) {
    SilkRoad game = new SilkRoad();
    game.StartScreen();
    Player player = new Player();
    Time calender = new Time();
    Scanner scanner = new Scanner(System.in);
    String Stemp = scanner.nextLine();
    while (Stemp.compareTo("Ready") != 0) {
      game.clearScreen();
      game.StartScreen();
      System.out.println(Stemp);
      Stemp = scanner.nextLine();
    }
    game.clearScreen();



    String person1 = "Logan";
    String person2 = "Edwin";
    Person p1 = new Person(person1);
    Person p2 = new Person(person2);
    int temp = calender.getDay();
    System.out.println(temp);
    calender.setDay(100);
    temp = calender.getDay();
    System.out.println(temp);
    calender.newDay();
    System.out.println(calender.getSeason());
    System.out.println(calender.getDay());
    temp = p1.getHealth();
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    System.out.println(temp);
  }

}
