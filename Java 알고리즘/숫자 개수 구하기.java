import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		int N = sc.nextInt(); //150
		int M = sc.nextInt(); //266
		int L = sc.nextInt(); //427
		sc.close();

		int MUL = N*M*L; //17037300

		while(MUL > 0) { 
			arr[MUL%10]++;
			MUL /= 10;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}

	}	
}
