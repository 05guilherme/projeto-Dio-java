import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = s.nextLine();

        System.out.println("Por favor, digite o seu número!");
        int numero = s.nextInt();
        s.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nome = s.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = s.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");


    }
}
