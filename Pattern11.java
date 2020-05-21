import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		for( int i=n;i>=1;i--) {
			for(int j =1;j<=n;j++) {
				System.out.printf("%3c",(char)(i+96));
			}
			System.out.println();
		}

	}

}
//output
//10
//j  j  j  j  j  j  j  j  j  j
//i  i  i  i  i  i  i  i  i  i
//h  h  h  h  h  h  h  h  h  h
//g  g  g  g  g  g  g  g  g  g
//f  f  f  f  f  f  f  f  f  f
//e  e  e  e  e  e  e  e  e  e
//d  d  d  d  d  d  d  d  d  d
//c  c  c  c  c  c  c  c  c  c
//b  b  b  b  b  b  b  b  b  b
//a  a  a  a  a  a  a  a  a  a