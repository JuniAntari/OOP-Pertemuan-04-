/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;
/**
 *
 * @author LAB F
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayDim AD = new ArrayDim();
        Scanner dIN = new Scanner(System.in);
        String bubar = "TIDAK";
        
        do{
            System.out.println("Aplikasi Buku Teman V1.0");
            System.out.println("~~~~~~~~");
            System.out.println("A. Isi Data");
            System.out.println("B. Tampil Data");
            System.out.println("C. Ubah Data");
            System.out.println("D. Hapus Data");
            System.out.println("S. Selesai");
            System.out.println("Pilih Menu : ");
            String ch = dIN.nextLine();

            switch (ch) {
                case "A":
                    AD.Storedata();
                    break;
                case "B":
                    AD.Viewdata();
                    break;
                case "C":
                    AD.editdata();
                    break;
                case "D":
                    AD.destroydata();
                    break;
                case "S":
                    bubar = "YA";
                    break;
                default:
                    System.out.println("Menu pilihan tidak definisikan");
                    break;
            }
        }while(bubar.equals("TIDAK"));
    }
    
}