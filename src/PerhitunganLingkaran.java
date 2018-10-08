/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama             : Alvin Lukman Nulhakim
 * Nim              : 10117095
 * Kelas            : IF-3
 * Deskripsi        : Menghitung Lingkaran
 */
public class PerhitunganLingkaran {

    
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
