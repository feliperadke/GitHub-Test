package br.pucrs.ep.poo.parquimetro.test;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import br.pucrs.ep.poo.parquimetro.Parquimetro;

public class ParquimetroTest {

    private Parquimetro parq;

    @Before
    public void setUp() {
        parq = new Parquimetro();
        parq.insereMoeda(100);
    }

    @Test
    public void testInsereMoeda() {
        parq.insereMoeda(1);
        parq.insereMoeda(5);
        parq.insereMoeda(10);
        parq.insereMoeda(25);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        assertEquals(291, parq.getSaldo());
    }

    @Test
    public void testGetSaldo() {
        int actual = parq.getSaldo();
        assertEquals(100, actual);
    }

    @Test
    public void testEmiteTicket() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        boolean actual = parq.emiteTicket();
        assertTrue(actual);
        assertEquals(100,parq.getSaldo());
    }

    @Test
    public void testDevolve() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        parq.emiteTicket();
        int actual = parq.devolve();
        assertEquals(100, actual);
    }
}