package com.company;

import java.util.Scanner;

public class bucles {

    public void demanarNum() {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("introduce un numero: ");
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    public void negativo() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Intorduce un numero: ");
        num = sc.nextInt();


        while (num != 0) {

            if (num > 0) {
                System.out.println("el numero es positivo : " + num);
                break;

            } else {
                System.out.println("el numero es negativo: " + num);
                break;
            }
        }

        System.out.println("se acabó");
    }

    public void cero() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("introduce un numero:  ");
            num = sc.nextInt();
            if (num != 0) {
                if (num > 0) {
                    System.out.println("el numero es positivo : " + num);
                } else {
                    System.out.println("el numero es negativo: " + num);
                }
            }
        } while (num != 0);


    }
    public void mult2(){




    }


}









