package edu.poniperro.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;
import edu.poniperro.item.Sale;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> lastSale = new ArrayList<>();
        Sales sales = new Sales();
        lastSale.add(sales.checkCriteria(sneaker).get(sales.checkCriteria(sneaker).size()-1));
        return lastSale;
    }
    
}
