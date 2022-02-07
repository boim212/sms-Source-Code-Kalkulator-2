/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator_versi_Switch;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Kalkulator_versi_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
  
        double inputDouble, bilangan1, bilangan2,total1;
        char pilih;
        
        System.out.println("");
        System.out.println("--------------By Skuy--------------");
        System.out.println("--------------PROGRAM KALKULATOR--------------");
        System.out.println("----------------------------------------------");
        System.out.println("");
        System.out.print  ("Silahkan Masukkan Bilangan 1 = ");
        bilangan1 = input.nextDouble();
        System.out.print  ("Silahkan Masukkan Bilangan 2 = ");
        bilangan2 = input.nextDouble();
        System.out.println("");
        System.out.println("Operasi Yang Ada");
        System.out.println("Tambah (+) -------->   A atau a");
        System.out.println("Kurang (-) -------->   B atau b");
        System.out.println("Kali   (*) -------->   C atau c");
        System.out.println("Bagi   (/) -------->   D atau d");
        System.out.print  ("Pilih Operasi Matematika Yang Anda Mau = ");
            pilih = input.next().charAt(0);
                switch(pilih){
                    case ('A'):
                        total1 = bilangan1 + bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('a'):
                        total1 = bilangan1 + bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('B'):
                        total1 = bilangan1 - bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('b'):
                        total1 = bilangan1 - bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('C'):
                        total1 = bilangan1 * bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('c'):
                        total1 = bilangan1 * bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('D'):
                        total1 = bilangan1 / bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                    case ('d'):
                        total1 = bilangan1 / bilangan2;
                        System.out.println("Hasilnya Adalah = " + total1);
                    break;
                }
                        System.out.println("");
                        System.out.println("--------------By Skuy--------------");
                        System.out.println("--------------PROGRAM KALKULATOR--------------");
                        System.out.println("----------------------------------------------");
            }
}
