/*
ID: glennren
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;
class ride {
	public static String calcMod (String comet, String name) {
		int cometTotal = 1;
		int nameTotal = 1;
		char[] cometChars = comet.toCharArray();
		char[] nameChars = name.toCharArray();

		Map<Character, Integer> key = new HashMap<Character,Integer>()
		{{
			put('A', 1);
			put('B', 2);
			put('C', 3);
			put('D', 4);
			put('E', 5);
			put('F', 6);
			put('G', 7);
			put('H', 8);
			put('I', 9);
			put('J', 10);
			put('K', 11);
			put('L', 12);
			put('M', 13);
			put('N', 14);
			put('O', 15);
			put('P', 16);
			put('Q', 17);
			put('R', 18);
			put('S', 19);
			put('T', 20);
			put('U', 21);
			put('V', 22);
			put('W', 23);
			put('X', 24);
			put('Y', 25);
			put('Z', 26);
		}};

		for (char i : cometChars) {
			cometTotal *= key.get(i);
		}
		for (char j : nameChars) {
			nameTotal *= key.get(j);
		}
		if (cometTotal%47 == nameTotal%47) {
			return "GO";
		}
		return "STAY";
	}

	public static void main (String [] args) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader("ride.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	   	String comet = br.readLine();    
	    String name = br.readLine();   
	    out.println(calcMod(comet, name));
	    out.close();
  }
}