package view;
import controller.Cadastro;
import controller.Trabalhavel;
import model.Desenvolvedor;
import model.Estagiario;
import model.Gerente;

public class Sistema {
    
    public static void executar() {
        int opcao = 0;
    
        do {
    
            mostrarMenu();
            opcao = Console.lerInt();
            verificarOpcao(opcao);
    
        } while (opcao != 0);
    }

    private static void mostrarMenu() {

        System.out.println("\nSISTEMA DE FUNCIONÁRIOS");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Listar todos os gerentes");
        System.out.println("6) Listar todos os Programadores");
        System.out.println("7) Listar todos os Estagiários");
        System.out.println("8) Pesquisar Funcionário");
        System.out.println("9) Remover funcionário");
        System.out.println("0) Sair");
        System.out.print("Digite uma opção: ");

    }

    private static void verificarOpcao(int opcao) {
        String nome;
        int matricula;
        float salarioHora;
        float horasTrab;

        switch (opcao) {
            case 1:
                System.out.println("\nCADASTRO DE GERENTE:");
                System.out.print("\nNome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Valor da Hora Trabalhada: ");
                salarioHora = Console.lerFloat();
                System.out.print("Horas Trabalhadas: ");
                horasTrab = Console.lerFloat();
                System.out.print("Equipe que gerencia: ");
                String equipeGerencia = Console.lerString();
                System.out.print("Bônus Anual: ");
                float bonusAnual = Console.lerFloat();
                
                Gerente gerente = new Gerente(nome, matricula, salarioHora, horasTrab, equipeGerencia, bonusAnual);
                Cadastro.bancoDeFuncionarios.add(gerente);

                System.out.println(gerente.trabalhar());
                break;

            case 2:
                System.out.println("\nCADASTRO DE DESENVOLVEDOR:");
                System.out.print("\nNome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Valor da Hora Trabalhada: ");
                salarioHora = Console.lerFloat();
                System.out.print("Horas Trabalhadas: ");
                horasTrab = Console.lerFloat();
                System.out.print("Tecnologia que Domina: ");
                String tecnologiaExpert = Console.lerString();

                Trabalhavel desenvolvedor = new Desenvolvedor(nome, matricula, salarioHora, horasTrab, tecnologiaExpert);
                Cadastro.bancoDeFuncionarios.add(desenvolvedor);

                System.out.println(desenvolvedor.trabalhar());
                break;

            case 3:
                System.out.println("\nCADASTRO DE ESTAGIÁRIO:");
                System.out.print("\nNome: ");
                nome = Console.lerString();
                System.out.print("Matícula: ");
                matricula = Console.lerInt();
                System.out.print("Valor da Hora Trabalhada: ");
                salarioHora = Console.lerFloat();
                System.out.print("Horas Trabalhadas: ");
                horasTrab = Console.lerFloat();
                System.out.print("Horas de Trabalho: ");
                int horasDeTrabalho = Console.lerInt();
                System.out.print("Supervisor: ");
                int supervisor = Console.lerInt();

                Estagiario estagiario = new Estagiario(nome, matricula, salarioHora, horasTrab, horasDeTrabalho, supervisor);
                Cadastro.bancoDeFuncionarios.add(estagiario);

                System.out.println(estagiario.trabalhar());
                break;

            case 4:
                if (Cadastro.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNenhum funcionário cadastrado!");
                    break;
                }
            
                System.out.println("\nFUNCIONÁRIOS CADASTRADOS:");
                for (Trabalhavel tempFuncionario : Cadastro.getListaFuncionarios()) {
                    System.out.println(tempFuncionario);
                }
                break;

            case 5:
                System.out.println("\nGERENTES CADASTRADOS:");
                for (Trabalhavel tempGerente : Cadastro.getListaFuncionarios()) {  
                    if(tempGerente instanceof Gerente) {
                        System.out.println(tempGerente);
                    }
                }
                break;

            case 6:
                System.out.println("\nDESENVOLVERORES CADASTRADOS:");
                for (Trabalhavel tempDev : Cadastro.getListaFuncionarios()) {  
                    if(tempDev instanceof Desenvolvedor) {
                        System.out.println(tempDev);
                    }
                }
                break;

            case 7:
                System.out.println("\nESTAGIÁRIOS CADASTRADOS:");
                for (Trabalhavel tempEstagiario : Cadastro.getListaFuncionarios()) {  
                    if(tempEstagiario instanceof Estagiario) {
                        System.out.println(tempEstagiario);
                    }
                }
                break;
            
            case 8:
                System.out.println("\nPESQUISAR FUNCIONÁRIO");
                System.out.print("Informe a matícula do funcionário: ");
                matricula = Console.lerInt();
                Cadastro.pesquisar(matricula);
                break;
            
            case 9:
                System.out.println("\nREMOVER FUNCIONÁRIO");
                System.out.print("Informe a matícula do funcionário: ");
                matricula = Console.lerInt();

                if (Cadastro.excluir(matricula)){
                    System.out.println("\nFuncionário foi removido com sucesso!");
                } else {
                    System.out.println("\nFuncionário da " + matricula + " não localizado no cadastro");
                }
                break;
            
            case 0:
                System.out.println("\nFINALIZANDO O SISTEMA...");
                break;

            default:
                System.out.println("\nOPS!!! \nOpção inválida. Digite novamente.");
                break;
        }
        System.out.println("\n");
    }  
}
