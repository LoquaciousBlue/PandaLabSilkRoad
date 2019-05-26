import java.util.Scanner;
import java.util.Random;


public class SilkRoad {

  public SilkRoad() {
    int totalDays = 0;
  }


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
    System.out.println("Enter 'R' when you're ready to begin your adventure");
  }

  public void Start(Scanner scanner, SilkRoad game) {
    game.clearScreen();
    game.clearScreen();
    game.StartScreen();
    String Stemp = scanner.nextLine();
    while (Stemp.compareTo("R") != 0) {
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
      if ((name.compareTo("R") == 0) && (p1.getName().compareTo("") != 0) && (p2.getName().compareTo("") != 0) && (p3.getName().compareTo("") != 0) && (p4.getName().compareTo("") != 0) && (p5.getName().compareTo("") != 0)) {
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
    System.out.println("When every party member is named, type 'R'");
    System.out.println("");
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
        game.BuyMenu2("a box of bullets (20 Bullets)", player.getCash(), bulletCost);
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
      if (calender.getStore() == 1) {
        if ((item.compareTo("R") == 0) &&  initial > current && ((fcoxn + player.getOxen()) >= 2) && ((fcclothesn + player.getClothing()) >= 5)) {
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
      } else {
        if ((item.compareTo("R") == 0) &&  initial > current) {
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
    }


      current = fcfoodn*foodCost + clothesCost*fcclothesn + bulletCost*fcbulletn + oxCost*fcoxn + tongueCost*fctonguen + wheelCost*fcwheeln + axleCost*fcaxlen;
      game.clearScreen();
      game.BuyMenu1(player.getFood() + fcfoodn, foodCost, player.getClothing() + fcclothesn, clothesCost, player.getBullets() + 20*fcbulletn, bulletCost, player.getOxen() + fcoxn, oxCost, player.getWheel() + fcwheeln, wheelCost, player.getTongue() + fctonguen, tongueCost, player.getAxle() + fcaxlen, axleCost, player.getCash(), current);
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
    System.out.println("When you have everything you want to buy, type 'R'");
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

  public void Season(Scanner scanner, Time calender, SilkRoad game) {
    String season = "initial";
    while (true) {
        if (season.compareTo("1") == 0) {
          calender.setSeason(0);
          break;
        }
        if (season.compareTo("2") == 0) {
          calender.setSeason(1);
          break;
        }
        if (season.compareTo("3") == 0) {
          calender.setSeason(2);
          break;
        }
        if (season.compareTo("4") == 0) {
          calender.setSeason(3);
          break;
        }
        if (season.compareTo("5") == 0) {
          game.clearScreen();
          game.SeasonInfo();
          String sunused = scanner.nextLine();
        }
        game.clearScreen();
        game.SeasonPick();
        season = scanner.nextLine();
    }
  }

  public void SeasonPick() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("When would you like to begin your journey?");
    System.out.println("");
    System.out.println(" 1. Winter");
    System.out.println("");
    System.out.println(" 2. Spring");
    System.out.println("");
    System.out.println(" 3. Summer");
    System.out.println("");
    System.out.println(" 4. Fall");
    System.out.println("");
    System.out.println(" 5. Need help choosing when to leave?");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("What is your choice?");
  }

  public void SeasonInfo() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("Your pace should help you determine when you want to go");
    System.out.println("");
    System.out.println("The winter has harsh weather that will make your party more susceptible to certain illnesses");
    System.out.println("");
    System.out.println("Conversely, the summer can be also quite hot resulting in illness in your party aswell");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to choice menu");
  }

  public String checkHealth(Person p1, Person p2, Person p3, Person p4, Person p5, SilkRoad game) {
    p1.checkKill();
    p2.checkKill();
    p3.checkKill();
    p4.checkKill();
    p5.checkKill();
    double totalhp = 0;
    int alive = 0;
    if (p1.isAlive() == true) {
      alive++;
      totalhp += p1.getHealth();
    }
    if (p2.isAlive() == true) {
      alive++;
      totalhp += p2.getHealth();
    }
    if (p3.isAlive() == true) {
      alive++;
      totalhp += p3.getHealth();
    }
    if (p4.isAlive() == true) {
      alive++;
      totalhp += p4.getHealth();
    }
    if (p5.isAlive() == true) {
      alive++;
      totalhp += p5.getHealth();
    }
    double status = totalhp/alive;

    if (status > 95) {
      return "Very Healthy";
    } else if (status > 80) {
      return "Healthy";
    } else if (status > 65) {
      return "Sufficent";
    } else if (status > 60) {
      return  "Poor";
    } else {
      return "Critical";
    }

  }


  public void TravelMenu(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            Travel Menu:");
    System.out.println("");
    System.out.println(calender.getDate());
    System.out.println("");
    System.out.println("Weather: "+ calender.weatherString(calender.getWeather()));
    System.out.println("");
    System.out.println("Health: "+ game.checkHealth(p1, p2, p3, p4, p5, game));
    System.out.println("");
    System.out.println("Food: "+ player.getFood());
    System.out.println("");
    System.out.println("Traveled Miles: ");
    System.out.println("");
    System.out.println("Next Landmark: ");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type Anything to travel a days worth of time");
    System.out.println("Type 'Menu' for your on road Menu:");
  }

  public void TravelMenu2(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            Travel Menu: (Auto Traveling)");
    System.out.println("");
    System.out.println(calender.getDate());
    System.out.println("");
    System.out.println("Weather: "+ calender.weatherString(calender.getWeather()));
    System.out.println("");
    System.out.println("Health: "+ game.checkHealth(p1, p2, p3, p4, p5, game));
    System.out.println("");
    System.out.println("Food: "+ player.getFood());
    System.out.println("");
    System.out.println("Traveled Miles: ");
    System.out.println("");
    System.out.println("Next Landmark: ");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
  }

  public void TravelMenu3(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            Travel Menu: (Resting)");
    System.out.println("");
    System.out.println(calender.getDate());
    System.out.println("");
    System.out.println("Weather: "+ calender.weatherString(calender.getWeather()));
    System.out.println("");
    System.out.println("Health: "+ game.checkHealth(p1, p2, p3, p4, p5, game));
    System.out.println("");
    System.out.println("Food: "+ player.getFood());
    System.out.println("");
    System.out.println("Traveled Miles: ");
    System.out.println("");
    System.out.println("Next Landmark: ");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
  }


    public void newDayStatusCheck(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      calender.newDay();
      //int RE[] = RandomEvent(player, scanner, calender, game, p1, p2, p3, p4, p5);

      //Create random events via calender
      //Create travel time here

    }


    public void RandomEvent(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int event = rand.nextInt(10);
      if (event == 7) { // good event
        game.clearScreen();
        event = rand.nextInt(5);
        if(event == 0) {
          //found cart
        } else if (event == 1) {
          //found oxen
        } else if (event == 2) {
          //found medecine
        } else if (event == 3) {
          //found shortcut to city
        } else {
          //found berry bush or root vegetables
        }
        //Good event scnree
        String goodevent = scanner.nextLine();
        return;
      }
      if (event == 4) { // bad event
        game.clearScreen();

        event = rand.nextInt(9);
        if(event == 0) {
          //blizard or rainstorm
        } else if (event == 1) {
          //robber
        } else if (event == 2) {
          //instant illness on everyone
        } else if (event == 3) {
          //wrong road
        } else if (event == 4) {
          //broken wheel
        } else if (event == 5) {
          //broken tongue
        } else if (event == 6) {
          //dead oxen(s)
        } else if (event == 7) {
          //murderer
        } else {
          //Cart fire
        }
        //Bad event screen
        String badevent = scanner.nextLine();
        return;
      }

    }


    public void Travel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      String isMenu = "";
      while (isMenu.compareTo("Menu") != 0) {
        game.clearScreen();
        game.TravelMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);
        isMenu = scanner.nextLine();
        if (isMenu.compareTo("Menu") != 0) {
          game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
      }
      game.clearScreen();
      game.OnRoadMenu();
      game.OnRoadInput(player, scanner, calender, game, p1, p2, p3, p4, p5);
    }

  public void OnRoadMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            Travel Menu:");
    System.out.println("");
    System.out.println("1. Return to travel menu");
    System.out.println("");
    System.out.println("2. Auto Travel");
    System.out.println("");
    System.out.println("3. Map");
    System.out.println("");
    System.out.println("4. Supplies & Members Status");
    System.out.println("");
    System.out.println("5. Set Pace");
    System.out.println("");
    System.out.println("6. Set Rations");
    System.out.println("");
    System.out.println("7. Rest");
    System.out.println("");
    System.out.println("8. Trade");
    System.out.println("");
    System.out.println("9. Hunt");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Enter which action you want to perform:");
  }

  public void AutoTravelMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("By auto-traveling, you will travel for a set number of days");
    System.out.println("You should note that you won't have access to the travel menu during this period");
    System.out.println("You will still be informed of random events or coming across a city");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type a number to travel that many days.");
    System.out.println("Type 'Menu' if you want to return");
  }

  public void RestMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("By resting, you will allow members of your party to heal from ailments");
    System.out.println("You should note that you won't have access to the travel menu during this period");
    System.out.println("You will still be informed of random events or coming across a city");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type a number to rest that many days.");
    System.out.println("Type 'Menu' if you want to return");
  }

  public void StatusMenu(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5){
    int totalAlive = game.getTotalAliveMembers(p1, p2, p3, p4, p5);

    String alive = "";
    if (p1.isAlive() == false) {
      alive = "(Dead)";
    }
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Members Status:                                     "+totalAlive+"/5 of your members are alive");
    System.out.println(p1.getName()+": "+alive);
    System.out.println("Bubonic Plague: "+p1.getBubonicPlague()+"    Smallpox: "+p1.getSmallpox()+"   Anthrax: "+p1.getAnthrax()+"   Leprosy: "+p1.getLeprosy()+"   Measles: "+p1.getMeasles());
    System.out.println("");

    alive = "";
    if (p2.isAlive() == false) {
      alive = "(Dead)";
    }

    System.out.println(p2.getName()+": "+alive);
    System.out.println("Bubonic Plague: "+p2.getBubonicPlague()+"    Smallpox: "+p2.getSmallpox()+"   Anthrax: "+p2.getAnthrax()+"   Leprosy: "+p2.getLeprosy()+"   Measles: "+p2.getMeasles());
    System.out.println("");

    alive = "";
    if (p3.isAlive() == false) {
      alive = "(Dead)";
    }

    System.out.println(p3.getName()+": "+alive);
    System.out.println("Bubonic Plague: "+p3.getBubonicPlague()+"    Smallpox: "+p3.getSmallpox()+"   Anthrax: "+p3.getAnthrax()+"   Leprosy: "+p3.getLeprosy()+"   Measles: "+p3.getMeasles());
    System.out.println("");

    alive = "";
    if (p4.isAlive() == false) {
      alive = "(Dead)";
    }

    System.out.println(p4.getName()+": "+alive);
    System.out.println("Bubonic Plague: "+p4.getBubonicPlague()+"    Smallpox: "+p4.getSmallpox()+"   Anthrax: "+p4.getAnthrax()+"   Leprosy: "+p4.getLeprosy()+"   Measles: "+p1.getMeasles());
    System.out.println("");

    alive = "";
    if (p5.isAlive() == false) {
      alive = "(Dead)";
    }
    System.out.println(p5.getName()+": "+alive);
    System.out.println("Bubonic Plague: "+p5.getBubonicPlague()+"    Smallpox: "+p5.getSmallpox()+"   Anthrax: "+p5.getAnthrax()+"   Leprosy: "+p5.getLeprosy()+"   Measles: "+p5.getMeasles());

    String pace = "";
    if (player.getPaceCoef() == 1) {
      pace = "Steady";
    }
    if (player.getPaceCoef() == 1.5) {
      pace = "Strenuous";
    }
    if (player.getPaceCoef() == 2) {
      pace = "Grueling";
    }

    String ration = "";
    if (player.getRationCoef() == 3) {
      ration = "Filling";
    }
    if (player.getRationCoef() == 2) {
      ration = "Meager";
    }
    if (player.getRationCoef() == 1) {
      ration = "Barebones";
    }


    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Supplies Status:");
    System.out.println("");
    System.out.println("Food: "+player.getFood()+"  Clothes: "+player.getClothing()+"   Bullets: "+player.getBullets()+"  Cash: "+player.getCash()+ "");
    System.out.println("Oxen: "+player.getOxen()+"  Wheels: "+player.getWheel()+"   Axles: "+player.getAxle()+"  Tongues: "+player.getTongue()+"");
    System.out.println("");
    System.out.println("Pace: "+pace);
    System.out.println("Rations: "+ration);
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to Travel Menu: ");
  }

  public void Status(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.StatusMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);
    String statustemp = scanner.nextLine();
  }

  public void AutoTravel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.AutoTravelMenu();
    String travel = scanner.nextLine();
    if (travel.compareTo("Menu") == 0) {
      return;
    }
    if (isInteger(travel) != true) {
      return;
    }
    int traveldays = Integer.parseInt(travel);

    for(int i = 0; traveldays > i; i++) {
      game.clearScreen();
      game.TravelMenu2(player, scanner, calender, game, p1, p2, p3, p4, p5);
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
      try
      {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
    }
    game.clearScreen();
    game.TravelMenu2(player, scanner, calender, game, p1, p2, p3, p4, p5);
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
  }

  public void Rest(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.RestMenu();
    String rest = scanner.nextLine();
    if (rest.compareTo("Menu") == 0) {
      return;
    }
    if (isInteger(rest) != true) {
      return;
    }
    int restdays = Integer.parseInt(rest);

    for(int i = 0; restdays > i; i++) {
      game.clearScreen();
      game.TravelMenu3(player, scanner, calender, game, p1, p2, p3, p4, p5);
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
      try
      {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
    }
    game.clearScreen();
    game.TravelMenu3(player, scanner, calender, game, p1, p2, p3, p4, p5);
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
  }

  public void PaceMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Pacing your travel is important. Traveling too slowly may result in encumbering bad weather and poor time.");
    System.out.println("Travel too fast and you may risk the well being of your party");
    System.out.println("");
    System.out.println("1. Steady (A solid 8 hours of travel a day)");
    System.out.println("");
    System.out.println("2. Strenuous (A hard 12 hours of travel a day)");
    System.out.println("");
    System.out.println("3. Grueling (A challenging 16 hours of travel a day)");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type a number to ration your food.");
    System.out.println("Type 'Menu' if you want to return");
  }

  public void Pace(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.PaceMenu();
    String travelPace = scanner.nextLine();
    if (travelPace.compareTo("Menu") == 0) {
      return;
    }
    if (isInteger(travelPace) != true) {
      return;
    }
    int travelPaceInt = Integer.parseInt(travelPace);

    if (travelPaceInt == 1) {
      player.setPaceCoef(1);
    }
    if (travelPaceInt == 2) {
      player.setPaceCoef(1.5);
    }
    if (travelPaceInt == 3) {
      player.setPaceCoef(2);
    }

  }

  public int getTotalAliveMembers(Person p1, Person p2, Person p3, Person p4, Person p5) {
    int totalAlive = 0;
    if (p1.isAlive() == true) {
      totalAlive++;
    }
    if (p2.isAlive() == true) {
      totalAlive++;
    }
    if (p3.isAlive() == true) {
      totalAlive++;
    }
    if (p4.isAlive() == true) {
      totalAlive++;
    }
    if (p5.isAlive() == true) {
      totalAlive++;
    }
    return totalAlive;
  }

  public void RationsMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Rationing your food is important. Having good portions helps travelers health.");
    System.out.println("Although, eating too much can result in a lack of food");
    System.out.println("");
    System.out.println("1. Filling (Travelers will be feeling strong and ready to travel)");
    System.out.println("");
    System.out.println("2. Meager (Enough for travelers to keep going)");
    System.out.println("");
    System.out.println("3. Barebones (Travelers will be going to sleep hungry)");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type a number to ration your food.");
    System.out.println("Type 'Menu' if you want to return");
  }

  public void Rations(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.RationsMenu();
    String rationString = scanner.nextLine();
    if (rationString.compareTo("Menu") == 0) {
      return;
    }
    if (isInteger(rationString) != true) {
      return;
    }
    int rationInt = Integer.parseInt(rationString);

    if (rationInt == 1) {
      player.setRationCoef(3);
    }
    if (rationInt == 2) {
      player.setRationCoef(2);
    }
    if (rationInt == 3) {
      player.setRationCoef(1);
    }

  }

  public void HuntFailsMenu(int index) {
    String whoops = "";
    if (index == -1) {
      whoops = "You decided to go hunting without bullets...";
    }
    if (index == -2) {
      whoops = "The weather was so cold that no animals were about";
    }
    if (index == -3) {
      whoops = "The weather was so hot that no animals were about";
    }
    if (index == -4) {
      whoops = "Even with all your ammo, you couldn't hit anything.";
    }
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("The Hunt Didn't go well...");
    System.out.println("");
    System.out.println(whoops);
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to the menu");

  }

  public void HuntingMenu(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Hunting will be a key way to sustain yourself while on the road.");
    System.out.println("Before hunting, you must allocate a certain amount of bullets to the hunt");
    System.out.println("It's important to note that when you hunt, you can only take 50 Lb of food");
    System.out.println("per person in your party for each hunt.");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("You have: "+player.getBullets()+" bullets");
    System.out.println("");
    System.out.println("Type 'Menu' if you want to return to the menu");
    System.out.println("Type the number of bullets you will be using for your hunt.");
  }

  public void HuntingResults(int bears, int dears, int monkeys, int snakes, int foxes, int rabbits, int geese, int ducks, int bullets, int totalfood, int gatheredfood) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("That was a successful Hunt!");
    System.out.println("");
    System.out.println("What you got:");
    System.out.println("");
    System.out.println("Bears: "+bears);
    System.out.println("Dears: "+dears);
    System.out.println("Monkeys: "+monkeys);
    System.out.println("Snakes: "+snakes);
    System.out.println("Foxes: "+foxes);
    System.out.println("Rabbits: "+rabbits);
    System.out.println("Geese: "+geese);
    System.out.println("Ducks: "+ducks);
    System.out.println("");
    System.out.println("You used a total of "+bullets+" during the hunt.");
    System.out.println("");
    System.out.println("Of the "+totalfood+" lb you were able to hunt, you were able to salvage "+gatheredfood+" lb of it.");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type anything to return to the menu");
  }

  public void Hunting(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.HuntingMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);

    String bullets = scanner.nextLine();
    if (bullets.compareTo("Menu") == 0) {
      return;
    }
    if (isInteger(bullets) != true) {
      return;
    }
    int bulletsInt = Integer.parseInt(bullets);

    int HuntVar = 0;

    if (player.getBullets() <= 0) {
      HuntVar = -1;
    }
    if (calender.getWeather() == -2) {
      HuntVar = -2;
    }
    if (calender.getWeather() == 6) {
      HuntVar = -3;
    }
    if (HuntVar < 0) {
      game.clearScreen();
      game.HuntFailsMenu(HuntVar);
      String huntfail = scanner.nextLine();
      return;
    }

    if (bulletsInt > player.getBullets()) {
      bulletsInt = player.getBullets();
    }

    Random rand = new Random();

    int Bears = 0;
    int Dears = 0;
    int Monkeys = 0;
    int Snakes = 0;
    int Foxes = 0;
    int Rabbits = 0;
    int Geese = 0;
    int Ducks = 0;

    int ShootRNG = 0;
    for (int i = 0; i != bulletsInt; i++) {
      ShootRNG = rand.nextInt(400);
      if (ShootRNG == 1 || ShootRNG == 2 || ShootRNG == 3 || ShootRNG == 4 || ShootRNG == 5) {
        Bears++;
      }
      if (ShootRNG == 10 || ShootRNG == 11 || ShootRNG == 12 || ShootRNG == 13 || ShootRNG == 14) {
        Dears++;
      }
      if (ShootRNG == 20 || ShootRNG == 21 || ShootRNG == 22 || ShootRNG == 23 || ShootRNG == 24) {
        Monkeys++;
      }
      if (ShootRNG == 31 || ShootRNG == 32 || ShootRNG == 33 || ShootRNG == 34 || ShootRNG == 35) {
        Snakes++;
      }
      if (ShootRNG == 41 || ShootRNG == 42 || ShootRNG == 43 || ShootRNG == 44 || ShootRNG == 45) {
        Foxes++;
      }
      if (ShootRNG == 51 || ShootRNG == 52 || ShootRNG == 53 || ShootRNG == 54 || ShootRNG == 55) {
        Rabbits++;
      }
      if (ShootRNG == 61 || ShootRNG == 62 || ShootRNG == 63 || ShootRNG == 64 || ShootRNG == 65) {
        Geese++;
      }
      if (ShootRNG == 71 || ShootRNG == 72 || ShootRNG == 73 || ShootRNG == 74 || ShootRNG == 75) {
        Ducks++;
      }
      if (player.getFoodMult() == 1.25) {
        if (ShootRNG == 6 || ShootRNG == 7 || ShootRNG == 8 || ShootRNG == 9 || ShootRNG == 0) {
          Bears++;
        }
        if (ShootRNG == 15 || ShootRNG == 16 || ShootRNG == 17 || ShootRNG == 18 || ShootRNG == 19) {
          Dears++;
        }
        if (ShootRNG == 25 || ShootRNG == 26 || ShootRNG == 27 || ShootRNG == 28 || ShootRNG == 29) {
          Monkeys++;
        }
        if (ShootRNG == 35 || ShootRNG == 36 || ShootRNG == 37 || ShootRNG == 38 || ShootRNG == 39) {
          Snakes++;
        }
        if (ShootRNG == 45 || ShootRNG == 46 || ShootRNG == 47 || ShootRNG == 48 || ShootRNG == 49) {
          Foxes++;
        }
        if (ShootRNG == 55 || ShootRNG == 56 || ShootRNG == 57 || ShootRNG == 58 || ShootRNG == 59) {
          Rabbits++;
        }
        if (ShootRNG == 65 || ShootRNG == 66 || ShootRNG == 67 || ShootRNG == 68 || ShootRNG == 69) {
          Geese++;
        }
        if (ShootRNG == 75 || ShootRNG == 76 || ShootRNG == 77 || ShootRNG == 78 || ShootRNG == 79) {
          Ducks++;
        }
      }

    }
    int totalFood = 0;
    totalFood = 75*Bears+45*Dears+20*Monkeys+10*Snakes+7*Foxes+5*Rabbits+4*Geese+3*Ducks;

    if (totalFood == 0) {
      game.clearScreen();
      game.HuntFailsMenu(-4);
      player.loseAmmo(bulletsInt);
      String huntfail2 = scanner.nextLine();
      return;
    }

    int totalAlive = game.getTotalAliveMembers(p1, p2, p3, p4, p5);

    int salvagedFood = 0;
    if (totalAlive*50 >= totalFood) {
      salvagedFood = totalFood;
    } else {
      salvagedFood = totalAlive*50;
    }
    player.buyFood(salvagedFood);
    player.loseAmmo(bulletsInt);
    game.clearScreen();
    game.HuntingResults(Bears, Dears, Monkeys, Snakes, Foxes, Rabbits, Geese, Ducks, bulletsInt, totalFood, salvagedFood);
    String results = scanner.nextLine();

  }




  public void OnRoadInput(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {

    String road = "initial";
    while (true) {
        if (road.compareTo("1") == 0) {
          game.clearScreen();
          game.Travel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("2") == 0) {
          game.clearScreen();
          game.AutoTravel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("3") == 0) {

        }
        if (road.compareTo("4") == 0) {
          game.clearScreen();
          game.Status(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("5") == 0) {
          game.clearScreen();
          game.Pace(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("6") == 0) {
          game.clearScreen();
          game.Rations(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("7") == 0) {
            game.clearScreen();
            game.Rest(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (road.compareTo("8") == 0) {

        }
        if (road.compareTo("9") == 0) {
          game.clearScreen();
          game.Hunting(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        game.clearScreen();
        game.OnRoadMenu();
        road = scanner.nextLine();
    }
  }




  public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }

}
