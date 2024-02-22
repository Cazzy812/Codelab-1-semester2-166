import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class  DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelaminInput = scanner.nextLine().charAt(0);
        String jenisKelamin = (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') ? "Laki-laki" : "Perempuan";

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, sekarang);

        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + period.getYears() + " tahun " + period.getMonths() + " bulan");
    }
}

