import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		char ch= 'z';
		for(int i =1 ;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3c",ch--);
			}
			System.out.println();
		}

	}

}
//output
//5
//z  y  x  w  v
//u  t  s  r  q
//p  o  n  m  l
//k  j  i  h  g
//f  e  d  c  b

