package com.company;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number = 6;
        int toplam=0;

        for (int i = 1; i < number; i++) {
            if (number%i==0){
                toplam=toplam+i;
                System.out.println(toplam);
            }
        }
        if (toplam==number){
            System.out.println("Mukemmel sayi " + number);
        }else{
            System.out.println("Mukemmel sayi değil");
        }
    }
}
