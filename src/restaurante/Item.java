package restaurante;

import java.math.BigDecimal;

/**
 *
 * @author aluno
 */
public class Item {
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void totalizar(){
        valorTotal = quantidade.multiply(valorUnitario).setScale(2); ///não posso usar apenas *, pois estou usando BigDecimal
    
    }
}
