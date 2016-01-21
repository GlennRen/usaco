/* 
ID: glennren
LANG: JAVA
TASK: speeding 
*/

import java.io.*;
import java.util.*;

class speeding {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] nLength = new int[n];
		int[] nSpeed = new int[n];
		int[] mLength = new int[m];
		int[] mSpeed = new int[m];

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			nLength[i] = Integer.parseInt(st.nextToken());
			nSpeed[i] = Integer.parseInt(st.nextToken());
		} 

		for (int j=0; j<m; j++) {
			st = new StringTokenizer(br.readLine());
			mLength[j] = Integer.parseInt(st.nextToken());
			mSpeed[j] = Integer.parseInt(st.nextToken());
		}

		int[] road = new int[100];
		int roadCount = 0;
		for (int i=0; i<n; i++){
			for (int j=0; j!=nLength[i]; j++) {
				road[roadCount] = nSpeed[i];
				roadCount++;
			}
		}

		int[] cow = new int[100];
		int cowCount = 0;
		for (int i=0; i<m; i++){
			for (int j=0; j!=mLength[i]; j++) {
				cow[cowCount] = mSpeed[i];
				cowCount++;
			}
		}

		int largest = 0;
		for (int i=0; i<100; i++) {
			if (cow[i]-road[i] > largest) {
				largest = cow[i]-road[i];
			}
		}

		pw.println(largest);
		pw.close();
	}
}