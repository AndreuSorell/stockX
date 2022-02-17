package edu.poniperro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.item.Bid;

public class BidTest {
    private Bid bid = null;
    @Before
    public void setupBid() {
        bid = new Bid("13", 550);
        assertNotNull("bid creada", bid);
    }

    @Test
    public void constructorTest() {
        assertNotNull("bid creada", bid);
        assertEquals("Bid [bid=550, size=13]", bid.toString());
        assertEquals("13", bid.size());
        assertEquals(550, bid.value());
    }
}
