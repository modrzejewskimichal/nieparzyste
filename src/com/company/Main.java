package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner wej = new Scanner(System.in);
        int a = wej.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        // write your code here
    }
}