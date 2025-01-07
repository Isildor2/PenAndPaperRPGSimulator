package game;

public abstract class Unit {
	private static final int value = 0;

	public abstract void attack();

	public int getTypeValue() {
		return this.value;
	}
}