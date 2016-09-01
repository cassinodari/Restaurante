package restaurante;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Mesa {
    private boolean ocupada;
    private List<Item>itens = new ArrayList<Item>(); //posso usar apenas Item aqui dentro;  
    private BigDecimal valorTotal;
    
    public boolean isOcupada() {
        return ocupada;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    public void ocupar(){
        ocupada = true;        
    }
    
    public void desocupar(){
        ocupada = false;
    }
    
    public void totalizar(){
        valorTotal = new BigDecimal("0.0");
        
        for(Item item:itens){
            item.totalizar();
            valorTotal = valorTotal.add(item.getValorTotal());
        }
        
    }
        public void adicionarItem(Produto produto, BigDecimal quantidade){
            Item novoItem = new Item();
            novoItem.setProduto(produto);
            novoItem.getQuantidade(); 
            itens.add(novoItem);
            
        }
        
    }

