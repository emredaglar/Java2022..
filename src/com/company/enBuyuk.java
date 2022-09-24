package com.company;

public class enBuyuk {
    public static void main(String[] args) {
        int sayi11 = 20;
        int sayi2 = 25;
        int sayi3 = 5;
        int enBuyuk = sayi11;
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println(enBuyuk);
    }
}
