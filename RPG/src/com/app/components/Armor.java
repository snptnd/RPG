package com.app.components;

public class Armor {

	private String armorID; // unique identifier used so there can be multiples of the same weapon.
	private String armorType;
	private String armorMaterial;
	private String armorEnchantment;
	private double armorDurability;
	private String armorQuality; // quality helps determine base dam. Higher crafting gives a higher probability of creating better quality equipment.
	//the below parameters are auto filled
	//private int weight;
	private double baseDefence;
	private double baseValue;
	private double agilityPenalty; //

	public Armor(String type, String material, String enchantment, double durability, String quality){
		this.armorID = java.util.UUID.randomUUID().toString();
		this.armorType = type;
		this.armorMaterial = material;
		this.armorEnchantment = enchantment;
		this.armorDurability = durability;
		this.armorQuality = quality;
		/* Quality Levels
		 * Superior
		 * Fine
		 * Good
		 * Shoddy
		 * Junk
		 */

		if(this.armorType == "Cloth"){
			this.baseDefence = 3;
			this.baseValue = 10;
		}else if(this.armorType == "Light"){
			this.baseDefence = 15;
			this.baseValue = 15;
		}else if(this.armorType == "Heavy"){
			this.baseDefence = 35;
			this.baseValue = 18;
		}else{
			this.baseDefence = 0;
			this.baseValue = 0;
		}
		// if its heavy armor, decide what material it is made of
		if(this.armorType == "Heavy"){

			if(this.armorMaterial == "Bronze"){
				this.baseDefence = this.baseDefence*1;
				this.baseValue = this.baseValue*2;
			}else if(this.armorMaterial == "Iron"){
				this.baseDefence = this.baseDefence*1.5;
				this.baseValue = this.baseValue*4;
			}else if(this.armorMaterial == "Steel"){
				this.baseDefence = this.baseDefence*2;
				this.baseValue = this.baseValue*6;
			}else if(this.armorMaterial == "Mithril"){
				this.baseDefence = this.baseDefence*3;
				this.baseValue = this.baseValue*10;
			}else{
				this.baseDefence += 0;
				this.baseValue += 0;
			}
		}

		if(this.armorQuality == "Superior"){ // display as Purple in interface
			this.baseDefence = this.baseDefence*1.20;
			this.baseValue = this.baseValue*1.40;
		}else if(this.armorQuality == "Fine"){ // display as Green in interface
			this.baseDefence = this.baseDefence*1.10;
			this.baseValue = this.baseValue*1.20;
		}else if(this.armorQuality == "Good"){ // display as White in interface
			//weapon keeps base stats
		}else if(this.armorQuality == "Shoddy"){ // display as Grey in interface
			this.baseDefence = this.baseDefence*0.80;
			this.baseValue = this.baseValue*0.70;
		}else if(this.armorQuality == "Junk"){// display as Red in interface
			this.baseDefence = this.baseDefence*0.60;
			this.baseValue = this.baseValue*0.50;
		}else{
			this.baseDefence = 0;
			this.baseValue = 0;
		}


	}


}	
