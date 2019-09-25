/**
* Person that is going to be used Oregon Trail Game
*
* @author Edwin Aldrich
*
* Date 5/14/19
* @Version 1.0
*/

import java.util.Scanner;

public class Person {
	//Vars to be used in describing a person
	private String name;
	private boolean BubonicPlague; //Going to keep track of sickness via integer values
	private boolean Smallpox;
	private boolean Measles;
	private int health;
	private boolean alive;

	public Person(String name, boolean BubonicPlague, boolean Smallpox, boolean Measles, int health, boolean alive) {
		this.name = name;
		this.BubonicPlague = BubonicPlague;
		this.Smallpox = Smallpox;
		this.Measles = Measles;
		this.health = health;
		this.alive = alive;
	}

	public Person(String name) {
		this(name, true, true, true, 100, true);
	}

	public Person() {
		this("", false, false, false, 100, true);
	}

	public String getName() {
		return name;
	}

	public boolean getBubonicPlague() {
		return BubonicPlague;
	}

	public boolean getSmallpox() {
		return Smallpox;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setBubonicPlague(boolean BubonicPlague) {
		this.BubonicPlague = BubonicPlague;
	}

	public void setSmallpox(boolean Smallpox) {
		this.Smallpox = Smallpox;
	}

	public void setMeasles(boolean Measles) {
		this.Measles = Measles;
	}

	public void setHealth(int health) {
		this.health = health;
		if (health > 110) {
			health = 109;
		}
	}

	public void decHealth(int a1) {
    this.health = health - a1;
		if (health < 0) {
			health = 0;
		}
  }

  public void incHealth(int a1) {
    this.health = health + a1;
		if (health > 110) {
			health = 109;
		}
  }

	public void setAlive(boolean alive) {
		this.alive = alive;
	}


}
