import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = input.nextInt();

        if (N < 5) {
            System.out.println("Nilai N minimal harus 5");
        } else {
            for (int i = N; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
