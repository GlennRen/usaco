/*
ID: glennren
LANG: JAVA
TASK: speeding
*/

import java.io.*;
import java.util.*;

class bcount {
	public static void main(String [] args) throws IOException {
		List<Integer> typesOfCows = new ArrayList<>();
		List<Integer[]> intervals = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader("bcount.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int numOfCows = Integer.parseInt(st.nextToken());
		int numOfIntervals = Integer.parseInt(st.nextToken());

		for (int i=0; i<numOfCows; i++ ) {
			st = new StringTokenizer(br.readLine());
			typesOfCows.add(Integer.parseInt(st.nextToken()));
		}
		for (int j=0; j<numOfIntervals; j++ ) {
			st = new StringTokenizer(br.readLine());
			intervals.add(new Integer[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
		}

		for (Integer[] i: intervals) {
			int firstInterval = i[0];
			int secondInterval = i[1];

			int breed1Count, breed2Count, breed3Count;
			breed1Count = breed2Count = breed3Count = 0;

			for (int j=firstInterval-1; j<secondInterval; j++ ) {
				if (typesOfCows.get(j) == 1) {
					breed1Count ++;
				} else if (typesOfCows.get(j) == 2) {
					breed2Count ++;
				} else if (typesOfCows.get(j) == 3) {
					breed3Count ++;
				}
			}
			pw.println(breed1Count + " " + breed2Count + " " + breed3Count);
		}
		pw.close();
	}
}

/* timed out :( */