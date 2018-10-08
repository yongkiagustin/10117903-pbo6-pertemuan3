/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.yongkiagustin.lat36targetsaldotabungan;

import lat36TargetSaldoTabungan.TargetSaldoTabunganFungsi;
/**
 *
 * @author yongki
 * Nama : Yongki Agustin
 * Kelas : PBO6/IF6K 
 * Nim : 10117903
 * Deskripsi Program : Program ini berisi program untuk mneghitung berapa
 * lamanya menabung untuk mencapai target tabungan dengan ditambah bunga
 * perbulannya
 */
public class PBO610117903YongkiAgustinTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan = 0;

        TargetSaldoTabunganFungsi tst = new TargetSaldoTabunganFungsi();
        tst.hitungSaldoTabungan(saldoTabungan, saldoBulanan, bunga);
    }

}
