import java.util.*;
import java.io.*;
public class day1q2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = "";
		int a = 0;
		int first = 0;
        int second = 0;
        int third = 0;

		while (!(s = readLine()).equals("")) {
			do {
				a += Integer.parseInt(s);
			} while (!(s = readLine()).equals(""));

			if (a > first) {
                third = second;
                second = first;
                first = a;
            } else if (a > second) {
                third = second;
                second = a;
            } else if (a > third) third = a;
            a = 0;
		}
		System.out.println(first + second + third);
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
