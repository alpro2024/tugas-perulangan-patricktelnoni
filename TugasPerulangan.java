
import java.util.Scanner;

public class TugasPerulangan{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int stokAwal = input.nextInt();
        int pembelianPerhari = input.nextInt();
        
        for (int i = 0; i < 28; i++) {
            stokAwal -= pembelianPerhari;
        }

        if(stokAwal < 0){
            stokAwal = -1;
        }
  
        
        System.out.println(stokAwal);
    }
}
