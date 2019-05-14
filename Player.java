import java.util.ArrayList;

public class Player {
  private int food;
  private int bullets;
  private int clothing;
  private int misc;
  private int cash;
  private int alive;

  public Player(int food, int bullets, int clothing, int misc, int cash, int alive) {
    this.food = food;
    this.bullets = bullets;
    this.clothing = clothing;
    this.misc = misc;
    this.cash = cash;
    this.alive = alive;
  }

  public Player() {
    this(0, 0, 0, 0, 400, 5);
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

  public int getMisc() {
    return misc;
  }

  public int getCash() {
    return cash;
  }

  public int getAlive() {
    return alive;
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

  public void setMisc(int misc) {
    this.misc = misc;
  }

  public void setCash(int getCash) {
    this.cash = cash;
  }

  public void setAlive(int alive) {
    this.alive = alive;
  }

}
