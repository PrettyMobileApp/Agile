package Original;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Hello World";
		System.out.println(myString.substring(0,1));
		
		List<String> tempArray = new ArrayList<String> ();
		for(int i=0; i<myString.length(); i++){
			tempArray.add(myString.substring(i, i+1));
		}
		for(int i=0; i<tempArray.size(); i++){
			System.out.println(tempArray.get(i));
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("some text 1-");
		stringBuilder.append("some text 2-");
		stringBuilder.append("some text 3");
		String finalString = stringBuilder.toString();
		System.out.println(finalString);
		
	}

}
