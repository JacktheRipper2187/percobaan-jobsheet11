import java.util.Scanner;

public class Tugas322 {
    public static void cetakPersegiAngka(int n) {
        if (n < 3) {
            System.out.println("Nilai N minimal harus 3 atau lebih");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int nilaiN = scanner.nextInt();

        cetakPersegiAngka(nilaiN);

        scanner.close();
    }
}
