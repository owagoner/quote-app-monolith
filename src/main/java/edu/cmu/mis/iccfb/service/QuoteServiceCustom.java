package edu.cmu.mis.iccfb.service;

import java.util.ArrayList;

import edu.cmu.mis.iccfb.model.Quote;

public interface QuoteServiceCustom {
    public Quote randomQuote();
    public ArrayList<Quote> authorQuotes(long id);
}
