package edu.poniperro.criteria;

import java.util.List;
import java.util.Optional;

import edu.poniperro.item.Ask;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class MinAsk implements Criteria {

    public MinAsk() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> min = sneaker.offers().stream()
        .filter(o -> o instanceof Ask).min(Offer::compareTo);
        return min.isPresent()? List.of(min.get()) : List.of();
    }
}
