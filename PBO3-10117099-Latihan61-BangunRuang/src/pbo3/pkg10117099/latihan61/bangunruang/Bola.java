/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan61.bangunruang;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen   
//NIM   :10117099
//KELAS :IF-3
 */
public class Bola extends BangunRuang {
    private double r;
    private double volume;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double hitungVolume() {
        this.volume = (4/3) * 3.14 * (r * r * r);
        return this.volume;
    }
}
