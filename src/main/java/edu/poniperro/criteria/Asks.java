package edu.poniperro.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.item.Ask;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class Asks implements Criteria {
    
    public Asks() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o instanceof Ask).sorted().collect(Collectors.toList());
    }
    
}
