/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.yongki.latihan32.daftarfilm;

import yongki.daftarFilm.model.fungsiFilm;

/**
 * @author yongki
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program menampilkan data Daftar Film
 */
public class YongkiLatihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println("\n");
        
        fungsiFilm filmno1 = new fungsiFilm();
        filmno1.namaFilm = "Venom";
        filmno1.genre = "Action, Horror, Scifi";
        filmno1.rating = 8.5;
        filmno1.duration = 120;
        filmno1.playing();
        System.out.println("");
        
        fungsiFilm filmno2 = new fungsiFilm();
        filmno2.namaFilm = "Small Foot";
        filmno2.genre = "Animation";
        filmno2.rating = 9.6;
        filmno2.duration = 90;
        filmno2.playing();
        System.out.println("");
        
        fungsiFilm filmno3 = new fungsiFilm();
        filmno3.namaFilm = "Crazy Rich Asian";
        filmno3.genre = "Comedy";
        filmno3.rating = 7.8;
        filmno3.duration = 119;
        filmno3.playing();
        System.out.println("");
        
        fungsiFilm filmno4 = new fungsiFilm();
        filmno4.namaFilm = "Asih";
        filmno4.genre = "Horror";
        filmno4.rating = 6.0;
        filmno4.duration = 100;
        filmno4.playing();
    }
    
}
