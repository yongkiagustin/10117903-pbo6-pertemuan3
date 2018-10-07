/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33.yongki.userlogin;
import java.util.Scanner;
import yongki.fungsi.UserLogin;

/**
 *
 * @author yongki
 * Nama : ongki Agustin
 * Kelas : PBO6/IF6K 
 * Nim : 10117903
 * Deskripsi Program : Program menampilkan data diri dengan memanggil fungsi di 
 * class UserLogin
 */
public class Latihan33YongkiUserLogin {

    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        UserLogin cek = new UserLogin();
        cek.pengecekkanLogin(usName, passWord);

    }
    
}
