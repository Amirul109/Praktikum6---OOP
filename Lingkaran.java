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
public class Lingkaran extends BangunDatar {
    int r;
    
    //Menggunakan Setter
    public Lingkaran(int r){
        this.r = r;
    }
    
    //Menggunakan Getter
    public void gambar(){
        System.out.println("Menggambar Bangun Lingkaran");
    }
    public float luas(){
        return(float) 3.14*this.r*this.r;
    }
}
