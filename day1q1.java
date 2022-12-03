import java.util.*;
import java.io.*;
public class day1q1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = "";
		int a = 0;
		int b = 0;

		while (!(s = readLine()).equals("")) {
			do {
				a += Integer.parseInt(s);
			} while (!(s = readLine()).equals(""));
			if (a > b){
				b = a;
			}
			a = 0;
		}
		System.out.println(b);
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		String s = br.readLine();
		if (s == null) return "";
		else return s;
	}
}
