/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yongki.kalkulator.fungsi;

/**
 *
 * @author yongki
 */
public class fungsiPenjumlahan {
   public double tambahBilangan(double value1, double value2) {
        double hasil = value1 + value2;
        return hasil;
    }
    public double kurangBilangan(double value1, double value2) {
        double hasil = value1 - value2;
        return hasil;
    }
    public double kaliBilangan(double value1, double value2) {
        double hasil = value1 * value2;
        return hasil;
    }
    public double bagiBilangan(double value1, double value2) {
        double hasil = value1 / value2;
        System.out.println("Hasil Pembagian : " + hasil);
        return hasil;
    }
    public double sisaBilangan(double value1, double value2) {
        double hasil = value1 % value2;
        System.out.println("Hasil Sisa Pembagian : " + hasil);
        return hasil;
    } 
}
