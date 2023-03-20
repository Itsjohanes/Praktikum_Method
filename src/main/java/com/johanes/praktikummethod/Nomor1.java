/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.praktikummethod;
import java.util.*;
/**
 *
 * @author Johannes Alexander Putra,CSCU.
 */


public class Nomor1 {
 public static int subDigit(int angka){

     String abc = Integer.toString(angka);
     char pertama = abc.charAt(0);
     int hasil = Character.getNumericValue(pertama);
     int banyakHuruf = abc.length();
     for(int i =1;i<banyakHuruf;i++){
        char lainnya = abc.charAt(i);
        int angkalain = Character.getNumericValue(lainnya);
        hasil = hasil - angkalain;
            
     }
     return hasil;
    

}
public static int addDigit(int angka){
 String abc = Integer.toString(angka);
     char pertama = abc.charAt(0);
     int hasil = Character.getNumericValue(pertama);
     int banyakHuruf = abc.length();
     for(int i =1;i<banyakHuruf;i++){
        char lainnya = abc.charAt(i);
        int angkalain = Character.getNumericValue(lainnya);
        hasil = hasil + angkalain;
         
         
     }
     return hasil;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hasil;
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        if(angka2 == -1){
            
            hasil = subDigit(angka1);
            System.out.println(hasil);
            
        }else if(angka2 == 1){
           hasil =  addDigit(angka1);
           System.out.println(hasil);

        }   
    }
}
