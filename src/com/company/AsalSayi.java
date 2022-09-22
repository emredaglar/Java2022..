package com.company;

public class AsalSayi {
    public static void main(String[] args) {
        int number=11;

        boolean isPrime=true;

        for(int i=2;i<number;i++){
            if (number%i==0){
                isPrime=false;
                return;
            }
      }

        if (number==2){
            System.out.println("Sayı asaldır");
            return;
        }
        if (number<2){
            System.out.println("Geçersiz sayı.");
            return;
        }

        if (isPrime){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }

    }
}
