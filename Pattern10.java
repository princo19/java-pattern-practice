import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.printf("%3c", (char) (j + 96));
			}
			System.out.println();
		}

	}

}
//output
//10
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a
//j  i  h  g  f  e  d  c  b  a

