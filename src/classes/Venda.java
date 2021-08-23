package classes;
import util.UtilData;
import java.util.Date;

public class Venda {
    
    private Date data;
    public String produtoVendido;
    public int quantidadeVendida;
    public double valorProdutoVendido;

    public Venda() {
        this.data = data;
        this.produtoVendido = produtoVendido;
        this.quantidadeVendida = quantidadeVendida;
        this.valorProdutoVendido = valorProdutoVendido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date string) {
        this.data = string;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getValorProdutoVendido() {
        return valorProdutoVendido;
    }

    public void setValorProdutoVendido(double valorProdutoVendido) {
        this.valorProdutoVendido = valorProdutoVendido;
    }

    @Override
    public String toString(){
        String dataEHora = UtilData.converterDateParaDataEHora(this.data);
        return String.format("%s - (%s) - %s", dataEHora, this.produtoVendido, this.quantidadeVendida);
    }
}
