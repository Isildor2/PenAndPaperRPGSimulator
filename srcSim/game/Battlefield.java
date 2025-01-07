package game;

public class Battlefield {
	private Unit[] field;

	Battlefield(int fieldSize) {
		field = new Unit[fieldSize * fieldSize];

	}

	Battlefield(Unit[] fieldNew) {
		field = fieldNew;

	}

	Unit getSquare(int index) {
		return this.field[index];
	}

	int getSquareUnitType(int index) {
		return this.field[index].getTypeValue();
	}
}