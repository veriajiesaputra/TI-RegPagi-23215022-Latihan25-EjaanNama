/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Latihan_25_EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input nama
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = input.nextLine();
        
        // Menampilkan header ejaan
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah : ");
        
        // Mengeja setiap huruf
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + nama.charAt(i));
        }
        
        input.close();
    }
}
