

public class Player {
  private int food;
  private int bullets;
  private int clothing;
  private int wheel;
  private int axle;
  private int tongue;
  private double cash;
  private int alive;
  private double FoodMult;
  private double tradeRate;
  private double paceCoef;
  private double rationCoef;
  private int distance;
  private int oxen;

  public Player(int oxen, int food, int bullets, int clothing, int wheel, int axle, int tongue, double cash, int alive, double FoodMult, double tradeRate, double paceCoef, double rationCoef, int distance) {
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
    this.paceCoef = paceCoef;
    this.rationCoef = rationCoef;
    this.distance = distance;
  }

  public Player() {
    this(0, 0, 0, 0, 0, 0, 0, 800, 5, 1, 1, 1, 3, 0);
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

  public double getFoodMult() {
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

  public void setFoodMult(double FoodMult) {
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

}
