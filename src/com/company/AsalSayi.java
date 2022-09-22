package com.company;

public class AsalSayi {
    public static void main(String[] args) {
        int number=0;
        int remainder=number%2;

        if (number==2){
            System.out.println("Sayı asaldır");
            return;
        }
        if (number<2){
            System.out.println("Geçersiz sayı.");
            return;
        }

        boolean isPrime=false;

        if (remainder==1){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }

    }
}
