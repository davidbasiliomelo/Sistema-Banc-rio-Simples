import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int log = 0;
        String entradaUsuario, entradaSenha;
        String name;
        String senha;
        Scanner scan = new Scanner(System.in);


        System.out.println("-----Painel de Login-----");
        System.out.println("     Registrar conta     ");
        System.out.print("Usuário: ");
        name = scan.nextLine();
        System.out.print("Senha: ");
        senha = scan.nextLine();
        System.out.println("Registro Feito com sucesso!");
        System.out.println("Iniciando Login...");
        for (int i = 0; i <= 10; i++) {
            System.out.print("■");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("                ");
        }

        do {
            System.out.println(" ");
            System.out.println("-----Painel de Login-----");
            System.out.print("| Digite seu usuário: ");
            entradaUsuario = scan.nextLine();
            System.out.print("| Digite sua Senha: ");
            entradaSenha = scan.nextLine();
            if (entradaUsuario.equals(name) && entradaSenha.equals(senha)) {
                System.out.println("Usuario e senha corretos!");
                System.out.println("Seja Bem Vindo!");
                log = 1;
            } else {
                System.out.println("Usuário ou Senha Incorreto");
                System.out.println("Sistema Fechando...");
                log = 0;
            }


        } while (log != 1);


        int escolha;
        double saldo = 0, ver;
        do {
            System.out.println("-----Painel do Bancário-----");
            System.out.println("|   [1] Sacar              |");
            System.out.println("|   [2] Depositar          |");
            System.out.println("|   [3] Saldo              |");
            System.out.println("|   [4] Sair               |");
            System.out.println("----------------------------");
            System.out.print("Escolha: ");
            escolha = scan.nextInt();
            for (int i = 0; i < 50; i++) {
                System.out.println("                ");
            }
            switch (escolha) {
                case 1:
                    System.out.println("-----Painel do Bancário-----");
                    System.out.print(" Sacar: R$");
                    ver = scan.nextDouble();
                    if (saldo < ver){
                        System.out.println("Você não tem dinheiro suficiente.");
                    } else {
                        saldo = saldo - ver ;
                    }
                    break;
                case 2:
                    System.out.println("-----Painel do Bancário-----");
                    System.out.print("Deposito: R$");
                    ver = scan.nextDouble();
                    saldo += ver;
                    break;
                case 3:
                    System.out.println("-----Painel do Bancário-----");
                    System.out.println("Seu Saldo: "+saldo);
                    break;
                case 4:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (escolha != 4);
    }
}