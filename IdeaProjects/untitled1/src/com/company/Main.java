package com.company;

import java.util.Scanner;

 class Main {

     public static void main(String[] arg) {
         Scanner sc = new Scanner(System.in);
         System.out.println("informe a quantidade de notas");
         int avaliações = sc.nextInt();
         double media = 0;
         for (int i = 1; i <= avaliações; i++) {
             System.out.println("informe a nota" + i);
             double nota = sc.nextDouble();
             media=media+nota;

         }
         media = media / avaliações;
         System.out.println("media:" + media);
     }
 }


