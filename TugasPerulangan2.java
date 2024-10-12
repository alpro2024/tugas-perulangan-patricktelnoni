
import java.util.Scanner;

public class TugasPerulangan2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N  = input.nextInt();

        if(N < 2 || N > 100){
            System.out.println(-1);
            
        }
        else{
            for (int i = 1; i <= N; i++) {
                int output = i * 3;
                System.out.println(output);
            }
        }
    }
}
