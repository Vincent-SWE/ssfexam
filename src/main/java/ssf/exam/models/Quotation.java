// Add your package here
package ssf.exam.models;

// DO NOT MODIFY THIS FILE

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

public class Quotation {

    private String quoteId;
    private Map<String, Float> quotations = new HashMap<>();

    public String getQuoteId() {
        return quoteId;
    }
    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public Map<String, Float> getQuotations() {
        return quotations;
    }
    public void setQuotations(Map<String, Float> quotations) {
        this.quotations = quotations;
    }
    public void addQuotation(String item, Float unitPrice) {
        this.quotations.put(item, unitPrice);
    }
    public Float getQuotation(String item) {
        return this.quotations.getOrDefault((Object)item, -1000000f);
    }

    public static Quotation create(JsonObject json) {
        Quotation quotation = new Quotation();

        if (json.containsKey("quoteId"))
            quotation.setQuoteId(json.getS("quoteId"));

        quotation.setItem(json.getString("item"));
        quotation.setQuantity(json.getString("quantity"));

        return quotation;

    }






}
