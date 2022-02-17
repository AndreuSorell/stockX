package edu.poniperro;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.item.Bid;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;
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
        assertEquals("Sneaker: Jordan 1 Retro High Dark Mocha\n\tModelo: 555088-105", sneaker.toString());
        assertEquals(0, sneaker.getBid());
        assertEquals(0, sneaker.getAsk());
        assertEquals(0, sneaker.getSale());
    }

    @Test
    public void addOfferBidTest() {
        Bid bid = new Bid("13", 550);
        assertNotNull("bid creada", bid);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
        List<Offer> offers = new ArrayList<Offer>();
        offers.add(bid);
        assertEquals(offers, sneaker.offers());
    }
}
