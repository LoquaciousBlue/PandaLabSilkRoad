
import java.util.Scanner;
import java.util.Random;
import java.io.*;

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

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
 import java.awt.FlowLayout;
import java.net.URL;
 import java.io.File;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.ImageIO;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import javax.swing.*;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class SilkRoad {
  private String name;
    BufferedImage bi = null;

  public SilkRoad() {
    this.name = name;
  }

  public String getName() {
    return name;
  }

    public void setName(String name) {
    this.name = name;
  }



  public class StartScreen{
    BufferedImage bi = null;
    JFrame f = new JFrame("The Silk Road");
    JLabel image = new JLabel();

    StartScreen() {
      JPanel background = new JPanel();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      image.setIcon(new ImageIcon("Town.jpg"));
      background.add(image);
      f.add(background);
      f.setResizable(false);



      f.setSize(1000, 650);
      //f.setExtendedState(true);
      //JFrame.MAXIMIZED_BOTH);
      //f.setUndecorated(true);

      f.setLocationRelativeTo(null);

      f.setVisible(true);
    }

    public void changeImage(int i) {



      switch (i) {
        case 1: image.setIcon(new ImageIcon("Dock.jpg"));
        break;
        case 2: image.setIcon(new ImageIcon("Raft.jpg"));
        break;
        case 3: image.setIcon(new ImageIcon("Town.jpg"));
        break;
        case 4: image.setIcon(new ImageIcon("Thief.jpg"));
        break;
        case 5: image.setIcon(new ImageIcon("BoatRide.jpg"));
        break;
        case 6: image.setIcon(new ImageIcon("NormBush.jpg"));
        break;
        case 7: image.setIcon(new ImageIcon("NormNorm.jpg"));
        break;
        case 8: image.setIcon(new ImageIcon("SnowNorm.jpg"));
        break;
        case 9: image.setIcon(new ImageIcon("SnowTown.jpg"));
        break;
        case 10: image.setIcon(new ImageIcon("TownNear.jpg"));
        break;
        case 11: image.setIcon(new ImageIcon("YouTried.jpg"));
        break;
        case 12: image.setIcon(new ImageIcon("FoundCart.jpg"));
        break;
        case 13: image.setIcon(new ImageIcon("SnowFerry.jpg"));
        break;
        case 14: image.setIcon(new ImageIcon("SnowThief.jpg"));
        break;
        case 15: image.setIcon(new ImageIcon("SnowTrade.jpg"));
        break;
        case 16: image.setIcon(new ImageIcon("FailedTrip.jpg"));
        break;
        case 17: image.setIcon(new ImageIcon("FoundCamel.jpg"));
        break;
        case 18: image.setIcon(new ImageIcon("NightThief.jpg"));
        break;
        case 19: image.setIcon(new ImageIcon("SteamNorm.jpg"));
        break;
        case 20: image.setIcon(new ImageIcon("TraderNorm.jpg"));
        break;
        case 21: image.setIcon(new ImageIcon("WinterDock.jpg"));
        break;
        case 22: image.setIcon(new ImageIcon("StartScreen.jpg"));
        break;
        case 23: image.setIcon(new ImageIcon("CartFireNorm.jpg"));
        break;
        case 24: image.setIcon(new ImageIcon("CartFireSnow.jpg"));
        break;
        case 25: image.setIcon(new ImageIcon("NormQuestion.jpg"));
        break;
        case 26: image.setIcon(new ImageIcon("SnowNormNorm.jpg"));
        break;
        case 27: image.setIcon(new ImageIcon("SnowQuestion.jpg"));
        break;
        case 28: image.setIcon(new ImageIcon("SnowTownNear.jpg"));
        break;
        case 29: image.setIcon(new ImageIcon("SnowTreasure.jpg"));
        break;
        case 30: image.setIcon(new ImageIcon("TreasureNorm.jpg"));
        break;
        case 31: image.setIcon(new ImageIcon("NormGrass.jpg"));
        break;
        case 32: image.setIcon(new ImageIcon("RoadSplitNorm.jpg"));
        break;
        case 33: image.setIcon(new ImageIcon("RoadSplitSnow.jpg"));
        break;
        case 34: image.setIcon(new ImageIcon("SnowFoundCart.jpg"));
        break;
        case 35: image.setIcon(new ImageIcon("FoundCamelWinter.jpg"));
        break;



      }



        f.revalidate();
        f.repaint();

    }


    public void closeFrame() {
        f.setVisible(false);
        f.dispose();

    }


  }


  public void Start(JFrame frame, Scanner scanner, Time calender, SilkRoad game, Player player, Person p1, Person p2, Person p3, Person p4, Person p5) {

    StartScreen start = new StartScreen();


  //  ImageIcon icon = new ImageIcon("index.png");

    String fname = "";

    while (fname.compareTo("") == 0) {
      fname = (String)JOptionPane.showInputDialog(frame, "Enter your first name",
      "The Silk Road (First Name Prompt)", JOptionPane.QUESTION_MESSAGE);
    }

start.changeImage(1);

    String lname = "";
    while (lname.compareTo("") == 0) {
     lname = (String)JOptionPane.showInputDialog(frame, "Enter your last name",
    "The Silk Road (Last Name Prompt)", JOptionPane.QUESTION_MESSAGE);
  }

  start.changeImage(2);


  JFrame framer = new JFrame();





  int n = 4;
  while (n == 4) {
    String[] options = {"Newbie", "Practice", "Expert"};

    n = JOptionPane.showOptionDialog(framer,//parent container of JOptionPane
        "What is your level of experience?",
        "The Silk Road (Role)",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,//do not use a custom Icon
        options,//the titles of buttons
        options[0]);//default button title
  }




    String ability = "";

    if (n  == 0) {
      ability = "N";
    }
    if (n == 1) {
      ability = "P";
    }
    if (n == 2) {
      ability = "E";
    }






    start.changeImage(3);


    int x = 0;
    String num = "" + x;
    String filename = ""+fname+lname+ability+num+".txt";

    int flag = 1;

    File tmpDir = new File(filename);

    while(flag == 1) {
        if(tmpDir.exists()) {
          x++;
          num = "" + x;
          filename = ""+fname+lname+ability+num+".txt";
          tmpDir = new File(filename);
        } else {
          flag = 0;
        }
    }

    game.setName(filename);
    try {
    	     File file = new File(filename);
    	     boolean fvar = file.createNewFile();
    	     if (fvar){
    	          System.out.println("File has been created successfully");
    	     }
    	     else{
    	          System.out.println("File already present at the specified location");
    	     }
        	} catch (IOException e) {
        		System.out.println("Exception Occurred:");
    	        e.printStackTrace();
    	  }

        game.WriteData(game, calender,"Name: "+fname+" "+lname);

        JFrame frame2 = new JFrame();

        x = 3;
        while (x == 3) {
          String[] roles = {"Carpenter",
                              "Hunter",
                              "Trader", "More Info"};
          x = JOptionPane.showOptionDialog(frame2,//parent container of JOptionPane
              "Many people have traveled the Silk Road. What type of person are you?",
              "Role",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.QUESTION_MESSAGE,
              null,//do not use a custom Icon
              roles,//the titles of buttons
              roles[3]);//default button title
              if (x == 3) {
                JOptionPane.showMessageDialog(null, "1. Carpenters\n Carpenters will be able to be the " +
                "handymen when you travel meaning broken wheels and caulking a boat will be problems of the past\n" +
                "2. Hunters\nHunters get more food when they hunt which will help the survival of the group\n" + "3. Trader\nTraders know the price of the things on the silk road meaning they" +
                " will get the best price");

              }
        }

        if (x == 0) {
          WriteData(game, calender, "Carpenter");
          player.setCarpenter(true);
        } else if (x == 1) {
          WriteData(game, calender, "Hunter");
          player.setFoodMult(true);
        } else {
          WriteData(game, calender, "Trader");
          player.setTradeRate(.8);
        }


            JTextField character1 = new JTextField(12);
            JTextField character2 = new JTextField(12);
            JTextField character3 = new JTextField(12);
            JTextField character4 = new JTextField(12);
            JTextField character5 = new JTextField(12);

            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("Member 1:"));
            myPanel.add(character1);
            myPanel.add(Box.createVerticalStrut(12)); // a spacer
            myPanel.add(new JLabel("2:"));
            myPanel.add(character2);
            myPanel.add(Box.createVerticalStrut(12)); // a spacer
            myPanel.add(new JLabel("3:"));
            myPanel.add(character3);
            myPanel.add(Box.createVerticalStrut(12)); // a spacer
            myPanel.add(new JLabel("4:"));
            myPanel.add(character4);
            myPanel.add(Box.createVerticalStrut(12)); // a spacer
            myPanel.add(new JLabel("5:"));
            myPanel.add(character5);

            character1.setText(" ");
            character2.setText(" ");
            character3.setText(" ");
            character4.setText(" ");
            character5.setText(" ");


          while ((character1.getText().compareTo(" ") == 0) || (character2.getText().compareTo(" ") == 0) || (character3.getText().compareTo(" ") == 0) || (character4.getText().compareTo(" ") == 0) || (character5.getText().compareTo(" ") == 0)) {
            int result = JOptionPane.showConfirmDialog(null, myPanel,
                "What will the members of your party be named?", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION && character1.getText() != "") {
              p1.setName(character1.getText());
              p2.setName(character2.getText());
              p3.setName(character3.getText());
              p4.setName(character4.getText());
              p5.setName(character5.getText());
            }
          }

          game.WriteData(game, calender, "\nP1: "+p1.getName()+"\nP2: "+p2.getName()+"\nP3: "+p3.getName()+"\nP4: "+p4.getName()+"\nP5: "+p5.getName());


          x = 4;
          JFrame frame3 = new JFrame();

          while ((x == 4)){
            String[] seasons = {"Winter", "Spring", "Summer", "Fall", "More Info"};
            x = JOptionPane.showOptionDialog(frame3,//parent container of JOptionPane
                "When would you like to begin your journey?",
                "Season",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,//do not use a custom Icon
                seasons,//the titles of buttons
                seasons[4]);//default button title

                if (x == 4) {
                  JOptionPane.showMessageDialog(null, "Your pace should help you determine when you want " +
                  "to go.\nThe winter has harsh weather that will make your party more susceptible to certain " +
                  "illnesses\nConversely, the summer can be also quite hot resulting in illness in your party aswell");
                }
          }



          if (x == 0) {
            calender.setSeason(0);
            game.WriteData(game, calender, "Winter");
          } else if (x == 1) {
            calender.setSeason(1);
            game.WriteData(game, calender, "Spring");
          } else if (x == 2) {
            calender.setSeason(2);
            game.WriteData(game, calender, "Summer");
          } else {
            calender.setSeason(3);
            game.WriteData(game, calender, "Fall");
          }



          JOptionPane.showMessageDialog(null, "Before you embark on your journey, you will need to buy some" + " supplies.\nThe nearby local store should " +
          "have everything you need.\nThings you may need to buy include food, clothes, and ammunition for the members of your group.\nThe only requirement before you go on your trip is that everything in the party has their own set of clothes.\nOn top of those items " +
          "for the members of your party, you'll need to buy stuff for your cart\nThis will include camel(s) to pull the cart, as well " +
          "as possibly spare cart parts.\nYour cart will start off with 4 wheels, 1 tongue, and 2 axles");


        start.closeFrame();



    }



  public void WriteData(SilkRoad game, Time calender, String data) {
    BufferedWriter writer = null;
    try
    {
        writer = new BufferedWriter(new FileWriter(game.getName(), true));
        if (calender.getStart() == 0) {
          calender.setStart();
        }
        if (calender.getTotalDays() == 1) {
          writer.write("\nTime: "+calender.getTime()+" "+data+"\n");
        } else {
          writer.write("\nDay: "+calender.getTotalDays()+"\nTime: "+calender.getTime()+" \n"+data+"\n");
        }
    }
    catch ( IOException e)
    {
    }
    finally
    {
        try
        {
            if ( writer != null)
            writer.close( );
        }
        catch ( IOException e)
        {
        }
    }
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

    double camelCost = player.getTradeRate()*(40+5*(calender.getStore()-1));

    double tongueCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double wheelCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double axleCost = player.getTradeRate()*(10+2*(calender.getStore()-1));

    double initial = player.getCash();

    double current = 0;
    String.format("$%,.2f", current);

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


    int x = 0;

    JFrame frame = new JFrame();

    while (x != 8 && initial > current){
      String a = "Food: "+(player.getFood()+fcfoodn);
      String b = "Clothes: "+(player.getClothing()+fcclothesn);
      String c = "Ammunition: "+(player.getBullets()+fcbulletn)*20;
      String d = "Camels: "+(player.getCamel()+fcoxn);
      String e = "Wheels: "+(player.getWheel()+fcwheeln);
      String f = "Tongues: "+(player.getTongue()+fctonguen);
      String g = "Axles: "+(player.getAxle()+fcaxlen);
      String[] shop = {a, b, c, d, e, f, g, "More Info", "Ready"};
      x = JOptionPane.showOptionDialog(frame,//parent container of JOptionPane
          "What are you thinking about buying?\n You have $" +player.getCash()+"\nYour bill is currently: $"+current,
          "Shop",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,//do not use a custom Icon
          shop,//the titles of buttons
          shop[0]);//default button title

          if (x == 0) {
            foodn = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getFood() + "lbs. It costs "+foodCost+" per pound of food. You currently have $"+player.getCash()+"\nHow much do you want to buy?",
            "Shop (Food)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(foodn) == true) {
               cfoodn = Integer.parseInt(foodn);
              if (cfoodn >= 0) {
                fcfoodn = cfoodn;
              }
            }
          }
          if (x == 1) {
            clothesn = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getClothing() + " sets of clothes. It costs "+clothesCost+" per set. You currently have $"+player.getCash()+"\nHow many sets do you want to buy?",
            "Shop (Clothes)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(clothesn) == true) {
               cclothesn = Integer.parseInt(clothesn);
              if (cclothesn >= 0) {
                fcclothesn = cclothesn;
              }
            }
          }
          if (x == 2) {
            bulletn = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getBullets() + " boxes of Ammunition (20 Ammunition). It costs "+bulletCost+" per box of ammunition. You currently have $"+player.getCash()+"\nHow many boxes do you want to buy?",
            "Shop (Ammunition)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(bulletn) == true) {
               cbulletn = Integer.parseInt(bulletn);
              if (cbulletn >= 0) {
                fcbulletn = cbulletn;
              }
            }
          }

          if (x == 3) {
            oxn = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getCamel() + " camels. It costs "+camelCost+" per camel. You currently have $"+player.getCash()+"\nHow many do you want to buy?",
            "Shop (Camels)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(oxn) == true) {
               coxn = Integer.parseInt(oxn);
              if (coxn >= 0) {
                fcoxn = coxn;
              }
            }
          }

          if (x == 4) {
            wheeln = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getWheel() + " wheels. It costs "+wheelCost+" per wheel. You currently have $"+player.getCash()+"\nThe max number of wheels that you can buy is 3."+"\nHow many do you want to buy?",
            "Shop (Wheels)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(wheeln) == true) {
               cwheeln = Integer.parseInt(wheeln);
              if (cwheeln > 0 && 3 >= cwheeln && ((cwheeln + player.getWheel()) <= 7)) {
                fcwheeln = cwheeln;
              }
            }
          }

          if (x == 5) {
            tonguen = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getTongue() + " tongues. It costs "+tongueCost+" per tongue. You currently have $"+player.getCash()+"\nThe max number of tongues that you can buy is 3."+"\nHow many do you want to buy?",
            "Shop (Wheels)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(tonguen) == true) {
               ctonguen = Integer.parseInt(tonguen);
              if (ctonguen > 0 && 3 >= ctonguen && ((ctonguen + player.getTongue()) <= 4)) {
                fctonguen = ctonguen;
              }
            }
          }

          if (x == 6) {
            axlen = (String)JOptionPane.showInputDialog(frame, "You currently have " + player.getAxle() + " axles. It costs "+axleCost+" per axle. You currently have $"+player.getCash()+"\nThe max number of tongues that you can buy is 3."+"\nHow many do you want to buy?",
            "Shop (Wheels)", JOptionPane.QUESTION_MESSAGE);
            if (isInteger(axlen) == true) {
              caxlen = Integer.parseInt(axlen);
              if (caxlen > 0 && 3 >= caxlen && ((caxlen + player.getAxle()) <= 5)) {
                fcaxlen = caxlen;
              }
            }
          }
          if (x == 7) {
            JOptionPane.showMessageDialog(null, "Food is necessary to keep your group moving along. Without food, your party will get sick or worse.\n" +
            "Clothes are needed to keep your party warm. Without clothing, your party will get sick or" +
             "worse.\nAmmunition is needed to hunt animals for food.\nCamel are needed to pull the wagon. Without them," +
             " you will be going at a snails pace.\nWheels, Tongues, and Axels are spare parts for the wagon incase other parts break.\nIf you can't replace the part, you won't be getting anywhere fast.");
          }
          current = fcfoodn*foodCost + clothesCost*fcclothesn + bulletCost*fcbulletn + camelCost*fcoxn + tongueCost*fctonguen + wheelCost*fcwheeln + axleCost*fcaxlen;
    }



      if (calender.getTotalDays() == 1) {
        if (initial >= current && ((fcclothesn + player.getClothing()) >= 5)) {
          player.buyFood(fcfoodn);
          player.buyClothing(fcclothesn);
          player.buyAmmo(fcbulletn*20);
          player.buyCamel(fcoxn);
          player.buyWheel(fcwheeln);
          player.buyTongue(fctonguen);
          player.buyAxle(fcaxlen);
          player.spend(current);
          current = 0;
          game.WriteData(game, calender, "Initial Food: "+player.getFood());
          game.WriteData(game, calender, "Initial Clothing: "+player.getClothing());
          game.WriteData(game, calender, "Initial Ammunition: "+player.getBullets());
          game.WriteData(game, calender, "Initial Camel: "+player.getCamel());
          game.WriteData(game, calender, "Initial Wheel: "+player.getWheel());
          game.WriteData(game, calender, "Initial Tongues: "+player.getTongue());
          game.WriteData(game, calender, "Initial Axles: "+player.getAxle());
        }
      } else {
        if (initial > current) {
          player.buyFood(fcfoodn);
          player.buyClothing(fcclothesn);
          player.buyAmmo(fcbulletn*20);
          player.buyCamel(fcoxn);
          player.buyWheel(fcwheeln);
          player.buyTongue(fctonguen);
          player.buyAxle(fcaxlen);
          player.spend(current);
          current = 0;
          game.WriteData(game, calender, "Bought Food: "+fcfoodn);
          game.WriteData(game, calender, "Bought Clothing: "+fcclothesn);
          game.WriteData(game, calender, "Bought Ammunition: "+fcbulletn*20);
          game.WriteData(game, calender, "Bought Camel: "+fcoxn);
          game.WriteData(game, calender, "Bought Wheel: "+fcwheeln);
          game.WriteData(game, calender, "Bought Tongues: "+fctonguen);
          game.WriteData(game, calender, "Bought Axle: "+fcaxlen);
      }
    }

  }














  public void checkKill(Person person, SilkRoad game, Time calender) {
		if (person.getHealth() <= 0 && person.isAlive() == true) {
      JOptionPane.showMessageDialog(null, person.getName()+" has died.");
      person.setHealth(0);
      person.setAlive(false);
		  WriteData(game, calender, person.getName()+" died");
		}

	}


  public String checkHealth(Person p1, Person p2, Person p3, Person p4, Person p5, SilkRoad game) {

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
    } else if (status > 65) {
      return "Healthy";
    } else if (status > 35) {
      return "Sufficent";
    } else if (status > 20) {
      return  "Poor";
    } else {
      return "Critical";
    }

  }


  public void TravelMenu(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {

    int x = 12;
    JFrame travelFrame = new JFrame();

    String a = "Travel";
    //"<html><font face='Serif' size='5' color='black'>Travel";
    //"Travel";
    String b = "Rest";
    String c = "Map";
    String d = "General Status";
    String e = "Set Pace";
    String f = "Set Rations";
    String g = "Hunt";
    String h = "More Info";

    String bitText = "Travel Menu:\n"+calender.getDate()+"\nWeather: "+ calender.weatherString(calender.getWeather()) + "\nHealth: "+ game.checkHealth(p1, p2, p3, p4, p5, game) + "\nFood: "+ player.getFood()+" lbs" + "\nTraveled Miles: "+calender.getDistance()+" miles" + "\nNext Landmark: "+calender.getLandmark()+" miles";
    String[] travel = {a, b, c, d, e, f, g, h};

    int flag = 0;
    while (true) {
      x = JOptionPane.showOptionDialog(travelFrame,//parent container of JOptionPane
          bitText,
          "Travel Menu",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,//do not use a custom Icon
          travel,//the titles of buttons
          travel[0]);//default button title
        //  UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.PLAIN, 5));


          if (x == 0) {
            game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
            //flag = 1;
          } else if (x == 1) {
            //1 day rest
            //flag = 1;

          } else if (x == 2) {
            //map
            //flag = 1;

          } else if (x == 3) {
            game.Status(player, scanner, calender, game, p1, p2, p3, p4, p5);
            game.TravelMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);

          } else if (x == 4) {
            game.Pace(player, scanner, calender, game, p1, p2, p3, p4, p5);
            //flag = 1;

          } else if (x == 5) {
            game.Rations(player, scanner, calender, game, p1, p2, p3, p4, p5);
            //flag = 1;

          } else if (x == 6) {
            game.Hunting(player, scanner, calender, game, p1, p2, p3, p4, p5);
            //flag = 1;

          } else if (x == 7) {
            //more info
          }
        }

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
          game.clearScreen();
          game.Hunting(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        game.clearScreen();
        game.OnRoadMenu();
        road = scanner.nextLine();
    }
  }


