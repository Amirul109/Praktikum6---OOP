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
public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    //Menggunakan Setter
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    //Menggunakan Abstract
    public void gambar(){
        System.out.println("Menggambar Bangun Segitiga");
    }
    public float luas(){
        return this.alas* this.tinggi;
    }
}
