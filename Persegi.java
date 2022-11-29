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
public class Persegi extends BangunDatar {
    float panjang;
    float lebar;
    
    //Menggunakan Setter
    public Persegi(int panjang,int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //Menggunakan Abstract
    public void gambar(){
        System.out.println("Menggambar Bangun Persegi");
    }
    public float luas(){
        return this.panjang* this.lebar;
    }
}
