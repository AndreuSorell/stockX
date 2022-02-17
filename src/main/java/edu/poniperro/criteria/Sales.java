package edu.poniperro.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.item.Sale;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class Sales implements Criteria {
    
    public Sales() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream()
        .filter(o -> o instanceof Sale).collect(Collectors.toList());
    }
    
}
