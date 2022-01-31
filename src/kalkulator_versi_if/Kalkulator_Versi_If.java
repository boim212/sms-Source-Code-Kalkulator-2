/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_versi_if;
import java.util.*;
/**
 *
 * @author Personal
 */
public class Kalkulator_Versi_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double  total1, bilangan1, bilangan2;
        char pilihan1,select;
        System.out.println("--------------By Yudha 205314020-v   -------------");
        System.out.println("--------------PROGRAM KALKULATOR--------------");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.print  ("Silahkan Masukkan Bilangan 1 = ");
        bilangan1 = input.nextInt();
        System.out.print  ("Silahkan Masukkan Bilangan 2 = ");
        bilangan2 = input.nextInt();
        System.out.println("");
        System.out.println("Operasi Yang Ada");
        System.out.println("Tambah (+) -------->   A atau a");
        System.out.println("Kurang (-) -------->   B atau b");
        System.out.println("Kali   (*) -------->   C atau c");
        System.out.println("Bagi   (/) -------->   D atau d");
        System.out.print  ("Pilih Operasi Matematika Yang Anda Mau = ");
        pilihan1 = input.next().charAt(0);
            if(pilihan1 =='A' || pilihan1 == 'A'){
                total1 = bilangan1 + bilangan2;
                System.out.println("Hasilnya Adalah = " + total1);
            }
            else if(pilihan1 =='B' || pilihan1 == 'b'){
                total1 = bilangan1 - bilangan2;
                System.out.println("Hasilnya Adalah = " + total1);
            }
            else if(pilihan1 =='C' || pilihan1 == 'C'){
                total1 = bilangan1 * bilangan2;
                System.out.println("Hasilnya Adalah = " + total1);
            }
            else if(pilihan1 =='D' || pilihan1 == 'd'){
                total1 = bilangan1 / bilangan2;
                System.out.println("Hasilnya Adalah = " + total1);
            }
            else{
                System.out.println("Maaf Input Anda Tidak Dapat Saya Proses");
            }
            System.out.println("Program Beherti");
            System.out.println("--------------By Yudha 205314020--------------");
            System.out.println("----------------------------------------------");
    }
}
