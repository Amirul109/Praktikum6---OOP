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
public abstract class BangunDatar {
 String warna;
 
 //Menggunakan Settter
 public void setWarna(String warna){
     this.warna = warna;
 }
    
 //Menggunakan Getter
 public String getWarna(){
     return this.warna;
 }
 
 //Menggunakan Abstract
 public abstract void gambar();
 public abstract float luas();
}
