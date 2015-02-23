package com.app.components;

public class Human extends Actor{
	public Human(){
		super.setWB(new WeaponSword());
	}
	
	public void killBunchOfOrcs(){
		super.getWB().kill(50);
	}
	public void changeWeapon(WeaponBehavior weapon){
		super.setWb(weapon);
	}
}
