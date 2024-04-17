package HodKockou;

import java.util.Random;

public class Príklad {
    public static void main(String[] args) {
        Random rd = new Random();

        int jedna = 1;
        int dva = 2;
        int tri = 3;
        int styri = 4;
        int pat = 5;
        int sest = 6;
        for (int i = 0; i<1000;i++) {
            int randomcislo = rd.nextInt(7);
            switch (randomcislo) {
                case 1:
                    jedna++;
                    break;
                case 2:
                    dva++;
                    break;
                case 3:
                    tri++;
                    break;
                case 4:
                    styri++;
                    break;
                case 5:
                    pat++;
                    break;
                case 6:
                    sest++;
                    break;
                default:
                    break;

            }
        }
                    System.out.println("vypočet 1:" + jedna + ((double) 100 * jedna)/1000 + "%");
        System.out.println("vypočet 2:" + dva + ((double) 100 * dva)/1000 + "%");
        System.out.println("vypočet 3:" + tri + ((double) 100 * tri)/1000 + "%");
        System.out.println("vypočet 4:" + styri + ((double) 100 * styri)/1000 + "%");
        System.out.println("vypočet 5:" + pat + ((double) 100 * pat)/1000 + "%");
        System.out.println("vypočet 6:" + sest + ((double) 100 * sest)/1000 + "%");

            }

        }


