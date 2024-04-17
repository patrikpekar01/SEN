package funkcie;

import java.util.Scanner;


public class FunkciePriklady {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj celok:");
        double celok = sc.nextDouble();
        System.out.println("Zadaj ciastku");
        double ciastka = sc.nextDouble();
        double percento = percenta (sc.nextDouble() ,sc.nextDouble());

        System.out.println("Vysledok je" +":"+ percento + "%");
    }
    public static double percenta(double celok, double ciastka){
       return (celok * ciastka)/100;




    }
}
