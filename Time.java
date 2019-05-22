import java.util.Random;

public class Time {
  private int day;
  private int season;
  private int stores;
  private String StringSeason;


  Random rand = new Random();

  public Time(int day, int season, int stores) {
    this.day = day;
    this.season = season;
    this.stores = stores;
  }

  public Time() {
    this(1,0,1);
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setSeason(int season) {
    this.season = season;
  }

  public void setStores(int stores) {
    this.stores = stores;
  }

  public void addStore() {
    stores++;
  }

  public int getDay() {
    return day;
  }

  public int getStore() {
    return stores;
  }

  public int getSeason() {
    return season;
  }

  public void newDay() {
    day++;
    if (day >= 91) {
      day = 1;
      season++;
    }
    if (season >= 4) {
      season = 0;
    }
  }

  public String getDate() {
    if (season == 0) {
      StringSeason = "Winter";
    }
    if (season == 1) {
      StringSeason = "Spring";
    }
    if (season == 2) {
      StringSeason = "Summer";
    }
    if (season == 3) {
      StringSeason = "Fall";
    }

    return "Date: Day "+day+" of "+StringSeason+"";
  }

  public int getWeather() {
      int weather = rand.nextInt(4);
      int seasonMod = 0;
      if (season == 0) {
        return weather - 2;
      }
      if (season == 2) {
        return weather + 2;
      }
      return weather;
  }




}
