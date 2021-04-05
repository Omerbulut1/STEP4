package STEP4;
import java.util.Scanner;
public class A2_Do_While_Calculator {
    public static void main(String[]args) {


        Scanner input = new Scanner(System.in);
        int sayi1 = 0, sayi2 = 0, sonuc=0, secim;



        do {
            System.out.println("ISLEM SECINIZ\n1.OPLAMA\n2.CIKARMA");
            secim=input.nextInt();
            if (secim!=5){
                System.out.println("1.sayiyi giriniz");
                sayi1=input.nextInt();
                System.out.println("2.sayiyi giriniz");
                sayi2=input.nextInt();
                if(secim==1){
                    sonuc=sayi1+sayi2;
                }
                else if(secim==2){
                    sonuc=sayi1-sayi2;
                }
                System.out.println("sonuc="+ sonuc);
            }

        }while(secim!=5);
        System.out.println("tercihiniz icin tesekkur ederiz");








    }

}
