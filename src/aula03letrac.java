import java.util.Scanner;

public class aula03letrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a idade:");
        int idade = sc.nextInt();
        if (idade<=10) {
            System.out.println("infantil");
        }else if (idade>10 && idade <=17) {
            System.out.println("juvenil");
        }else{
            System.out.println("senior");
        }
    }
}

