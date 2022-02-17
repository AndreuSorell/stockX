package edu.poniperro.criteria;

import java.util.List;
import java.util.Optional;

import edu.poniperro.item.Bid;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class MaxBid implements Criteria {

    public MaxBid() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers().stream()
        .filter(o -> o instanceof Bid).max(Offer::compareTo);
        return max.isPresent()? List.of(max.get()) : List.of();
    }
}
