package model;
import controller.Trabalhavel;

public class Gerente extends Funcionario implements Trabalhavel{

    private String equipeGerencia;
    private float bonusAnual;
    private double inicioPojeto;

    public Gerente (String nome, int matricula, float salarioHora, float horasTrab,
                    String equipeGerencia, float bonusAnual){
        super(nome, matricula, salarioHora, horasTrab);
        this.equipeGerencia = equipeGerencia;
        this.bonusAnual = bonusAnual;
        this.inicioPojeto = 0.00;
    }
    

    public float getBonusAnual() {
        return bonusAnual;
    }
    public void setBonusAnual(int bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    public String getEquipeGerencia() {
        return equipeGerencia;
    }
    public void setEquipeGerencia(String equipeGerencia) {
        this.equipeGerencia = equipeGerencia;
    }
    public double getInicioPojeto() {
        return inicioPojeto;
    }
    public void setInicioPojeto(double inicioPojeto) {
        this.inicioPojeto = inicioPojeto;
    }

    public double calcularProgresso() {
        inicioPojeto += 5.0;
        inicioPojeto *= 1.33;
        if(inicioPojeto > 100.00){inicioPojeto = 100.00;}
        return inicioPojeto;
    }

    @Override
    public float calcularSalario(){
        return horasTrab * salarioHora + bonusAnual;
    }

    @Override
    public String trabalhar() {
        return "\nO Gerente definiu as metas de seu projeto.";
    }

    @Override
    public String relatarProguesso() {
        return "O Projeto está em: " + String.format("%.2f", calcularProgresso()) + "%";
    }

    @Override
    public int getMatricula(){
        return matricula;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                "\nEquipe Gerenciada: " + equipeGerencia +
                "\nBônus Anual: " + bonusAnual +
                "\nSalario: " + calcularSalario() +
                "\nProgresso: " + relatarProguesso();
    }
}
