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
	private boolean Typhoid; //Going to keep track of sickness via integer values
	private boolean Cholera;
	private boolean Dysentery;
	private boolean Diphtheria;
	private boolean Measles;
	private int health;
	private boolean alive;

	public Person(String name, boolean Typhoid, boolean Cholera, boolean Dysentery, boolean Diphtheria, boolean Measles, int health, boolean alive) {
		this.name = name;
		this.Typhoid = Typhoid;
		this.Cholera = Cholera;
		this.Dysentery = Dysentery;
		this.Diphtheria = Diphtheria;
		this.Measles = Measles;
		this.health = health;
		this.alive = alive;
	}

	public Person(String name) {
		this(name, true, true, true, true, true, 100, true);
	}
	public String getName() {
		return name;
	}

	public boolean getTyphoid() {
		return Typhoid;
	}

	public boolean getCholera() {
		return Cholera;
	}

	public boolean getDysentery() {
		return Dysentery;
	}

	public boolean getDiphtheria() {
		return Diphtheria;
	}

	public boolean getMeasles() {
		return Measles;
	}

	public int getHealth() {
		return health;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setTyphoid(boolean Typhoid) {
		this.Typhoid = Typhoid;
	}

	public void setCholera(boolean Cholera) {
		this.Cholera = Cholera;
	}

	public void setDysentery(boolean Dysentery) {
		this.Dysentery = Dysentery;
	}

	public void setDiptheria(boolean Diphtheria) {
		this.Diphtheria = Diphtheria;
	}

	public void setMeasles(boolean Measles) {
		this.Measles = Measles;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void getAlive(boolean alive) {
		this.alive = alive;
	}

}
