package edu.poniperro.item;

import java.util.List;

public interface Item {
    public int getBid();
    public int getAsk();
    public int getSale();
    public void add(Offer offer);
    public List<Offer> offers();
    public void setBid(int price);
    public void setAsk(int price);
    public void setSale(int price);
}
