/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArrayPlg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,jd;
        String[] nm = new String[10];
        String[] kp = new String[10];
        String[] alamat = new String[10];
        String tanya ="";
        
        do{
            System.out.println("Masukkan Jumlah data :");jd = input.nextInt();
            for(i=1;i<=jd;i++){
                System.out.println("Data ke "+ i);
                System.out.println("Kode pelanggan :");kp[i]= input.next();
                System.out.println("Nama Pelanggan :");nm[i]= input.next();
                System.out.println("Alamat Pelanggan :");alamat[i] = input.next();
            }
            
            System.out.println("        Data Pelanggan PT SENTOSA");
            System.out.println("Jln Sagu no.27A Kebagusan Jakarta Selatan");
            System.out.println("========================================================");
            System.out.println("No\tKode Pelanggan\tNama Pelanggan\tAlamat Pelanggan");
              for(i=1;i<=jd;i++){
                System.out.print(i);
                System.out.print("\t" + kp[i]);
                System.out.print("\t\t"+nm[i]);
                System.out.println("\t\t"+alamat[i]);
              }
            System.out.println("========================================================");
            System.out.println("Mau Input data lagi?");tanya = input.next();
        }while(tanya.equalsIgnoreCase("y"));
        
    }
    
}
