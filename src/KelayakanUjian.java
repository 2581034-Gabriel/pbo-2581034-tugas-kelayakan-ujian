import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kehadiran (%) : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Nilai tugas : ");
        int nilaiTugas = scanner.nextInt();

        System.out.print("Dispensasi : ");
        boolean dispensasi = scanner.nextBoolean();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);
        // a atau b sama alasannya dikarenakan operator AND && punya precedence yang lebih tinggi dibandingkan dengan OR ||.
        // sedangkan c berbeda karena kurungnya digeser sehingga urutan dan hasilnya berbeda.

        boolean negasiDispensasi = !dispensasi;
        // termasuk kedalam ketentuan 5 dimana semua variabel disimpan ke dalam boolean
