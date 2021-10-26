import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(); // 5

        ArrayList<Integer> List = new ArrayList<>();  //정렬 값

        for(int i = 0; i < N; i++) List.add(sc.nextInt());  // 5 4 3 2 1
        Collections.sort(List); // 오름차순 정렬 => 1 2 3 4 5

        for(Integer c : List) sb.append(c).append("\n"); //Integer c <= List 대입  sb.append(c) => 5 저장후 => append("\n") => \n => 4 => \n ... 1 => \n

        System.out.println(sb);
    }
}