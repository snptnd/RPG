package com.app.components;

public class Weapon {
	private String weaponID; // unique identifier used so there can be multiples of the same weapon.
	private String weaponType;
	private String weaponMaterial;
	private String weaponEnchantment;
	private double weaponDurability;
	private String weaponQuality; // quality helps determine base dam. Higher crafting gives a higher probability of creating better quality equipment.
	//the below parameters are auto filled
	//private int weight;
	private double baseDamage;
	private double baseCrit;
	private double baseSpeed;
	private double baseStunChance;
	private double baseValue;
	
	public Weapon(String type, String material, String enchantment, double durability, String quality){
		this.weaponID = java.util.UUID.randomUUID().toString();
		this.weaponType = type;
		this.weaponMaterial = material;
		this.weaponEnchantment = enchantment;
		this.weaponDurability = durability;
		this.weaponQuality = quality;
		/* Quality Levels
		 * Superior
		 * Fine
		 * Good
		 * Shoddy
		 * Junk
		 */
		
		if(this.weaponType == "Dagger"){
			this.baseDamage = 5;
			this.baseCrit = 20;
			this.baseValue = 10;
			this.baseStunChance = 0;
		}else if(this.weaponType == "Sword"){
			this.baseDamage = 10;
			this.baseCrit = 10;
			this.baseValue = 15;
			this.baseStunChance = 1;
		}else if(this.weaponType == "Axe"){
			this.baseDamage = 18;
			this.baseCrit = 5;
			this.baseValue = 18;
			this.baseStunChance = 3;
		}else if(this.weaponType == "Mace"){
			this.baseDamage = 15;
			this.baseCrit = 3;
			this.baseValue = 16;
			this.baseStunChance = 8;
		}else{
			this.baseDamage = 0;
			this.baseCrit = 0;
			this.baseValue = 0;
			this.baseStunChance = 0;
		}
		
		if(this.weaponMaterial == "Bronze"){
			this.baseDamage = this.baseDamage*1;
			this.baseValue = this.baseValue*2;
			this.baseStunChance = this.baseStunChance + 0;
		}else if(this.weaponMaterial == "Iron"){
			this.baseDamage = this.baseDamage*1.5;
			this.baseValue = this.baseValue*4;
			this.baseStunChance = this.baseStunChance + 1;
		}else if(this.weaponMaterial == "Steel"){
			this.baseDamage = this.baseDamage*2;
			this.baseValue = this.baseValue*6;
			this.baseStunChance = this.baseStunChance + 2;
		}else if(this.weaponMaterial == "Mithril"){
			this.baseDamage = this.baseDamage*3;
			this.baseValue = this.baseValue*10;
			this.baseStunChance = this.baseStunChance + 3;
		}else{
			this.baseDamage += 0;
			this.baseValue += 0;
		}
		
		if(this.weaponQuality == "Superior"){ // display as Purple in interface
			this.baseDamage = this.baseDamage*1.20;
			this.baseCrit = this.baseCrit*1.20;
			this.baseValue = this.baseValue*1.40;
		}else if(this.weaponQuality == "Fine"){ // display as Green in interface
			this.baseDamage = this.baseDamage*1.10;
			this.baseCrit = this.baseCrit*1.10;
			this.baseValue = this.baseValue*1.20;
		}else if(this.weaponQuality == "Good"){ // display as White in interface
			//weapon keeps base stats
		}else if(this.weaponQuality == "Shoddy"){ // display as Grey in interface
			this.baseDamage = this.baseDamage*0.80;
			this.baseCrit = this.baseCrit*0.80;
			this.baseValue = this.baseValue*0.70;
		}else if(this.weaponQuality == "Junk"){// display as Red in interface
			this.baseDamage = this.baseDamage*0.60;
			this.baseCrit = this.baseCrit*0.60;
			this.baseValue = this.baseValue*0.50;
		}else{
			this.baseDamage = 0;
			this.baseCrit = 0;
			this.baseValue = 0;
		}
		
		
	}
	
	public String getweaponID(){
		return this.weaponID;
	}
	
	public void setWeaponEnchantment(String enchantment){
		this.weaponEnchantment = enchantment;
	}
	
	public String getWeaponEnchantment(){
		return this.weaponEnchantment;
	}
	
	public void setWeaponDurability(double durability){
		this.weaponDurability = durability;
	}
	
	public Double getWeaponDurability(){
		return this.weaponDurability;
	}

	public String getWeaponType(){
		return this.weaponType;
	}
	
	public String getWeaponMaterial(){
		return this.weaponMaterial;
	}
	
	public void setWeaponQuality(String quality){
		this.weaponQuality = quality;
	}
	
}
