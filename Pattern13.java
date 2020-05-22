import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		int ch='a';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3c",ch++);
			}
			System.out.println();
		}

	}

}
//output
//5
//a  b  c  d  e
//f  g  h  i  j
//k  l  m  n  o
//p  q  r  s  t
//u  v  w  x  y
