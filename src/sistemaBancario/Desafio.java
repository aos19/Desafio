package sistemaBancario;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Inicializando o leitor
        Scanner leitura = new Scanner(System.in);

        System.out.println("======= CONTROLE da CONTA BANCÁRIA =======\n ");

        // Variáveis das informações iniciais
        String nomeCliente = "\t\t\tArthur Oliveira Stopa";
        String tipoConta = "\tCorrente";
        double saldoConta = 2500.00;

        // Exibindo dados iniciais do cliente
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: \t\t\tR$ " + saldoConta);

        System.out.println("============================================\n");

        // Variáveis das operações
        int escolhaUsuario = 0;
        double valorRecebe;
        double valorTransfere;

        // String do menu de operações
        String operacoes = """
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada
            
                    """;

        // Loop que repete a permissão de escolha do usuário
        while (escolhaUsuario != 4)
        {
            // Criando string para as opções do usuário e exibindo-a
//            String operacoes = "Operações\n 1 - Consultar saldo\n 2 - Receber valor\n 3 - Transferir valor\n 4 - Sair\n\n Digite a opção desejada";

            // Exibição do menu
            System.out.println(operacoes);

            // Entrada do usuário
            escolhaUsuario = leitura.nextInt();

            // Condiicional para verificar a opção do usuário
            if (escolhaUsuario == 4) {
                System.out.println("Sistema encerrado");
            }
            else if (escolhaUsuario == 1) {
                System.out.println("Saldo atualizado:\n" + "R$ " + saldoConta + "\n");
            }
            else if (escolhaUsuario == 2) {
                System.out.println("Digite o valor a receber:\n");
                valorRecebe = leitura.nextDouble();
                saldoConta += valorRecebe;
                System.out.println("Saldo atualizado:\n" + "R$ " + saldoConta + "\n");
            }
            else if (escolhaUsuario == 3) {
                System.out.println("Digite o valor a ser transferido:\n");
                valorTransfere = leitura.nextDouble();
                if (valorTransfere > saldoConta) {
                    System.out.println("Não há saldo suficiente para esta transferência\n");
                } else {
                    saldoConta -= valorTransfere;
                    System.out.println("Saldo atualizado: \n" + "R$ " + saldoConta + "\n");
                }
            } else {
                System.out.println("Escolha inválida!");
            }
        }
    }
}