/**

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
    System.out.println("Food: "+ player.getFood()+" lbs");
    System.out.println("");
    System.out.println("Traveled Miles: "+calender.getDistance()+" miles");
    System.out.println("");
    System.out.println("Next Landmark: "+calender.getLandmark()+" miles");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Type Anything to travel a days worth of time");
    System.out.println("Type 'Menu' for your on road Menu:");




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
    System.out.println("8. Hunt");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Enter which action you want to perform:");

*/





















/*
  public void TravelMenu2(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    JOptionPane.showMessageDialog(null, person.getName()+" has died.");


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
    System.out.println("Food: "+ player.getFood()+" lbs");
    System.out.println("");
    System.out.println("Traveled Miles: "+calender.getDistance()+" miles");
    System.out.println("");
    System.out.println("Next Landmark: "+calender.getLandmark()+" miles");
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
    System.out.println("Food: "+ player.getFood()+" lbs");
    System.out.println("");
    System.out.println("Traveled Miles: "+calender.getDistance()+" miles");
    System.out.println("");
    System.out.println("Next Landmark: "+calender.getLandmark()+" miles");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
  }

*/

/*
  public void TravelMenu4(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            Travel Menu: (Storm)");
    System.out.println("");
    System.out.println(calender.getDate());
    System.out.println("");
    System.out.println("Weather: "+ calender.weatherString(calender.getWeather()));
    System.out.println("");
    System.out.println("Health: "+ game.checkHealth(p1, p2, p3, p4, p5, game));
    System.out.println("");
    System.out.println("Food: "+ player.getFood()+" lbs");
    System.out.println("");
    System.out.println("Traveled Miles: "+calender.getDistance()+" miles");
    System.out.println("");
    System.out.println("Next Landmark: "+calender.getLandmark()+" miles");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
  }

  */
  public void CriticalCheck(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    if (p1.getHealth() < 20 && p1.isAlive() == true) {
      JOptionPane.showMessageDialog(null, p1.getName()+" is in critical condition and needs to rest.");
    }
    if (p2.getHealth() < 20 && p2.isAlive() == true) {
      JOptionPane.showMessageDialog(null, p2.getName()+" is in critical condition and needs to rest.");
    }
    if (p3.getHealth() < 20 && p3.isAlive() == true) {
      JOptionPane.showMessageDialog(null, p3.getName()+" is in critical condition and needs to rest.");

    }
    if (p4.getHealth() < 20 && p4.isAlive() == true) {
      JOptionPane.showMessageDialog(null, p4.getName()+" is in critical condition and needs to rest.");
    }
    if (p5.getHealth() < 20 && p5.isAlive() == true) {
      JOptionPane.showMessageDialog(null, p5.getName()+" is in critical condition and needs to rest.");
    }
  }


  public void GameOver(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    while (true) {
      JOptionPane.showMessageDialog(null, " Good try! You made it to day "+calender.getTotalDays());
    }

  }

    public void newDayStatusCheck(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      game.checkKill(p1, game, calender);
      game.checkKill(p2, game, calender);
      game.checkKill(p3, game, calender);
      game.checkKill(p4, game, calender);
      game.checkKill(p5, game, calender);

      game.CriticalCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);

      //check if anyone is alive for a new day
      game.eat(player, scanner, game, p1, p2, p3, p4, p5);
      game.isResting(player, scanner, calender, game, p1, p2, p3, p4, p5);
      game.RandomEvent(player, scanner, calender, game, p1, p2, p3, p4, p5);

      game.Tolling(player, scanner, calender, game, p1, p2, p3, p4, p5);

      if (game.getTotalAliveMembers(p1, p2, p3, p4, p5) == 0) {
        game.GameOver(player, scanner, calender, game, p1, p2, p3, p4, p5);
      }

      calender.newDay();
      if (player.getResting() == false && player.getStorming() == false) {
        double doubleprogress = player.getPaceCoef()*(3.5*player.getCamel())+10;
        int progress = (int) Math.round(doubleprogress);
        if ((player.getTongue() <= 0) || (player.getWheel() <= 3) || (player.getAxle() <= 1) || (player.getCamel() <= 0)) {
          progress = 5;
        }
        calender.ProgressOnRoad(progress);
        calender.closerToLandMark(progress);
        if (calender.getLandmark() == 0) {
          game.clearScreen();
          game.NewCityMenu(game, calender, scanner);
          game.CityInput(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
      }

    }

    public void NewCityMenu(SilkRoad game, Time calender, Scanner scanner) {
      JOptionPane.showMessageDialog(null, "You made it to "+calender.StringLandMark(calender.getStore())+"\nIn this town, you will be able to trade and buy from the locals.");
      WriteData(game, calender, "Made it to "+calender.StringLandMark(calender.getStore()));
    }

    public void Tolling(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      if (p1.isAlive() == true) {
        naturalToll(game, p1, player, calender);
      }
      if (p2.isAlive() == true) {
        naturalToll(game, p2, player, calender);
      }
      if (p3.isAlive() == true) {
        naturalToll(game, p3, player, calender);
      }
      if (p4.isAlive() == true) {
        naturalToll(game, p4, player, calender);
      }
      if (p5.isAlive() == true) {
        naturalToll(game, p5, player, calender);
      }
    }

    public void StarvingMenu() {
      System.out.println("==================================================================================================================");
      System.out.println("");
      System.out.println("Your party is out of food!");
      System.out.println("");
      System.out.println("Without food, your party will not be able to travel as fast and will be easily sespetible to illness.");
      System.out.println("");
      System.out.println("==================================================================================================================");
      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("Type anything to acknowledge");
    }



    public void eat(Player player, Scanner scanner, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      int eaten = (int) Math.round(game.getTotalAliveMembers(p1, p2, p3, p4, p5)*player.getRationCoef());
      player.loseFood(eaten);
      if (player.getFood() == 0) {
        player.setRationCoef(1);
        JOptionPane.showMessageDialog(null, "Your party is out of food!\nWithout food, your party will not be able to travel as fast and will be easily sespetible to illness.");
      }
    }

    public void healed(String illness, Person person) {
      JOptionPane.showMessageDialog(null, "Resting has allowed "+person.getName()+" to heal.\nNow they don't have "+illness);
    }

    public void naturalToll(SilkRoad game, Person person, Player player, Time calender) {
      Random rand = new Random();
      Scanner scanner = new Scanner(System.in);
      int healthNum = rand.nextInt(3);
      double healthmod = (-1*(player.getRationCoef()-4))*2*player.getPaceCoef();
      int healthmodInt = 0;
      if (healthNum == 0) {
        healthmodInt = (int) Math.round(1.5*healthmod);
      } else if (healthNum == 1) {
        healthmodInt = (int) Math.round(.5*healthmod);
      } else {
        healthmodInt = (int) Math.round(0);
      }
      person.decHealth(healthmodInt);

      if (person.getBubonicPlague() == true) {
        person.decHealth(6);
      }
      if (person.getSmallpox() == true) {
        person.decHealth(6);
      }
      if (person.getMeasles() == true) {
        person.decHealth(6);
      }


      healthmod = ((10-Math.round(person.getHealth())/10)/5);
      if (calender.getSeason() == 0 || calender.getSeason() == 2) {
        healthmod += 1;
      }
      if ((player.getClothing()-3)<=0) {
        healthmod +=2;
      }
      for (int i = 0; healthmod > i; i++) {
        int illnessRNG = rand.nextInt(95);
        if (person.getBubonicPlague() == false && illnessRNG == 10) {
          person.setBubonicPlague(true);

          JOptionPane.showMessageDialog(null, person.getName()+" has contracted Bubonic Plague.");

          WriteData(game, calender, person.getName()+ " got Bubonic Plague via not taking care of themself");
          break;
        }
        illnessRNG = rand.nextInt(95);
        if (person.getMeasles() == false && illnessRNG == 10) {
          person.setMeasles(true);

          JOptionPane.showMessageDialog(null, person.getName()+" has contracted Measles.");

          WriteData(game, calender, person.getName()+ " got Measles via not taking care of themself");

          break;
        }

        illnessRNG = rand.nextInt(95);
        if (person.getSmallpox() == false && illnessRNG == 10) {
          person.setSmallpox(true);

          JOptionPane.showMessageDialog(null, person.getName()+" has contracted Small pox.");

          WriteData(game, calender, person.getName()+ " got small pox via not taking care of themself");

        }
      }
    }


    public void restHeal(SilkRoad game, Person person, Player player, Random rand, Time calender) {
      Scanner scanner = new Scanner(System.in);
      int healthNum = rand.nextInt(3);
      int healed = 0;
      if (healthNum == 0) {
        healed = (int) Math.round(3.5*player.getRationCoef());
        person.incHealth(healed);
      } else if (healthNum == 1) {
        healed = (int) Math.round(2.5*player.getRationCoef());
        person.incHealth(healed);
      } else {
        healed = (int) Math.round(1.5*player.getRationCoef());
        person.incHealth(healed);
      }
      healthNum = (int) Math.round(player.getRationCoef()+rand.nextInt(10));
      if (healthNum >= 8) {
        if (person.getBubonicPlague() == true) {
          person.setBubonicPlague(false);
          WriteData(game, calender, person.getName()+" cured of bubonic plague via rest");
          game.healed("Bubonic Plague", person);
        }
      }
      healthNum = (int) Math.round(player.getRationCoef()+rand.nextInt(10));
      if (healthNum >= 8) {
        if (person.getSmallpox() == true) {
          person.setSmallpox(false);
          WriteData(game, calender, person.getName()+" cured of smallpox via rest");
          game.healed("Smallpox", person);
        }
      }

      healthNum = (int) Math.round(player.getRationCoef()+rand.nextInt(10));
      if (healthNum >= 8) {
        if (person.getMeasles() == true) {
          person.setMeasles(false);
          WriteData(game, calender, person.getName()+" cured of measles via rest");
          game.healed("Measles", person);
        }
      }

    }

    public void isResting(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      if (player.getResting() == true) {
        game.restHeal(game, p1, player, rand, calender);
        game.restHeal(game, p2, player, rand, calender);
        game.restHeal(game, p3, player, rand, calender);
        game.restHeal(game, p4, player, rand, calender);
        game.restHeal(game, p4, player, rand, calender);
      }
    }

    public void FoundCart(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int bulls = rand.nextInt(235);
      player.buyAmmo(bulls);
      int cloths = rand.nextInt(10);
      player.buyClothing(cloths);
      int wheels = rand.nextInt(2);
      player.buyWheel(wheels);
      int tongues = rand.nextInt(2);
      player.buyTongue(tongues);
      int Axles = rand.nextInt(2);
      player.buyAxle(Axles);

      JOptionPane.showMessageDialog(null, "You found an abandoned cart on the side of the road!\nYou were able to salvage:\n\nAmmunition: "+
      + bulls + "\nClothing: "+cloths+"\nWheels: "+wheels+"\nTongues: "+tongues+"Axles: "+Axles);


      WriteData(game, calender, "Found a cart with "+bulls+" bullets, "+cloths+" clothes, "+wheels+" wheels, "+tongues+" tongues, and "+Axles+" axles");

    }

    public void FindCamel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int Camel = 1+rand.nextInt(3);
      player.buyCamel(Camel);

      JOptionPane.showMessageDialog(null, "You found Stray Camel on the side of the road!\nYou were able to add " +Camel+ " to your Yoke");

      WriteData(game, calender, "Found "+Camel+" Camel");

    }

    public void PersonHeal(Person person) {
      person.setHealth(110);
      person.setBubonicPlague(false);
      person.setSmallpox(false);
      person.setMeasles(false);
    }

    public void FullHeal(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      if (p1.isAlive()) {
        game.PersonHeal(p1);
      }
      if (p2.isAlive()) {
        game.PersonHeal(p2);
      }
      if (p3.isAlive()) {
        game.PersonHeal(p3);
      }
      if (p4.isAlive()) {
        game.PersonHeal(p4);
      }
      if (p5.isAlive()) {
        game.PersonHeal(p5);
      }
    }



    public void FindFood(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int food = 1+rand.nextInt(400);
      player.buyFood(food);
      String vegetables = "a field of berry bushes";
      if (calender.getSeason() == 0) {
        vegetables = "a field of carrots";
      }

      JOptionPane.showMessageDialog(null, "You found a "+vegetables+"!\nYou were able to add " +food+ " lbs to your supplies");
      WriteData(game, calender, "Found "+food+" pounds of food");

    }

    public void FindTreasure(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int cash = rand.nextInt(400);
      player.makeMoney(cash);

      JOptionPane.showMessageDialog(null, "You found a chest of money while traveling!\nYou were able to add $" +cash+ " to your supplies");
    }

    public void StormMenu(int storm) {

      JOptionPane.showMessageDialog(null, "Your party has come across a storm while traveling!\nYou are forced to take shelter for "+storm+ " days");

    }

    public void Storm(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();

      int storm = 1+rand.nextInt(7);

      game.StormMenu(storm);
      WriteData(game, calender, "A storm for "+storm+" days occurs");

      player.setStorming(true);
      for(int i = 0; storm > i; i++) {
        game.clearScreen();
        //game.TravelMenu4(player, scanner, calender, game, p1, p2, p3, p4, p5);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);

      }
      game.clearScreen();
    //  game.TravelMenu4(player, scanner, calender, game, p1, p2, p3, p4, p5);
      try
      {
          Thread.sleep(2000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
      player.setStorming(false);
    }

    public void Robbed(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int playercashInt = (int) Math.round(player.getCash());
      int robbedInt = rand.nextInt(playercashInt);
      player.spend(robbedInt);

      JOptionPane.showMessageDialog(null, "In the night, a thief came and robbed you.\nThe thief was able to take off with $" +robbedInt+ "!");

      WriteData(game, calender, "Robbed of $"+robbedInt+"");

    }


    public void Sickness(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int illness = rand.nextInt(3);
      String sickness = "";
      if (illness == 0) {
        sickness = "Bubonic Plague";
        p1.setBubonicPlague(true);
        p2.setBubonicPlague(true);
        p3.setBubonicPlague(true);
        p4.setBubonicPlague(true);
        p5.setBubonicPlague(true);
        WriteData(game, calender, "Everyone in the party got bubonic plague");
      }
      if (illness == 1) {
        sickness = "Measles";
        p1.setMeasles(true);
        p2.setMeasles(true);
        p3.setMeasles(true);
        p4.setMeasles(true);
        p5.setMeasles(true);
        WriteData(game, calender, "Everyone in the party got getMeasles");
      }
      if (illness == 2) {
        sickness = "Smallpox";
        p1.setSmallpox(true);
        p2.setSmallpox(true);
        p3.setSmallpox(true);
        p4.setSmallpox(true);
        p5.setSmallpox(true);
        WriteData(game, calender, "Everyone in the party got small pox");
      }

      JOptionPane.showMessageDialog(null, "There's an outbreak of "+sickness+" in your entire party!");

    }

    public void BrokenWheel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {


      Random rand = new Random();
      int check = rand.nextInt(2);

      if (check == 0 && player.getCarpenter() == true) {
        JOptionPane.showMessageDialog(null, "You have a broken wheel!\nGiven you're a Carpenter, you were able to fix it without another wheel.");
        WriteData(game, calender, "Broken wheel repaired via Carpenter ability");
        return;
      }

      if (player.getWheel() >= 5) {
        JOptionPane.showMessageDialog(null, "You have a broken wheel!\nThe good news is you're able to repair it with a spare wheel.");
        WriteData(game, calender, "Fixed wheel with spare wheel");
      } else {
        JOptionPane.showMessageDialog(null, "You have a broken wheel!\nOh no! You're out of wheels and you're going to have to walk.");
        WriteData(game, calender, "No wheels to repair cart");
      }

      player.loseWheel(1);
    }

    public void BrokenAxle(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int check = rand.nextInt(2);

      if (check == 0 && player.getCarpenter() == true) {
        JOptionPane.showMessageDialog(null, "You have a broken axle!\nGiven you're a Carpenter, you were able to fix it without another axle.");
        WriteData(game, calender, "Broken axle repaired via Carpenter ability");
        return;
      }

      if (player.getAxle() >= 3) {
        JOptionPane.showMessageDialog(null, "You have a broken axle!\nThe good news is you're able to repair it with a spare axle.");
        WriteData(game, calender, "Fixed axle with spare axle");
      } else {
        JOptionPane.showMessageDialog(null, "You have a broken axle!\nOh no! You're out of axles and you're going to have to walk.");
        WriteData(game, calender, "No axles to repair cart");
      }

      player.loseAxle(1);
    }

    public void BrokenTongue(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int check = rand.nextInt(2);

      if (check == 0 && player.getCarpenter() == true) {
        JOptionPane.showMessageDialog(null, "You have a broken tongue!\nGiven you're a Carpenter, you were able to fix it without another tongue.");
        WriteData(game, calender, "Broken tongue repaired via Carpenter ability");
        return;
      }

      if (player.getTongue() >= 2) {
        JOptionPane.showMessageDialog(null, "You have a broken tongue!\nThe good news is you're able to repair it with a spare tongue.");
        WriteData(game, calender, "Fixed tongue with spare tongue");
      } else {
        JOptionPane.showMessageDialog(null, "You have a broken tongue!\nOh no! You're out of tongues and you're going to have to walk.");
        WriteData(game, calender, "No tongues to repair cart");
      }

      player.loseTongue(1);
    }

    public void DeadCamel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int deadCamel = rand.nextInt(player.getCamel()+1);

      if (deadCamel == player.getCamel()) {
        JOptionPane.showMessageDialog(null, "Oh no! All your camels died due to illness and you're going to have to walk.");
        WriteData(game, calender, "All camels succumed to illness");
      } else {
        JOptionPane.showMessageDialog(null, "Oh no. "+deadCamel+" of your Camel have died due to illness.");
        WriteData(game, calender, "Illness caused" +deadCamel+" Camel to die");
      }

      player.loseCamel(deadCamel);
    }

    public void CartFire(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int bulls = rand.nextInt(player.getBullets()+1);
      player.loseAmmo(bulls);
      int cloths = rand.nextInt(player.getClothing()+1);
      player.loseClothing(cloths);
      int food = rand.nextInt(player.getFood()+1);
      player.loseFood(food);

      JOptionPane.showMessageDialog(null, "You cart caught on fire!\nYou lost these items in the fire:\n\nAmmunition: "+bulls+"\nClothing: "+cloths+"Food: "+food);

      WriteData(game, calender, "Fire caused party to lose "+bulls+" bullets, "+cloths+" clothes, and "+food+" pounds of food");
    }

    public void Attack(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();



      while (game.getTotalAliveMembers(p1, p2, p3, p4, p5) != 0) {
        int dead = rand.nextInt(5);
        if (dead == 0 && p1.isAlive() == true) {
          p1.setHealth(p1.getHealth()/2);
          JOptionPane.showMessageDialog(null, "A bear attacked your camp!\n"+p1.getName()+" was hurt in the attack.");
          WriteData(game, calender, p1.getName()+" hurt in bear attack");
          break;
        }
        if (dead == 1 && p2.isAlive() == true) {
          p2.setHealth(p2.getHealth()/2);
          JOptionPane.showMessageDialog(null, "A bear attacked your camp!\n"+p2.getName()+" was hurt in the attack.");
          WriteData(game, calender, p2.getName()+" hurt in bear attack");
          break;
        }
        if (dead == 2 && p3.isAlive() == true) {
          p3.setHealth(p3.getHealth()/2);
          JOptionPane.showMessageDialog(null, "A bear attacked your camp!\n"+p3.getName()+" was hurt in the attack.");
          WriteData(game, calender, p3.getName()+" hurt in bear attack");
          break;
        }
        if (dead == 3 && p4.isAlive() == true) {
          p4.setHealth(p4.getHealth()/2);
          JOptionPane.showMessageDialog(null, "A bear attacked your camp!\n"+p4.getName()+" was hurt in the attack.");
          WriteData(game, calender, p4.getName()+" hurt in bear attack");
          break;
        }
        if (dead == 4 && p5.isAlive() == true) {
          p5.setHealth(p5.getHealth()/2);
          JOptionPane.showMessageDialog(null, "A bear attacked your camp!\n"+p5.getName()+" was hurt in the attack.");
          WriteData(game, calender, p5.getName()+" hurt in bear attack");
          break;
        }
      }

    }


    public void RandomEvent(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      Random rand = new Random();
      int event = rand.nextInt(10);
      if (event == 7) { // good event
        game.clearScreen();
        event = rand.nextInt(4);
        if(event == 0) {
          game.FoundCart(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 1) {
          game.FindCamel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 2) {
          game.FindTreasure(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 3) {
          game.FindFood(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        //Good event scnree

      }
      if (event == 4) { // bad event
        game.clearScreen();

        event = rand.nextInt(9);
        if(event == 0) {
          game.Storm(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 1) {
          game.Robbed(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 2) {
          game.Sickness(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 3) {
          game.BrokenWheel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 4) {
          game.BrokenTongue(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 5) {
          game.DeadCamel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 6) {
          game.Attack(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else if (event == 7) {
          game.BrokenAxle(player, scanner, calender, game, p1, p2, p3, p4, p5);
        } else {
          game.CartFire(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }

        //Bad event screen

      }

    }







    public void Travel(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
      while (true) {
        if(calender.getLandmark()<=0) {
        calender.incStore();
        Random rand = new Random();
        int firstLand = rand.nextInt(50)+300;
        calender.setLandmark(firstLand);
      }
      //game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
      game.TravelMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);
    }

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
    System.out.println("8. Hunt");
    System.out.println("");
    System.out.println("");
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("Enter which action you want to perform:");
  }

  public void CityMenu() {
    System.out.println("==================================================================================================================");
    System.out.println("");
    System.out.println("");
    System.out.println("                            City Menu:");
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
    System.out.println("8. Shop");
    System.out.println("");
    System.out.println("9. Trade");
    System.out.println("");
    System.out.println("10. Doctor");
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

  public String getStatus(SilkRoad game, Scanner scanner, Person person) {
    int status = person.getHealth();
    if (status > 95) {
      return "Health: Very Healthy";
    } else if (status > 65) {
      return "Health: Healthy";
    } else if (status > 35) {
      return "Health: Sufficent";
    } else if (status > 20) {
      return  "Health: Poor";
    } else {
      return "Health: Critical";
    }
  }

  public void StatusMenu(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5){
    int totalAlive = game.getTotalAliveMembers(p1, p2, p3, p4, p5);

    String alive1 = "";
    if (p1.isAlive() == false) {
      alive1 = "(Dead)";
    }

    String alive2 = "";
    if (p2.isAlive() == false) {
      alive2 = "(Dead)";
    }

    String alive3 = "";
    if (p3.isAlive() == false) {
      alive3 = "(Dead)";
    }

    String alive4 = "";
    if (p4.isAlive() == false) {
      alive4 = "(Dead)";
    }

    String alive5 = "";
    if (p5.isAlive() == false) {
      alive5 = "(Dead)";
    }

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

    JOptionPane.showMessageDialog(null, "Members Status:  "+totalAlive+"/5 of your members are alive\n\n" +
    p1.getName()+": "+alive1 +"\n" + game.getStatus(game, scanner, p1) + "" + p1.getHealth() +
    "\nBubonic Plague: "+p1.getBubonicPlague()+"    Smallpox: "+p1.getSmallpox()+"   Measles: "+p1.getMeasles() +
    "\n" + p2.getName()+": "+alive2 +"\n" + game.getStatus(game, scanner, p2) + "" + p2.getHealth() +
    "\nBubonic Plague: "+p2.getBubonicPlague()+"    Smallpox: "+p2.getSmallpox()+"   Measles: "+p2.getMeasles() +
    "\n" + p3.getName()+": "+alive3 + "\n" + game.getStatus(game, scanner, p3) + "" + p3.getHealth() +
    "\nBubonic Plague: "+p3.getBubonicPlague()+"    Smallpox: "+p3.getSmallpox()+"   Measles: "+p3.getMeasles() +
    "\n" + p4.getName()+": "+alive4 + "\n" + game.getStatus(game, scanner, p4) + "" + p4.getHealth() +
    "\nBubonic Plague: "+p4.getBubonicPlague()+"    Smallpox: "+p4.getSmallpox()+"   Measles: "+p4.getMeasles() +
    "\n" + p5.getName()+": "+alive5 + "\n" + game.getStatus(game, scanner, p5) + "" + p5.getHealth() +
    "\nBubonic Plague: "+p5.getBubonicPlague()+"    Smallpox: "+p5.getSmallpox()+"   Measles: "+p5.getMeasles() +
    "\n\nSupplies Status:\n" + "Food: "+player.getFood()+" lb  Clothes: "+player.getClothing()+" sets   Ammunition: "+player.getBullets()+"  Cash: $"+player.getCash()+ "\n" +
    "Camel: "+player.getCamel()+"  Wheels: "+player.getWheel()+"   Axles: "+player.getAxle()+"  Tongues: "+player.getTongue()+"\n" +
    "\nPace: "+pace+ "\nRations: "+ration);


    WriteData(game, calender, "Checked health and party status");

  }

  public void Status(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {
    game.StatusMenu(player, scanner, calender, game, p1, p2, p3, p4, p5);
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
    game.WriteData(game, calender, "Decided to AutoTravel for "+traveldays+" days");
    for(int i = 0; traveldays > i; i++) {
      game.clearScreen();
      //game.TravelMenu2(player, scanner, calender, game, p1, p2, p3, p4, p5);
      try
      {
          Thread.sleep(2000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);

    }
    game.clearScreen();
    //game.TravelMenu2(player, scanner, calender, game, p1, p2, p3, p4, p5);
    try
    {
        Thread.sleep(2000);
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
    game.WriteData(game, calender, "Decided to rest for "+restdays+" days");
    player.setResting(true);
    for(int i = 0; restdays > i; i++) {
      game.clearScreen();
    //  game.TravelMenu3(player, scanner, calender, game, p1, p2, p3, p4, p5);
      try
      {
          Thread.sleep(2000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
    }
    game.clearScreen();
    //game.TravelMenu3(player, scanner, calender, game, p1, p2, p3, p4, p5);
    try
    {
        Thread.sleep(2000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    player.setResting(false);
  }


  public void Pace(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {


        JFrame framer = new JFrame();
        int n = 3;
        while (n == 3) {
          String[] options = {"Steady", "Strenuous", "Grueling", "More Info"};

          n = JOptionPane.showOptionDialog(framer,//parent container of JOptionPane
              "Pacing your travel is important. Traveling too slowly may result in encumbering bad weather and poor time.\nTravel too fast and you may risk the well being of your party",
              "The Silk Road (Pace)",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.QUESTION_MESSAGE,
              null,//do not use a custom Icon
              options,//the titles of buttons
              options[3]);//default button title
              if (n == 3) {
                JOptionPane.showMessageDialog(null, "Steady - A solid 8 hours of travel a day\nStrenuous - A hard 12 hours of travel a day\nGrueling - A challenging 16 hours of travel a day");
              }
        }

        //int rationInt = Integer.parseInt(rationString);

        if (n == 0) {
          player.setPaceCoef(1);
          game.WriteData(game, calender, "Changed pace to steady");
        }
        if (n == 1) {
          player.setPaceCoef(1.5);
          game.WriteData(game, calender, "Changed pace to strenuous");
        }
        if (n == 2) {
          player.setPaceCoef(2);
          game.WriteData(game, calender, "Changed pace to grueling");
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


  public void Rations(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {

    JFrame framer = new JFrame();
    int n = 3;
    while (n == 3) {
      String[] options = {"Filling", "Meager", "Barebones", "More Info"};

      n = JOptionPane.showOptionDialog(framer,//parent container of JOptionPane
          "Rationing your food is important. Having good portions helps travelers health.\nAlthough, eating too much can result in a lack of food",
          "The Silk Road (Rations)",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,//do not use a custom Icon
          options,//the titles of buttons
          options[3]);//default button title
          if (n == 3) {
            JOptionPane.showMessageDialog(null, "Filling - Travelers will be feeling strong and ready to travel\nMeager - Enough for travelers to keep going\nBarebones - Travelers will be going to sleep hungry");
          }
    }

    //int rationInt = Integer.parseInt(rationString);

    if (n == 0) {
      player.setRationCoef(3);
      game.WriteData(game, calender, "Changed Rations to Filling");
    }
    if (n == 1) {
      player.setRationCoef(2);
      game.WriteData(game, calender, "Changed Rations to Meager");
    }
    if (n == 2) {
      player.setRationCoef(1);
      game.WriteData(game, calender, "Changed Rations to Barebones");
    }

  }

  public void HuntFailsMenu(int index) {
    String whoops = "";
    if (index == -1) {
      whoops = "You decided to go hunting without Ammunition...";
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

    JOptionPane.showMessageDialog(null, "The Hunt didn't go well... "+whoops);


  }


  public void HuntingResults(int bears, int dears, int monkeys, int snakes, int foxes, int rabbits, int geese, int ducks, int bullets, int totalfood, int gatheredfood) {
    JOptionPane.showMessageDialog(null, "That was a successful Hunt!\nWhat you got:\n\nBears: "+bears+"\nDears: "+dears+"\nMonkeys: "+monkeys+
    "\nSnakes: "+snakes+"\nFoxes: "+foxes+"\nRabbits: "+rabbits+"\nGeese: "+geese+"\nDucks: "+ducks+"\n\nYou used a total of "+bullets+" ammunition during the hunt."+
    "Of the "+totalfood+" lb you were able to hunt, you were able to salvage "+gatheredfood+" lb of it.");
  }

  public void Hunting(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {



    JFrame frameh = new JFrame();
    String bullets = (String)JOptionPane.showInputDialog(frameh, "Hunting will be a key way to sustain yourself while on the road."+
        "\nBefore hunting, you must allocate a certain amount of ammunition to the hunt" +
        "\nIt's important to note that when you hunt, you can only take 50 lbs- of food" +
        "\nYou have: "+player.getBullets()+" ammunition",
      "Hunting", JOptionPane.QUESTION_MESSAGE);


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
      game.WriteData(game, calender, "Failed at hunting");
      player.setStorming(true);
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
      player.setStorming(false);
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
      if (ShootRNG == 71 || ShootRNG == 72 || ShootRNG == 73 || ShootRNG == 74 || ShootRNG == 95) {
        Ducks++;
      }
      if (player.getFoodMult() == true) {
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
    totalFood = 95*Bears+45*Dears+20*Monkeys+10*Snakes+7*Foxes+5*Rabbits+4*Geese+3*Ducks;
    if (calender.getWeather() == -1) {
      totalFood = totalFood/2;
    }
    if (calender.getWeather() == 5) {
      totalFood = totalFood/2;
    }

    if (totalFood == 0) {
      game.clearScreen();
      game.HuntFailsMenu(-4);
      player.loseAmmo(bulletsInt);
      String huntfail2 = scanner.nextLine();
      game.WriteData(game, calender, "Failed at hunting");
      player.setStorming(true);
      game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
      player.setStorming(false);
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
    game.WriteData(game, calender, "Successful at hunting. Got "+salvagedFood+" pounds of food");
    player.setStorming(true);
    game.newDayStatusCheck(player, scanner, calender, game, p1, p2, p3, p4, p5);
    player.setStorming(false);

  }






  public void CityInput(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {

    String city = "initial";
    while (true) {
        if (city.compareTo("1") == 0) {
          game.clearScreen();
          game.Travel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("2") == 0) {
          game.clearScreen();
          game.AutoTravel(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("3") == 0) {

        }
        if (city.compareTo("4") == 0) {
          game.clearScreen();
          game.Status(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("5") == 0) {
          game.clearScreen();
          game.Pace(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("6") == 0) {
          game.clearScreen();
          game.Rations(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("7") == 0) {
            game.clearScreen();
            game.Rest(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        if (city.compareTo("8") == 0) {
          game.clearScreen();
          game.Buy(scanner, game, calender, player);
        }
        if (city.compareTo("9") == 0) {
          game.clearScreen();
          //game.Trade(scanner, game, calender, player);
        }
        if (city.compareTo("10") == 0) {
          game.clearScreen();
          game.Doctoring(player, scanner, calender, game, p1, p2, p3, p4, p5);
        }
        game.clearScreen();
        game.CityMenu();
        city = scanner.nextLine();
    }
  }


  public void Doctoring(Player player, Scanner scanner, Time calender, SilkRoad game, Person p1, Person p2, Person p3, Person p4, Person p5) {

    int x = 2;
    JFrame fa = new JFrame();

      String[] doctor = {"Heal", "No Heal"};
      x = JOptionPane.showOptionDialog(fa,//parent container of JOptionPane
          "By visiting the doctor, we can ensure your entire party is in tip-top shape for their next journey.\nThe cost to heal your party is $100.\nType a 'Heal' to receive medial treatment for your party.",
          "Doctor",
          JOptionPane.YES_NO_CANCEL_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,//do not use a custom Icon
          doctor,//the titles of buttons
          doctor[1]);//default button title

          if (x == 0 && player.getCash() <= 99) {
            JOptionPane.showMessageDialog(null, "Thank you for your purchase!");
            WriteData(game, calender, "Paid to heal entire party at doctors");
            game.FullHeal(player, scanner, calender, game, p1, p2, p3, p4, p5);
            player.spend(100);
          } else {
            return;
          }

  }










  public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
  }

}
