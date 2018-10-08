/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.yongki.latihan37RatarataNilai;

import fungsi.latihan37.rataNilai.rataNilai;
import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class YongkiRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         rataNilai mhs = new rataNilai();
         Scanner scn = new Scanner(System.in);

         int banyakMhs;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         banyakMhs = scn.nextInt();

         mhs.HitungTotal(mhs.nilaiMhs, banyakMhs);
         mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs, banyakMhs);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : %.1f\n "
                +mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs,banyakMhs));
        
    }
    
}
