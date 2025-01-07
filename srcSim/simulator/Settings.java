package simulator;

import java.util.ArrayList;

import game.Unit;

public class Settings {
	private ArrayList<SingleSetting> settings;
	// int fieldSize=12;

	/*
	 * Add list of parameter sets
	 */
	Unit[] field = {};

	public int getAmountOfSettingsToTest() {
		return settings.size();
	}

	public void addSettingsToTest(SingleSetting settingToTest) {
		this.settings.add(settingToTest);
	}

	public SingleSetting getSetting(int index) {
		return settings.get(index);
	}

}