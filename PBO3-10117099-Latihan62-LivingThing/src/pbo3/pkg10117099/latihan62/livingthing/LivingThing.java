/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan62.livingthing;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen   
//NIM   :10117099
//KELAS :IF-3
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " makan");
    }
}
