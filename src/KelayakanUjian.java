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

        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);
        System.out.println();
        // operator && AND adalah short-circuit, ketika operand kiri false maka hasil akhirnya akan menjadi false
        // operator || OR adalah juga short-circuit, ketika operand kiri true maka hasil akhir pasti true
        // karena (cek++>=0) keduanya tidak dijalankan maka nilai cek akan tetap 0

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi : " + dispensasi);
        System.out.println("a (tanpa kurung) : " + a);
        System.out.println("b (kurung precedence): " + b);
        System.out.println("c (kurung digeser): " + c);
        System.out.println("!dispensasi: " + negasiDispensasi);
        System.out.println("cek dipanggil: " + cek);

    }
}