package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("informe a quatidade de pacientes");
        int quantidadepacientes = sc.nextInt();
        int idademaisvelho = 0;
        for(int i=1; i<=quantidadepacientes; i++){
            System.out.println("informe a idade" + i);
            int idade = sc.nextInt();
            if(idade > idademaisvelho){
                idademaisvelho = idade;
            }
        }
        System.out.println(" a idade do mais velho e :" + +idademaisvelho);

    }
}
