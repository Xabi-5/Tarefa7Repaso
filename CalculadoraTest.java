

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    
    //Suma
    @Test
    public void c1() throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.suma(20, 50);
        assertEquals(res, 70);
    }

    @Test
    public void c2() throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.suma(-5245, 243);
        assertEquals(res, -5002);
    }

    @Test
    public void c3() throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.suma(0, 0);
        assertEquals(res, 0);
    }

    //Resta
    @Test
    public void c4()throws Exception {
        Calculadora calc = new Calculadora();
        int res = calc.resta(-40, 60);
        assertEquals(res, -100);
    }

    @Test
    public void c5()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.resta(3, -20);
        assertEquals(res, 23);
    }

    @Test
    public void c6()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.resta(0, 0);
        assertEquals(res, 0);
    }

    @Test
    public void c7()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacion(-1, 1);
        assertEquals(res, -1);
    }

    @Test
    public void c8()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacion(-100, -100);
        assertEquals(res, 10000);
    }

    @Test
    public void c9()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacion(0, Integer.MAX_VALUE);
        assertEquals(res, 0);
    }

    @Test
    public void c10()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.division(0, 100);
        assertEquals(res, 0);
    }

    @Test
    public void c11()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.division(-24, 2);
        assertEquals(res, -12);
    }

    @Test (expected = Exception.class)
    public void c12()throws Exception{
        Calculadora calc = new Calculadora();
        int res = calc.division(900, 0);
    }
}
