/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author Amir
 */
public class Utama {
    public static void main(String[] args){
        BangunDatar bulat = new Lingkaran(12);
        BangunDatar nasi_tumpeng = new Segitiga(7,16);
        BangunDatar meja = new Persegi(12,4);
        
        //Memanggil Method gambar
        bulat.gambar();
        nasi_tumpeng.gambar();
        meja.gambar();
        
        //Menampilkan Luas Bangun
        System.out.println("\nLuas Bangun Lingkaran: "+ bulat.luas());
        System.out.println("\nLuas Bangun Segitiga: "+ nasi_tumpeng.luas());
        System.out.println("\nLuas Bangun Persegi: "+ meja.luas());
    }
    
}
