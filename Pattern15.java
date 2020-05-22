import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		char ch ='*';
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3c",ch);
			}
			System.out.println();
		}
	}

}
//output
//10
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *  *


