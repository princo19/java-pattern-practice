import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.printf("%3c", (char) (j + 96));
			}
			System.out.println();
		}

	}

}
//output
//10
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j
//a  b  c  d  e  f  g  h  i  j