import java.util.Scanner;


public class SilkRoad {

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
    System.out.println("");
    System.out.println("");
    System.out.println("Many people have traveled the Silk Road");
    System.out.println("What type of person are you?");
    System.out.println("");
    System.out.println(" 1. A Wealthy Banker");
    System.out.println("");
    System.out.println(" 2. An Experienced Hunter");
    System.out.println("");
    System.out.println(" 3. A Well Versed Trader");
    System.out.println("");
    System.out.println(" 4. More info?");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("What is your choice?");
  }

  public void RoleInfo() {
    System.out.println("");
    System.out.println("");
    System.out.println("1. Bankers");
    System.out.println("Bankers get more initial money due to the fact");
    System.out.println("they travel with extra money");
    System.out.println("");
    System.out.println("");
    System.out.println("2. Hunters");
    System.out.println("Hunters get more food when they hunt which will");
    System.out.println("help the survival of the group");
    System.out.println("");
    System.out.println("");
    System.out.println("3. Trader");
    System.out.println("Traders know the price of the things on the silk");
    System.out.println("road meaning they will get the best price");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to choice menu");
  }

  public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }



  public static void main (String args[]) {

    //Creating all objects but Persons
    SilkRoad game = new SilkRoad();
    game.clearScreen();
    game.clearScreen();
    game.StartScreen();
    Player player = new Player();
    Time calender = new Time();
    Scanner scanner = new Scanner(System.in);
    String Stemp = scanner.nextLine();


    /**
    While loop holding player until they type Ready
    */
    while (Stemp.compareTo("Ready") != 0) {
      game.clearScreen();
      game.StartScreen();
      Stemp = scanner.nextLine();
    }

    /**
    While loop looking for players choice in role
    */

    String role = "initial";
    boolean selected = false;
    boolean fix = false;
    while (selected != true) {
        if (role.compareTo("1") == 0) {
          player.setCash(1200);
          selected = true;
          break;
        }
        if (role.compareTo("2") == 0) {
          player.setFoodMult(1.25);
          selected = true;
          break;
        }
        if (role.compareTo("3") == 0) {
          player.setTradeRate(.8);
          selected = true;
          break;
        }
        if (role.compareTo("4") == 0) {
          game.clearScreen();
          game.RoleInfo();
          String unused = scanner.nextLine();
        }
        game.clearScreen();
        game.RolePick();
        role = scanner.nextLine();
    }

    /**
    While loop to make names for people
    */

    String name;
    boolean


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
