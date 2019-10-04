/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan25.ejaannama;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Mengeja nama;
 */
public class PBO11K10118901Latihan25EjaanNama {

    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String nama;
        System.out.print("Masukan nama depan anda untuk di eja : ");
        nama = input.next();
        System.out.println("");
        System.out.println("Ejaan Untuk \""+nama+"\" adalah : ");
        char[] strArr = nama.toCharArray();
        for(int i = 0;i<nama.length();i++) {
            int j = i + 1;
            System.out.println("Huruf ke-"+j+" : "+strArr[i]);
        }
        
    }
    
}
