

public class Player {
  private int food;
  private int bullets;
  private int clothing;
  private int wheel;
  private int axle;
  private int tongue;
  private int cash;
  private int alive;

  public Player(int food, int bullets, int clothing, int wheel, int axle, int tongue, int cash, int alive) {
    this.food = food;
    this.bullets = bullets;
    this.clothing = clothing;
    this.cash = cash;
    this.alive = alive;
    this.wheel = wheel;
    this.tongue = tongue;
    this.axle = axle;
  }

  public Player() {
    this(0, 0, 0, 0, 0, 0, 800, 5);
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


  public int getCash() {
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

  public void setFood(int food) {
    this.food = food;
  }

  public void setBullets(int bullets) {
    this.bullets = bullets;
  }

  public void setClothing(int clothing) {
    this.clothing = clothing;
  }

  public void setCash(int getCash) {
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

}
