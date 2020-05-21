import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		scn.close();
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				System.out.printf("%3c",(char)(i+96));
			}
			System.out.println();
		}

	}

}
//output10
//a  a  a  a  a  a  a  a  a  a
//b  b  b  b  b  b  b  b  b  b
//c  c  c  c  c  c  c  c  c  c
//d  d  d  d  d  d  d  d  d  d
//e  e  e  e  e  e  e  e  e  e
//f  f  f  f  f  f  f  f  f  f
//g  g  g  g  g  g  g  g  g  g
//h  h  h  h  h  h  h  h  h  h
//i  i  i  i  i  i  i  i  i  i
//j  j  j  j  j  j  j  j  j  j

