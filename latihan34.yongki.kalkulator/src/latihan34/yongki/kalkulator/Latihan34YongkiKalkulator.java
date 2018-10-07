/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan34.yongki.kalkulator;

import java.util.Scanner;
import yongki.kalkulator.fungsi.fungsiPenjumlahan;

/**
 *
 * @author yongki
 */
public class Latihan34YongkiKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fungsiPenjumlahan math = new fungsiPenjumlahan();
        Scanner scn = new Scanner(System.in);

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan angka ke-1 : ");
        Double value1 = scn.nextDouble();
        System.out.print("Masukkan angka ke-2 : ");
        Double value2 = scn.nextDouble();
        System.out.println();
        System.out.println("Hasil Pertambahan : " + math.tambahBilangan(value1, value2));
        System.out.println("Hasil Pengurangan : " + math.kurangBilangan(value1, value2));
        System.out.println("Hasil Perkalian : " + math.kaliBilangan(value1, value2));
        System.out.println("Hasil Pembagian : " + math.bagiBilangan(value1, value2));
        System.out.println("Hasil Sisa Pembagian : " + math.sisaBilangan(value1, value2));
    }

}
