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

  public void GroupNamesDisplay1(String name1, String name2, String name3, String name4, String name5) {
    System.out.println("");
    System.out.println("What will the members of your party be named?");
    System.out.println("");
    System.out.println("1. " +name1);
    System.out.println("");
    System.out.println("");
    System.out.println("2. " +name2);
    System.out.println("");
    System.out.println("");
    System.out.println("3. " +name3);
    System.out.println("");
    System.out.println("");
    System.out.println("4. " +name4);
    System.out.println("");
    System.out.println("");
    System.out.println("5. " +name5);
    System.out.println("");
    System.out.println("When every party member is named, type 'Ready'");
    System.out.println("Once each member's name is set, it cannot be undone");
    System.out.println("Enter the corresponding number to change the");
    System.out.println("party member's name:");

  }

  public void GroupNamesDisplay2(int num, String name1, String name2, String name3, String name4, String name5) {
    System.out.println("");
    System.out.println("What will the members of your party be named?");
    System.out.println("");
    System.out.println("1. " +name1);
    System.out.println("");
    System.out.println("");
    System.out.println("2. " +name2);
    System.out.println("");
    System.out.println("");
    System.out.println("3. " +name3);
    System.out.println("");
    System.out.println("");
    System.out.println("4. " +name4);
    System.out.println("");
    System.out.println("");
    System.out.println("5. " +name5);
    System.out.println("");
    System.out.println("");
    System.out.println("What will member #"+num+" be called?");
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
    while (true) {
        if (role.compareTo("1") == 0) {
          player.setCash(1200);
          break;
        }
        if (role.compareTo("2") == 0) {
          player.setFoodMult(1.25);
          break;
        }
        if (role.compareTo("3") == 0) {
          player.setTradeRate(.8);
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
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
    Person p4 = new Person();
    Person p5 = new Person();

    String name = "initial";
    String name2 = "";
    while (true) {
      if (name.compareTo("1") == 0) {
        game.clearScreen();
        game.GroupNamesDisplay2(1, p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
        name2 = scanner.nextLine();
        p1.setName(name2);
      }
      if (name.compareTo("2") == 0) {
        game.clearScreen();
        game.GroupNamesDisplay2(2, p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
        name2 = scanner.nextLine();
        p2.setName(name2);
      }
      if (name.compareTo("3") == 0) {
        game.clearScreen();
        game.GroupNamesDisplay2(3, p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
        name2 = scanner.nextLine();
        p3.setName(name2);
      }
      if (name.compareTo("4") == 0) {
        game.clearScreen();
        game.GroupNamesDisplay2(4, p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
        name2 = scanner.nextLine();
        p4.setName(name2);
      }
      if (name.compareTo("5") == 0) {
        game.clearScreen();
        game.GroupNamesDisplay2(5, p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
        name2 = scanner.nextLine();
        p5.setName(name2);
      }
      if ((name.compareTo("Ready") == 0) && (p1.getName().compareTo("") != 0) && (p2.getName().compareTo("") != 0) && (p3.getName().compareTo("") != 0) && (p4.getName().compareTo("") != 0) && (p5.getName().compareTo("") != 0)) {
        break;
      }
      game.clearScreen();
      game.GroupNamesDisplay1(p1.getName(), p2.getName(), p3.getName(), p4.getName(), p5.getName());
      name = scanner.nextLine();
    }



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
  }

}
