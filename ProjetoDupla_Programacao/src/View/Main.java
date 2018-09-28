package View;

import Controller.*;
import Model.AluguelDeAutomovel;
import Model.Automovel;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int n =0;
        ArrayList<Pessoa> pessoa = new ArrayList<>();
        ArrayList<Automovel> Automovel = new ArrayList<>();
        ArrayList<AluguelDeAutomovel> Alugueis = new ArrayList<>();
        
        
        GerarAluguel ga = new GerarAluguel();
        
        while(n != 4){
             n = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada"+""
                     + "\n 1 para Cadastrar pessoa"+""
                     + "\n 2 para Cadastrar Automovel"+""
                     + "\n 3 para Cadastrar aluguel"));

        }
        
        switch (n) {
            case 1:
                pessoa.add(ga.CadastrarPessoa());
      
                break;
            case 2:
                ga.CadastrarVrum();
                break;
            case 3:
                String x = "Rafael";
                        for(int i=0; i<pessoa.size();i++){
                            
                            if(pessoa.get(i).getNome()==x){
                                int n = i;
                            }
                        }
                ga.gerarAluguel(pessoa[n], pessoa[n], Automovel[0]);
                break;
            case 4:
                break;
        }

    }
    
}
