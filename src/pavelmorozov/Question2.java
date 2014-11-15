package pavelmorozov;

public class Question2 {
	public static boolean checkByte(int i){
		if ((i>=0) && (i<=255)) {
			return true;
		}
		return false;
	}
	
	public static boolean check(int r, int g, int b){
		//checks arguments
		if (checkByte(r)&&checkByte(g)&&checkByte(b)){
			return true;
		}
		return false;
	}
	
	public static String convert(int r, int g, int b){
		//Converts int colors to HTML hex format 
		if (check(r,g,b)) {
			return('#'+Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b));
		}
		return null;
	}
}
