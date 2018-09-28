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
public class Carro extends Automovel{
    protected String modelo;
    protected int ano;

    public Carro(String modelo, int ano, String tipoCarro, int qtdPortas, String cor, String marca) {
        super(tipoCarro, qtdPortas, cor, marca);
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    void DadosCarro()
    { System.out.println(this.marca + this.modelo + this.cor);}
}
