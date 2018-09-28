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
public class Cliente extends Pessoa{
    protected int IDCliente;
    protected float Credito;

    public Cliente(int IDCliente, String nome, int idade, String sexo, float altura, float peso) {
        super(nome, idade, sexo, altura, peso);
        this.IDCliente = IDCliente;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }
    
    void ImprimeCliente (){
        System.out.println(this.IDCliente + this.nome + this.sexo);
    }
    
    float ImprimeCredito(){
        return this.Credito;
    }
    
    
    
}
