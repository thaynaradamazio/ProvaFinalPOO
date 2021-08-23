package classes;
import java.util.InputMismatchException;
public class Produto {
    private String letrasCodigo;
    private int numerosCodigo;
    private String nomeDoProduto;
    private int valorDoProduto;
    private int QuantidadeEmEstoque;


public Produto(String Codigo, String nomeDoProduto) {
    setCodigo(Codigo);
    this.nomeDoProduto = nomeDoProduto;
}

public Produto() {
}

//#region Getters / Setters
public String getCodigo() {
    if(letrasCodigo == null) {
        return letrasCodigo;
    } else {
        return letrasCodigo + numerosCodigo;
    }
}

public void setCodigo(String codigo) {
    if(codigo != null && codigo.matches("[A-Z]{3}\\d{4}")) {
        letrasCodigo = codigo.substring(0, 3);
        numerosCodigo = Integer.parseInt(codigo.substring(3));
    } else {
        throw new InputMismatchException("O código precisa ter 3 letras e 4 números, as letras devem ser maiúsculas");
    } 
}

public String getNomeDoProduto() {
    return nomeDoProduto;
}

public void setNomeDoProduto(String nomeDoProduto) {
    this.nomeDoProduto = nomeDoProduto;
}

public int getValorDoProduto() {
    return valorDoProduto;
}

public void setValorDoProduto(int valorDoProduto) {
    this.valorDoProduto = valorDoProduto;
}

public int getQuantidadeEmEstoque() {
    return QuantidadeEmEstoque;
}

public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
    QuantidadeEmEstoque = quantidadeEmEstoque;
}
//#endregion
}

