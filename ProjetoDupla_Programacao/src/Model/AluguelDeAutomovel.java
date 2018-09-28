package Model;
public abstract class AluguelDeAutomovel {
  private  String dataDeAlguel;
  private  float preco;
  private  String dataDeEntrega;

    public AluguelDeAutomovel(String dataDeAlguel, float preco, String dataDeEntrega) {
        this.dataDeAlguel = dataDeAlguel;
        this.preco = preco;
        this.dataDeEntrega = dataDeEntrega;
    }

    public String getDataDeAlguel() {
        return dataDeAlguel;
    }

    public void setDataDeAlguel(String dataDeAlguel) {
        this.dataDeAlguel = dataDeAlguel;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDataDeEntrega() {
        return dataDeEntrega;
    }

    public void setDataDeEntrega(String dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }


    public  abstract void AluguelDeAutomovel();
    
    
}
