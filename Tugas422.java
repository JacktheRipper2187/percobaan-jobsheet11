import java.util.Arrays;
import java.util.Comparator;

class Atlet {
    private String nama;

    public Atlet(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class  Tugas422 {
    public static void main(String[] args) {
        // Membuat array untuk setiap cabang olahraga dan menambahkan atlet-atletnya
        Atlet[] atletBadminton = {
            new Atlet("Atlet1"),
            new Atlet("Atlet2"),
            new Atlet("Atlet3"),
            new Atlet("Atlet4"),
            new Atlet("Atlet5")
        };

        Atlet[] atletTenisMeja = {
            new Atlet("Atlet6"),
            new Atlet("Atlet7"),
            new Atlet("Atlet8"),
            new Atlet("Atlet9"),
            new Atlet("Atlet10")
        };

        Atlet[] atletBasket = {
            new Atlet("Atlet11"),
            new Atlet("Atlet12"),
            new Atlet("Atlet13"),
            new Atlet("Atlet14"),
            new Atlet("Atlet15")
        };

        Atlet[] atletVoli = {
            new Atlet("Atlet16"),
            new Atlet("Atlet17"),
            new Atlet("Atlet18"),
            new Atlet("Atlet19"),
            new Atlet("Atlet20")
        };

        // Menggabungkan semua atlet ke dalam satu array
        Atlet[] semuaAtlet = new Atlet[atletBadminton.length + atletTenisMeja.length +
                                        atletBasket.length + atletVoli.length];

        System.arraycopy(atletBadminton, 0, semuaAtlet, 0, atletBadminton.length);
        System.arraycopy(atletTenisMeja, 0, semuaAtlet, atletBadminton.length, atletTenisMeja.length);
        System.arraycopy(atletBasket, 0, semuaAtlet, atletBadminton.length + atletTenisMeja.length, atletBasket.length);
        System.arraycopy(atletVoli, 0, semuaAtlet, atletBadminton.length + atletTenisMeja.length + atletBasket.length, atletVoli.length);

        // Mengurutkan semua atlet berdasarkan nama secara ascending
        Arrays.sort(semuaAtlet, Comparator.comparing(Atlet::getNama));

        // Menampilkan informasi atlet yang sudah diurutkan
        System.out.println("Daftar Atlet:");
        for (Atlet atlet : semuaAtlet) {
            System.out.println(atlet.getNama());
        }
    }
}
