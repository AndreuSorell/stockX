package edu.poniperro.criteria;

import java.util.List;
import java.util.Optional;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class Max implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    
    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(sneaker)
                                    .stream()
                                    .max(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();
    }
    
}
