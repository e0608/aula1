package com.company;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class aula03letraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quantidade de copias");
        int copias = sc.nextInt();
        copias = sc.nextInt();
        double totalpago;
        if (copias <= 100) {
            totalpago = copias * 0.25;
        } else {
            totalpago = copias * 0.25;

        }
        System.out.println("o valor pago é r$ " + totalpago);
    }

}