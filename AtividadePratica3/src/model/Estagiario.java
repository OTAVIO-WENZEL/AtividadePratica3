package model;
import controller.*;

public class Estagiario extends Funcionario implements Trabalhavel{

    private int horasDeTrabalho;
    private int supervisor;

    public Estagiario (String nome, int matricula, float salarioHora, float horasTrab,
                    int horasDeTrabalho, int supervisor){
        super(nome, matricula, salarioHora, horasTrab);
        this.horasDeTrabalho = horasDeTrabalho;
        this.supervisor = supervisor;
    }

    public int getHorasDeTrabalho() {
        return horasDeTrabalho;
    }
    public void setHorasDeTrabalho(int horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }
    public int getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(int supervisor) {
        this.supervisor = supervisor;
    }
    
    public static String supervisorDoEstagiario(int supervisor) {
        for (Trabalhavel tempFuncionario : Cadastro.getListaFuncionarios()){
            if (tempFuncionario instanceof Desenvolvedor && ((Funcionario)tempFuncionario).getMatricula() == supervisor) {
                return ((Desenvolvedor)tempFuncionario).getNome();
            }
        }
        return "\nSem supervisor";
    }

    @Override
    public float calcularSalario(){
        return horasTrab * salarioHora;
    }
    
    @Override
    public String trabalhar() {
        return "\n" + nome + " está 'batendo cabeça' com os primeiros bugs...";
    }

    @Override
    public String relatarProguesso() {
        return "Na medida do possível.";
    }

    @Override
    public int getMatricula(){
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHoras de Trabalho: " + horasDeTrabalho +
                "\nSupervisor: " + supervisorDoEstagiario(supervisor) +
                "\nSalário: " + calcularSalario() +
                "\nProgresso: " + relatarProguesso();
    }
}
