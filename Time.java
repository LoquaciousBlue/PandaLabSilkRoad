public class Time {
  private int day;
  private int season;

  public Time(int day, int season) {
    this.day = day;
    this.season = season;
  }

  public Time() {
    this(0,0);
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setSeason(int season) {
    this.season = season;
  }

  public int getDay(int day) {
    return day;
  }

  public int getSeason(int season) {
    return season;
  }

  public void newDay() {
    day++;
    if (day == 90) {
      day = 0;
      season++;
    }
  }




}
