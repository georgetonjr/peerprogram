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
public class Mensal extends AluguelDeAutomovel{
    private Pessoa Aluga;

    public Mensal(Pessoa Aluga, String dataDeAlguel, float preco, String dataDeEntrega) {
        super(dataDeAlguel, preco, dataDeEntrega);
        this.Aluga = Aluga;
    }

    public Mensal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public void Mensal(){

    }

    @Override
    public void AluguelDeAutomovel() {

    }

    public Pessoa getAluga() {
        return Aluga;
    }

    public void setAluga(Pessoa Aluga) {
        this.Aluga = Aluga;
    }
    
    String  imprimeAluguelMensal(){
        return this.getDataDeAlguel();
    }
    
    
}
