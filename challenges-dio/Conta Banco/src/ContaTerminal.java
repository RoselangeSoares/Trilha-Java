import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String saldo = "R$ " + 237 + "," + 48;

        System.out.println("Olá, seja bem-vindo, pressione ENTER para abertura de conta ");
        String ENTER = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome! (depois ENTER para prosseguir) ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome! (depois ENTER para prosseguir) ");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da Agência! (depois ENTER para prosseguir) ");
        String agencia = scanner.next();

        System.out.println("E por fim digite o número da conta! (depois ENTER para FINALIZAR) ");
        int num = scanner.nextInt();

        System.out.println(
                "Olá, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                        + agencia + ", conta: " + num + " e seu saldo " + saldo + " já esta disponível para saque. ");
    }
}