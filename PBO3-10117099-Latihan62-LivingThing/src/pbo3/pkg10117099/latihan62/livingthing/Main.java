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
public class Main {
    public static void main(String[] args) {
        Human a = new Human();
        a.setNama("I Gusti Glen");
        a.walk(a.getNama());
        a.breath(a.getNama());
        a.eat(a.getNama());
    }
}
