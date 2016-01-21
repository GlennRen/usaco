/*
ID: glennren
LANG: JAVA
TASK: badmilk
*/

import java.io.*;
import java.util.*;

class badmilk {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("badmilk.in"));
		PrintWriter pw = new PrintWriter(new PrintWriter(new FileWriter("badmilk.out")));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int numberOfGuests = Integer.parseInt(st.nextToken());
		int typesOfMilk = Integer.parseInt(st.nextToken());
		int drinkLog = Integer.parseInt(st.nextToken());
		int sickLog = Integer.parseInt(st.nextToken());

		
	}
}