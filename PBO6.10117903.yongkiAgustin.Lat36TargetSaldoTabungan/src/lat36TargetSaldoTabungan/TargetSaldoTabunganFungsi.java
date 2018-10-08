package lat36TargetSaldoTabungan;
/**
 *
 * @author yongki
 * Nama : Yongki Agustin
 * Kelas : PBO6/IF6K 
 * Nim : 10117903
 * Deskripsi Program : class ini untuk menyimpan fungsi perulangan agar tabungan
 * mencapai terget 8 bulan
 */
public class TargetSaldoTabunganFungsi {

    public void hitungSaldoTabungan(int saldoTabungan, double saldoBulanan, double bunga) {
        int i;
        for (i = 1; saldoTabungan <= 6000000; i++) {
            saldoBulanan = bunga * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoTabungan);
        }
    }
}
