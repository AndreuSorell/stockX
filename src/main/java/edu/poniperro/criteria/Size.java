package edu.poniperro.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

public class Size implements Criteria {
    private String size = "";
    
    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> infoSize = new ArrayList<>();
        for (Offer offer : sneaker.offers()) {
            if (offer.size() == this.size) {
                infoSize.add(offer);
            }
        }
        return infoSize;
    }
    
}
