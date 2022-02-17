package edu.poniperro.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.item.Bid;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class Bids implements Criteria {
    
    public Bids() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o instanceof Bid).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    
}
