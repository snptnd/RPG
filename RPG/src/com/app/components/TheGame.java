package com.app.components;

public class TheGame {
	public static void main(String[] args) {
		Human h = new Human();
		
		WeaponBehavior ws = new WeaponSword();
		ws = new WeaponBow();
		
		Human h = new Human();
		h.killBunchOfOrcs();
		h.changeWeapon(new WeaponBow());
		h.killBunchOfOrcs();
	}
}
