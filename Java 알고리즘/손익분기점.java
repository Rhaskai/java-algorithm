import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
			
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (B >= C) {
			System.out.println("-1");
		} else if (B < C) {
			System.out.println((A/(C-B))+1);
		}
	
	sc.close();
		
	}
}