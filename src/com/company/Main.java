package com.company;

import java.util.Scanner;

public class Main {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Zadejte počet opakování.");
        int pocetOpakovani = sc.nextInt();
        fibSeq(0, 1, pocetOpakovani);

    }

    static void fibSeq(int a, int b, int rounds) {
        if (rounds == 0) return;
        if (a == 0) System.out.print(a + " " + b);
        int c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
        rounds = rounds - 1;
        fibSeq(a, b, rounds);
    }
}



