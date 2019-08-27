package com.company;

import java.util.Scanner;

public class LetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

	String nome;
    int idade;

        System.out.println("informe seu nome: ");
        nome = sc.nextLine();
        System.out.println("informe sua idade");
        idade = sc.nextInt();
        System.out.println("seu nome e " + nome + " e sua idade é " + idade);
    }
}
