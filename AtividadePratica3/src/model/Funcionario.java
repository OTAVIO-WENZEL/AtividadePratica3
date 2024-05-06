package model;
public abstract class Funcionario{

    protected String nome;
    protected int matricula;
    protected float salarioHora;
    protected float horasTrab;
    protected float salario;

    public Funcionario() {
        
    }

    public Funcionario(String nome, int matricula, float salarioHora, float horasTrab) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioHora = salarioHora;
        this.horasTrab = horasTrab;
    }

    public abstract float calcularSalario();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getSalarioHora() {
        return salarioHora;
    }
    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }
    public float getHorasTrab() {
        return horasTrab;
    }
    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
     
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nMatrícula: " + matricula +
                "\nSalário Hora: " + salarioHora +
                "\nHoras Trabalhadas: " + horasTrab;
    }

}