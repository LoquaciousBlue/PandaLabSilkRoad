public class Time {
  private int day;
  private int season;
  private int stores;

  public Time(int day, int season, int stores) {
    this.day = day;
    this.season = season;
    this.stores = stores;
  }

  public Time() {
    this(0,0,0);
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
    if (day >= 90) {
      day = 0;
      season++;
    }
  }

}
