/*
ID: glennren
LANG: JAVA
TASK: promote
*/

import java.io.*;
import java.util.*;

public class promote {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("promote.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));

		// Reading input
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bronzeBefore = Integer.parseInt(st.nextToken());
		int bronzeAfter = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int silverBefore = Integer.parseInt(st.nextToken());
		int silverAfter = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int goldBefore = Integer.parseInt(st.nextToken());
		int goldAfter = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int platBefore = Integer.parseInt(st.nextToken());
		int platAfter = Integer.parseInt(st.nextToken());
	
		int goldToPlat = platAfter - platBefore;
		int silverToGold = goldAfter - (goldBefore - goldToPlat);
		int bronzeToSilver = silverAfter - (silverBefore - silverToGold);

		pw.println(bronzeToSilver);
		pw.println(silverToGold);
		pw.println(goldToPlat);
		pw.close();
	}
}