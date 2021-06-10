package latihanarray;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Latihan {
    public static void main(String[] args) throws IOException {
//        deklarasi
        String nama,tanggal;
        int jml,total = 0;
        String [] kode_barang,nama_barang;
        int[] harga_barang,jumlah,total_harga;
        kode_barang = new String[10];
        nama_barang = new String[10];
        harga_barang = new int[10];
        jumlah = new int [10];
        total_harga = new int[10];
        InputStreamReader KeyReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(KeyReader);
        
//        Tampilan input
System.out.println("            PT PERMATA 'PRATAMA'");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.readLine();
        System.out.print("Tanggal : ");
        tanggal = input.readLine();
        System.out.print("Jumlah data yang akan dimasukkan : ");
        jml = Integer.parseInt(input.readLine());
        System.out.println("-----------------------------------------");
        
//        bikin perulangan
for (int i = 1;i <= jml;i++){
    System.out.println("Data ke "+ i);
    System.out.print("Kode Barang :");kode_barang[i]= input.readLine();
    System.out.print("Jumlah :");jumlah[i]= Integer.parseInt(input.readLine());
    switch(kode_barang[i]){
        case "P001" :
            nama_barang[i] = "Printer";
            harga_barang[i]= 700000;
            break;
        case "V001":
            nama_barang[i] = "VGA Card";
            harga_barang[i] = 75000;
            break;
        case "M001":
            nama_barang[i] = "Motherboard";
            harga_barang[i] = 950000;
            break;
        default:
            nama_barang[i] ="";
            harga_barang[i] = 0;
            jumlah[i]=0;
            break;
}  
    //        rumus total harga
total_harga[i] = harga_barang[i]* jumlah[i];
total = total + total_harga[i];
}
    //Output
System.out.println("                        PT PERMATA 'PRATAMA'");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas :" + nama);
        System.out.println("                                        Tanggal :" + tanggal);
        System.out.println("Jumlah data yang dimasukkan :" + jml);
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.print("Data ke");
        System.out.print("      Kode Barang");
        System.out.print("      Nama Barang");
        System.out.print("      Harga Barang");
        System.out.print("      Jumlah Barang");
        System.out.println("    Total Harga");
        

//       perulangan output
for(int i =1;i<=jml;i++){
System.out.print("  "+ i);
System.out.print("              "+ kode_barang[i]);
System.out.print("          "+ nama_barang[i]);
System.out.print("          "+ harga_barang[i]);
System.out.print("              " + jumlah[i]);
System.out.println("            " + total_harga[i]);
   
}
 System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Total Pendapatan pada tanggal "+tanggal + " sebesar Rp."+ total);
    }
}
    

    
    
  
