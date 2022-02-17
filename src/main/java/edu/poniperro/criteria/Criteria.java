package edu.poniperro.criteria;

import java.util.List;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public interface Criteria {
    public List<Offer> checkCriteria(Item sneaker);
}
