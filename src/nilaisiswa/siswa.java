/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;



/**
 *
 * @author ASUS VIVOBOOK 14
 */
public class siswa {
    Scanner input = new Scanner(System.in);
    String Nama, Mapel, Kelas;
    
    void keterangan(){
        System.out.println("==== Keterangan Kelulusan ====");
        System.out.println();
        System.out.print("Nama : ");
        Nama = input.nextLine();
        System.out.print("Kelas / No Absen : ");
        Kelas = input.nextLine();
        System.out.print("Mata Pelajaran : ");
        Mapel = input.nextLine();
    }
    
    void cetakNilai(){
        System.out.print("Nilai : ");
        int Nilai = input.nextInt();
        
        if (Nilai >= 80){
            System.out.println("Selamat anda lulus");
        }
        else{
            System.out.println("Maaf anda harus belajar lebih giat lagi");
        }
    }
    
    
   }  
   

