import java.util.Scanner;


public class SilkRoad {

  public SilkRoad() {}


  public void StartScreen() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println(" #######                 ");
    System.out.println("    #     #    #  ###### ");
    System.out.println("    #     #    #  #      ");
    System.out.println("    #     ######  #####  ");
    System.out.println("    #     #    #  #      ");
    System.out.println("    #     #    #  #      ");
    System.out.println("    #     #    #  ###### ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("  #####                          ######                          ");
    System.out.println(" #     #  #  #       #    #      #     #   ####     ##    #####  ");
    System.out.println(" #        #  #       #   #       #     #  #    #   #  #   #    # ");
    System.out.println("  #####   #  #       ####        ######   #    #  #    #  #    # ");
    System.out.println("       #  #  #       #  #        #   #    #    #  ######  #    # ");
    System.out.println(" #     #  #  #       #   #       #    #   #    #  #    #  #    # ");
    System.out.println("  #####   #  ######  #    #      #     #   ####   #    #  #####  ");
    System.out.println("");
    System.out.println("");
    System.out.println("By: The Panda Lab");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("Enter 'Ready' when you're ready to begin your adventure");
  }

  public void Start(Scanner scanner, SilkRoad game) {
    game.clearScreen();
    game.clearScreen();
    game.StartScreen();
    String Stemp = scanner.nextLine();
    while (Stemp.compareTo("Ready") != 0) {
      game.clearScreen();
      game.StartScreen();
      Stemp = scanner.nextLine();
    }
  }

  public void Role(Scanner scanner, Player player, SilkRoad game) {
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
  }

  public void RolePick() {
    System.out.println("==================================================================================================================");
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
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("What is your choice?");
  }

  public void RoleInfo() {
    System.out.println("==================================================================================================================");
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
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to choice menu");
  }

  public void People(Scanner scanner, Person p1, Person p2, Person p3, Person p4, Person p5, SilkRoad game) {
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
  }

  public void FirstBuy(Scanner scanner, SilkRoad game) {
    game.clearScreen();
    game.PreBuyMenu();
    String unused = scanner.nextLine();
  }


  public void GroupNamesDisplay1(String name1, String name2, String name3, String name4, String name5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
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
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("When every party member is named, type 'Ready'");
    System.out.println("Once each member's name is set, it cannot be undone");
    System.out.println("Enter the corresponding number to change the");
    System.out.println("party member's name:");

  }

  public void GroupNamesDisplay2(int num, String name1, String name2, String name3, String name4, String name5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
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
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("What will member #"+num+" be called?");
  }

