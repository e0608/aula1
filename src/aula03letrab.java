import java.util.Scanner;

public class aula03letrab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecasProduzidas, pecasDefeituosas;
        System.out.println("informe a quantidade de peças produzidas");
        pecasProduzidas = sc.nextInt();
        System.out.println("informe a quantidade de peças defeituosas");
        pecasDefeituosas = sc.nextInt();
        if (pecasDefeituosas > (pecasProduzidas * 0.1)) {
        } else {

            System.out.println("maquina não precisa de manutençao ");

        }
    }
}




