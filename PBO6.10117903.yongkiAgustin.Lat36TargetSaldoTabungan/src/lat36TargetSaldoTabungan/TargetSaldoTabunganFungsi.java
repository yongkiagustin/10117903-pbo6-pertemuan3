package lat36TargetSaldoTabungan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yongki
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
