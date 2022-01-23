package workshop8_3;

import java.util.ArrayList;

public class ConvertList {
	public ArrayList<Integer> convertList(int[] array){
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int i=array.length-1; i>=0; i--) {
			newArray.add(array[i]);
		}
		return newArray;
	}
}
