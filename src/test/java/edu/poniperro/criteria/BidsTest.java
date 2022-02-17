package edu.poniperro.criteria;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.item.Bid;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;
import edu.poniperro.item.Sneaker;

public class BidsTest {
    private Criteria bids = null;
    @Before
    public void setupBids() {
        bids = new Bids();
        assertNotNull("bids creada", bids);
    }

    @Test
    public void checkCriteriaTest() {
        assertNotNull("bid creada", bids);
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        assertEquals(1, bids.checkCriteria(sneaker).size());

        Optional<Offer> maxOpt = Optional.ofNullable(bids.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent()? maxOpt.get().value() : 0);
        assertEquals(550, sneaker.getBid());
    }
}
