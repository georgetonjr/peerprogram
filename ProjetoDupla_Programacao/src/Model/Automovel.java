package Model;
public class Automovel {
  
    String tipoCarro;
    int qtdPortas;
    String cor;
    String marca;

    public Automovel(String tipoCarro, int qtdPortas, String cor, String marca) {
        this.tipoCarro = tipoCarro;
        this.qtdPortas = qtdPortas;
        this.cor = cor;
        this.marca = marca;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
