import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        double sum = 0.00;
        int max = 0;
        double avg = 0.00;
       for (int i = 0; i < arr.length; i++) {
            
            arr[i] = sc.nextInt();

                if(arr[i] > max) {
                    max = arr[i];
                }
            sum = sum + arr[i];
       } 
       sc.close();

       avg = sum / a / max * 100.0;  // (점수합계 / 과목수) / 최댓값 * 100
       System.out.println(avg);
    }
}