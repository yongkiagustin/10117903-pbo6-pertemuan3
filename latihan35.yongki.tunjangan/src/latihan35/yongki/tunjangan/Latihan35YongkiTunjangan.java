/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan35.yongki.tunjangan;

import java.util.Scanner;
import yongki.tunjangan.fungsi.fungsiTunjangan;

/**
 *
 * @author yongki 
 * Nama : yongki Agustin 
 * Kelas : PBO6/IF6K 
 * Nim : 10117903
 * Deskripsi Program : program main untuk menginput dan menampilkan hasil
 * tunjangan
 */
public class Latihan35YongkiTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        String status;

        fungsiTunjangan tjn = new fungsiTunjangan();
        Scanner scn = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scn.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scn.next();
        System.out.println();

        tjn.hasilTunjangan(gajiPokok, status);
        System.out.println("Developed By : Anony");
    }

}
