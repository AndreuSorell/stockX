package edu.poniperro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.item.Item;
import edu.poniperro.item.Sneaker;

public class SneakerTest {
    private Item sneaker = null;
    @Before
    public void setupSneaker() {
        sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("Sneaker creada", sneaker);
    }

    @Test
    public void constructorTest() {
        assertNotNull("Sneaker creada", sneaker);
        assertEquals("Sneaker: Jordan 1 Retro High Dark Mocha Modelo: 555088-105", sneaker.toString());
        assertEquals(0, sneaker.getBid());
        assertEquals(0, sneaker.getAsk());
        assertEquals(0, sneaker.getSale());
    }
}
