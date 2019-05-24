import java.util.Random;

public class Time {
  private int day;
  private int season;
  private int stores;
  private int weather;
  private String StringSeason;


  Random rand = new Random();

  public Time(int day, int season, int stores, int weather) {
    this.day = day;
    this.season = season;
    this.stores = stores;
    this.weather = weather;
  }

  public Time() {
    this(1,0,1,2);
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

  public void setWeather(int weather) {
    this.weather = weather;
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


  public int getWeather() {
      return weather;
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
    weather = rand.nextInt(4);
    if (season == 0) {
      weather = weather - 2;
    }
    if (season == 2) {
      weather = weather + 2;
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


  public String weatherString(int weatherInt) {
    if (weatherInt == -2) {
      return "Deathly Cold";
    } else if (weatherInt == -1) {
      return "Very Cold";
    } else if (weatherInt == 0) {
      return "Cold";
    } else if (weatherInt == 1) {
      return "Cool";
    } else if (weatherInt == 2) {
      return "Fair";
    } else if (weatherInt == 3) {
      return "Warm";
    } else if (weatherInt == 4) {
      return "Hot";
    } else if (weatherInt == 5) {
      return "Very Hot";
    } else {
      return "Deathly Hot";
    }
  }




}
