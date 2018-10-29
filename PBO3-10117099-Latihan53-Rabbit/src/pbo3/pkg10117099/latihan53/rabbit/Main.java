/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan53.rabbit;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen   
//NIM   :10117099
//KELAS :IF-3
 */
public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("Jojon",false, "grass", 4, "White" );
        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs.");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());

    }
    
}
