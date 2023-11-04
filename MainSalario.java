import java.util.ArrayList;
import java.util.Scanner;

public class MainSalario {
   
    public static void main(String[] args) {
        String opcao;
        ArrayList<Funcionario> lsfuncionarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu\n");
        System.out.println("1 - Criar funcionário");
        System.out.println("2 - Mostrar");
        System.out.println("3 - Sair");

        opcao = entrada.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Número do crachá");
                int numerocracha = entrada.nextInt();
                entrada.nextLine(); // Limpa a nova linha pendente

                System.out.println("Nome do funcionário");
                String nomefuncionario = entrada.nextLine();

                System.out.println("Setor do funcionário");
                String setorfuncionario = entrada.nextLine();

                System.out.println("Função do funcionário");
                String funcaofuncionario = entrada.nextLine();

                System.out.println("Funcionário horista [H] Funcionário Mensalista [M]");
                String horaoumensal = entrada.nextLine();

                if ("H".equalsIgnoreCase(horaoumensal)) {
                    System.out.println("Horas trabalhadas?");
                    int horastrabalhada = entrada.nextInt();
                    System.out.println("Valor das Horas?");
                    double valorhora = entrada.nextDouble();
                    FuncionarioHorista funhora = new FuncionarioHorista(horastrabalhada, valorhora, numerocracha, nomefuncionario, setorfuncionario, funcaofuncionario);
                    lsfuncionarios.add(funhora);
                } else {
                    System.out.println("Salário mensal?");
                    double salariomensal = entrada.nextDouble();
                    System.out.println("Descontos?");
                    double desconto = entrada.nextDouble();
                    FuncionarioMensalista funmensal = new FuncionarioMensalista(salariomensal, desconto, numerocracha, nomefuncionario, setorfuncionario, funcaofuncionario);
                    lsfuncionarios.add(funmensal);
                }
                break;
            case "2":
                if (lsfuncionarios.isEmpty()) {
                    System.out.println("Não há funcionários cadastrados.");
                } else {
                    for (Funcionario funcionario : lsfuncionarios) {
                        System.out.println(funcionario);
                        System.out.println("Salário: " + funcionario.calcularSalario());
                        System.out.println();
                    }
                }
                break;
            case "3":
                System.out.println("Saindo do programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
        }
    }
}
