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


  public void BuyMenu1(int foodAmount, double foodCost, int clothes, double clothesCost, int bullets, double bulletCost, int oxen, double oxCost, int wheels, double wheelCost, int tongues, double tongueCost, int axles, double axleCost, double initial, double current) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("What would you like to buy adventurer?");
    System.out.println("");
    System.out.println("");
    System.out.println(" 1. Food: "+foodAmount+" lb");
    System.out.println("Costs "+foodCost+" per pound");
    System.out.println("");
    System.out.println(" 2. Clothes: "+clothes+" sets");
    System.out.println("Costs "+clothesCost+" per set");
    System.out.println("Min: 5");
    System.out.println("");
    System.out.println(" 3. Ammunition: "+bullets+" bullets");
    System.out.println("Costs "+bulletCost+" per box (20 bullets)");
    System.out.println("");
    System.out.println(" 4. Oxen: "+oxen);
    System.out.println("Costs "+oxCost+" per ox");
    System.out.println("Max: 8 & Min: 2");
    System.out.println("");
    System.out.println(" 5. Cart Wheels: "+wheels);
    System.out.println("Costs "+wheelCost+" per wheel");
    System.out.println("Max: 3");
    System.out.println("");
    System.out.println(" 6. Tongues: "+tongues);
    System.out.println("Costs "+tongueCost+" per tongue");
    System.out.println("Max: 3");
    System.out.println("");
    System.out.println(" 7. Axles: "+axles);
    System.out.println("Costs "+axleCost+" per wheel");
    System.out.println("Max: 3");
    System.out.println("");
    System.out.println(" 8. Need help buying stuff?");
    System.out.println("");
    System.out.println("You started with: $"+initial);
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
    System.out.println("You have $"+money);
    System.out.println("");
    System.out.println("");
    System.out.println("The price of "+item+" is "+cost+"");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("How many do you want to buy?");
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

    game.clearScreen();
    game.PreBuyMenu();
    String unused = scanner.nextLine();

    double foodCost = player.getTradeRate()*(.25+.1*calender.getStore());

    double clothesCost = player.getTradeRate()*(10+5*calender.getStore());

    double bulletCost = player.getTradeRate()*(2+.25*calender.getStore());

    double oxCost = player.getTradeRate()*(40+5*calender.getStore());

    double tongueCost = player.getTradeRate()*(10+2*calender.getStore());

    double wheelCost = player.getTradeRate()*(10+2*calender.getStore());

    double axleCost = player.getTradeRate()*(10+2*calender.getStore());

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


    while (true) {
      if (item.compareTo("1") == 0) {
        game.clearScreen();
        game.BuyMenu2("food", player.getCash(), foodCost);
        foodn = scanner.nextLine();
        if (isInteger(foodn) == true) {
          int cfoodn = Integer.parseInt(foodn);
          if (cfoodn > 0) {
            player.setFood(cfoodn);
          }
        }
      }
      if (item.compareTo("2") == 0) {
        game.clearScreen();
        game.BuyMenu2("clothes", player.getCash(), clothesCost);
        clothesn = scanner.nextLine();
        if (isInteger(clothesn) == true) {
          int cclothesn = Integer.parseInt(clothesn);
          if (cclothesn > 0) {
            player.setClothing(cclothesn);
          }
        }
      }
      if (item.compareTo("3") == 0) {
        game.clearScreen();
        game.BuyMenu2("bullets", player.getCash(), bulletCost);
        bulletn = scanner.nextLine();
        if (isInteger(bulletn) == true) {
          int cbulletn = Integer.parseInt(bulletn);
          if (cbulletn > 0) {
            player.setBullets(cbulletn*20);
          }
        }
      }
      if (item.compareTo("4") == 0) {
        game.clearScreen();
        game.BuyMenu2("oxen", player.getCash(), oxCost);
        oxn = scanner.nextLine();
        if (isInteger(oxn) == true) {
          int coxn = Integer.parseInt(oxn);
          if (coxn >= 2 && 8 >= coxn) {
            player.setOxen(coxn);
          }
        }
      }
      if (item.compareTo("5") == 0) {
        game.clearScreen();
        game.BuyMenu2("wheel", player.getCash(), wheelCost);
        wheeln = scanner.nextLine();
        if (isInteger(wheeln) == true) {
          int cwheeln = Integer.parseInt(wheeln);
          if (cwheeln > 0 && 3 >= cwheeln) {
            player.setWheel(cwheeln);
          }
        }
      }
      if (item.compareTo("6") == 0) {
        game.clearScreen();
        game.BuyMenu2("tongue", player.getCash(), tongueCost);
        tonguen = scanner.nextLine();
        if (isInteger(tonguen) == true) {
          int ctonguen = Integer.parseInt(tonguen);
          if (ctonguen > 0 && 3 >= ctonguen) {
            player.setTongue(ctonguen);
          }
        }
      }
      if (item.compareTo("7") == 0) {
        game.clearScreen();
        game.BuyMenu2("axle", player.getCash(), axleCost);
        axlen = scanner.nextLine();
        if (isInteger(axlen) == true) {
          int caxlen = Integer.parseInt(axlen);
          if (caxlen > 0 && 3 >= caxlen) {
            player.setAxle(caxlen);
          }
        }
      }
      if ((item.compareTo("Ready") == 0) && player.getCash() > current && player.getOxen() >= 2 && player.getClothing() >= 5) {
        player.spend(current);
        break;
      }
      current = cfoodn*foodCost + clothesCost*cclothesn + bulletCost*cbulletn + oxCost*coxn + tongueCost*ctonguen + wheelCost*cwheeln + axleCost*caxlen;
      game.clearScreen();
      game.BuyMenu1(player.getFood(), foodCost*player.getTradeRate(), player.getClothing(), clothesCost*player.getTradeRate(), player.getBullets(), bulletCost*player.getTradeRate(), player.getOxen(), oxCost*player.getTradeRate(), player.getWheel(), wheelCost*player.getTradeRate(), player.getTongue(), tongueCost*player.getTradeRate(), player.getAxle(), axleCost*player.getTradeRate(), player.getCash(), current);
      item = scanner.nextLine();
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






  } //main bracket

}
