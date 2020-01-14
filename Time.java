import java.util.Random;

public class Time {
  private int day;
  private int season;
  private int stores;
  private int weather;
  private int totaldays;
  private String StringSeason;
  private int nextLandMark;
  private int totalDistance;
  private long starttime;
  private long taketime;
  private String cities[] = {"Test", "Rome", "Constantinople", "Antioch", "Dura-Europas",
  "Qumis", "FILLER_1", "FILLER_2", "Kashgar", "FILLER_3", "Dunhuang", "Anxi County", "Wuwei", "Chang'an", "Luoyang"};


  Random rand = new Random();

  public Time(int day, int season, int stores, int weather, int nextLandMark, int totalDistance, int totaldays, long starttime, long taketime) {
    this.day = day;
    this.season = season;
    this.stores = stores;
    this.weather = weather;
    this.nextLandMark = nextLandMark;
    this.totalDistance = totalDistance;
    this.totaldays = totaldays;
    this.starttime = starttime;
    this.taketime = taketime;
  }

  public Time() {
    this(1,0,1,2,0,0,1,0,0);
  }

  public void Choice1(int x) {
    if(x == 1) {
      cities[6] = "Boof";
      stores++;
      cities[7] = "Balch";
    } else {
      cities[6] = "Merv";
      cities[7] = "Samarkand";
    }
  }

  public void Choice2(int x) {
    if(x == 1) {
      cities[9] = "Aksu";
    } else {
      cities[9] = "Hoton";
    }
  }

  public void setStart() {
    this.starttime = System.currentTimeMillis();
  }

  public String getTime() {
    this.taketime = System.currentTimeMillis();
    long time = taketime-starttime;
    String returnable = "";
    time = time/1000;
    int digit1and2 = (int)time/60;
    int digit3and4 = (int)time%60;

    returnable = digit1and2+":"+digit3and4;

    return returnable;
  }

  public long getStart() {
      return starttime;
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

  public void setLandmark(int nextLandMark) {
    this.nextLandMark = nextLandMark;
  }

  public void setDistance(int totalDistance) {
    this.totalDistance = totalDistance;
  }

  public void ProgressOnRoad(int progress) {
    this.totalDistance = totalDistance + progress;
  }

  public void addLandMark(int oof) {
    this.nextLandMark = nextLandMark + oof;
  }

  public void closerToLandMark(int yeet) {
    this.nextLandMark = nextLandMark - yeet;
    if (nextLandMark < 0) {
      nextLandMark = 0;
    }
  }

  public int getTotalDays() {
    return totaldays;
  }


  public String StringLandMark(int stores) {
    String cityname = "";

    cityname = cities[stores];

    return cityname;
  }

  public int getLandmark() {
    return nextLandMark;
  }

  public int getDistance() {
    return totalDistance;
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

  public void incStore() {
    stores++;
  }

  public int getSeason() {
    return season;
  }


  public int getWeather() {
      return weather;
  }

  public void newDay() {
    day++;
    totaldays++;
    if (day >= 91) {
      day = 1;
      season++;
    }
    if (season >= 4) {
      season = 0;
    }
    weather = rand.nextInt(5);
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
