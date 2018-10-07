/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yongki.tunjangan.fungsi;
/**
 *
 * @author yongki
 * Nama : Yongki Agustin
 * Kelas : PBO6/IF6K 
 * Nim : 10117903
 * Deskripsi Program :class ini berfungsi untuk menyimpan fungsi tunjangan dan 
 * pernyataan status menikah/belum
 */
public class fungsiTunjangan {

    public double tunjangan;
    public double totalGaji;

    public void hasilTunjangan(Double gajiPokok, String status) {
        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        //tunjangan
        tunjangan = (status.equalsIgnoreCase("Menikah")) ? 0.35 * gajiPokok : 0;

        System.out.println("Tunjangan : Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total Gaji : Rp. " + totalGaji);
    }
}