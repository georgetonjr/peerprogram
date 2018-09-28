
package Controller;

import Model.*;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class GerarAluguel {
    
    public AluguelDeAutomovel gerarAluguel(Cliente c, Funcionario f, Automovel a){
        
        AluguelDeAutomovel al = null;
        String tipo;
        do{
        tipo = JOptionPane.showInputDialog("Informe o tipo de Aluguel(Diaria ou Mensal)");
        if(tipo == "Diaria"){
                     al = new Diaria();
            JOptionPane.showMessageDialog(null, "Cliente: "+ c.getNome()+" \n "+ "Matricula: " +c.getIDCliente()+"\n"+ "Funcionario que efetuou o aluguel: "+
                    f.getIDFuncionario()+"Automovel Alugado: "+a.getTipoCarro()+ "Valor da Diaria: "+al.getPreco());
            
        }
        
        else if(tipo == "Mensal"){
            al = new Mensal();
            
            JOptionPane.showMessageDialog(null, "Cliente: "+ c.getNome()+" \n "+ "Matricula: " +c.getIDCliente()+"\n"+ "Funcionario que efetuou o aluguel: "+
                    f.getIDFuncionario()+"Automovel Alugado: "+a.getTipoCarro()+ "Valor do aluguel Mensal: "+ al.getPreco());
            
        }
        else if(tipo != "Diaria" || tipo !="Mensal"){
            JOptionPane.showMessageDialog(null, "Por favor, passe uma resposta Valida, de acordou com as Opções");
        }
        }while(tipo != "Diaria" || tipo !="Mensal");
        return null;
    }

    public GerarAluguel() {
    }
    
    
    public Pessoa CadastrarPessoa(){
        Pessoa n1;
        JOptionPane.showMessageDialog(null, "\n1 - Para Funcionário \n2 - Para Pessoa");
        String esco = JOptionPane.showInputDialog("Insira o valor desejado:"); 
        switch (esco){
            case "1":
                n1 = new Cliente(1, "SS", 12, "m", 1.3, 1.2);
                break;
            case "2":
                System.out.println("Insira o nome do aluno");
                break;
            default:
                System.out.println("se fodeu");               
        }
    }
        public void CadastrarVrum(){
        JOptionPane.showMessageDialog(null, "\n1 - Para Vrum que anda na terra \n2 - Para Vrum levas carga");
        int esc;
        Scanner sc = new Scanner(System.in);
        esc = sc.nextInt();
        
        switch (esc){
            case 1:
                System.out.println("Insira o modelo do vrum");
                break;
            case 2:
                System.out.println("Insira o tipo do vrum");
                break;
            default:
                System.out.println("se fodeu");               
        }
    }
}
