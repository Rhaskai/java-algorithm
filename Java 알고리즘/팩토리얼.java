import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
			
		int A = sc.nextInt(); // 5
		int Ave = 1;

			for(int i = 1; i <= A; i++) {

				Ave = Ave * i;

			}


	sc.close();
	
	System.out.println(Ave);
		
	}
}