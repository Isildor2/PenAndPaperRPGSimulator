package simulator;

import game.Unit;

public class Simulator {
	public Simulator() {
		Settings settings=new Settings();
		runSimLoop(settings);
	}
	void runSimLoop(Settings settings) {
		for (int i=0;i<settings.getAmountOfSettingsToTest();i++) {
			int winsA=0;
			int closeCallsA=0;
			SingleSetting setting=settings.getSetting(i);
			for (int j=0;j<100;j++) {
				switch (runTest(setting)) {
				case 0:
					winsA++;
					break;
				case 1:
					closeCallsA++;
					break;
				
				}
			}
		}
	}
	int runTest(SingleSetting setting) {
		while(bothSidesHaveTroops(setting.getField())) {
			
		}
		
		
		
		return 0;
	}
	boolean bothSidesHaveTroops(Unit[] field) {
		boolean aHasTroops=false;
		boolean bHasTroops=false;
		for (int i=0;i<field.length;i++) {
			switch(field.getSquare()) {
			
			}
		}
		return false;
	}
	int evaluateResult(Result result) {
		return 0;
		
	}
	class Result {
		Unit[] field;

		public Result(Unit[] field) {
			this.field=field;
		}
		int getSquare(int index) {
			return field[index].getTypeValue();
		}
	}
}