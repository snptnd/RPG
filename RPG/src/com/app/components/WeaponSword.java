package com.app.components;

import javax.swing.JOptionPane;

public class WeaponSword implements WeaponBehaviors{
	private int damage;

	@Override
	public boolean kill(int numberOfPeople) {
		JOptionPane.showMessageDialog(null,  "You stabbed " + numberOfPeople + "with a sword");
		return false;
	}

	@Override
	public int dismember(double bodyParts) {
		JOptionPane.showMessageDialog(null,  "You chopped off " + numberOfPeople + " limbs with a sword");
		return 0;
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return this.damage;
	}

	@Override
	public void setDamage(int damagePoints) {
		this.damage = damagePoints
		
	}

}
