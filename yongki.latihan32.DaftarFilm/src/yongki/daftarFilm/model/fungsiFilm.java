/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yongki.daftarFilm.model;

/**
 *
 * @author yongki
 */
public class fungsiFilm {

    public String namaFilm, genre;
    public double rating;
    public int duration;

    public void playing() {
        System.out.println("Judul Film\t: ".concat( namaFilm));
        System.out.println("Genre Film\t: ".concat(genre));
        System.out.println("Rating Film\t: ".concat(String.valueOf(rating)));
        System.out.println("Duration Film\t: ".concat(String.valueOf(duration)).concat("Menit"));
    }
}