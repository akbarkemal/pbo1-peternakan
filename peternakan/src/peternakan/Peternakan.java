/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peternakan;
import peternak.*;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Peternakan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tanya saya = new tanya();
        Scanner input = new Scanner(System.in);
        
        //input bagian peternak
        System.out.print("Masukkan ID Peternak : ");
        saya.inputIdPeternak(input.nextInt());
        input.nextLine();
        System.out.print("Masukkan Nama Peternak : ");
        saya.inputNamaPeternak(input.nextLine());
        System.out.print("Masukkan Alamat Peternak : ");
        saya.inputAlamat(input.nextLine());
        System.out.print("Masukkan Email Peternak : ");
        saya.inputEmail(input.nextLine());
        System.out.print("Masukkan Password Peternak : ");
        saya.inputPassword(input.nextLine());
        
        //input bagian tanya
        System.out.print("Masukkan id tanya : ");
        saya.inputIdTanya(input.nextInt());
        input.nextLine();
        System.out.print("Masukkan pertanyaan : ");
        saya.inputPertanyaan(input.nextLine());
        System.out.print("Masukkan kategori : ");
        saya.inputKategori(input.nextLine());
        System.out.print("Masukkan waktu : ");
        saya.inputWaktu(input.nextLine());
        System.out.print("Masukkan status : ");
        saya.inputStatus(input.nextLine());
        
        //menampilkan
        System.out.println("==================================");
        System.out.println("ID Peternak : "+saya.ambilIdPeternak());
        System.out.println("Nama Peternak : "+saya.ambilNamaPeternak());
        System.out.println("Alamat Peternak : "+saya.ambilAlamat());
        System.out.println("Email Peternak : "+saya.ambilEmail());
        System.out.println("Password Peternak : "+saya.ambilPassword());
        System.out.println("id tanya : "+saya.ambilIdTanya());
        System.out.println("pertanyaan : "+saya.ambilPertanyaan());
        System.out.println("kategori : "+saya.ambilKategori());
        System.out.println("waktu : "+saya.ambilWaktu());
        System.out.println("status : "+saya.ambilStatus());
        System.out.println("==================================");
    }
    
}
