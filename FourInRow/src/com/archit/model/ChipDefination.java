package com.archit.model;

import lombok.Builder;

@Builder
public class ChipDefination {
	PlayerEnum playerEnum;
	int chipXcoordinate;
	int chipYcoordinate;
	
	public int getChipXcoordinate() {
		return chipXcoordinate;
	}

	public void setChipXcoordinate(int chipXcoordinate) {
		this.chipXcoordinate = chipXcoordinate;
	}

	public int getChipYcoordinate() {
		return chipYcoordinate;
	}

	public void setChipYcoordinate(int chipYcoordinate) {
		this.chipYcoordinate = chipYcoordinate;
	}

	public PlayerEnum getPlayerEnum() {
		return playerEnum;
	}

	public void setPlayerEnum(PlayerEnum playerEnum) {
		this.playerEnum = playerEnum;
	}
}
