/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {
    protected double Salario;
    protected int IDFuncionario;

    public Funcionario(double Salario, int IDFuncionario, String nome, int idade, String sexo, float altura, float peso) {
        super(nome, idade, sexo, altura, peso);
        this.Salario = Salario;
        this.IDFuncionario = IDFuncionario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getIDFuncionario() {
        return IDFuncionario;
    }

    public void setIDFuncionario(int IDFuncionario) {
        this.IDFuncionario = IDFuncionario;
    }
    
    public void DadosFuncionario(){
        System.out.println(this.nome + this.IDFuncionario + this.Salario);
    }
    
}

//Classe Funcionario, estava com acento no "A".