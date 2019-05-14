/**
* Person that is going to be used Oregon Trail Game
*
* @author Edwin Aldrich
*
* Date 5/14/19
* @Version 1.0
*/

public class Person {
	//Vars to be used in describing a person
	private String name;
	private int Typhoid; //Going to keep track of sickness via integer values
	private int Cholera;
	private int Dysentery;
	private int Diphtheria;
	private int Measles;
	private int health;
	private boolean alive;
	private int sickness;

	public Person(String name, int Typhoid, int Cholera, int Dysentery, int Diphtheria, int Measles, int health, boolean alive, int sickness) {
		this.name = name;
		this.Typhoid = Typhoid;
		this.Cholera = Cholera;
		this.Dysentery = Dysentery;
		this.Diphtheria = Diphtheria;
		this.Measles = Measles;
		this.health = health;
		this.alive = alive;
		this.sickness = sickness;
	}

	public Person(String name) {
		this(name, 0, 0, 0, 0, 0, 100, true, 0);
	}
	public String getName() {
		return name;
	}

	public int getTyphoid() {
		return Typhoid;
	}

	public int getCholera() {
		return Cholera;
	}

	public int getDysentery() {
		return Dysentery;
	}

	public int getDiphtheria() {
		return Diphtheria;
	}

	public int getMeasles() {
		return Measles;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return alive;
	}
	//Temporary main ailmant
	public int getSickness() {
		return sickness;
	}

	public void setTyphoid(int Typhoid) {
		this.Typhoid = Typhoid;
	}

	public void setCholera(int Cholera) {
		this.Cholera = Cholera;
	}

	public void setDysentery(int Dysentery) {
		this.Dysentery = Dysentery;
	}

	public void setDiptheria(int Diphtheria) {
		this.Diphtheria = Diphtheria;
	}

	public void setMeasles(int Measles) {
		this.Measles = Measles;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void getAlive(boolean alive) {
		this.alive = alive;
	}

	public void setSickness(int sickness) {
		this.sickness = sickness;
	}
}
