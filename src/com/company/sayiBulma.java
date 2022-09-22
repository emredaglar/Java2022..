package com.company;

public class sayiBulma {
    public static void main(String[] args) {
        int[] sayilar=new int[]{1,2,4,5,7,9,11};
        int aranacak=5;
        boolean varmi=false;

        for(int i=0;i<sayilar.length;i++){
            if(sayilar[i]==aranacak){
                varmi=true;
            }
        }
        if (varmi){
            System.out.println("Sayı Bulundu");
        }else{
            System.out.println("Sayı bulunamadı");
        }
    }
}
