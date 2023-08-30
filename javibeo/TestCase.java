package javibeo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestCase {

	public static void main(String[] arg ) {
		
		String phrase = arg[0];
				
		String phrase2 = (phrase == null || phrase.isEmpty()) ? null :  String.join(" ", Arrays.asList(phrase.split(" "))
                .stream().filter(w -> w.length() > 0)
                .map(w -> w.substring(0,1).toUpperCase()  + (w.length() == 1 ? "" : w.substring(1, w.length()).toLowerCase()))
                .collect(Collectors.toList()));
		
	
		System.out.print(phrase2);
	}
	
}
