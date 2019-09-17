

public class Player {
  private int food;
  private int bullets;
  private int clothing;
  private int wheel;
  private int axle;
  private int tongue;
  private double cash;
  private int alive;
  private boolean FoodMult;
  private double tradeRate;
  private boolean Carpenter;
  private double paceCoef;
  private double rationCoef;
  private int distance;
  private int oxen;
  private boolean resting;
  private boolean storming;

  public Player(int oxen, int food, int bullets, int clothing, int wheel, int axle, int tongue, double cash, int alive, boolean FoodMult, double tradeRate, boolean Carpenter, double paceCoef, double rationCoef, int distance, boolean resting, boolean storming) {
    this.oxen = oxen;
    this.food = food;
    this.bullets = bullets;
    this.clothing = clothing;
    this.cash = cash;
    this.alive = alive;
    this.wheel = wheel;
    this.tongue = tongue;
    this.axle = axle;
    this.FoodMult = FoodMult;
    this.tradeRate = tradeRate;
    this.Carpenter = Carpenter;
    this.paceCoef = paceCoef;
    this.rationCoef = rationCoef;
    this.distance = distance;
    this.resting = resting;
    this.storming = storming;
  }


  public Player() {
    this(0, 0, 0, 0 , 4, 2, 1, 800, 5, false, 1, false, 1, 3, 0, false, false);
  }

  public void setResting(boolean resting) {
    this.resting = resting;
  }

  public boolean getResting() {
    return resting;
  }

  public void setCarpenter(boolean Carpenter) {
    this.Carpenter = Carpenter;
  }

  public boolean getCarpenter() {
    return Carpenter;
  }

  public void setStorming(boolean storming) {
    this.storming = storming;
  }

  public boolean getStorming() {
    return storming;
  }

  public int getOxen() {
    return oxen;
  }

  public int getFood() {
    return food;
  }

  public int getBullets() {
    return bullets;
  }

  public int getClothing() {
    return clothing;
  }


  public double getCash() {
    return cash;
  }

  public int getAlive() {
    return alive;
  }

  public int getWheel() {
    return wheel;
  }

  public int getTongue() {
    return tongue;
  }

  public int getAxle() {
    return axle;
  }

  public boolean getFoodMult() {
    return FoodMult;
  }

  public double getTradeRate() {
    return tradeRate;
  }

  public double getPaceCoef() {
    return paceCoef;
  }

  public double getRationCoef() {
    return rationCoef;
  }

  public int getDistance() {
    return distance;
  }

  public void setFood(int food) {
    this.food = food;
  }

  public void setBullets(int bullets) {
    this.bullets = bullets;
  }

  public void setClothing(int clothing) {
    this.clothing = clothing;
  }

  public void setCash(double cash) {
    this.cash = cash;
  }

  public void setAlive(int alive) {
    this.alive = alive;
  }

  public void setTongue(int tongue) {
    this.tongue = tongue;
  }

  public void setAxle(int axle) {
    this.axle = axle;
  }

  public void setWheel(int wheel) {
    this.wheel = wheel;
  }

  public void setFoodMult(boolean FoodMult) {
    this.FoodMult = FoodMult;
  }

  public void setTradeRate(double tradeRate) {
    this.tradeRate = tradeRate;
  }

  public void setPaceCoef(double paceCoef) {
    this.paceCoef = paceCoef;
  }

  public void setRationCoef(double rationCoef) {
    this.rationCoef = rationCoef;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public void setOxen(int oxen) {
    this.oxen = oxen;
  }

  public void spend(double dock) {
    this.cash = cash - dock;
  }

  public void buyWheel(int w1) {
    this.wheel = wheel + w1;
  }

  public void buyAxle(int a1) {
    this.axle = axle + a1;
  }

  public void buyTongue(int t1) {
    this.tongue = tongue + t1;
  }

  public void buyFood(int a1) {
    this.food = food + a1;
  }

  public void buyAmmo(int a1) {
    this.bullets = bullets + a1;
  }

  public void buyOxen(int Ox) {
    this.oxen = oxen + Ox;
  }

  public void buyClothing(int c1) {
    this.clothing = c1 + clothing;
  }

  public void makeMoney(double money) {
    this.cash = cash + money;
  }

  public void loseWheel(int w1) {
    this.wheel = wheel - w1;
    if (wheel < 0) {
      wheel = 0;
    }
  }

  public void loseAxle(int a1) {
    this.axle = axle - a1;
    if (axle < 0) {
      axle = 0;
    }
  }

  public void loseTongue(int t1) {
    this.tongue = tongue - t1;
    if (tongue < 0) {
      tongue = 0;
    }
  }

  public void loseFood(int a1) {
    this.food = food - a1;
    if (food < 0) {
      food = 0;
    }
  }

  public void loseAmmo(int a1) {
    this.bullets = bullets - a1;
    if (bullets < 0) {
      bullets = 0;
    }
  }

  public void loseOxen(int Ox) {
    this.oxen = oxen - Ox;
    if (oxen < 0) {
      oxen = 0;
    }
  }

  public void loseClothing(int c1) {
    this.clothing = clothing- c1;
    if (clothing < 0) {
      clothing = 0;
    }
  }

}
