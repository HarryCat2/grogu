package harrrycat.grogu.util;

public class MathUtil
{
	public static int clamp(int min, int max, int value){
		return Math.max(Math.min(max, value), min);
	}
}
