package restaurante;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Item instance = new Item();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class Item.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        Item instance = new Item();
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Item.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Item instance = new Item();
        BigDecimal expResult = null;
        BigDecimal result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Item.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        BigDecimal quantidade = null;
        Item instance = new Item();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorUnitario method, of class Item.
     */
    @Test
    public void testGetValorUnitario() {
        System.out.println("getValorUnitario");
        Item instance = new Item();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValorUnitario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorUnitario method, of class Item.
     */
    @Test
    public void testSetValorUnitario() {
        System.out.println("setValorUnitario");
        BigDecimal valorUnitario = null;
        Item instance = new Item();
        instance.setValorUnitario(valorUnitario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorTotal method, of class Item.
     */
    @Test
    public void testGetValorTotal() {
        System.out.println("getValorTotal");
        Item instance = new Item();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValorTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorTotal method, of class Item.
     */
    @Test
    public void testSetValorTotal() {
        System.out.println("setValorTotal");
        BigDecimal valorTotal = null;
        Item instance = new Item();
        instance.setValorTotal(valorTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalizar method, of class Item.
     */
    @Test
    public void testTotalizar() {
        System.out.println("totalizar");
        Item instance = new Item();
        instance.totalizar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
