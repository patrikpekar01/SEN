package funkcie;

import java.util.Scanner;

public class FukncieStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*    pozdrav();
        int sucet = sucetDvochCisel();
        System.out.println(sucet);
*/

        System.out.println("Zadaj cislo pre vypocet druhej mocniny");
        int DruhaMocninaPremenna = DruhaMocnina(sc.nextInt());
        System.out.println(DruhaMocninaPremenna);
    }

    public static void pozdrav() {
        System.out.println("Ahoj pozdravujem ta");


    }
    public static int sucetDvochCisel(){
        return 200+900;

    }
    public static int DruhaMocnina (int a){
        return a*a;

    }
}
