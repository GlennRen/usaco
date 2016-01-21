/*
ID: glennren
LANG: JAVA
TASK: paint
*/
import java.io.*;
import java.util.*;

class paint {
	public static int fencePainted(int a, int b, int c, int d) {
		int e, f;
		if (a > c) {
			e = c;
			f = d;
			c = a;
			d = b;
			a = e;
			b = f;
		}

		if (a<c && c<b && a<d && d<b) {
			return b-a;
		} else if (b>c) {
			return d-a;
		} else {
			return (b-a)+(d-c);
		}
	}
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("paint.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		pw.println(fencePainted(a,b,c,d));
		pw.close();
	}
}