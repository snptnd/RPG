package com.app.components;

import java.util.ArrayList;

import edu.pitt.bank.Transaction;

public abstract class Actor {
	private WeaponBehaviors wb;
	private String actorID; // unique identifier used so there can be multiples of the same weapon.
	private String actorType;
	private String actorFirstName;
	private String actorLastName;
	private String actorRace;
	private char actorGender; // m or f
	private double actorStrength;
	private double actorAgility;
	private double actorDefence;
	private double actorHealth;
	private double actorStamina;
	private String actorIntroduction;
	private ArrayList<Status> statusList = new ArrayList<Status>();
	private String headCondition;
	private String torsoCondition;
	// something for inventory
	// decrease effectiveness the lower their health
	// 
	
	// this object needs to hold an image that corresponds to this actor object.
	
	public Actor(String actorType, String actorRace){
		this.actorRace = actorRace;
		
		if(actorType == "Player"){
			// this should never happen
		}else if(actorType == "Bandit"){
			
		}else if(actorType == "Merchant"){
			
		}else if(actorType == "Mercenary"){
			
		}else if(actorType == "Slaver"){
			
		}else if(actorType == "Townsfolk"){
			
		}else if(actorType == "Farmer"){
			
		}else if(actorType == "Orc"){
			
		}else if(actorType == "Goblin"){
			
		}else if(actorType == "Dwarf"){
			
		}else if(actorType == "Guard"){
			
		}else if(actorType == "Soldier"){
			
		}else if(actorType == "Thief"){
			
		}else if(actorType == "Assassin"){	
			
		}else if(actorType == "Adventurer"){
			
		}else if(actorType == "Miner"){
			
		}else if(actorType == "Tribesfolk"){
			
		}else if(actorType == "Slave"){
			
		}else if(actorType == "Dwarf"){
			
		}else if(actorType == "Dwarf"){
			
		}else if(actorType == "Dwarf"){
			
		}else if(actorType == "Dwarf"){
			
		}else{
			
		}
	}

	public Actor(String actorID, String actorType, String actorFirstName,
			String actorLastName, String actorRace, char actorGender, double actorStrength,
			double actorAgility, double actorDefence, double actorHealth,
			double actorStamina, String actorIntroduction) {
		this.actorID = actorID;
		this.actorType = actorType;
		this.actorFirstName = actorFirstName;
		this.actorLastName = actorLastName;
		this.actorRace = actorRace;
		this.actorGender = actorGender;
		this.actorStrength = actorStrength;
		this.actorAgility = actorAgility;
		this.actorDefence = actorDefence;
		this.actorHealth = actorHealth;
		this.actorStamina = actorStamina;
		this.actorIntroduction = actorIntroduction;
	}
	public WeaponBehaviors getWB() {
		return wb;
	}
	
}
