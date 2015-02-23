package com.app.scenes;

import javax.imageio.ImageIO;

public class Map {
	String mapName;
	String buttonAt; //the current button the play is standing on
	ImageIO image;
	
	
	public Map getMap(){
		//this will use the mapName variable to find the map Image
	        image = ImageIO.read(getClass().getResource("/images/maps/" + mapName + ".png"));
		
		
		return null;		
	}

}
