package model;
import controller.Trabalhavel;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

    private String tecnologiaExpert;

    public Desenvolvedor (String nome, int matricula, float salarioHora, float horasTrab,
                    String tecnologiaExpert){
        super(nome, matricula, salarioHora, horasTrab);
        this.tecnologiaExpert = tecnologiaExpert;
    }

    public String getTecnologiaExpert() {
        return tecnologiaExpert;
    }
    public void setTecnologiaExpert(String tecnologiaExpert) {
        this.tecnologiaExpert = tecnologiaExpert;
    }

    @Override
    public float calcularSalario(){
        return salarioHora * horasTrab;
    }
    
    @Override
    public String trabalhar() {
        return "\nO dev começou a codar! Quer café?";
    }

    @Override
    public String relatarProguesso() {
        return "Se essa linha de código apareceu aqui, é porque tá rodando...";
    }

    @Override
    public int getMatricula(){
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nTecnologia Expert: " + tecnologiaExpert +
                "\nSalario: " + calcularSalario() +
                "\nProgresso: " + relatarProguesso();
    }
    
}
