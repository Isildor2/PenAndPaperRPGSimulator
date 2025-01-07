package world;

public class Biomes {
	public static String getNameByValue(int id) {
		switch(id) {
		case 0:
			return "Ocean";
		case 1:
			return "Plains";
		case 2:
			return "Forest";
		case 3:
			return "Mountains";
		}
		return "youdumb";
	}
}
