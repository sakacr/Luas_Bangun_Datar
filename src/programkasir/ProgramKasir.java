
package programkasir;

import java.util.Scanner;
public class ProgramKasir {

    public static void main(String[] args) {
        program kasir = new program();
        kasir.pertama();        
    }
    
}
 class program{
     public void pertama(){
     
     int jumlah, harga, total, diskonA, diskonB, kembali, anggota, totalA;
     String nama;
     int diskon = 10;
     Scanner masuk = new Scanner(System.in);
     
     do{ 
            System.out.println("\n Selamat Datang");
            System.out.print("Masukan Nama : ");
            nama = masuk.next();
            System.out.print("Jumlah barang : ");
            jumlah = masuk.nextInt();
            System.out.print("Harga barang : Rp. ");
            harga = masuk.nextInt();
            System.out.print("Punya kartu anggota? (y=1, n=2)" );
            anggota = masuk.nextInt();
            total = jumlah * harga;
            
            if (total > 1000000) {
                diskonA = total / diskon;
                if (anggota == 1){
                    diskonB = total / diskon;
                    totalA = total - diskonA - diskonB;
                System.out.println("Total : Rp. " + totalA);
            }else
                totalA = total - diskonA;
            System.out.println("Total : Rp. " + totalA);
            
        }else 
                System.out.println("Total : Rp.  " + total);
                System.out.print(nama + ",   Ingin Melakukan Transaksi Lagi? (y=1, n=2)");
                kembali = masuk.nextInt();
                
        }while (kembali == 1);
        System.out.print("\n Terima Kasih!");
        }
 }