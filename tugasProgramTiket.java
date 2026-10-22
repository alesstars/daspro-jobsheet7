import java.util.Scanner;

public class tugasProgramTiket {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, tiketTerjual = 0, penjualanSehari = 0, jmlTiket = 0, totalHarga = 0;
        double diskon = 0, hargaAkhir, hargaDiskon;

        do {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik 0 untuk keluar): ");
            jmlTiket = sc.nextInt();
            if (jmlTiket == 0) {
                System.out.println("Transaksi selesai.");
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan kembali jumlah yang valid!");
                continue;
            }

            totalHarga = jmlTiket * hargaTiket;

            System.out.println("Total: Rp" + totalHarga);

            if (jmlTiket >= 4) {
                diskon = 0.1;
                System.out.println("Selamat! Anda mendapatkan diskon 10%.");
            } else if (jmlTiket >= 10) {
                diskon = 0.15;
                System.out.println("Selamat! Anda mendapatkan diskon 15%.");
            }

            hargaDiskon = totalHarga * diskon;
            hargaAkhir = totalHarga - hargaDiskon;

            System.out.println("Total yang harus dibayar: Rp" + hargaAkhir);

            tiketTerjual += jmlTiket;
            penjualanSehari += hargaAkhir;

        } while (true);

        System.out.println("Jumlah tiket terjual hari ini: " + tiketTerjual);
        System.out.println("Total penjualan hari ini: Rp" + penjualanSehari);

        sc.close();
    }
}
