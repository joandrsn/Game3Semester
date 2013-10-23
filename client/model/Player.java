package model;

import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private int xpos;
	private int ypos;
	private int point;
	private int oldXPos;
	private int oldYPos;
	private String direction;

	public Player (String name) {
		this.name = name;
		xpos = 5;
		ypos = 7;
		oldXPos =-1;
		oldYPos=-1;
		point = 0;
		direction = "up";
	}
	public int getPoint() {
		return point;
	}

	public int getXpos() {
		return xpos;
	}

	public void setXpos(int xpos) {
		this.xpos = xpos;
	}

	public int getYpos() {
		return ypos;
	}

	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String ToString () {
		return name + "   " + point;
	}
	
	public void addOnePoint() {
		point ++;
	}

	public void subOnePoint() {
		point --;
	}
	public int getOldXPos() {
		return oldXPos;
	}
	public void setOldXPos(int oldXPos) {
		this.oldXPos = oldXPos;
	}
	public int getOldYPos() {
		return oldYPos;
	}
	public void setOldYPos(int oldYPos) {
		this.oldYPos = oldYPos;
	}
}