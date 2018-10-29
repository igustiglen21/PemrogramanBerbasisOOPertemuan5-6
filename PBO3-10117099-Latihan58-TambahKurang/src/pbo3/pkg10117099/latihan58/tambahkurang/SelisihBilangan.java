/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan58.tambahkurang;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen   
//NIM   :10117099
//KELAS :IF-3
 */
public class SelisihBilangan extends Bilangan {
    public void tampilHasilSelisih() {
        int z = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + z);
    }
}
