
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Facturatest {

    @Test 
    public void C1() throws Exception{
        Factura instance = new Factura();
        int resultado = instance.calcularPrezokWh();
        assertEquals(0, resultado);
    }

    @Test
    public void C2() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(-40);
        int resultado = instance.calcularPrezokWh();
        assertEquals(9, resultado);
    }

    @Test
    public void C3() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(450);
        int resultado = instance.calcularPrezokWh();
        assertEquals(8, resultado);
    }

    @Test
    public void C4() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(800);
        int resultado = instance.calcularPrezokWh();
        assertEquals(6, resultado);
    }

    @Test
    public void C5() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(1500);
        int resultado = instance.calcularPrezokWh();
        assertEquals(5, resultado);
    }

    @Test
    public void C6() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(3000);
        int resultado = instance.calcularPrezokWh();
        assertEquals(0, resultado);
    }

    @Test
    public void C7() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(Integer.MIN_VALUE);
        int resultado = instance.calcularPrezokWh();
        assertEquals(9, resultado);
    }

    @Test 
    public void C8() throws Exception{
        Factura instance = new Factura();
        instance.setConsumokWh(Integer.MAX_VALUE);
        int resultado = instance.calcularPrezokWh();
        assertEquals(0, resultado);
    }
}
