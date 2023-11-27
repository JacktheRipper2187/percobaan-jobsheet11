import java.util.Scanner;

public class Tugas122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("N harus minimal 3");
            return;
        }

        for (int i = 1; i <= N; i++) {
            // Mencetak spasi untuk pola segitiga
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Mencetak angka dari 1 hingga i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris selesai
        }
    }
}
