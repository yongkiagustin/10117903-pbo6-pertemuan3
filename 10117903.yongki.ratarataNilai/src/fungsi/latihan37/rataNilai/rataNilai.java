/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi.latihan37.rataNilai;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class rataNilai {

    public int nilaiMhs;
    public int totalNilaiMhs;
    Scanner scnr = new Scanner(System.in);

    public double HitungTotal(int parNilaiMhs, int parN) {
        for (int i = 1; i <= parN; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            parNilaiMhs = scnr.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
        return totalNilaiMhs;
    }

    public double HitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total / jmlhMhs;
    }
}
