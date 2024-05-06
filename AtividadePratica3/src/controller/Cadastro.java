package controller;
import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class Cadastro{

    public static ArrayList<Trabalhavel> bancoDeFuncionarios = new ArrayList<>();

    public static void cadastrar(Trabalhavel funcionario){
        bancoDeFuncionarios.add(funcionario);
    }

    public static boolean excluir(int matricula) {
        for (Trabalhavel tempFuncionario : bancoDeFuncionarios){
            if (tempFuncionario instanceof Funcionario && ((Funcionario)tempFuncionario).getMatricula() == matricula) {
                bancoDeFuncionarios.remove(tempFuncionario);
                return true;
            }
        }
        return false;
    }

    public static void pesquisar(int matricula) {
        boolean encontrado = false;
        for (Trabalhavel tempFuncionario : bancoDeFuncionarios){
            if (tempFuncionario instanceof Funcionario && ((Funcionario)tempFuncionario).getMatricula() == matricula) {
                System.out.println(tempFuncionario);
                encontrado = true;
                break;
            }
        }
        if(encontrado == false){System.out.println("\nFuncionário da " + matricula + " não localizado no cadastro");}
    }

    public static List<Trabalhavel> getListaFuncionarios(){
        return bancoDeFuncionarios;
    }
}
