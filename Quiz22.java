import java.util.Scanner;
import java.util.Random;

public class Quiz22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil!");
                } else if (answer > number) {
                    System.out.println("Tebakan Anda terlalu besar!");
                } else {
                    success = true;
                    System.out.println("Tebakan Anda benar!");
                }
            } while (!success);

            System.out.println("Apakah anda ingin mengulang permainan (Y/T) ");
            menu = input.next().charAt(0);
            input.nextLine();
        } while (menu == 'Y' || menu == 'y');
    }
}
