import java.util.Scanner;

public class tugasProgramParkir {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jenis, durasi = 0, total = 0;

        System.out.println("Kode jenis kendaraan: 1 = mobil, 2 = motor, 0 = keluar");

        do {
            System.out.print("Masukkan jenis kendaraan (ketik 0 untuk keluar): ");
            jenis = sc.nextInt();
            if (jenis == 0) {
                System.out.println("Transaksi selesai.");
                break;
            }

            if (jenis < 0 || jenis > 2) {
                System.out.println("Jenis kendaraan tidak valid. Masukkan kembali jenis kendaraan yang valid!");
                continue;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi <= 0) {
                    System.out.println("Durasi parkir tidak valid. Masukkan kembali durasi yang valid!");
                    continue;
                }

                if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } 

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp" + total);

        sc.close();

    }
}