  public void PreBuyMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Before you embark on your journey, you will need to buy some supplies.");
    System.out.println("The nearby local store should have everything you need.");
    System.out.println("");
    System.out.println("");
    System.out.println("Things you may need to buy include food, clothes, and bullets for the members of your group.");
    System.out.println("");
    System.out.println("");
    System.out.println("On top of those items for the members of your party, you'll need to buy stuff for your cart.");
    System.out.println("This will include oxen to pull the card which you need, as well as possibly spare cart parts.");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to go to the shop");
  }


  public static boolean isInteger(String s) {
      try {
          Integer.parseInt(s);
      } catch(NumberFormatException e) {
          return false;
      } catch(NullPointerException e) {
          return false;
      }
      // only got here if we didn't return false
      return true;
  }

  public void Buy(Scanner scanner, SilkRoad game, Time calender, Player player) {
    game.clearScreen();

    double foodCost = player.getTradeRate()*(.25+.1*(calender.getStore()-1));

    double clothesCost = player.getTradeRate()*(10+5*(calender.getStore()-1));

    double bulletCost = player.getTradeRate()*(2+.25*(calender.getStore()-1));

    double oxCost = player.getTradeRate()*(40+5*(calender.getStore()-1));

    double tongueCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double wheelCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double axleCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double initial = player.getCash();

    String item = "100";
    double current = 0;

    String foodn;
    String clothesn;
    String bulletn;
    String tonguen;
    String oxn;
    String wheeln;
    String axlen;

    int cfoodn = 0;
    int cclothesn = 0;
    int cbulletn = 0;
    int coxn = 0;
    int cwheeln = 0;
    int caxlen = 0;
    int ctonguen = 0;

    int fcfoodn = 0;
    int fcclothesn = 0;
    int fcbulletn = 0;
    int fcoxn = 0;
    int fcwheeln = 0;
    int fcaxlen = 0;
    int fctonguen = 0;

    while (true) {
      if (item.compareTo("1") == 0) {
        game.clearScreen();
        game.BuyMenu2("a pound of food", player.getCash(), foodCost);
        foodn = scanner.nextLine();
        if (isInteger(foodn) == true) {
           cfoodn = Integer.parseInt(foodn);
          if (cfoodn >= 0) {
            fcfoodn = cfoodn;
          }
        }
      }
      if (item.compareTo("2") == 0) {
        game.clearScreen();
        game.BuyMenu2("a set of clothes", player.getCash(), clothesCost);
        clothesn = scanner.nextLine();
        if (isInteger(clothesn) == true) {
           cclothesn = Integer.parseInt(clothesn);
          if (cclothesn >= 0) {
            fcclothesn = cclothesn;
          }
        }
      }
      if (item.compareTo("3") == 0) {
        game.clearScreen();
        game.BuyMenu2("a box of bullets (20 Bulelts)", player.getCash(), bulletCost);
        bulletn = scanner.nextLine();
        if (isInteger(bulletn) == true) {
           cbulletn = Integer.parseInt(bulletn);
          if (cbulletn >= 0) {
            fcbulletn = cbulletn;
          }
        }
      }
      if (item.compareTo("4") == 0) {
        game.clearScreen();
        game.BuyMenu2("an oxen", player.getCash(), oxCost);
        oxn = scanner.nextLine();
        if (isInteger(oxn) == true) {
           coxn = Integer.parseInt(oxn);
          if (coxn >= 0 && 8 >= coxn && ((coxn + player.getOxen()) <= 8)) {
            fcoxn = coxn;
          }
        }
      }
      if (item.compareTo("5") == 0) {
        game.clearScreen();
        game.BuyMenu2("a wheel", player.getCash(), wheelCost);
        wheeln = scanner.nextLine();
        if (isInteger(wheeln) == true) {
           cwheeln = Integer.parseInt(wheeln);
          if (cwheeln > 0 && 3 >= cwheeln && ((cwheeln + player.getWheel()) <= 3)) {
            fcwheeln = cwheeln;
          }
        }
      }
      if (item.compareTo("6") == 0) {
        game.clearScreen();
        game.BuyMenu2("a tongue", player.getCash(), tongueCost);
        tonguen = scanner.nextLine();
        if (isInteger(tonguen) == true) {
           ctonguen = Integer.parseInt(tonguen);
          if (ctonguen > 0 && 3 >= ctonguen && ((ctonguen + player.getTongue()) <= 3)) {
            fctonguen = ctonguen;
          }
        }
      }
      if (item.compareTo("7") == 0) {
        game.clearScreen();
        game.BuyMenu2("an axle", player.getCash(), axleCost);
        axlen = scanner.nextLine();
        if (isInteger(axlen) == true) {
          caxlen = Integer.parseInt(axlen);
          if (caxlen > 0 && 3 >= caxlen && ((caxlen + player.getAxle()) <= 3)) {
            fcaxlen = caxlen;
          }
        }
      }

      if (item.compareTo("8") == 0) {
        game.clearScreen();
        game.ShopInfo();
        String weird = scanner.nextLine();
      }

      if ((item.compareTo("Ready") == 0) && initial > current && ((fcoxn + player.getOxen()) >= 2) && ((fcclothesn + player.getClothing()) >= 5)) {
        player.buyFood(fcfoodn);
        player.buyClothing(fcclothesn);
        player.buyAmmo(fcbulletn*20);
        player.buyOxen(fcoxn);
        player.buyWheel(fcwheeln);
        player.buyTongue(fctonguen);
        player.buyAxle(fcaxlen);

        player.spend(current);
        current = 0;
        break;
      }
      current = fcfoodn*foodCost + clothesCost*fcclothesn + bulletCost*fcbulletn + oxCost*fcoxn + tongueCost*fctonguen + wheelCost*fcwheeln + axleCost*fcaxlen;
      game.clearScreen();
      game.BuyMenu1(player.getFood() + fcfoodn, foodCost*player.getTradeRate(), player.getClothing() + fcclothesn, clothesCost*player.getTradeRate(), player.getBullets() + 20*fcbulletn, bulletCost*player.getTradeRate(), player.getOxen() + fcoxn, oxCost*player.getTradeRate(), player.getWheel() + fcwheeln, wheelCost*player.getTradeRate(), player.getTongue() + fctonguen, tongueCost*player.getTradeRate(), player.getAxle() + fcaxlen, axleCost*player.getTradeRate(), player.getCash(), current);
      item = scanner.nextLine();
    }
  }


  public void BuyMenu1(int foodAmount, double foodCost, int clothes, double clothesCost, int bullets, double bulletCost, int oxen, double oxCost, int wheels, double wheelCost, int tongues, double tongueCost, int axles, double axleCost, double initial, double current) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("What would you like to buy adventurer?");
    System.out.println("");
    System.out.println(" 1. Food: "+foodAmount+" lb");
    System.out.printf("Costs: $%.2f per pound", foodCost);
    System.out.println("");
    System.out.println("");
    System.out.println(" 2. Clothes: "+clothes+" sets");
    System.out.printf("Costs: $%.2f per set\n",clothesCost);
    System.out.println("Min: 5");
    System.out.println("");
    System.out.println(" 3. Ammunition: "+bullets+" bullets");
    System.out.printf("Costs: $%.2f per box (20 bullets)\n",bulletCost);
    System.out.println("");
    System.out.println(" 4. Oxen: "+oxen);
    System.out.printf("Costs: $%.2f per ox\n",oxCost);
    System.out.println("Max: 8 & Min: 2");
    System.out.println("");
    System.out.println(" 5. Wheels: "+wheels);
    System.out.printf("Costs: $%.2f per wheel\n", wheelCost);
    System.out.println("Max: 3");
    System.out.println("");
    System.out.println(" 6. Tongues: "+tongues);
    System.out.printf("Costs: $%.2f per tongue\n", tongueCost);
    System.out.println("Max: 3");
    System.out.println("");
    System.out.println(" 7. Axles: "+axles);
    System.out.printf("Costs: $%.2f per axle\n", axleCost);
    System.out.println("Max: 3");
    System.out.println("");
    System.out.printf(" 8. Need help buying stuff?");
    System.out.println("");
    System.out.println("");
    System.out.println("You have: $"+initial);
    System.out.println("Your bill is current: $"+current);
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("When you have everything you want to buy, type 'Ready'");
    System.out.println("Know that there will be more stores on the road");
    System.out.println("Enter the corresponding number to buy an item");
  }

  public void BuyMenu2(String item, double money, double cost) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("You have: $"+money);
    System.out.println("");
    System.out.println("");
    System.out.println("The price of "+item+" is $"+cost+"");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("How many units do you want to buy?");
  }

  public void ShopInfo() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Food is necessary to keep your group moving along. Without food, your party will get sick or worse.");
    System.out.println("");
    System.out.println("Clothes are needed to keep your party warm. Without clothing, your party will get sick or worse.");
    System.out.println("");
    System.out.println("Ammunition is needed to hunt animals for food. ");
    System.out.println("");
    System.out.println("Oxen are needed to pull the wagon. Without them, you will be going at a snails pace.");
    System.out.println("");
    System.out.println("Wheels, Tongues, and Axels are spare parts for the wagon incase other parts break.");
    System.out.println("If you can't replace the part, you won't be getting anywhere fast.");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to shop menu");
  }

  public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }

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

    

    while()




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
