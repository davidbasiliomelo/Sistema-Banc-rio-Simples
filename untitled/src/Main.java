import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
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
            Scanner sc = new Scanner(System.in);
            escolha = sc.nextInt();
            for (int i = 0; i < 50; i++) {
                System.out.println("                ");
            }
            switch (escolha) {
                case 1:
                    System.out.println("-----Painel do Bancário-----");
                    System.out.print(" Sacar: R$");
                    ver = sc.nextInt();
                    saldo = saldo - ver ;
                    break;
                case 2:
                    System.out.println("-----Painel do Bancário-----");
                    System.out.print("Deposito: R$");
                    ver = sc.nextInt();
                    saldo = ver++;
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