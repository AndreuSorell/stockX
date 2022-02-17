package edu.poniperro.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class LastSale implements Criteria {

    public LastSale() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> lastSale = new ArrayList<>();
        Criteria sales = new Sales();
        lastSale.add(sales.checkCriteria(sneaker).get(sales.checkCriteria(sneaker).size()-1));
        return lastSale;
    }
    
}
